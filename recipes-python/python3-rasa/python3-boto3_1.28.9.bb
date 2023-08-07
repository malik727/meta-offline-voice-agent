SUMMARY = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for Python, which allows Python developers to write software that makes use of services like Amazon S3 and Amazon EC2."
HOMEPAGE = "https://github.com/boto/boto3"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI = "\
    git://github.com/boto/boto3.git;protocol=https;branch=master \
    "

PV = "1.28.9+git${SRCPV}"
S = "${WORKDIR}/git"
SRCREV = "59b3da9b9c12de8c13bdb51d9aed6e9db4ff170d"

DEPENDS += "\
    python3 \
    python3-botocore \
    python3-jmespath \
    python3-s3transfer \
    "

inherit setuptools3

# python3 needs to be included since there are core dependencies such
# as getpass.
RDEPENDS:${PN} += "\
    python3 \
    python3-botocore \
    python3-jmespath \
    python3-s3transfer \
    "
