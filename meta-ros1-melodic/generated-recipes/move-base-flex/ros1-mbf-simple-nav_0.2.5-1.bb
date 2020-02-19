# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The mbf_simple_nav package contains a simple navigation server implementation of Move Base Flex (MBF). The simple navigation server is bound to no map representation. It provides actions for planning, controlling and recovering. MBF loads all defined plugins which are defined in the lists *planners*, *controllers* and *recovery_behaviors*. Each list holds a pair of a *name* and a *type*. The *type* defines which kind of plugin to load. The *name* defines under which name the plugin should be callable by the actions.           It tries to load the defined plugins which implements the defined interfaces in <a href="wiki.ros.org/mbf_abstract_core">mbf_abstract_core</a>."
AUTHOR = "Sebastian Pütz <spuetz@uos.de>"
ROS_AUTHOR = "Sebastian Pütz <spuetz@uos.de>"
HOMEPAGE = "http://wiki.ros.org/move_base_flex"
SECTION = "devel"
LICENSE = "3-Clause-BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2a17ba6bda1db7ca47fe93a1560e517b"

ROS_CN = "move_base_flex"
ROS_BPN = "mbf_simple_nav"

ROS_BUILD_DEPENDS = " \
    ros1-actionlib \
    ros1-actionlib-msgs \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-mbf-abstract-core \
    ros1-mbf-abstract-nav \
    ros1-mbf-msgs \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-std-msgs \
    ros1-std-srvs \
    ros1-tf \
    ros1-tf2 \
    ros1-tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-actionlib \
    ros1-actionlib-msgs \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-mbf-abstract-core \
    ros1-mbf-abstract-nav \
    ros1-mbf-msgs \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-std-msgs \
    ros1-std-srvs \
    ros1-tf \
    ros1-tf2 \
    ros1-tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-actionlib \
    ros1-actionlib-msgs \
    ros1-dynamic-reconfigure \
    ros1-geometry-msgs \
    ros1-mbf-abstract-core \
    ros1-mbf-abstract-nav \
    ros1-mbf-msgs \
    ros1-nav-msgs \
    ros1-pluginlib \
    ros1-roscpp \
    ros1-std-msgs \
    ros1-std-srvs \
    ros1-tf \
    ros1-tf2 \
    ros1-tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uos-gbp/move_base_flex-release/archive/release/melodic/mbf_simple_nav/0.2.5-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/mbf_simple_nav"
SRC_URI = "git://github.com/uos-gbp/move_base_flex-release;${ROS_BRANCH};protocol=https"
SRCREV = "ddeb8b8232ab542b98800109d6dc63006dbf9f52"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
