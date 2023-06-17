SUMMARY = "A Python module for reading and writing WAV files using numpy arrays."
HOMEPAGE = "https://github.com/WarrenWeckesser/wavio"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/README.rst;beginline=48;endline=48;md5=bc752f76db0a3e24c17afcc8dda3d553"
# License listed in README.rst at https://github.com/WarrenWeckesser/wavio

SRC_URI = "git://github.com/WarrenWeckesser/wavio;protocol=https;branch=master"

PV = "0.0.4+git${SRCPV}"
SRCREV = "54699acdde2cb4f68fbe3dc5847a74ab796662e1"

S = "${WORKDIR}/git"

inherit setuptools3

DEPENDS += "python3-numpy"

RDEPENDS:${PN} += "python3-audio python3-core python3-numpy"
