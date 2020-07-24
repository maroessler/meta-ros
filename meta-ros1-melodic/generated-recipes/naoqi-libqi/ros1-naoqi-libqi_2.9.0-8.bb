# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Aldebaran's libqi: a core library for NAOqiOS development"
AUTHOR = "Maxime Busy <mbusy@softbankrobotics.com>"
ROS_AUTHOR = "Aldebaran"
HOMEPAGE = "http://doc.aldebaran.com/libqi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "naoqi_libqi"
ROS_BPN = "naoqi_libqi"

ROS_BUILD_DEPENDS = " \
    boost \
    openssl \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    openssl \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    openssl \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-naoqi/libqi-release/archive/release/melodic/naoqi_libqi/2.9.0-8.tar.gz
ROS_BRANCH ?= "branch=release/melodic/naoqi_libqi"
SRC_URI = "git://github.com/ros-naoqi/libqi-release;${ROS_BRANCH};protocol=https"
SRCREV = "9eb7286e402f7e7c9069f9c60231f29421184828"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
