# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "The launch command for ROS 2 command line tools."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "launch_ros"
ROS_BPN = "ros2launch"

ROS_BUILD_DEPENDS = " \
    ros2-ament-index-python \
    ros2-launch \
    ros2-launch-ros \
    ros2-ros2cli \
    ros2-ros2pkg \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    ros2-ament-index-python \
    ros2-launch \
    ros2-launch-ros \
    ros2-ros2cli \
    ros2-ros2pkg \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros2-ament-index-python \
    ros2-launch \
    ros2-launch-ros \
    ros2-ros2cli \
    ros2-ros2pkg \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    python3-pytest \
    ros2-ament-copyright \
    ros2-ament-flake8 \
    ros2-ament-pep257 \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/launch_ros-release/archive/release/dashing/ros2launch/0.8.7-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/ros2launch"
SRC_URI = "git://github.com/ros2-gbp/launch_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "bf5acbf91fe9122b13b7898d92438673a8a7569e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
