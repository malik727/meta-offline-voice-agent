SUMMARY = "Tracebacks for Humans (in Jupyter notebooks)"
HOMEPAGE = "https://github.com/sanic-org/tracerite"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=605b9ee741fb194674b08ff2532e52b1"

SRC_URI = " \
    git://github.com/sanic-org/tracerite;protocol=https;branch=main \
    "

PV = "1.1.0+git${SRCPV}"
SRCREV = "c96c21f26393ddcf2472b92f7662c3e5664b0cb8"
S = "${WORKDIR}/git"

DEPENDS += "python3-html5tagger python3-setuptools-scm-native"

inherit setuptools3

RDEPENDS:${PN} += "python3-html5tagger"
