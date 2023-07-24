SUMMARY = "This package provides magic filter based on dynamic attribute getter"
HOMEPAGE = "https://github.com/aiogram/magic-filter"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a5f760788262f557f4db541bfdc749f6"

SRC_URI = " \
    git://github.com/aiogram/magic-filter;protocol=https;branch=master \
    "

PV = "1.0.10+git${SRCPV}"
SRCREV = "599e5bfa574d6cc97fd00b41a77b3247b0736ce9"
S = "${WORKDIR}/git"

inherit setuptools3

do_configure:prepend() {
cat > ${S}/setup.py <<-EOF
from setuptools import setup

setup(
       name="magic-filter",
       version="1.0.10",
       license="${LICENSE}",
)
EOF
}
