SUMMARY = "Simple retry client for aiohttp."
HOMEPAGE = "https://github.com/inyutin/aiohttp_retry"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d37fc449eb112dc6aace331d0e5f6a3e"

SRC_URI = " \
    git://github.com/inyutin/aiohttp_retry;protocol=https;branch=master \
    "

PV = "2.8.3+git${SRCPV}"
SRCREV = "c5e6bb74b5373650527bc1f5c29ba5ad145dea48"
S = "${WORKDIR}/git"

DEPENDS += " \
    python3-aiohttp \
    python3-yarl \
    "

inherit setuptools3

RDEPENDS:${PN} += " \
    python3-aiohttp \
    python3-yarl \
    "
