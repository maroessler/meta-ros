# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "ROS msgs from and to dual quaternions"
AUTHOR = "achille <achille.verheye@gmail.com>"
ROS_AUTHOR = "achille <achille.verheye@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "dual_quaternions_ros"
ROS_BPN = "dual_quaternions_ros"

ROS_BUILD_DEPENDS = " \
    ros1-geometry-msgs \
    ros1-rospy \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-geometry-msgs \
    ros1-rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-dual-quaternions \
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

# matches with: https://github.com/Achllle/dual_quaternions_ros-release/archive/release/melodic/dual_quaternions_ros/0.1.4-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/dual_quaternions_ros"
SRC_URI = "git://github.com/Achllle/dual_quaternions_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "44a5e3b478f829da233b4292fd8d34b4bfb055a5"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}