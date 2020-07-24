# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Provides nonlinear state estimation through sensor fusion of an abritrary number of sensors."
AUTHOR = "Tom Moore <ayrton04@gmail.com>"
ROS_AUTHOR = "Tom Moore <ayrton04@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/robot_localization"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "robot_localization"
ROS_BPN = "robot_localization"

ROS_BUILD_DEPENDS = " \
    libeigen \
    python-catkin-pkg \
    ros1-cmake-modules \
    ros1-diagnostic-msgs \
    ros1-diagnostic-updater \
    ros1-eigen-conversions \
    ros1-geographic-msgs \
    ros1-geometry-msgs \
    ros1-message-filters \
    ros1-message-generation \
    ros1-nav-msgs \
    ros1-nodelet \
    ros1-roscpp \
    ros1-roslint \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-std-srvs \
    ros1-tf2 \
    ros1-tf2-geometry-msgs \
    ros1-tf2-ros \
    ros1-xmlrpcpp \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    libeigen \
    ros1-cmake-modules \
    ros1-diagnostic-msgs \
    ros1-diagnostic-updater \
    ros1-eigen-conversions \
    ros1-geographic-msgs \
    ros1-geometry-msgs \
    ros1-message-filters \
    ros1-nav-msgs \
    ros1-nodelet \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-std-srvs \
    ros1-tf2 \
    ros1-tf2-geometry-msgs \
    ros1-tf2-ros \
    ros1-xmlrpcpp \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libeigen \
    ros1-cmake-modules \
    ros1-diagnostic-msgs \
    ros1-diagnostic-updater \
    ros1-eigen-conversions \
    ros1-geographic-msgs \
    ros1-geometry-msgs \
    ros1-message-filters \
    ros1-message-runtime \
    ros1-nav-msgs \
    ros1-nodelet \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-std-srvs \
    ros1-tf2 \
    ros1-tf2-geometry-msgs \
    ros1-tf2-ros \
    ros1-xmlrpcpp \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-rosbag \
    ros1-rostest \
    ros1-rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/cra-ros-pkg/robot_localization-release/archive/release/melodic/robot_localization/2.6.7-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/robot_localization"
SRC_URI = "git://github.com/cra-ros-pkg/robot_localization-release;${ROS_BRANCH};protocol=https"
SRCREV = "099d3b6cc4d9a938b8724f640fa9fb1513bb17dd"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
