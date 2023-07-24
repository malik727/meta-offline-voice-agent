SUMMARY = "AMQP 0.9 client designed for asyncio and humans"
HOMEPAGE = "https://github.com/mosquito/aio-pika"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

PYPI_PACKAGE = "aio-pika"

SRC_URI[md5sum] = "1ce080b02665b7541dbef5cc0af79482"
SRC_URI[sha256sum] = "175b657ae022f318dd1476209bee4d5b793b0e0b298759fea7c11e1aa0cac6cd"

DEPENDS += " \
    python3-yarl \
    python3-typing-extensions \
    python3-aiormq \
    python3-setuptools-native \
"

inherit pypi setuptools3

RDEPENDS:${PN} += " \
    python3-yarl \
    python3-typing-extensions \
    python3-aiormq \
"
