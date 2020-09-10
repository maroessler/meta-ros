# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The rqt_virtual_joy package"
AUTHOR = "Hikaru Sugiura <hikaru.sugiura@whill.inc>"
ROS_AUTHOR = "Hikaru Sugiura <hikaru.sugiura@whill.inc>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "rqt_virtual_joy"
ROS_BPN = "rqt_virtual_joy"

ROS_BUILD_DEPENDS = " \
    ros1-rospy \
    ros1-rqt-gui \
    ros1-rqt-gui-py \
    ros1-sensor-msgs \
    ros1-std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-rospy \
    ros1-rqt-gui \
    ros1-rqt-gui-py \
    ros1-sensor-msgs \
    ros1-std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-rospy \
    ros1-rqt-gui \
    ros1-rqt-gui-py \
    ros1-sensor-msgs \
    ros1-std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/aquahika/rqt_virtual_joystick-release/archive/release/melodic/rqt_virtual_joy/0.1.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rqt_virtual_joy"
SRC_URI = "git://github.com/aquahika/rqt_virtual_joystick-release;${ROS_BRANCH};protocol=https"
SRCREV = "65681359d09c212b8acd63fd4a4ac1e19922a9bc"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}