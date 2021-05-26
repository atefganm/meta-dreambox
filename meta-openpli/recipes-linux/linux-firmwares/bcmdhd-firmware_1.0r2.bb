SUMMARY = "Broadcom DHD firmware"
LICENSE = "CLOSED"
require conf/license/license-close.inc

inherit allarch
INSANE_SKIP_${PN} = "arch"

SRC_URI = "http://dreamboxupdate.com/download/opendreambox/2.6.0/${PN}/${PV}/all/3815bf87c0c39c63de32db99f02827ba/${PN}_${PV}_all.tar.xz"

SRC_URI[md5sum] = "3815bf87c0c39c63de32db99f02827ba"
SRC_URI[sha256sum] = "9b36fa0981ec605e13372aff4a1cba7a0f4cb632d26de0967302624870449ce3"

SRC_URI += "file://LICENSE-CLOSE"

S = "${WORKDIR}/${PN}_${PV}_all"

PACKAGES = "${PN}"
FILES_${PN} += "${sysconfdir}/brcm ${nonarch_base_libdir}/firmware/brcm"

do_install() {
    install -d ${D}${sysconfdir}/brcm
    install -m 0644 ${S}${sysconfdir}/brcm/*.txt ${D}${sysconfdir}/brcm/

    install -d ${D}${nonarch_base_libdir}/firmware/brcm
    install -m 0644 ${S}${nonarch_base_libdir}/firmware/brcm/*.bin ${D}${nonarch_base_libdir}/firmware/brcm/
}

do_license() {
    mv ${WORKDIR}/LICENSE-CLOSE ${B}/LICENSE-CLOSE
}

addtask do_license before do_populate_lic after do_unpack
