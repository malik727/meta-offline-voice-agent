SUMMARY = "Authentication, JWT, and permission scoping for Sanic"
HOMEPAGE = "https://github.com/ahopkins/sanic-jwt"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c3a2839b22af0a25e097bcfc682c6523"

PYPI_PACKAGE = "sanic-jwt"

SRC_URI[md5sum] = "b043b92964f623041949ac873be113e8"
SRC_URI[sha256sum] = "ae16cdaebc8cd9569dae6f633a2a876205d7b36134e5920698ae5b8e4f1b83f1"

DEPENDS += "python3-pyjwt"

inherit pypi setuptools3

RDEPENDS:${PN} += "python3-pyjwt"
