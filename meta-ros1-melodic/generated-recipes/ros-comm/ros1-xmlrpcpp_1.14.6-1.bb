# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "XmlRpc++ is a C++ implementation of the XML-RPC protocol. This version is     heavily modified from the package available on SourceForge in order to     support roscpp's threading model. As such, we are maintaining our     own fork."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Chris Morley"
HOMEPAGE = "http://xmlrpcpp.sourceforge.net"
SECTION = "devel"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=184dd1523b9a109aead3fbbe0b4262e0"

ROS_CN = "ros_comm"
ROS_BPN = "xmlrpcpp"

ROS_BUILD_DEPENDS = " \
    ros1-cpp-common \
    ros1-rostime \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-cpp-common \
    ros1-rostime \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-cpp-common \
    ros1-rostime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    boost \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/xmlrpcpp/1.14.6-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/xmlrpcpp"
SRC_URI = "git://github.com/ros-gbp/ros_comm-release;${ROS_BRANCH};protocol=https"
SRCREV = "44709de84b655c2ddd67f4d090548a89e208d72b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
