SUMMARY = "PyYAML-based module to produce a bit more pretty and readable YAML-serialized data"
HOMEPAGE = "https://github.com/mk-fg/pretty-yaml"
LICENSE = "WTFPL"
LIC_FILES_CHKSUM = "file://COPYING;md5=cb6845a9953333608b280507d7803cb3"

PYPI_PACKAGE = "pyaml"

SRC_URI[md5sum] = "a41620eeb64f4b460e6d23b98156780e"
SRC_URI[sha256sum] = "b3f636b467864319d7ded1558f86bb305b8612a274f5d443a62dc5eceb1b7176"

DEPENDS += "python3-pyyaml python3-setuptools-native"

inherit pypi setuptools3

RDEPENDS_${PN} += "python3-pyyaml"
BBCLASSEXTEND = "native"