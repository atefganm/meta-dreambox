FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

MAINTAINER = "RAED"

SRC_URI_append += "\
	${@bb.utils.contains("MACHINE_FEATURES", "dreambox", "\
	file://use-ioctl-22-for-h265.patch \
	file://fix-fp-version.patch \
	file://dual-tuner-letter-detection.patch \
	file://Add-Option-Zap-Mode.patch \
	", "", d)} \
"

SRC_URI_append_dm900 += "\
    file://add-skin_display-dm900.patch \
    file://dm9x0-recoverymode.patch \
    file://add-support-2160p.patch \
    file://make-front-led-configurable.patch \
    file://move-lcd-text-a-bit-to-the-right.patch \
    file://fix-framebuffer-and-use-ion-to-allocate-accel-memory.patch \
"

SRC_URI_append_dm920 += "\
    file://add-skin_display-dm920.patch \
    file://dm9x0-recoverymode.patch \
    file://add-support-2160p.patch \
    file://make-front-led-configurable.patch \
    file://move-lcd-text-a-bit-to-the-right.patch \
    file://fix-framebuffer-and-use-ion-to-allocate-accel-memory.patch \
"

SRC_URI_append_dm820 += "\
    file://dm9x0-recoverymode.patch \
    file://make-front-led-configurable.patch \
    file://fix-framebuffer-and-use-ion-to-allocate-accel-memory.patch \
"

SRC_URI_append_dm7080 += "\
    file://dm9x0-recoverymode.patch \
    file://make-front-led-configurable.patch \
    file://fix-framebuffer-and-use-ion-to-allocate-accel-memory.patch \
"

SRC_URI_append_dm520 += "\
    file://dm9x0-recoverymode.patch \
    file://make-front-led-configurable.patch \
    file://fix-framebuffer-and-use-ion-to-allocate-accel-memory.patch \
"
