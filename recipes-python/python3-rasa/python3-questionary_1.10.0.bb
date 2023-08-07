SUMMARY = "Python library to build pretty command line user prompts"
HOMEPAGE = "https://github.com/tmbo/questionary"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=19f0688967ec2b2624ee04c0136daae7"

PYPI_PACKAGE = "questionary"

SRC_URI[md5sum] = "0fc453e2b7f2516e76edf321b58c1332"
SRC_URI[sha256sum] = "600d3aefecce26d48d97eee936fdb66e4bc27f934c3ab6dd1e292c4f43946d90"

DEPENDS += "python3-prompt-toolkit"

inherit pypi python_poetry_core

RDEPENDS:${PN} += "python3-prompt-toolkit"
