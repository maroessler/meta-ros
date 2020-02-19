# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "multisense catkin driver"
AUTHOR = "Maintained by Carnegie Robotics LLC <support@carnegierobotics.com>"
ROS_AUTHOR = "Maintained by CarnegieRobotics LLC"
HOMEPAGE = "http://ros.org/wiki/multisense"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "multisense_ros"
ROS_BPN = "multisense"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-multisense-bringup \
    ros1-multisense-cal-check \
    ros1-multisense-description \
    ros1-multisense-lib \
    ros1-multisense-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-multisense-bringup \
    ros1-multisense-cal-check \
    ros1-multisense-description \
    ros1-multisense-lib \
    ros1-multisense-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/carnegieroboticsllc/multisense_ros-release/archive/release/melodic/multisense/4.0.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/multisense"
SRC_URI = "git://github.com/carnegieroboticsllc/multisense_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "a2df878d0878719f47c7c523ae42e233fd0f5cad"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
