SUMMARY = "Ultra fast asyncio event loop."
HOMEPAGE = "https://github.com/MagicStack/uvloop"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE-APACHE;md5=bb92739ddad0a2811957bd98bdb90474"

PYPI_PACKAGE = "uvloop"

SRC_URI[md5sum] = "bc5e841a1c3f6e8935eeaf9d82b5ee29"
SRC_URI[sha256sum] = "0ddf6baf9cf11a1a22c71487f39f15b2cf78eb5bde7e5b45fbb99e8a9d91b9e1"

DEPENDS += "python3-cython-native"

inherit pypi setuptools3

do_compile:prepend() {
    export LIBUV_CONFIGURE_HOST=${HOST_SYS}
}

do_install:prepend() {
    export LIBUV_CONFIGURE_HOST=${HOST_SYS}
}
