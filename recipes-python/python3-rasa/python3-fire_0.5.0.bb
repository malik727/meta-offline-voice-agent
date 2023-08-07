SUMMARY = "Python Fire is a library for automatically generating command line interfaces (CLIs) from absolutely any Python object."
HOMEPAGE = "https://github.com/google/python-fire"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab892b2b62f951d424bdb712a72584cc"

PYPI_PACKAGE = "fire"

SRC_URI[md5sum] = "8b24d579bd2a1b344b4f9670fa49ebc8"
SRC_URI[sha256sum] = "a6b0d49e98c8963910021f92bba66f65ab440da2982b78eb1bbf95a0a34aacc6"

DEPENDS += "python3-six python3-termcolor"

inherit pypi setuptools3

RDEPENDS_${PN} += "python3-six python3-termcolor"
