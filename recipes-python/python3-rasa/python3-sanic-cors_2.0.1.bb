SUMMARY = "A Sanic extension for handling Cross Origin Resource Sharing (CORS), making cross-origin AJAX possible."
HOMEPAGE = "https://github.com/ashleysommer/sanic-cors"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=db2d9ca6ab6d7568b89656d68b0c01ee"

PYPI_PACKAGE = "Sanic-Cors"

SRC_URI[md5sum] = "9d4e56275332487fb6fdfe8644116e98"
SRC_URI[sha256sum] = "4d2f26333d49db428217814c66e89fc3df20fc62a5ab518a71fa22e2e249e19d"

DEPENDS += " \
    python3-packaging \
    python3-sanic \
    "

inherit pypi setuptools3

RDEPENDS_${PN} += "\
    python3-packaging \
    python3-sanic \
    "
