inherit pypi setuptools3

SUMMARY = "Ahead of Time compiler for numeric kernels"
HOMEPAGE = "https://pythran.readthedocs.io/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e277a0b6033e0cb3d510c86b74144b01"

SRC_URI[md5sum] = "e09e90484771937ab499380858bdb18d"
SRC_URI[sha256sum] = "0b2cba712e09f7630879dff69f268460bfe34a6d6000451b47d598558a92a875"

DEPENDS = "python3-gast"
RDEPENDS_${PN} = "python3-beniget python3-gast"

BBCLASSEXTEND = "native"