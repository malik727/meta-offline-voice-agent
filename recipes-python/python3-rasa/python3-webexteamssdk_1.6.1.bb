SUMMARY = "Work with the Webex Teams APIs in native Python!"
HOMEPAGE = "https://github.com/WebexCommunity/WebexPythonSDK"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9ca6af19c185da6b9c067b533f3c2a30"

PYPI_PACKAGE = "webexteamssdk"

SRC_URI[md5sum] = "b2cde8af44cd73ed5f6332ca74268a62"
SRC_URI[sha256sum] = "bbc7672f381b26fb22d0d03f87d131a2fa1e7d54c2f37f2e4cd28d725b8b5dfb"

DEPENDS += " \
    python3-future \
    python3-requests \
    python3-pyjwt \
    python3-requests-toolbelt \
    "

inherit pypi setuptools3

RDEPENDS:${PN} += " \
    python3-future \
    python3-requests \
    python3-pyjwt \
    python3-requests-toolbelt \
    "
