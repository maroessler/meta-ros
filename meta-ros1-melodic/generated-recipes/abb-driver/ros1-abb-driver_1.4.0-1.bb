# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "<p>      ROS-Industrial nodes for interfacing with ABB robot controllers.    </p>    <p>      This package is part of the ROS-Industrial program and contains nodes       for interfacing with ABB industrial robot controllers.    </p>"
AUTHOR = "Levi Armstrong (Southwest Research Institute) <levi.armstrong@swri.org>"
ROS_AUTHOR = "Edward Venator"
HOMEPAGE = "http://wiki.ros.org/abb_driver"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "abb_driver"
ROS_BPN = "abb_driver"

ROS_BUILD_DEPENDS = " \
    ros1-industrial-robot-client \
    ros1-simple-message \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-industrial-robot-client \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-industrial-robot-client \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-industrial-release/abb_driver-release/archive/release/melodic/abb_driver/1.4.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/abb_driver"
SRC_URI = "git://github.com/ros-industrial-release/abb_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "30d266f399980e6d4f2fc864e37062f68fe3cd36"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
