# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "AutonomouStuff PACMod driver package"
AUTHOR = "AutonomouStuff Software Team <software@autonomoustuff.com>"
ROS_AUTHOR = "Joe Driscoll <jdriscoll@autonomoustuff.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "pacmod"
ROS_BPN = "pacmod"

ROS_BUILD_DEPENDS = " \
    ros1-can-msgs \
    ros1-pacmod-msgs \
    ros1-roscpp \
    ros1-roslint \
    ros1-std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-can-msgs \
    ros1-pacmod-msgs \
    ros1-roscpp \
    ros1-std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-can-msgs \
    ros1-pacmod-msgs \
    ros1-roscpp \
    ros1-std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/astuff/pacmod-release/archive/release/melodic/pacmod/2.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pacmod"
SRC_URI = "git://github.com/astuff/pacmod-release;${ROS_BRANCH};protocol=https"
SRCREV = "6f41f7855ac3d751b1ac9e80be9354da323a551c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
