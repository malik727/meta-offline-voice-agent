SUMMARY = "Backport Python 3.8+ typing utils & add issubtype & more"
HOMEPAGE = "https://github.com/bojiang/typing_utils"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = " \
    git://github.com/bojiang/typing_utils;protocol=https;branch=main \
    "

PV = "0.1.0+git${SRCPV}"
SRCREV = "10476c342d3106be1d5b2c16f875bec53590f5b5"
S = "${WORKDIR}/git"

inherit setuptools3
