# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package provides the c++ extensions for a variety of threaded       programming tools. These are usually different on different       platforms, so the architecture for a cross-platform framework      is also implemented."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
ROS_AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/ecl_threads"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ecl_core"
ROS_BPN = "ecl_threads"

ROS_BUILD_DEPENDS = " \
    ros1-ecl-build \
    ros1-ecl-concepts \
    ros1-ecl-config \
    ros1-ecl-errors \
    ros1-ecl-exceptions \
    ros1-ecl-license \
    ros1-ecl-time \
    ros1-ecl-utilities \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-ecl-build \
    ros1-ecl-concepts \
    ros1-ecl-config \
    ros1-ecl-errors \
    ros1-ecl-exceptions \
    ros1-ecl-license \
    ros1-ecl-time \
    ros1-ecl-utilities \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-ecl-build \
    ros1-ecl-concepts \
    ros1-ecl-config \
    ros1-ecl-errors \
    ros1-ecl-exceptions \
    ros1-ecl-license \
    ros1-ecl-time \
    ros1-ecl-utilities \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_threads/0.62.2-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ecl_threads"
SRC_URI = "git://github.com/yujinrobot-release/ecl_core-release;${ROS_BRANCH};protocol=https"
SRCREV = "34daddc430a03dca0008589dd6ee5a1c53ff0515"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
