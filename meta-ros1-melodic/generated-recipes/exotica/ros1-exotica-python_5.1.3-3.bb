# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Python bindings for EXOTica"
AUTHOR = "Wolfgang Merkt <wolfgang.merkt@ed.ac.uk>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "exotica"
ROS_BPN = "exotica_python"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-matplotlib} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-pyassimp} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-tk} \
    python-rospkg \
    ros1-exotica-core \
    ros1-geometry-msgs \
    ros1-moveit-msgs \
    ros1-pybind11-catkin \
    ros1-shape-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-matplotlib} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-pyassimp} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-tk} \
    python-rospkg \
    ros1-exotica-core \
    ros1-geometry-msgs \
    ros1-moveit-msgs \
    ros1-pybind11-catkin \
    ros1-shape-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-matplotlib} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-pyassimp} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-tk} \
    python-rospkg \
    ros1-exotica-core \
    ros1-geometry-msgs \
    ros1-moveit-msgs \
    ros1-pybind11-catkin \
    ros1-shape-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipab-slmc/exotica-release/archive/release/melodic/exotica_python/5.1.3-3.tar.gz
ROS_BRANCH ?= "branch=release/melodic/exotica_python"
SRC_URI = "git://github.com/ipab-slmc/exotica-release;${ROS_BRANCH};protocol=https"
SRCREV = "f7f679592f5256456f172353b78aa09228f7f25c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
