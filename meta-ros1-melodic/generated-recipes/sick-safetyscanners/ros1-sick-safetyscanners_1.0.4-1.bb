# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Provides an Interface to read the sensor output of a SICK   Safety Scanner"
AUTHOR = "Lennart Puck <puck@fzi.de>"
ROS_AUTHOR = "Lennart Puck"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "ALv2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=48a602c865794401f5c0c56e309d9596"

ROS_CN = "sick_safetyscanners"
ROS_BPN = "sick_safetyscanners"

ROS_BUILD_DEPENDS = " \
    ros1-dynamic-reconfigure \
    ros1-message-generation \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-dynamic-reconfigure \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-dynamic-reconfigure \
    ros1-message-runtime \
    ros1-roscpp \
    ros1-rqt-reconfigure \
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

# matches with: https://github.com/SICKAG/sick_safetyscanners-release/archive/release/melodic/sick_safetyscanners/1.0.4-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/sick_safetyscanners"
SRC_URI = "git://github.com/SICKAG/sick_safetyscanners-release;${ROS_BRANCH};protocol=https"
SRCREV = "2d274d77450c3a21d4260b6e78064561e34a1e39"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}