SUMMARY = "Play and Record Sound with Python"
HOMEPAGE = "http://python-sounddevice.readthedocs.io/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd8634ff9bb1159041c3d4328659d00f"

SRC_URI = "gitsm://github.com/spatialaudio/python-sounddevice;protocol=https;branch=master"

PV = "0.4.4+git${SRCPV}"
SRCREV = "a56cdb96c9c8e3d23b877bbcc7d26bd0cda231e0"

S = "${WORKDIR}/git"

inherit setuptools3

# PACKAGECONFIG ?= "numpy"
PACKAGECONFIG[numpy] = "python3-numpy"

DEPENDS += "python3-cffi-native"

RDEPENDS:${PN} += "portaudio-v19 python3-cffi python3-core python3-ctypes python3-numpy"
