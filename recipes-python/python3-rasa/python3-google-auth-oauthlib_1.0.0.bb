SUMMARY = "This library provides oauthlib integration with google-auth."
HOMEPAGE = "https://github.com/googleapis/google-auth-library-python-oauthlib"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

PYPI_PACKAGE = "google-auth-oauthlib"

SRC_URI[md5sum] = "231bbc2d9875d8d6796b096d25f58a2d"
SRC_URI[sha256sum] = "e375064964820b47221a7e1b7ee1fd77051b6323c3f9e3e19785f78ab67ecfc5"

DEPENDS += " \
    python3-google-auth \
    python3-requests-oauthlib \
    "

inherit pypi setuptools3

RDEPENDS:${PN} += " \
    python3-google-auth \
    python3-requests-oauthlib \
    "
