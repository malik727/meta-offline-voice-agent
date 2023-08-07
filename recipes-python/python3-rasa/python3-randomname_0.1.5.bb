SUMMARY = "Generate random names (adj-noun) like docker and github."
HOMEPAGE = "https://github.com/beasteers/randomname"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=af47da9a50b5df42a6fb397386474144"

SRC_URI = " \
    git://github.com/beasteers/randomname;protocol=https;branch=main \
    "

PV = "0.1.5+git${SRCPV}"
SRCREV = "1068e5107929d20b878b05d87363edfd5d83247d"
S = "${WORKDIR}/git"

DEPENDS += "python3-fire"

inherit setuptools3

RDEPENDS_${PN} += "python3-fire"
