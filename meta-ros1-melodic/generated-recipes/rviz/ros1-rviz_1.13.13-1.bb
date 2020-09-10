# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "3D visualization tool for ROS."
AUTHOR = "William Woodall <william@osrfoundation.org>"
ROS_AUTHOR = "Dave Hershberger"
HOMEPAGE = "http://wiki.ros.org/rviz"
SECTION = "devel"
LICENSE = "BSD & CC-BY-SA-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rviz"
ROS_BPN = "rviz"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libogre-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libqt5-opengl-dev} \
    assimp \
    libeigen \
    libtinyxml2 \
    mesa \
    qtbase \
    ros1-cmake-modules \
    ros1-geometry-msgs \
    ros1-image-transport \
    ros1-interactive-markers \
    ros1-laser-geometry \
    ros1-map-msgs \
    ros1-message-filters \
    ros1-message-generation \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-python-qt-binding \
    ros1-resource-retriever \
    ros1-rosbag \
    ros1-rosconsole \
    ros1-roscpp \
    ros1-roslib \
    ros1-rospy \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-std-srvs \
    ros1-tf \
    ros1-urdf \
    ros1-visualization-msgs \
    urdfdom \
    urdfdom-headers \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libogre-dev} \
    assimp \
    libtinyxml2 \
    mesa \
    ros1-geometry-msgs \
    ros1-image-transport \
    ros1-interactive-markers \
    ros1-laser-geometry \
    ros1-map-msgs \
    ros1-message-filters \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-python-qt-binding \
    ros1-resource-retriever \
    ros1-rosbag \
    ros1-rosconsole \
    ros1-roscpp \
    ros1-roslib \
    ros1-rospy \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-std-srvs \
    ros1-tf \
    ros1-urdf \
    ros1-visualization-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libogre-dev} \
    assimp \
    libtinyxml2 \
    mesa \
    qtbase \
    ros1-geometry-msgs \
    ros1-image-transport \
    ros1-interactive-markers \
    ros1-laser-geometry \
    ros1-map-msgs \
    ros1-media-export \
    ros1-message-filters \
    ros1-message-runtime \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-python-qt-binding \
    ros1-resource-retriever \
    ros1-rosbag \
    ros1-rosconsole \
    ros1-roscpp \
    ros1-roslib \
    ros1-rospy \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-std-srvs \
    ros1-tf \
    ros1-urdf \
    ros1-visualization-msgs \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-rostest \
    ros1-rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/rviz-release/archive/release/melodic/rviz/1.13.13-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rviz"
SRC_URI = "git://github.com/ros-gbp/rviz-release;${ROS_BRANCH};protocol=https"
SRCREV = "513044877d43d97ce054af62011eee9e3ec5dc4f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}