# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The laser_scan_publisher_tutorial package"
AUTHOR = "William Woodall <william@osrfoundation.org>"
ROS_AUTHOR = "Eitan Marder-Eppstein"
HOMEPAGE = "http://ros.org/wiki/laser_scan_publisher_tutorial"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "navigation_tutorials"
ROS_BPN = "laser_scan_publisher_tutorial"

ROS_BUILD_DEPENDS = " \
    ros1-roscpp \
    ros1-sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-roscpp \
    ros1-sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-roscpp \
    ros1-sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/navigation_tutorials-release/archive/release/melodic/laser_scan_publisher_tutorial/0.2.4-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/laser_scan_publisher_tutorial"
SRC_URI = "git://github.com/ros-gbp/navigation_tutorials-release;${ROS_BRANCH};protocol=https"
SRCREV = "5fce6d384054eaa5b391ba6dca86c2c47cf9ac83"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
