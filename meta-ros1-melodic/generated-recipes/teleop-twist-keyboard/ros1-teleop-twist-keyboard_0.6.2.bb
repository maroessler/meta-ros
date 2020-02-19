# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Generic keyboard teleop for twist robots."
AUTHOR = "Austin Hendrix <namniart@gmail.com>"
ROS_AUTHOR = "Graylin Trevor Jay"
HOMEPAGE = "http://wiki.ros.org/teleop_twist_keyboard"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "teleop_twist_keyboard"
ROS_BPN = "teleop_twist_keyboard"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-geometry-msgs \
    ros1-rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-geometry-msgs \
    ros1-rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/teleop_twist_keyboard-release/archive/release/melodic/teleop_twist_keyboard/0.6.2-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/teleop_twist_keyboard"
SRC_URI = "git://github.com/ros-gbp/teleop_twist_keyboard-release;${ROS_BRANCH};protocol=https"
SRCREV = "8e5c45701774f927b97874631229293a5a68e36f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
