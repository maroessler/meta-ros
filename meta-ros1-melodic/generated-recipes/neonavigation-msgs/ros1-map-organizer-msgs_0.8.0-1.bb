# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Message definitions for map_organizer_msgs package"
AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
ROS_AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "neonavigation_msgs"
ROS_BPN = "map_organizer_msgs"

ROS_BUILD_DEPENDS = " \
    ros1-message-generation \
    ros1-nav-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-message-runtime \
    ros1-nav-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-message-runtime \
    ros1-nav-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/at-wat/neonavigation_msgs-release/archive/release/melodic/map_organizer_msgs/0.8.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/map_organizer_msgs"
SRC_URI = "git://github.com/at-wat/neonavigation_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "748d8c7ab03a2f8a1bac4483186b142fe6f7572c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
