SUMMARY = "An image containing the packages required by patchtest and patchtest-oe"
DESCRIPTION = "An image containing the packages that patchtest and patchtest-oe, used by the former as guest machine to test oe-core patches"
HOMEPAGE = "http://git.yoctoproject.org/cgit/cgit.cgi/patchtest/"

IMAGE_FSTYPES = "ext4"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-self-hosted \
    packagegroup-patchtest-oe \
    "
inherit core-image
