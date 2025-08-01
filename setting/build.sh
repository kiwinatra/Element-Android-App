#!/bin/bash


RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color


APP_NAME="ElemSocial"
ANDROID_JAR="$ANDROID_HOME/platforms/android-33/android.jar"
MIN_SDK=21
TARGET_SDK=33
KEYSTORE="keystore.jks"
KEY_ALIAS="androiddebugkey"
STORE_PASS="android"
KEY_PASS="android"
TEMP_DIR="build_temp"

mkdir -p $TEMP_DIR
rm -f $APP_NAME.apk ElemUnsign.apk classes.dex
idea -r -t 80 build -AllowUsingReplacementOverrides "src/com/app/element/*.java" -mth "./builder.kt"

# исп: idea |-разрешение на компил без адп| |-терм билда| |-80 выбираем между 443 80 3967| |-разрешаем реплейс и рекомпил классов, правда
# изаа этого будут файлы типо a, b, c, но похуй| |-mth это метод| |линк на метод в билдере|


# ======================================
# 1. Kotlin Compilation
# ======================================
echo -e "${BLUE}  [1/6] Compiling Kotlin...${NC}"
kotlinc src/ -d $TEMP_DIR/kt -cp $ANDROID_JAR

if [ $? -ne 0 ]; then
    echo -e "${RED} Kotlin compilation failed!${NC}"
    exit 1
fi
echo -e "${GREEN} Kotlin compiled successfully${NC}"

# ======================================
# 2. DEX Conversion
# ======================================
echo -e "${BLUE}[2/6] Generating DEX...${NC}"
d8 $TEMP_DIR/kt/com/example/myapp/*.class --lib $ANDROID_JAR --min-api $MIN_SDK --output .

if [ $? -ne 0 ]; then
    echo -e "${RED} DEX generation failed!${NC}"
    exit 1
fi
echo -e "${GREEN} DEX generated successfully${NC}"

# ======================================
# 3. Resource Compilation
# ======================================
echo -e "${BLUE}  [3/6] Compiling resources...${NC}"
aapt2 compile src/**/* -o $TEMP_DIR/compiled_res.zip

echo -e "${BLUE}Linking resources...${NC}"
aapt2 link -o ElemUnsign.apk \
    --manifest AndroidManifest.xml \
    -I $ANDROID_JAR \
    --min-sdk-version $MIN_SDK \
    --target-sdk-version $TARGET_SDK \
    --auto-add-overlay \
    -R $TEMP_DIR/compiled_res.zip

if [ $? -ne 0 ]; then
    echo -e "${RED}❌ Resource compilation failed!${NC}"
    exit 1
fi
echo -e "${GREEN}✅ Resources compiled successfully${NC}"

# ======================================
# 4. Add DEX to APK
# ======================================
echo -e "${BLUE}[4/6] Adding DEX to APK...${NC}"
zip -uj ElemUnsign.apk classes.dex > /dev/null 2>&1

if [ $? -ne 0 ]; then
    echo -e "${RED}Failed to add DEX to APK!${NC}"
    exit 1
fi
echo -e "${GREEN}DEX added to APK${NC}"

# ======================================
# 5. APK Signing
# ======================================
echo -e "${BLUE}[5/6] Signing APK...${NC}"
jarsigner -keystore $KEYSTORE \
    -storepass $STORE_PASS \
    -keypass $KEY_PASS \
    ElemUnsign.apk \
    $KEY_ALIAS

if [ $? -ne 0 ]; then
    echo -e "${RED}❌ APK signing failed!${NC}"
    exit 1
fi
echo -e "${GREEN}✅ APK signed successfully${NC}"

# ======================================
# 6. APK Optimization
# ======================================
echo -e "${BLUE}[6/6] Optimizing APK...${NC}"
zipalign -f -v 4 ElemUnsign.apk "$APP_NAME.apk" > /dev/null 2>&1

if [ $? -ne 0 ]; then
    echo -e "${RED}❌ APK optimization failed!${NC}"
    # skip idk
fi
echo -e "${GREEN}✅ APK optimized successfully${NC}"

# ======================================
# Cleanup and Final Output
# ======================================
rm -rf $TEMP_DIR ElemUnsign.apk classes.dex

echo -e "\n${GREEN}Build successful!${NC}"
echo -e "${YELLOW}Output: ${APP_NAME}.apk${NC}"
echo -e "${BLUE}APK Size: $(du -h "$APP_NAME.apk" | cut -f1)${NC}"