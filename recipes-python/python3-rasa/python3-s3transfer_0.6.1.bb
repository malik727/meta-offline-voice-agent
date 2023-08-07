SUMMARY = "Amazon S3 Transfer Manager for Python"
HOMEPAGE = "https://github.com/boto/s3transfer"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "\
    git://github.com/boto/s3transfer.git;protocol=https;branch=master \
    "

PV = "0.6.1+git${SRCPV}"
S = "${WORKDIR}/git"
SRCREV = "f53a45d286834799207c4e225f3676bfa8eb4e1a"

DEPENDS += "\
    python3-botocore \
    python3-urllib3 \
    "

inherit setuptools3

RDEPENDS:${PN} += "\
    python3-botocore \
    python3-urllib3 \
    "
