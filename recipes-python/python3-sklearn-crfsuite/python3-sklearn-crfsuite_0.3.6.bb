SUMMARY = "scikit-learn inspired API for CRFsuite"
HOMEPAGE = "https://github.com/TeamHG-Memex/sklearn-crfsuite"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rst;md5=430135089e45e49b28e1cb481484db9a"

PYPI_PACKAGE = "sklearn-crfsuite"

SRC_URI[md5sum] = "14b51eb8a1195f2dc441a7164133008f"
SRC_URI[sha256sum] = "2f59aad3055e01a778a79a6352891cac04788e8b52688aa5bc8b11be7717861e"

DEPENDS += " \
    python3-tabulate \
    python3-python-crfsuite \
    python3-six \
    python3-tqdm \
    python3-setuptools-native \
    "

inherit pypi setuptools3

RDEPENDS_${PN} += " \
    python3-tabulate \
    python3-python-crfsuite \
    python3-six \
    python3-tqdm \
    "
