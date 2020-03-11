# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Provides a toolchain running through the robot calibration process. This      involves capturing calibration data, estimating parameters, and      then updating the URDF."
AUTHOR = "Vincent Rabaud <vincent.rabaud@gmail.com>"
HOMEPAGE = "http://www.ros.org/wiki/ros_comm"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "calibration"
ROS_BPN = "calibration"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-calibration-estimation \
    ros1-calibration-launch \
    ros1-calibration-msgs \
    ros1-image-cb-detector \
    ros1-interval-intersection \
    ros1-joint-states-settler \
    ros1-laser-cb-detector \
    ros1-monocam-settler \
    ros1-settlerlib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-calibration-estimation \
    ros1-calibration-launch \
    ros1-calibration-msgs \
    ros1-image-cb-detector \
    ros1-interval-intersection \
    ros1-joint-states-settler \
    ros1-laser-cb-detector \
    ros1-monocam-settler \
    ros1-settlerlib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/calibration-release/archive/release/melodic/calibration/0.10.14-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/calibration"
SRC_URI = "git://github.com/ros-gbp/calibration-release;${ROS_BRANCH};protocol=https"
SRCREV = "97c9824dd5cc96c20b20ce4e452937a2d6ad6988"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}