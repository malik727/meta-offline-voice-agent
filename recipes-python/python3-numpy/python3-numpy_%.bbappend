FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI += " \
    file://0001-Disable-runtimelibdirs-for-cross-compile.patch \
    file://0001-Remove-using-library-directories-as-runtime-library-.patch \
    "
