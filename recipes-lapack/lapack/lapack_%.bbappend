DEPENDS += "openblas"
DEPENDS:remove:class-native = "libgfortran"

EXTRA_OECMAKE:append = " -DCBLAS=ON"
EXTRA_OECMAKE += " -DUSE_OPTIMIZED_BLAS=1"

do_install:append() {
    rm -f ${D}${includedir}/cblas.h
}

BBCLASSEXTEND = "native"
