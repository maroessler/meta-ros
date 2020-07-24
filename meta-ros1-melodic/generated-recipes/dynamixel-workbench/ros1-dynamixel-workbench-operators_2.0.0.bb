# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package contains nodes that control the Dynamixel by communicating with the server registered in the 'dynamixel_workbench_controllers' package"
AUTHOR = "Pyo <pyo@robotis.com>"
ROS_AUTHOR = "Darby Lim <thlim@robotis.com>"
HOMEPAGE = "http://wiki.ros.org/dynamixel_workbench_operators"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "dynamixel-workbench"
ROS_BPN = "dynamixel_workbench_operators"

ROS_BUILD_DEPENDS = " \
    ros1-cmake-modules \
    ros1-geometry-msgs \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-srvs \
    ros1-trajectory-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-cmake-modules \
    ros1-geometry-msgs \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-srvs \
    ros1-trajectory-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-cmake-modules \
    ros1-geometry-msgs \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-srvs \
    ros1-trajectory-msgs \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ROBOTIS-GIT-release/dynamixel-workbench-release/archive/release/melodic/dynamixel_workbench_operators/2.0.0-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/dynamixel_workbench_operators"
SRC_URI = "git://github.com/ROBOTIS-GIT-release/dynamixel-workbench-release;${ROS_BRANCH};protocol=https"
SRCREV = "38129af3747347db2005f44766eb404ac2a1db85"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
