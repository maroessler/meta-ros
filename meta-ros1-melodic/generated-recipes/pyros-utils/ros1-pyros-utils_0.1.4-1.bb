# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Miscellaneous tools for pyROS"
AUTHOR = "AlexV <asmodehn@gmail.com>"
ROS_AUTHOR = "AlexV <asmodehn@gmail.com>"
HOMEPAGE = "https://github.com/asmodehn/pyros-utils"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pyros_utils"
ROS_BPN = "pyros_utils"

ROS_BUILD_DEPENDS = " \
    ros1-catkin-pip \
    ros1-rosgraph \
    ros1-roslaunch \
    ros1-roslint \
    ros1-rospy \
    ros1-rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-rosgraph \
    ros1-roslaunch \
    ros1-rospy \
    ros1-rostest \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-rosgraph \
    ros1-roslaunch \
    ros1-rospy \
    ros1-rostest \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-pyros-test \
    ros1-rosnode \
    ros1-rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pyros-dev/pyros-utils-release/archive/release/melodic/pyros_utils/0.1.4-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pyros_utils"
SRC_URI = "git://github.com/pyros-dev/pyros-utils-release;${ROS_BRANCH};protocol=https"
SRCREV = "7aef0cdffe3c0d78eabe094a45ace8e8d9492d61"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
