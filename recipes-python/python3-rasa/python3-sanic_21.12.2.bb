SUMMARY = "Accelerate your web app development | Build fast. Run fast."
HOMEPAGE = "https://github.com/sanic-org/sanic"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=72f485002f8d965537e469a30e50998f"

PYPI_PACKAGE = "sanic"

SRC_URI[md5sum] = "8d4b54e966bd6eb237aee81b1e4e3b51"
SRC_URI[sha256sum] = "c426e15aac6984860c6d1221329be17e02e2dfed4ce0abf8532ab096026ee5e3"

DEPENDS += " \
    python3-websockets \
    python3-typing-extensions \
    python3-ujson \
    python3-multidict \
    python3-aiofiles \
    \
    python3-sanic-routing \
    python3-httptools \
    python3-uvloop \
    python3-html5tagger \
    python3-tracerite \
    "

inherit pypi setuptools3

RDEPENDS:${PN} += "\
    python3-websockets \
    python3-typing-extensions \
    python3-ujson \
    python3-multidict \
    python3-aiofiles \
    \
    python3-sanic-routing \
    python3-httptools \
    python3-uvloop \
    python3-html5tagger \
    python3-tracerite \
    "
