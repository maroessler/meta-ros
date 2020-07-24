# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "pr2_teleop_general"
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Gil Jones"
HOMEPAGE = "http://ros.org/wiki/pr2_teleop_general"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_apps"
ROS_BPN = "pr2_teleop_general"

ROS_BUILD_DEPENDS = " \
    ros1-actionlib \
    ros1-actionlib-msgs \
    ros1-angles \
    ros1-geometry-msgs \
    ros1-moveit-msgs \
    ros1-polled-camera \
    ros1-pr2-common-action-msgs \
    ros1-pr2-controller-manager \
    ros1-pr2-controllers-msgs \
    ros1-pr2-mechanism-msgs \
    ros1-pr2-msgs \
    ros1-ps3joy \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-tf \
    ros1-urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-actionlib \
    ros1-actionlib-msgs \
    ros1-angles \
    ros1-geometry-msgs \
    ros1-moveit-msgs \
    ros1-polled-camera \
    ros1-pr2-arm-kinematics \
    ros1-pr2-common-action-msgs \
    ros1-pr2-controller-manager \
    ros1-pr2-controllers-msgs \
    ros1-pr2-mannequin-mode \
    ros1-pr2-mechanism-msgs \
    ros1-pr2-msgs \
    ros1-pr2-tuck-arms-action \
    ros1-ps3joy \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-tf \
    ros1-urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-actionlib \
    ros1-actionlib-msgs \
    ros1-angles \
    ros1-geometry-msgs \
    ros1-moveit-msgs \
    ros1-polled-camera \
    ros1-pr2-arm-kinematics \
    ros1-pr2-common-action-msgs \
    ros1-pr2-controller-manager \
    ros1-pr2-controllers-msgs \
    ros1-pr2-mannequin-mode \
    ros1-pr2-mechanism-msgs \
    ros1-pr2-msgs \
    ros1-pr2-tuck-arms-action \
    ros1-ps3joy \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-tf \
    ros1-urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pr2-gbp/pr2_apps-release/archive/release/melodic/pr2_teleop_general/0.6.1-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pr2_teleop_general"
SRC_URI = "git://github.com/pr2-gbp/pr2_apps-release;${ROS_BRANCH};protocol=https"
SRCREV = "22364a4649688fed7cbea222262e30caa86cf7bc"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
