# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "A ROS node that controls a Linksys access point with     a Linksys WRT610n-compatible web interface."
AUTHOR = "Devon Ash <dash@clearpathrobotics.com>"
ROS_AUTHOR = "Catalin Drula"
HOMEPAGE = "http://ros.org/wiki/linksys_access_point"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "linux_networking"
ROS_BPN = "linksys_access_point"

ROS_BUILD_DEPENDS = " \
    ros1-access-point-control \
    ros1-dynamic-reconfigure \
    ros1-ieee80211-channels \
    ros1-rospy \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-access-point-control \
    ros1-dynamic-reconfigure \
    ros1-ieee80211-channels \
    ros1-rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-access-point-control \
    ros1-dynamic-reconfigure \
    ros1-ieee80211-channels \
    ros1-rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/linksys_access_point/1.0.16-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/linksys_access_point"
SRC_URI = "git://github.com/pr2-gbp/linux_networking-release;${ROS_BRANCH};protocol=https"
SRCREV = "f6c842749567696906de9f3637864094990b332c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
