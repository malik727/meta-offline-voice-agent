SUMMARY = "A tiny library for parsing, modifying, and composing SRT files."
HOMEPAGE = "https://github.com/cdown/srt"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6658a1272b4469f7249985d28b8697bb"

SRC_URI = "https://files.pythonhosted.org/packages/18/a3/e1466f7c86a9e5d3e462ed6eb3a548917e93cc1ee212cd927f8f4e887ae9/srt-${PV}.tar.gz"
SRC_URI[md5sum] = "3b68be7c46ec6152123fd801f519a63d"
SRC_URI[sha256sum] = "7aa4ad5ce4126d3f53b3e7bc4edaa86653d0378bf1c0b1ab8c59f5ab41384450"

S = "${WORKDIR}/srt-${PV}"

inherit setuptools3

RDEPENDS_${PN} += "python3-core python3-datetime python3-logging"

BBCLASSEXTEND = "native nativesdk"