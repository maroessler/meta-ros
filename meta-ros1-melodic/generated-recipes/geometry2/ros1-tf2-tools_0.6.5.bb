# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "tf2_tools"
AUTHOR = "Tully Foote <tfoote@osrfoundation.org>"
ROS_AUTHOR = "Wim Meeussen"
HOMEPAGE = "http://www.ros.org/wiki/tf2_tools"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "geometry2"
ROS_BPN = "tf2_tools"

ROS_BUILD_DEPENDS = " \
    ros1-tf2 \
    ros1-tf2-msgs \
    ros1-tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-tf2 \
    ros1-tf2-msgs \
    ros1-tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-tf2 \
    ros1-tf2-msgs \
    ros1-tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/geometry2-release/archive/release/melodic/tf2_tools/0.6.5-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/tf2_tools"
SRC_URI = "git://github.com/ros-gbp/geometry2-release;${ROS_BRANCH};protocol=https"
SRCREV = "fe975cee9e35c7728cf407894f0bec18bff2780e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
