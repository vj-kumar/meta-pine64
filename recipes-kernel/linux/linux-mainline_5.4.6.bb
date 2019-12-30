#
# Copyright (c) Siemens AG, 2018
# Copyright (c) Vijai Kumar K <vijaikumar.kanagarajan@gmail.com>, 2019
#
# SPDX-License-Identifier: MIT

require recipes-kernel/linux/linux-custom.inc

ARCHIVE_VERSION = "${@d.getVar('PV')}"

KBUILD_DEPENDS += "rsync"

SRC_URI += " \
    https://cdn.kernel.org/pub/linux/kernel/v5.x/linux-${ARCHIVE_VERSION}.tar.xz"
SRC_URI[sha256sum] = "fda561bcdea397ddd59656319c53871002938b19b554f30efed90affa30989c8"

S = "${WORKDIR}/linux-${ARCHIVE_VERSION}"
