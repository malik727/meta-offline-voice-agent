SUMMARY = "Pure python AMQP 0.9.1 asynchronous client library"
HOMEPAGE = "https://github.com/mosquito/aiormq"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e7462eb919e0134350d90bff49f6dc2b"

PYPI_PACKAGE = "aiormq"

SRC_URI[md5sum] = "f41b7a143c9ef2502358656e4cff9fe0"
SRC_URI[sha256sum] = "fd815d2bb9d8c950361697a74c1b067bc078726c3ef3b837e979a68a4986b148"

DEPENDS += " \
    python3-yarl \
    python3-pamqp \
    python3-setuptools-native \
"

inherit pypi setuptools3

RDEPENDS:${PN} += " \
    python3-yarl \
    python3-pamqp \
"
