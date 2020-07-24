# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "navfn provides a fast interpolated navigation function that can be used to create plans for         a mobile base. The planner assumes a circular robot and operates on a costmap to find a         minimum cost plan from a start point to an end point in a grid. The navigation function is         computed with Dijkstra's algorithm, but support for an A* heuristic may also be added in the         near future. navfn also provides a ROS wrapper for the navfn planner that adheres to the         nav_core::BaseGlobalPlanner interface specified in <a href="http://wiki.ros.org/nav_core">nav_core</a>."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
ROS_AUTHOR = "Kurt Konolige"
HOMEPAGE = "http://wiki.ros.org/navfn"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "navigation"
ROS_BPN = "navfn"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_netpbm} \
    ros1-cmake-modules \
    ros1-costmap-2d \
    ros1-geometry-msgs \
    ros1-message-generation \
    ros1-nav-core \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-rosconsole \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-tf2-ros \
    ros1-visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-costmap-2d \
    ros1-geometry-msgs \
    ros1-nav-core \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-rosconsole \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-tf2-ros \
    ros1-visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-costmap-2d \
    ros1-geometry-msgs \
    ros1-message-runtime \
    ros1-nav-core \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-rosconsole \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-tf2-ros \
    ros1-visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/navigation-release/archive/release/melodic/navfn/1.16.6-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/navfn"
SRC_URI = "git://github.com/ros-gbp/navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "c6db4d7571075d691bc06b09a649c1bbe2e69f3e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
