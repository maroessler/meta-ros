# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This includes a suite of programs demo'ing various aspects of the      ecl_core. It also includes various benchmarking and utility programs for      use primarily with embedded systems."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
ROS_AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/ecl_core_apps"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ecl_core"
ROS_BPN = "ecl_core_apps"

ROS_BUILD_DEPENDS = " \
    ros1-ecl-build \
    ros1-ecl-command-line \
    ros1-ecl-config \
    ros1-ecl-containers \
    ros1-ecl-converters \
    ros1-ecl-devices \
    ros1-ecl-errors \
    ros1-ecl-exceptions \
    ros1-ecl-formatters \
    ros1-ecl-geometry \
    ros1-ecl-ipc \
    ros1-ecl-license \
    ros1-ecl-linear-algebra \
    ros1-ecl-sigslots \
    ros1-ecl-streams \
    ros1-ecl-threads \
    ros1-ecl-time-lite \
    ros1-ecl-type-traits \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-ecl-build \
    ros1-ecl-command-line \
    ros1-ecl-config \
    ros1-ecl-containers \
    ros1-ecl-converters \
    ros1-ecl-devices \
    ros1-ecl-errors \
    ros1-ecl-exceptions \
    ros1-ecl-formatters \
    ros1-ecl-geometry \
    ros1-ecl-ipc \
    ros1-ecl-license \
    ros1-ecl-linear-algebra \
    ros1-ecl-sigslots \
    ros1-ecl-streams \
    ros1-ecl-threads \
    ros1-ecl-time-lite \
    ros1-ecl-type-traits \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-ecl-build \
    ros1-ecl-command-line \
    ros1-ecl-config \
    ros1-ecl-containers \
    ros1-ecl-converters \
    ros1-ecl-devices \
    ros1-ecl-errors \
    ros1-ecl-exceptions \
    ros1-ecl-formatters \
    ros1-ecl-geometry \
    ros1-ecl-ipc \
    ros1-ecl-license \
    ros1-ecl-linear-algebra \
    ros1-ecl-sigslots \
    ros1-ecl-streams \
    ros1-ecl-threads \
    ros1-ecl-time-lite \
    ros1-ecl-type-traits \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_core_apps/0.62.2-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ecl_core_apps"
SRC_URI = "git://github.com/yujinrobot-release/ecl_core-release;${ROS_BRANCH};protocol=https"
SRCREV = "97b595b7f841689494fbe9e9f71c039edb2903c1"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
