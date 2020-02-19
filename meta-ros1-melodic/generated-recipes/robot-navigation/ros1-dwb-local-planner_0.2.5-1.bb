# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Plugin based local planner implementing the nav_core2::LocalPlanner interface."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
ROS_AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "robot_navigation"
ROS_BPN = "dwb_local_planner"

ROS_BUILD_DEPENDS = " \
    ros1-dwb-msgs \
    ros1-geometry-msgs \
    ros1-nav-2d-msgs \
    ros1-nav-2d-utils \
    ros1-nav-core2 \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-tf \
    ros1-visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-dwb-msgs \
    ros1-geometry-msgs \
    ros1-nav-2d-msgs \
    ros1-nav-2d-utils \
    ros1-nav-core2 \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-tf \
    ros1-visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-dwb-msgs \
    ros1-geometry-msgs \
    ros1-nav-2d-msgs \
    ros1-nav-2d-utils \
    ros1-nav-core2 \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-tf \
    ros1-visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-roslint \
    ros1-rostest \
    ros1-rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/DLu/robot_navigation-release/archive/release/melodic/dwb_local_planner/0.2.5-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/dwb_local_planner"
SRC_URI = "git://github.com/DLu/robot_navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "8a0913ef1269b590e8662b0674027eaf1f83534c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
