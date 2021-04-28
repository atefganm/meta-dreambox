KV = "${KERNELVERSION}-1.17"
DRIVERDATE = "20200321"

require dreambox-dvb-modules-new.inc

SRC_URI[dm920.md5sum] = "51ad1a3ae2f7b8e24c8e0422d59a4faf"
SRC_URI[dm920.sha256sum] = "8fa9df0771c04418736568ca092d6aacbb70bd21bac7e41a94781b4b688d5172"

COMPATIBLE_MACHINE = "^(dm920)$"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm920.md5sum', True)}"