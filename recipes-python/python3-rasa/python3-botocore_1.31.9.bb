SUMMARY = "he low-level, core functionality of boto3 and the AWS CLI."
HOMEPAGE = "https://github.com/boto/botocore"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI = "\
    git://github.com/boto/botocore.git;protocol=https;branch=master \
    "

PV = "1.31.9+git${SRCPV}"
S = "${WORKDIR}/git"
SRCREV = "88ebf0a86f9bb7270b6f65211621e8f44a91a1c5"

DEPENDS += "\
    python3-dateutil \
    python3-jmespath \
    python3-urllib3 \
    "

inherit setuptools3

RDEPENDS:${PN} += "\
    python3-dateutil \
    python3-jmespath \
    python3-urllib3 \
    "
