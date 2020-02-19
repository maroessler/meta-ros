# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package depends on a recent version of the Kinematics and Dynamics     Library (KDL), distributed by the Orocos Project. It is a meta-package that     depends on kdl which contains the c++ version and pykdl which contains the     generated python bindings."
AUTHOR = "Orocos Developers <orocos-dev@lists.mech.kuleuven.be>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

ROS_CN = "orocos_kinematics_dynamics"
ROS_BPN = "orocos_kinematics_dynamics"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-orocos-kdl \
    ros1-python-orocos-kdl \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-orocos-kdl \
    ros1-python-orocos-kdl \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/orocos/orocos-kdl-release/archive/release/melodic/orocos_kinematics_dynamics/1.4.0-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/orocos_kinematics_dynamics"
SRC_URI = "git://github.com/orocos/orocos-kdl-release;${ROS_BRANCH};protocol=https"
SRCREV = "ffb71fe0e503ea266894b1c6e002450abf71701f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
