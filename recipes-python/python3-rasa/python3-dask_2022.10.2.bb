SUMMARY = "Parallel computing with task scheduling"
HOMEPAGE = "https://github.com/dask/dask"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f5eb2002f2deb4e003875dd453131e73"

PYPI_PACKAGE = "dask"

SRC_URI[md5sum] = "ec92d1ff05c60e0df0cf96753bc818a9"
SRC_URI[sha256sum] = "42cb43f601709575fa46ce09e74bea83fdd464187024f56954e09d9b428ceaab"

DEPENDS += " \
    python3-click \
    python3-pyyaml \
    python3-packaging \
    python3-cloudpickle \
    python3-fsspec \
    python3-partd \
    python3-toolz \
    "

inherit pypi setuptools3

RDEPENDS:${PN} += " \
    python3-click \
    python3-pyyaml \
    python3-packaging \
    python3-cloudpickle \
    python3-fsspec \
    python3-partd \
    python3-toolz \
    "
