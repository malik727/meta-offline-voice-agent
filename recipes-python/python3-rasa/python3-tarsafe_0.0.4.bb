SUMMARY = "A safe subclass of the TarFile class for interacting with tar files."
HOMEPAGE = "https://github.com/beatsbears/tarsafe"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=db603d043a8892407445e1da525115a0"

SRC_URI = " \
    git://github.com/beatsbears/tarsafe;protocol=https;branch=master \
    "

PV = "0.0.4+git${SRCPV}"
SRCREV = "80fe366d1e7d3dab436d3f809afb44d6b2f2abd1"
S = "${WORKDIR}/git"

inherit setuptools3
