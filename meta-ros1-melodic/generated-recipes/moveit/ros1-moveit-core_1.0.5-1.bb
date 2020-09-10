# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Core libraries used by MoveIt!"
AUTHOR = "Dave Coleman <dave@picknik.ai>"
ROS_AUTHOR = "Ioan Sucan <isucan@google.com>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit"
ROS_BPN = "moveit_core"

ROS_BUILD_DEPENDS = " \
    assimp \
    boost \
    console-bridge \
    fcl \
    libeigen \
    ros1-eigen-stl-containers \
    ros1-geometric-shapes \
    ros1-geometry-msgs \
    ros1-kdl-parser \
    ros1-moveit-msgs \
    ros1-octomap \
    ros1-octomap-msgs \
    ros1-random-numbers \
    ros1-rosconsole \
    ros1-roslib \
    ros1-rostime \
    ros1-sensor-msgs \
    ros1-shape-msgs \
    ros1-srdfdom \
    ros1-std-msgs \
    ros1-tf2-eigen \
    ros1-tf2-geometry-msgs \
    ros1-trajectory-msgs \
    ros1-urdf \
    ros1-visualization-msgs \
    ros1-xmlrpcpp \
    urdfdom \
    urdfdom-headers \
"

ROS_BUILDTOOL_DEPENDS = " \
    pkgconfig-native \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    assimp \
    boost \
    console-bridge \
    fcl \
    libeigen \
    ros1-eigen-stl-containers \
    ros1-geometric-shapes \
    ros1-geometry-msgs \
    ros1-kdl-parser \
    ros1-moveit-msgs \
    ros1-octomap \
    ros1-octomap-msgs \
    ros1-random-numbers \
    ros1-rosconsole \
    ros1-roslib \
    ros1-rostime \
    ros1-sensor-msgs \
    ros1-shape-msgs \
    ros1-srdfdom \
    ros1-std-msgs \
    ros1-tf2-eigen \
    ros1-tf2-geometry-msgs \
    ros1-trajectory-msgs \
    ros1-urdf \
    ros1-visualization-msgs \
    ros1-xmlrpcpp \
    urdfdom \
    urdfdom-headers \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    assimp \
    boost \
    console-bridge \
    fcl \
    libeigen \
    ros1-eigen-stl-containers \
    ros1-geometric-shapes \
    ros1-geometry-msgs \
    ros1-kdl-parser \
    ros1-moveit-msgs \
    ros1-octomap \
    ros1-octomap-msgs \
    ros1-random-numbers \
    ros1-rosconsole \
    ros1-roslib \
    ros1-rostime \
    ros1-sensor-msgs \
    ros1-shape-msgs \
    ros1-srdfdom \
    ros1-std-msgs \
    ros1-tf2-eigen \
    ros1-tf2-geometry-msgs \
    ros1-trajectory-msgs \
    ros1-urdf \
    ros1-visualization-msgs \
    ros1-xmlrpcpp \
    urdfdom \
    urdfdom-headers \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-angles \
    ros1-code-coverage \
    ros1-moveit-resources \
    ros1-orocos-kdl \
    ros1-rosunit \
    ros1-tf2-kdl \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_core/1.0.5-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/moveit_core"
SRC_URI = "git://github.com/ros-gbp/moveit-release;${ROS_BRANCH};protocol=https"
SRCREV = "3b055a46c8e10c2eaeb08af39be15dc2b2e385a8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}