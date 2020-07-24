# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Components of MoveIt! that offer visualization"
AUTHOR = "Jon Binney <jon.binney@gmail.com>"
ROS_AUTHOR = "Ioan Sucan <isucan@google.com>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit"
ROS_BPN = "moveit_ros_visualization"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libogre-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libqt5-opengl-dev} \
    libeigen \
    qtbase \
    ros1-class-loader \
    ros1-geometric-shapes \
    ros1-interactive-markers \
    ros1-moveit-ros-perception \
    ros1-moveit-ros-planning-interface \
    ros1-moveit-ros-robot-interaction \
    ros1-moveit-ros-warehouse \
    ros1-object-recognition-msgs \
    ros1-pluginlib \
    ros1-rosconsole \
    ros1-roscpp \
    ros1-rospy \
    ros1-rviz \
    ros1-tf2-eigen \
"

ROS_BUILDTOOL_DEPENDS = " \
    pkgconfig-native \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-geometric-shapes \
    ros1-interactive-markers \
    ros1-moveit-ros-perception \
    ros1-moveit-ros-planning-interface \
    ros1-moveit-ros-robot-interaction \
    ros1-moveit-ros-warehouse \
    ros1-object-recognition-msgs \
    ros1-pluginlib \
    ros1-rosconsole \
    ros1-roscpp \
    ros1-rospy \
    ros1-rviz \
    ros1-tf2-eigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-geometric-shapes \
    ros1-interactive-markers \
    ros1-moveit-ros-perception \
    ros1-moveit-ros-planning-interface \
    ros1-moveit-ros-robot-interaction \
    ros1-moveit-ros-warehouse \
    ros1-object-recognition-msgs \
    ros1-pluginlib \
    ros1-rosconsole \
    ros1-roscpp \
    ros1-rospy \
    ros1-rviz \
    ros1-tf2-eigen \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_visualization/1.0.5-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/moveit_ros_visualization"
SRC_URI = "git://github.com/ros-gbp/moveit-release;${ROS_BRANCH};protocol=https"
SRCREV = "37fa364723c80e36eba295568f60ce15c138777c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
