SUMMARY = "Create HTML documents from Python"
HOMEPAGE = "https://github.com/sanic-org/html5tagger"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=605b9ee741fb194674b08ff2532e52b1"

PYPI_PACKAGE = "html5tagger"

SRC_URI[md5sum] = "5f2b0c139ecd9d00f314e9c8c2ad99b3"
SRC_URI[sha256sum] = "84fa3dfb49e5c83b79bbd856ab7b1de8e2311c3bb46a8be925f119e3880a8da9"

DEPENDS += "python3-setuptools-scm-native"

inherit pypi setuptools3
