SUMMARY = "AnyIO is an asynchronous networking and concurrency library that works on top of either asyncio or trio"
HOMEPAGE = "https://github.com/agronholm/anyio"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c0a769411d2af7894099e8ff75058c9f"

SRC_URI += "file://0001-anyio-add-setup-file.patch"
SRC_URI[md5sum] = "58d288dd84e28e2507ff9ce7e4620010"
SRC_URI[sha256sum] = "44a3c9aba0f5defa43261a8b3efb97891f2bd7d804e0e1f56419befa1adfc780"

DEPENDS += " \
    python3-sniffio \
    python3-idna \
    python3-exceptiongroup \
    "

inherit pypi setuptools3

RDEPENDS:${PN} += " \
    python3-sniffio \
    python3-idna \
    python3-exceptiongroup \
    "
