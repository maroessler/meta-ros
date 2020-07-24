# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Introduces a compile time concept checking mechanism that can be used      most commonly to check for required functionality when passing      template arguments."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
ROS_AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/ecl_concepts"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ecl_core"
ROS_BPN = "ecl_concepts"

ROS_BUILD_DEPENDS = " \
    ros1-ecl-config \
    ros1-ecl-license \
    ros1-ecl-type-traits \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-ecl-config \
    ros1-ecl-license \
    ros1-ecl-type-traits \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-ecl-config \
    ros1-ecl-license \
    ros1-ecl-type-traits \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_concepts/0.62.2-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ecl_concepts"
SRC_URI = "git://github.com/yujinrobot-release/ecl_core-release;${ROS_BRANCH};protocol=https"
SRCREV = "19d56035cf66c6e1c51e13647e15e724231cadf2"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
