# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Wrapper around tinyxml2, providing nothing but a dependency on tinyxml2, on some systems.     On others, it provides a fixed CMake module or even an ExternalProject build of tinyxml2."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "tinyxml2_vendor"
ROS_BPN = "tinyxml2_vendor"

ROS_BUILD_DEPENDS = " \
    libtinyxml2 \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    libtinyxml2 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libtinyxml2 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/tinyxml2_vendor-release/archive/release/dashing/tinyxml2_vendor/0.6.1-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/tinyxml2_vendor"
SRC_URI = "git://github.com/ros2-gbp/tinyxml2_vendor-release;${ROS_BRANCH};protocol=https"
SRCREV = "3b7fc4e319de082034616e1dd0c8749799b521e7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
