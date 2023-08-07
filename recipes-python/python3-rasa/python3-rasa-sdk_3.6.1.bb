SUMMARY = "SDK for the development of custom actions for Rasa"
HOMEPAGE = "https://github.com/RasaHQ/rasa-sdk"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ad8371373a2c6c672f744151097162e1"

SRC_URI = " \
    git://github.com/RasaHQ/rasa-sdk;protocol=https;branch=main \
    file://0001-rasa-sdk-remove-group-from-poetry-as-its-not-support.patch \
    "

PV = "3.6.1+git${SRCPV}"
SRCREV = "b3e24199f020d876beb7a9ab3bc18afc65ebe989"
S = "${WORKDIR}/git"

DEPENDS += " \
    python3-coloredlogs \
    python3-typing-extensions \
    python3-websockets \
    python3-prompt-toolkit \
    python3-pluggy \
    \
    python3-ruamel.yaml \
    python3-sanic \
    python3-sanic-cors \
"

inherit python_poetry_core

RDEPENDS:${PN} += " \
    python3-coloredlogs \
    python3-typing-extensions \
    python3-websockets \
    python3-prompt-toolkit \
    python3-pluggy \
    \
    python3-ruamel.yaml \
    python3-sanic \
    python3-sanic-cors \
"

do_install:append() {
    # Remove README and LICENSE from the site-packages directory as they shouldn't be placed there,
    # it causes conflicts.
    rm -f ${D}${libdir}/python3.10/site-packages/README.md
    rm -f ${D}${libdir}/python3.10/site-packages/LICENSE.txt
}
