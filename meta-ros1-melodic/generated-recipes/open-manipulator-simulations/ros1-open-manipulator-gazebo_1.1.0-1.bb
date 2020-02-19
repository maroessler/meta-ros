# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Gazebo configurations package for OpenManipulator"
AUTHOR = "Pyo <pyo@robotis.com>"
ROS_AUTHOR = "Darby Lim <thlim@robotis.com>"
HOMEPAGE = "http://wiki.ros.org/open_manipulator_gazebo"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "open_manipulator_simulations"
ROS_BPN = "open_manipulator_gazebo"

ROS_BUILD_DEPENDS = " \
    ros1-controller-manager \
    ros1-gazebo-ros \
    ros1-gazebo-ros-control \
    ros1-roscpp \
    ros1-std-msgs \
    ros1-urdf \
    ros1-xacro \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-controller-manager \
    ros1-gazebo-ros \
    ros1-gazebo-ros-control \
    ros1-roscpp \
    ros1-std-msgs \
    ros1-urdf \
    ros1-xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-controller-manager \
    ros1-gazebo-ros \
    ros1-gazebo-ros-control \
    ros1-roscpp \
    ros1-std-msgs \
    ros1-urdf \
    ros1-xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ROBOTIS-GIT-release/open_manipulator_simulations-release/archive/release/melodic/open_manipulator_gazebo/1.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/open_manipulator_gazebo"
SRC_URI = "git://github.com/ROBOTIS-GIT-release/open_manipulator_simulations-release;${ROS_BRANCH};protocol=https"
SRCREV = "f31390bdcfb92df080694292c52df8b11852bd16"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
