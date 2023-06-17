SUMMARY = "Flutter VOSK Demo"
DESCRIPTION = "A Flutter based Offline Speech Recognition Demo Application using the VOSK API."

HOMEPAGE = "https://github.com/amanarora9848/voicerecognizer-gst-grpc.git"

BUGTRACKER = "https://github.com/amanarora9848/voicerecognizer-gst-grpc.git"

SECTION = "graphics"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=13e8863a069f2c314d9251336e4afcbf"


SRC_URI = "git://github.com/amanarora9848/voicerecognizer-gst-grpc.git;protocol=https;branch=master"

SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git/app"

inherit agl-app flutter-app

# flutter-app
#############
PUBSPEC_APPNAME = "flutter_vosk_demo"
FLUTTER_APPLICATION_INSTALL_PREFIX = "/flutter"
FLUTTER_BUILD_ARGS = "bundle -v"

# agl-app
#########
AGL_APP_TEMPLATE = "agl-app-flutter"
AGL_APP_ID = "flutter_vosk_demo"
AGL_APP_NAME = "VOSK-DEMO"

RDEPENDS:${PN} = "vosk-grpc-server"
