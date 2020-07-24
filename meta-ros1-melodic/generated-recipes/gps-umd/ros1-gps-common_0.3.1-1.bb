# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "GPS messages and common routines for use in GPS drivers"
AUTHOR = "Timo Roehling <timo.roehling@fkie.fraunhofer.de>"
HOMEPAGE = "http://ros.org/wiki/gps_common"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "gps_umd"
ROS_BPN = "gps_common"

ROS_BUILD_DEPENDS = " \
    ros1-message-filters \
    ros1-message-generation \
    ros1-nav-msgs \
    ros1-roscpp \
    ros1-rospy \
    ros1-sensor-msgs \
    ros1-std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-message-filters \
    ros1-message-runtime \
    ros1-nav-msgs \
    ros1-roscpp \
    ros1-rospy \
    ros1-sensor-msgs \
    ros1-std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-message-filters \
    ros1-message-runtime \
    ros1-nav-msgs \
    ros1-roscpp \
    ros1-rospy \
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

# matches with: https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/melodic/gps_common/0.3.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/gps_common"
SRC_URI = "git://github.com/swri-robotics-gbp/gps_umd-release;${ROS_BRANCH};protocol=https"
SRCREV = "db4a66f41a17feb0ae7b1ddfa58eaaa41c91410f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
