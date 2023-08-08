SUMMARY = "Task scheduling library for Python"
HOMEPAGE = "https://github.com/agronholm/apscheduler"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f0e423eea5c91e7aa21bdb70184b3e53"

PYPI_PACKAGE = "APScheduler"

SRC_URI[md5sum] = "bdf3d90556514b99e2104dbf9a206546"
SRC_URI[sha256sum] = "65e6574b6395498d371d045f2a8a7e4f7d50c6ad21ef7313d15b1c7cf20df1e3"

DEPENDS += " \
    python3-attrs \
    python3-anyio \
    python3-tzlocal \
    python3-typing-extensions \
    "

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += " \
    python3-attrs \
    python3-anyio \
    python3-tzlocal \
    python3-typing-extensions \
    "
