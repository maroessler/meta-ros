# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The linux_networking package"
AUTHOR = "Devon Ash <dash@clearpathrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "TODO"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "linux_networking"
ROS_BPN = "linux_networking"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-access-point-control \
    ros1-asmach \
    ros1-asmach-tutorials \
    ros1-ddwrt-access-point \
    ros1-hostapd-access-point \
    ros1-ieee80211-channels \
    ros1-linksys-access-point \
    ros1-multi-interface-roam \
    ros1-network-control-tests \
    ros1-network-detector \
    ros1-network-monitor-udp \
    ros1-network-traffic-control \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-access-point-control \
    ros1-asmach \
    ros1-asmach-tutorials \
    ros1-ddwrt-access-point \
    ros1-hostapd-access-point \
    ros1-ieee80211-channels \
    ros1-linksys-access-point \
    ros1-multi-interface-roam \
    ros1-network-control-tests \
    ros1-network-detector \
    ros1-network-monitor-udp \
    ros1-network-traffic-control \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/linux_networking/1.0.16-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/linux_networking"
SRC_URI = "git://github.com/pr2-gbp/linux_networking-release;${ROS_BRANCH};protocol=https"
SRCREV = "f99acdbd4d85fd16f0dc630be9364f60e54689d9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}