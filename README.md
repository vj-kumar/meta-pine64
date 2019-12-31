# meta-pine64

### Prerequisites

This setup is tested on a Ubuntu 18.04 host machine. Other linux distros should
work but not been validated.

This project makes use of ISAR for building debian images. For more information
visit https://github.com/ilbers/isar

Install the following packages.
```
sudo apt-get install binfmt-support \
    debootstrap \
    dosfstools \
    dpkg-dev \
    gettext-base \
    git \
    mtools \
    parted \
    python3 \
    python3-distutils \
    qemu \
    qemu-user-static \
    reprepro \
    sudo
```

### Cloning the repository
```
repo init -u https://github.com/vj-kumar/isar-manifests.git -m pine64.xml
repo sync
```

### Setup sudo rights

Follow the instructions available [here](https://github.com/ilbers/isar/blob/master/doc/user_manual.md#setup-sudo) to setup sudo rights.

### Building Debian Image
```
. ./setup-debian-build meta-pine64 build
bitbake multiconfig:pine64-plus-buster:isar-image-base
```
### Debian Image

The final Debian image will be present in

```
tmp/deploy/images/pine64-plus/isar-image-base-debian-buster-pine64-plus.wic.img
```
