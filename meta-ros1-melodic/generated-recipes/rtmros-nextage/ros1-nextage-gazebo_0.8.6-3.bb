# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Gazebo simulation for NEXTAGE Open"
AUTHOR = "TORK <dev@opensource-robotics.tokyo.jp>"
ROS_AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://wiki.ros.org/nextage_gazebo"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rtmros_nextage"
ROS_BPN = "nextage_gazebo"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-gazebo-plugins \
    ros1-gazebo-ros \
    ros1-gazebo-ros-control \
    ros1-nextage-description \
    ros1-nextage-moveit-config \
    ros1-ros-controllers \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-gazebo-plugins \
    ros1-gazebo-ros \
    ros1-gazebo-ros-control \
    ros1-nextage-description \
    ros1-nextage-moveit-config \
    ros1-ros-controllers \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/rtmros_nextage-release/archive/release/melodic/nextage_gazebo/0.8.6-3.tar.gz
ROS_BRANCH ?= "branch=release/melodic/nextage_gazebo"
SRC_URI = "git://github.com/tork-a/rtmros_nextage-release;${ROS_BRANCH};protocol=https"
SRCREV = "1eb1f24b2db4f1367c2bc721f889ca13621dfd86"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
