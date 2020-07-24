# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "CMake Functions and Modules for automating CMake"
AUTHOR = "Fabian Poggenhans <fabian.poggenhans@kit.edu>"
ROS_AUTHOR = "Fabian Poggenhans <fabian.poggenhans@kit.edu>"
HOMEPAGE = "http://wiki.ros.org/mrt_cmake_modules"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=e788c4500bef4dab03b1f8856c61151b"

ROS_CN = "mrt_cmake_modules"
ROS_BPN = "mrt_cmake_modules"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    python-pyyaml-native \
    python-rospkg-native \
    python-setuptools-native \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_lcov-native} \
    python-pyyaml-native \
    python-rospkg-native \
    python-setuptools-native \
"

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/KIT-MRT/mrt_cmake_modules-release/archive/release/melodic/mrt_cmake_modules/1.0.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/mrt_cmake_modules"
SRC_URI = "git://github.com/KIT-MRT/mrt_cmake_modules-release;${ROS_BRANCH};protocol=https"
SRCREV = "af0e8f4624e56c64ee377fec81084c7d8cd42f65"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
