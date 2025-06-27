# Base this image on core-image-base
include recipes-core/images/core-image-base.bb
# inherit swupdate-image

COMPATIBLE_MACHINE = "^rpi$"

IMAGE_INSTALL:append = " packagegroup-rpi-test"


# SWUPDATE_IMAGES = "rootfs kernel dtb"
# SWUPDATE_ROOTFS_TYPE = "ext4"
# SWUPDATE_CONFIG = "${WORKDIR}/swupdate.cfg"


IMAGE_INSTALL:append = " \
    vim \
    wireless-tools \
    bluez5 \
"