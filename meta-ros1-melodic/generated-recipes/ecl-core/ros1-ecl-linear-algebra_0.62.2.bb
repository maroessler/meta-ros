# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Ecl frontend to a linear matrix package (currently eigen)."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
ROS_AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/ecl_linear_algebra"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ecl_core"
ROS_BPN = "ecl_linear_algebra"

ROS_BUILD_DEPENDS = " \
    ros1-ecl-build \
    ros1-ecl-converters \
    ros1-ecl-eigen \
    ros1-ecl-exceptions \
    ros1-ecl-formatters \
    ros1-ecl-license \
    ros1-ecl-math \
    ros1-sophus \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-ecl-build \
    ros1-ecl-converters \
    ros1-ecl-eigen \
    ros1-ecl-exceptions \
    ros1-ecl-formatters \
    ros1-ecl-license \
    ros1-ecl-math \
    ros1-sophus \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-ecl-build \
    ros1-ecl-converters \
    ros1-ecl-eigen \
    ros1-ecl-exceptions \
    ros1-ecl-formatters \
    ros1-ecl-license \
    ros1-ecl-math \
    ros1-sophus \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_linear_algebra/0.62.2-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ecl_linear_algebra"
SRC_URI = "git://github.com/yujinrobot-release/ecl_core-release;${ROS_BRANCH};protocol=https"
SRCREV = "5e6bf31edf000ca8d5bfff8fb4cf6ad95a1ad309"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
