# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "octovis is visualization tool for the OctoMap library based on Qt and libQGLViewer. See   http://octomap.github.io for details."
AUTHOR = "Armin Hornung <armin@hornung.io>"
ROS_AUTHOR = "Kai M. Wurm <wurm@informatik.uni-freiburg.de>"
HOMEPAGE = "http://octomap.github.io"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=fe8b75cf0aba647401e1038bcd69ee74"

ROS_CN = "octomap"
ROS_BPN = "octovis"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libqglviewer-qt4-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libqt4-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libqt4-opengl-dev} \
    ros1-octomap \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libqglviewer-qt4} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libqt4-opengl} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libqtgui4} \
    ros1-catkin \
    ros1-octomap \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libqglviewer-qt4} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libqt4-opengl} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libqtgui4} \
    ros1-catkin \
    ros1-octomap \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/octomap-release/archive/release/melodic/octovis/1.9.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/octovis"
SRC_URI = "git://github.com/ros-gbp/octomap-release;${ROS_BRANCH};protocol=https"
SRCREV = "aa6a3d8dcbc20ff9feee62d0c10582e3a0f16134"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}