SUMMARY = "A Python module for communicating with the Twilio API and generating TwiML."
HOMEPAGE = "https://github.com/twilio/twilio-python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=98e410977eaccb4352beb8e4048b421e"

PYPI_PACKAGE = "twilio"

SRC_URI[md5sum] = "1dfe879f10e0919b21d77d8ed9252039"
SRC_URI[sha256sum] = "6470a8bb6b1e240dd48c77f17e29fc1ee9041b75707bf437f880a585b6c722bc"

DEPENDS += " \
    python3-pytz \
    python3-requests \
    python3-pyjwt \
    python3-aiohttp \
    python3-aiohttp-retry \
    "

inherit pypi setuptools3

RDEPENDS:${PN} += " \
    python3-pytz \
    python3-requests \
    python3-pyjwt \
    python3-aiohttp \
    python3-aiohttp-retry \
    "
