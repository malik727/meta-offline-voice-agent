SUMMARY = "Data validation using Python type hints"
HOMEPAGE = "https://github.com/pydantic/pydantic"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c02ea30650b91528657db64baea1757"

PYPI_PACKAGE = "pydantic"

SRC_URI[md5sum] = "d8135717be5067f7acfdeb4905d318ab"
SRC_URI[sha256sum] = "95c70da2cd3b6ddf3b9645ecaa8d98f3d80c606624b6d245558d202cd23ea3be"

DEPENDS += " \
    python3-typing-extensions \
    python3-setuptools-native \
"

inherit pypi setuptools3

RDEPENDS:${PN} += " \
    python3-typing-extensions \
"
