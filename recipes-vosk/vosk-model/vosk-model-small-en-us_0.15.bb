SUMMARY = "Lightweight wideband model 'en-us'"
HOMEPAGE = "https://alphacephei.com/vosk/"
LICENSE = "Apache-2.0"
# LIC_URL = "${COMMON_LICENSE_DIR}/Apache-2.0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/models.md;beginline=32;endline=32;md5=bb5cd71a409da2b13fa3bcb67a3573d1"

SRC_URI = " \
           https://alphacephei.com/vosk/models/vosk-model-small-en-us-0.15.zip;name=model \
           https://raw.githubusercontent.com/alphacep/vosk-space/master/models.md;name=license \
          "
# License listed on https://alphacephei.com/vosk/models

SRC_URI[model.sha256sum] = "30f26242c4eb449f948e42cb302dd7a686cb29a3423a8367f99ff41780942498"
SRC_URI[license.sha256sum] = "69e091d43baae61f93c586d939ff7c1997415964621614add8aed06590193f47"
# SRC_URI[license.sha256sum] = "3fbe0ee1fa914cb4b1cea2f2d7201a155884727cd0afbb51a267b66a73cb3444" (previously)

do_install() {
    install -d ${D}/usr/share/vosk
    cp -R ${WORKDIR}/vosk-model-small-en-us-0.15/ ${D}/usr/share/vosk/
}

FILES:${PN} += " /usr/share/vosk  /usr/share/vosk/vosk-model-small-en-us-0.15 "

RPROVIDES:${PN} += "virtual/vosk-model"
