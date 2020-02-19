# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "map_server provides the <tt>map_server</tt> ROS <a href="http://www.ros.org/wiki/Nodes">Node</a>, which offers map data as a ROS <a href="http://www.ros.org/wiki/Services">Service</a>. It also provides the <tt>map_saver</tt> command-line utility, which allows dynamically generated maps to be saved to file."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
ROS_AUTHOR = "Brian Gerkey, Tony Pratkanis"
HOMEPAGE = "http://wiki.ros.org/map_server"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "navigation"
ROS_BPN = "map_server"

ROS_BUILD_DEPENDS = " \
    bullet \
    libsdl \
    libsdl-image \
    ros1-nav-msgs \
    ros1-roscpp \
    ros1-tf2 \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    bullet \
    libsdl \
    libsdl-image \
    ros1-nav-msgs \
    ros1-roscpp \
    ros1-tf2 \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    bullet \
    libsdl \
    libsdl-image \
    ros1-nav-msgs \
    ros1-roscpp \
    ros1-tf2 \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros1-rospy \
    ros1-rostest \
    ros1-rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/navigation-release/archive/release/melodic/map_server/1.16.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/map_server"
SRC_URI = "git://github.com/ros-gbp/navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "d401adb050465f4933b7154d199a67134609c7fa"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
