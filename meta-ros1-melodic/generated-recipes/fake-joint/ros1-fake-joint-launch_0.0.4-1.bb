# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Collection of the launch files for fake_joint_driver."
AUTHOR = "Tokyo Opensource Robotics Kyokai (TORK) Developer Team <dev@opensource-robotics.tokyo.jp>"
ROS_AUTHOR = "Ryosuke Tajima <ryosuke.tajima@opensource-robotics.tokyo.jp>"
HOMEPAGE = "http://wiki.ros.org/fake_joint_launch"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "fake_joint"
ROS_BPN = "fake_joint_launch"

ROS_BUILD_DEPENDS = " \
    ros1-fake-joint-driver \
    ros1-roslaunch \
    ros1-rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-fake-joint-driver \
    ros1-roslaunch \
    ros1-rostest \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-abb-irb2400-support \
    ros1-controller-manager \
    ros1-fake-joint-driver \
    ros1-pr2-description \
    ros1-robot-state-publisher \
    ros1-roslaunch \
    ros1-rostest \
    ros1-rviz \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/fake_joint-release/archive/release/melodic/fake_joint_launch/0.0.4-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/fake_joint_launch"
SRC_URI = "git://github.com/tork-a/fake_joint-release;${ROS_BRANCH};protocol=https"
SRCREV = "d5d7e3f1e3ca810b577ac5f97247f02a7a2c4d37"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
