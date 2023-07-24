SUMMARY = "Open source machine learning framework to automate text- and voice-based conversations"
HOMEPAGE = "https://github.com/RasaHQ/rasa"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=930bc50f846c55c70b79b78055ae3d9b"

PYPI_PACKAGE = "rasa"

SRC_URI += " \
    file://0001-remove-group-from-poetry-as-its-not-supported.patch \
"
SRC_URI[md5sum] = "7aab346588a3056b54ff783357e4d081"
SRC_URI[sha256sum] = "21e57a99bdec8d9f36f7828985c8e3fb3bf3b2c3c94a856d3006e0a68b41a399"

DEPENDS += " \
    python3-requests \
    python3-matplotlib \
    python3-absl \
    python3-tqdm \
    python3-numpy \
    python3-pyyaml \
    python3-aiohttp \
    python3-attrs \
    python3-websockets \
    python3-typing-extensions \
    python3-pytz \
    python3-protobuf \
    python3-regex \
    python3-pydot \
    python3-packaging \
    python3-jsonschema \
    python3-networkx \
    python3-ujson \
    python3-dateutil \
    \
    python3-typing-utils \
    python3-aiogram \
    python3-aio-pika \
    python3-joblib \
    python3-scipy \
    python3-scikit-learn \
    python3-sklearn-crfsuite \
    python3-jsonpickle \
"

inherit pypi python_poetry_core

RDEPENDS:${PN} += " \
    python3-requests \
    python3-matplotlib \
    python3-absl \
    python3-tqdm \
    python3-numpy \
    python3-pyyaml \
    python3-aiohttp \
    python3-attrs \
    python3-websockets \
    python3-typing-extensions \
    python3-pytz \
    python3-protobuf \
    python3-pydot \
    python3-packaging \
    python3-jsonschema \
    python3-networkx \
    python3-ujson \
    python3-dateutil \
    \
    python3-typing-utils \
    python3-aiogram \
    python3-aio-pika \
    python3-joblib \
    python3-scipy \
    python3-scikit-learn \
    python3-sklearn-crfsuite \
    python3-jsonpickle \
"
