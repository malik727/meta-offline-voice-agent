SUMMARY = "Python wrapper of rust library for NLU utils with wrappers in other languages"
HOMEPAGE = "https://github.com/snipsco/snips-nlu-utils"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=fdebc354a9200f9dc847e624d4584ea9"

SRC_URI += " \
    git://github.com/malik727/snips-nlu-utils.git;protocol=https;branch=master \
    "

PV = "0.9.1+git${SRCPV}"
S = "${WORKDIR}/git/python"
SRCREV = "b632934413bf84a733cd745db33a0c83640eada8"

DEPENDS += "python3-setuptools-rust-native"

require ${BPN}-crates.inc

inherit cargo python_setuptools3_rust

do_compile[network] = "1"