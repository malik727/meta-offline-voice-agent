SUMMARY = "Python helpers to limit the number of threads used \
           in native libraries that handle their own internal threadpool"
HOMEPAGE = "https://github.com/joblib/threadpoolctl"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f2439cfddfbeebdb5cac3ae4ae80eaf"

PYPI_PACKAGE = "threadpoolctl"

SRC_URI[md5sum] = "e278b89038d9c9b39e7afafb8f5f87a3"
SRC_URI[sha256sum] = "a335baacfaa4400ae1f0d8e3a58d6674d2f8828e3716bb2802c44955ad391380"

DEPENDS = "python3-flit-core python3-setuptools-native"

inherit pypi setuptools3

do_configure:prepend() {
cat > ${S}/setup.py <<-EOF
from setuptools import setup

setup(
       name="${PYPI_PACKAGE}",
       version="${PV}",
       license="${LICENSE}",
)
EOF
}

RDEPENDS_${PN} = "python3-flit-core"
BBCLASSEXTEND = "native"