# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package provides some worlds for gazebo simulation."
AUTHOR = "Jannik Abbenseth <jba@ipa.fhg.de>"
ROS_AUTHOR = "Felix Messmer <fxm@ipa.fhg.de>"
HOMEPAGE = "http://ros.org/wiki/cob_gazebo_worlds"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_simulation"
ROS_BPN = "cob_gazebo_worlds"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-cob-default-env-config \
    ros1-controller-manager \
    ros1-gazebo-msgs \
    ros1-gazebo-ros \
    ros1-gazebo-ros-control \
    ros1-joint-state-controller \
    ros1-joint-state-publisher \
    ros1-position-controllers \
    ros1-robot-state-publisher \
    ros1-rospy \
    ros1-std-msgs \
    ros1-tf \
    ros1-velocity-controllers \
    ros1-xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-cob-default-env-config \
    ros1-roslaunch \
    ros1-rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_simulation-release/archive/release/melodic/cob_gazebo_worlds/0.7.4-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cob_gazebo_worlds"
SRC_URI = "git://github.com/ipa320/cob_simulation-release;${ROS_BRANCH};protocol=https"
SRCREV = "3df6d0724bd29ec272a53d306d8e6487fd52edc8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
