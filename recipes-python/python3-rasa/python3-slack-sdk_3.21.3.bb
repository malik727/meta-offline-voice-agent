SUMMARY = "Slack Developer Kit for Python"
HOMEPAGE = "https://github.com/slackapi/python-slack-sdk"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5059159dec692c70339fe0991a107b76"

SRC_URI = "\
    git://github.com/slackapi/python-slack-sdk;protocol=https;branch=main \
    "

PV = "3.21.3+git${SRCPV}"
S = "${WORKDIR}/git"
SRCREV = "8815d21930075cc7c2c8c482d8a30af4f1e6a759"

inherit setuptools3
