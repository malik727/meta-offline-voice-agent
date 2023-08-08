SUMMARY = "ruamel.yaml is a YAML 1.2 parser/emitter for Python"
HOMEPAGE = "https://sourceforge.net/projects/ruamel-yaml/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=034154b7344d15438bc5ed5ee9cc075f"

PYPI_PACKAGE = "ruamel.yaml"

SRC_URI[md5sum] = "206bda0f33ab2c2f63777636200748b7"
SRC_URI[sha256sum] = "8b7ce697a2f212752a35c1ac414471dc16c424c9573be4926b56ff3f5d23b7af"

DEPENDS += "python3-ruamel.yaml.clib python3-setuptools-native"

inherit pypi setuptools3

RDEPENDS:${PN} += "python3-ruamel.yaml.clib"
