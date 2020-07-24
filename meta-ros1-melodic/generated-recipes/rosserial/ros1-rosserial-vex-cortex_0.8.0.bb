# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "rosserial for Cortex/AVR platforms."
AUTHOR = "Canyon Turtle <canyonturtle@gmail.com>"
ROS_AUTHOR = "Cannon"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rosserial"
ROS_BPN = "rosserial_vex_cortex"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-rospy \
    ros1-rosserial-client \
    ros1-rosserial-python \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-rospy \
    ros1-rosserial-client \
    ros1-rosserial-python \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/rosserial-release/archive/release/melodic/rosserial_vex_cortex/0.8.0-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rosserial_vex_cortex"
SRC_URI = "git://github.com/ros-gbp/rosserial-release;${ROS_BRANCH};protocol=https"
SRCREV = "5da7e05192046248b9c6806bfaf6acea2443b8a2"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
