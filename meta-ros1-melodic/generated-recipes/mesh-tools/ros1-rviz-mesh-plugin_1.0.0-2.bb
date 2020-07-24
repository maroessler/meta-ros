# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "RViz display types and tools for the mesh_msgs package."
AUTHOR = "Sebastian Pütz <spuetz@uos.de>"
ROS_AUTHOR = "Sebastian Pütz <spuetz@uos.de>"
HOMEPAGE = "http://wiki.ros.org/ros_mesh_tools/rviz_mesh_plugin"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=76ea7cd512d17201ff67e2488e8c4ce3"

ROS_CN = "mesh_tools"
ROS_BPN = "rviz_mesh_plugin"

ROS_BUILD_DEPENDS = " \
    qtbase \
    ros1-mesh-msgs \
    ros1-roscpp \
    ros1-rviz \
    ros1-std-msgs \
    ros1-tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    qtbase \
    ros1-mesh-msgs \
    ros1-roscpp \
    ros1-rviz \
    ros1-std-msgs \
    ros1-tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    qtbase \
    ros1-mesh-msgs \
    ros1-roscpp \
    ros1-rviz \
    ros1-std-msgs \
    ros1-tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uos-gbp/mesh-tools/archive/release/melodic/rviz_mesh_plugin/1.0.0-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rviz_mesh_plugin"
SRC_URI = "git://github.com/uos-gbp/mesh-tools;${ROS_BRANCH};protocol=https"
SRCREV = "bdc6a85d748b8d772017a1599a61fb26066a30ad"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
