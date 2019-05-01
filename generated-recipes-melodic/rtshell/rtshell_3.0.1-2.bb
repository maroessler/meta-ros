# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "<p>Shell commands for managing RT-Middleware running on OpenRTM-aist.</p>"
AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Geoffrey Biggs <git@killbots.net>"
HOMEPAGE = "http://ros.org/wiki/openrtm_tools"
SECTION = "devel"
LICENSE = "EPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=b1456987590b6d6fb15d36f398651b8b"

ROS_CN = "rtshell"
ROS_BPN = "rtshell"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-omniorb} \
    python-setuptools \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    rtctree \
    rtsprofile \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rtctree \
    rtsprofile \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tork-a/rtshell-release/archive/release/melodic/rtshell/3.0.1-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "38d4ad0f071ae60a37e6b35d12dd2f78"
SRC_URI[sha256sum] = "31896d1d8dde59a6203f6ccca26cb115e3d1ef7b85b0a6f109ca6913e5bc4657"
S = "${WORKDIR}/rtshell-release-release-melodic-rtshell-3.0.1-2"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rtshell', d)}"
ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rtshell', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rtshell/rtshell_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rtshell/rtshell-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rtshell/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rtshell/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}