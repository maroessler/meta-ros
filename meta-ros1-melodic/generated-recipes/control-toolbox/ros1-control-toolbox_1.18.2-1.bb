# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The control toolbox contains modules that are useful across all controllers."
AUTHOR = "Bence Magyar <bence.magyar.robotics@gmail.com>"
ROS_AUTHOR = "Melonee Wise"
HOMEPAGE = "http://ros.org/wiki/control_toolbox"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "control_toolbox"
ROS_BPN = "control_toolbox"

ROS_BUILD_DEPENDS = " \
    libtinyxml \
    ros1-cmake-modules \
    ros1-control-msgs \
    ros1-dynamic-reconfigure \
    ros1-message-generation \
    ros1-realtime-tools \
    ros1-roscpp \
    ros1-std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    libtinyxml \
    ros1-control-msgs \
    ros1-dynamic-reconfigure \
    ros1-realtime-tools \
    ros1-roscpp \
    ros1-std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libtinyxml \
    ros1-control-msgs \
    ros1-dynamic-reconfigure \
    ros1-message-runtime \
    ros1-realtime-tools \
    ros1-roscpp \
    ros1-std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/control_toolbox-release/archive/release/melodic/control_toolbox/1.18.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/control_toolbox"
SRC_URI = "git://github.com/ros-gbp/control_toolbox-release;${ROS_BRANCH};protocol=https"
SRCREV = "d5c9c76f92d006f5fe3ca84163da249a24b2ff94"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
