# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Kinematics plugin for Fetch robot, generated through IKFast"
AUTHOR = "Russell Toris <rtoris@fetchrobotics.com>"
ROS_AUTHOR = "Michael Ferguson"
HOMEPAGE = "http://docs.fetchrobotics.com/manipulation.html"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=c93e37fc0c6f510db5735eb91dcc1550"

ROS_CN = "fetch_ros"
ROS_BPN = "fetch_ikfast_plugin"

ROS_BUILD_DEPENDS = " \
    lapack \
    ros1-eigen-conversions \
    ros1-moveit-core \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-tf2-eigen \
    ros1-tf2-kdl \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    lapack \
    ros1-eigen-conversions \
    ros1-moveit-core \
    ros1-pluginlib \
    ros1-roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    lapack \
    ros1-eigen-conversions \
    ros1-moveit-core \
    ros1-pluginlib \
    ros1-roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_ikfast_plugin/0.8.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/fetch_ikfast_plugin"
SRC_URI = "git://github.com/fetchrobotics-gbp/fetch_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "a2760424ab11f97624e76ebd4d687e7fb0bac752"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
