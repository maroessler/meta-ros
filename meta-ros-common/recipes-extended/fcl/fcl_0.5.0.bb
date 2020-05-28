DESCRIPTION = "FCL is a library for performing three types of proximity queries on a pair of geometric models composed of triangles and octrees."
HOMEPAGE = "https://github.com/flexible-collision-library/fcl"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7de20b14c33be61ee0c714b41e286d0b"

DEPENDS = "boost libccd"

SRCREV = "7075caf32ddcd5825ff67303902e3db7664a407a"
ROS_BRANCH ?= "branch=master"
SRC_URI = "git://github.com/flexible-collision-library/fcl;${ROS_BRANCH};protocol=https"

S = "${WORKDIR}/git"

FILES_${PN}_dev += "\
    ${libdir}/cmake \
    ${libdir}/libfcl.so \
"

inherit pkgconfig cmake
