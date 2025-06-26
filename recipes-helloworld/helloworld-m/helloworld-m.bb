SUMMARY = "Simple helloworld application with Makefile"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://helloworld.c \
           file://Makefile"

S = "${WORKDIR}"

# 使用make命令编译
do_compile() {
    oe_runmake
}

# 安装到目标目录
do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/helloworld-m ${D}${bindir}
}

FILES_${PN} = "${bindir}/helloworld-m"