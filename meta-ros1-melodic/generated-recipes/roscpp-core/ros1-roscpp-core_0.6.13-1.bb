# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Underlying data libraries for roscpp messages."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Josh Faust"
HOMEPAGE = "http://www.ros.org/wiki/roscpp_core"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "roscpp_core"
ROS_BPN = "roscpp_core"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-cpp-common \
    ros1-roscpp-serialization \
    ros1-roscpp-traits \
    ros1-rostime \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-cpp-common \
    ros1-roscpp-serialization \
    ros1-roscpp-traits \
    ros1-rostime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/roscpp_core-release/archive/release/melodic/roscpp_core/0.6.13-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/roscpp_core"
SRC_URI = "git://github.com/ros-gbp/roscpp_core-release;${ROS_BRANCH};protocol=https"
SRCREV = "44c7cec0a31f42793d0c79acd52d5c57d972a7f0"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
