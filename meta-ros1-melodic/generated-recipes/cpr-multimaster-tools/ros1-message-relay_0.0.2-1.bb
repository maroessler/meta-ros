# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Package to programmatically spawn message, service, and action relays. To add support for a message/service dependency, please add to the build dependencies in package.xml and CMakeLists.txt"
AUTHOR = "Paul Bovbel <pbovbel@clearpath.ai>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "cpr_multimaster_tools"
ROS_BPN = "message_relay"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-cheetah} \
    ros1-actionlib-msgs \
    ros1-controller-manager-msgs \
    ros1-diagnostic-msgs \
    ros1-gazebo-msgs \
    ros1-geometry-msgs \
    ros1-map-msgs \
    ros1-move-base-msgs \
    ros1-multimaster-msgs \
    ros1-nav-msgs \
    ros1-robot-localization \
    ros1-roscpp \
    ros1-rosgraph-msgs \
    ros1-sensor-msgs \
    ros1-shape-msgs \
    ros1-std-msgs \
    ros1-std-srvs \
    ros1-stereo-msgs \
    ros1-tf2-msgs \
    ros1-trajectory-msgs \
    ros1-visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-actionlib-msgs \
    ros1-controller-manager-msgs \
    ros1-diagnostic-msgs \
    ros1-gazebo-msgs \
    ros1-geometry-msgs \
    ros1-map-msgs \
    ros1-move-base-msgs \
    ros1-multimaster-msgs \
    ros1-nav-msgs \
    ros1-robot-localization \
    ros1-roscpp \
    ros1-rosgraph-msgs \
    ros1-sensor-msgs \
    ros1-shape-msgs \
    ros1-std-msgs \
    ros1-std-srvs \
    ros1-stereo-msgs \
    ros1-tf2-msgs \
    ros1-trajectory-msgs \
    ros1-visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-actionlib-msgs \
    ros1-controller-manager-msgs \
    ros1-diagnostic-msgs \
    ros1-gazebo-msgs \
    ros1-geometry-msgs \
    ros1-map-msgs \
    ros1-move-base-msgs \
    ros1-multimaster-msgs \
    ros1-nav-msgs \
    ros1-robot-localization \
    ros1-roscpp \
    ros1-rosgraph-msgs \
    ros1-sensor-msgs \
    ros1-shape-msgs \
    ros1-std-msgs \
    ros1-std-srvs \
    ros1-stereo-msgs \
    ros1-tf2-msgs \
    ros1-trajectory-msgs \
    ros1-visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-roslaunch \
    ros1-roslint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/cpr_multimaster_tools-release/archive/release/melodic/message_relay/0.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/message_relay"
SRC_URI = "git://github.com/clearpath-gbp/cpr_multimaster_tools-release;${ROS_BRANCH};protocol=https"
SRCREV = "eeaacfe61cbe6bc6abc0b4872414896d69e09eb5"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}