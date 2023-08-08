SUMMARY = "Concurrent appendable key-value storage"
HOMEPAGE = "https://github.com/dask/partd/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=01cbb2369bb5a7c865b5a165065dabb9"

PYPI_PACKAGE = "partd"

SRC_URI[md5sum] = "b1b31036992ad5892d32972128f15550"
SRC_URI[sha256sum] = "aa0ff35dbbcc807ae374db56332f4c1b39b46f67bf2975f5151e0b4186aed0d5"

DEPENDS += " \
    python3-locket \
    python3-toolz \
    "

inherit pypi setuptools3

RDEPENDS:${PN} += " \
    python3-locket \
    python3-toolz \
    "
