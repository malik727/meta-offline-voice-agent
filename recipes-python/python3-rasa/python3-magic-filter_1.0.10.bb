SUMMARY = "This package provides magic filter based on dynamic attribute getter"
HOMEPAGE = "https://github.com/aiogram/magic-filter"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a5f760788262f557f4db541bfdc749f6"

SRC_URI = "git://github.com/aiogram/magic-filter;protocol=https;branch=master \
           file://0001-magic-filter-add-setup-file.patch \
           "

PV = "1.0.10+git${SRCPV}"
SRCREV = "599e5bfa574d6cc97fd00b41a77b3247b0736ce9"
S = "${WORKDIR}/git"

inherit setuptools3
