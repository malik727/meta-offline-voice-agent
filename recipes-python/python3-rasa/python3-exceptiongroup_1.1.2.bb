SUMMARY = "Backport of PEP 654 (exception groups)"
HOMEPAGE = "https://github.com/agronholm/exceptiongroup"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5caa317463c433575efff1d2fe206d7"

PYPI_PACKAGE = "exceptiongroup"

SRC_URI += "file://0001-exceptiongroup-add-setup-file.patch"
SRC_URI[md5sum] = "80538bd299352020bc08d4059457d026"
SRC_URI[sha256sum] = "12c3e887d6485d16943a309616de20ae5582633e0a2eda17f4e10fd61c1e8af5"

inherit pypi setuptools3
