# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "CMake configuration to run coverage"
AUTHOR = "Michael Ferguson <mike@vanadiumlabs.com>"
ROS_AUTHOR = "Michael Ferguson <mike@vanadiumlabs.com>"
HOMEPAGE = "https://github.com/mikeferguson/code_coverage"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "code_coverage"
ROS_BPN = "code_coverage"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_lcov} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-coverage} \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_lcov} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-coverage} \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_lcov} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-coverage} \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/mikeferguson/code_coverage-gbp/archive/release/melodic/code_coverage/0.4.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/code_coverage"
SRC_URI = "git://github.com/mikeferguson/code_coverage-gbp;${ROS_BRANCH};protocol=https"
SRCREV = "3d136b1c5beb807b4b3654fbf65fd65183416bf3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
