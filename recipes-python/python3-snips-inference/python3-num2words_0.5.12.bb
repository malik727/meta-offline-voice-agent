SUMMARY = "Modules to convert numbers to words"
HOMEPAGE = "https://github.com/savoirfairelinux/num2words"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=f1b68565299e4b2403b8b3a87d0bcacf"

PYPI_PACKAGE = "num2words"

SRC_URI[md5sum] = "6ef51562822308f7e20f8059d2a81686"
SRC_URI[sha256sum] = "7e7c0b0f080405aa3a1dd9d32b1ca90b3bf03bab17b8e54db05e1b78301a0988"

DEPENDS += "python3-docopt python3-setuptools-native"

inherit pypi setuptools3

RDEPENDS_${PN} += "python3-docopt"
BBCLASSEXTEND = "native"