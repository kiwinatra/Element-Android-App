.PHONY: build clean install

build:
	build.sh

clean:
	rm -rf build_temp/ classes.dex ElemUnsign.apk

install:
	adb install -r ElemSocial.apk

test:
	adb shell am start -n elem.social.com/.MainActivity