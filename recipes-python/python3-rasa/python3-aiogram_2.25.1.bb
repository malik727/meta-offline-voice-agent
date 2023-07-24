SUMMARY = "aiogram is a modern and fully asynchronous framework for Telegram Bot API written in Python using asyncio"
HOMEPAGE = "https://github.com/aiogram/aiogram"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=93cce29e93ddfef6ad50176fb23e6a5a"

PYPI_PACKAGE = "aiogram"

SRC_URI[md5sum] = "944ab87052eaa8fb16b6076750dfe1f1"
SRC_URI[sha256sum] = "59ad78fc0ebbef1fd471c15778a4594b60117e0d7373bc2ce7bcd192074d527d"

DEPENDS += " \
    python3-magic-filter \
    python3-aiohttp \
    python3-aiofiles \
    python3-certifi \
    python3-pydantic \
    python3-setuptools-native \
"

inherit pypi setuptools3

RDEPENDS:${PN} += " \
    python3-magic-filter \
    python3-aiohttp \
    python3-aiofiles \
    python3-certifi \
    python3-pydantic \
"
