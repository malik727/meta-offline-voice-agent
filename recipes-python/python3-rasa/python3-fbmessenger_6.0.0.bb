SUMMARY = "A python library to communicate with the Facebook Messenger API's"
HOMEPAGE = "https://github.com/rehabstudio/fbmessenger"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=51d15f787b3ed17007b36e82f403bdae"

SRC_URI = " \
    git://github.com/rehabstudio/fbmessenger;protocol=https;branch=master \
    "

PV = "6.0.0+git${SRCPV}"
SRCREV = "a7b4b203aed3251da359bf6b3069486daf441d23"
S = "${WORKDIR}/git"

DEPENDS += "python3-requests"

inherit setuptools3

RDEPENDS_${PN} += "python3-requests"
