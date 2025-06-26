FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

do_install:append() {
    install -d \${D}\${sysconfdir}/systemd/network/
    install -m 0644 \${WORKDIR}/eth0.network \${D}\${sysconfdir}/systemd/network/

    install -d ${D}${systemd_unitdir}/system/
    install -m 0644 ${WORKDIR}/networkd-enable.service ${D}${systemd_unitdir}/system/
}

SYSTEMD_SERVICE_${PN} += "networkd-enable.service"
RDEPENDS_${PN} += "systemd-networkd"