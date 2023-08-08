SUMMARY = "Sentry integration for structlog"
HOMEPAGE = "https://github.com/kiwicom/structlog-sentry/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=533070a240ce2e02da642b7dc7406929"

SRC_URI = " \
    git://github.com/kiwicom/structlog-sentry;protocol=https;branch=master \
    "

PV = "2.0.3+git${SRCPV}"
SRCREV = "3cae523da9fe6e022de7b6d283090ddb59966625"
S = "${WORKDIR}/git"

DEPENDS += " \
    python3-structlog \
    python3-sentry-sdk \
    python3-urllib3 \
    python3-certifi \
    "

inherit python_poetry_core

RDEPENDS:${PN} += " \
    python3-structlog \
    python3-sentry-sdk \
    python3-urllib3 \
    python3-certifi \
    "
    
do_install:append() {
    # Remove extra files from the site-packages directory as they shouldn't be placed there,
    # it causes conflicts.
    rm -f ${D}${libdir}/python3.10/site-packages/README.md
    rm -f ${D}${libdir}/python3.10/site-packages/tox.ini 
    rm -f ${D}${libdir}/python3.10/site-packages/pyproject.toml
    rm -f ${D}${libdir}/python3.10/site-packages/.coveragerc
    rm -f ${D}${libdir}/python3.10/site-packages/.pre-commit-config.yaml
}
