#!/bin/sh

rm -rf src/main/java/de

# call jnaerator
java -jar jnaerator-0.12-SNAPSHOT.jar \
    -library leptonica \
    -runtime BridJ \
    -direct \
    -mode Directory \
    -skipDeprecated \
    -o src/main/java \
    -package de.vorb.leptonica \
    ../VS2013/tesseract-vs2013/liblept/include/allheaders.h
