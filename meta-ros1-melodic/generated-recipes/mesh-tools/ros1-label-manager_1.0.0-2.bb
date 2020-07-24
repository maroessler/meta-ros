# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Serving and persisting label information"
AUTHOR = "Sebastian Pütz <spuetz@uos.de>"
ROS_AUTHOR = "Sebastian Pütz <spuetz@uos.de>"
HOMEPAGE = "http://wiki.ros.org/ros_mesh_tools/label_manager"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=76ea7cd512d17201ff67e2488e8c4ce3"

ROS_CN = "mesh_tools"
ROS_BPN = "label_manager"

ROS_BUILD_DEPENDS = " \
    ros1-actionlib \
    ros1-actionlib-msgs \
    ros1-genmsg \
    ros1-mesh-msgs \
    ros1-message-generation \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-actionlib \
    ros1-actionlib-msgs \
    ros1-genmsg \
    ros1-mesh-msgs \
    ros1-message-generation \
    ros1-message-runtime \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-actionlib \
    ros1-actionlib-msgs \
    ros1-genmsg \
    ros1-mesh-msgs \
    ros1-message-generation \
    ros1-message-runtime \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uos-gbp/mesh-tools/archive/release/melodic/label_manager/1.0.0-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/label_manager"
SRC_URI = "git://github.com/uos-gbp/mesh-tools;${ROS_BRANCH};protocol=https"
SRCREV = "ef7c2025a882e538590e1b0acf3c69184511ab8c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
