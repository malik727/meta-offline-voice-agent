SUMMARY = "Dataset and a pre-trained model for the AGL voice assistant RASA based NLU intent engine."
HOMEPAGE = "https://github.com/malik727/rasa-model-agl"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ecab3ce0771d366e0f8e4ca058eb48e7"

SRC_URI = " \
    git://github.com/malik727/rasa-model-agl;protocol=https;branch=main \
"

PV = "0.1.0+git${SRCPV}"
S = "${WORKDIR}/git"
SRCREV = "a0f913d344acd010220615295f864ab76443c0be"

do_install() {
    install -d ${D}/usr/share/nlu/rasa
    cp -R ${WORKDIR}/git/* ${D}/usr/share/nlu/rasa/
}

FILES:${PN} += " /usr/share/nlu/rasa"
