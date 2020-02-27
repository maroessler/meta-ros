# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Generate the ROS interfaces in Python."
AUTHOR = "Scott K Logan <scott@openrobotics.org>"
ROS_AUTHOR = "Esteve Fernandez"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rosidl_python"
ROS_BPN = "rosidl_generator_py"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros2-ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ros2-rmw \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ros2-ament-cmake-native \
    ros2-ament-index-python-native \
    ros2-python-cmake-module-native \
    ros2-rosidl-cmake-native \
    ros2-rosidl-typesupport-c-native \
    ros2-rosidl-typesupport-interface-native \
"

ROS_EXEC_DEPENDS = " \
    python3-numpy \
    ros2-rmw-implementation \
    ros2-rmw-implementation-cmake \
    ros2-rosidl-generator-c \
    ros2-rosidl-parser \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    python3-numpy \
    python3-pytest \
    ros2-ament-cmake-pytest \
    ros2-ament-index-python \
    ros2-ament-lint-auto \
    ros2-ament-lint-common \
    ros2-python-cmake-module \
    ros2-rmw \
    ros2-rmw-implementation \
    ros2-rmw-implementation-cmake \
    ros2-rosidl-cmake \
    ros2-rosidl-generator-c \
    ros2-rosidl-parser \
    ros2-rosidl-typesupport-c \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rosidl_python-release/archive/release/dashing/rosidl_generator_py/0.7.10-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/rosidl_generator_py"
SRC_URI = "git://github.com/ros2-gbp/rosidl_python-release;${ROS_BRANCH};protocol=https"
SRCREV = "bb2511546b23fd492fab1964cdc3657848c98396"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
