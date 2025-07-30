#!/bin/bash
# Использование: ./scripts/obfuscate.sh
java -jar tools/proguard.jar @proguard-rules.pro \
  -injars ElemSocial.apk \
  -outjars ElemSocial-obfuscated.apk