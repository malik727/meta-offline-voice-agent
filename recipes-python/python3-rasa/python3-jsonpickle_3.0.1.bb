SUMMARY = "Python library for serializing any arbitrary object graph into JSON."
HOMEPAGE = "https://github.com/jsonpickle/jsonpickle"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c9706350b6b0ee6b429bf3c10e2172fd"

PYPI_PACKAGE = "jsonpickle"

SRC_URI[md5sum] = "cff64658527ec65ba815551baa727d1e"
SRC_URI[sha256sum] = "032538804795e73b94ead410800ac387fdb6de98f8882ac957fcd247e3a85200"

DEPENDS += "python3-setuptools-scm-native"

inherit pypi setuptools3
