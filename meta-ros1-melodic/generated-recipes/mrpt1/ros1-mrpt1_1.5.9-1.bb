# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Mobile Robot Programming Toolkit (MRPT) version 1.5.x"
AUTHOR = "Jose-Luis Blanco-Claraco <joseluisblancoc@gmail.com>"
ROS_AUTHOR = "Jose-Luis Blanco-Claraco <joseluisblancoc@gmail.com>"
HOMEPAGE = "https://www.mrpt.org/"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mrpt1"
ROS_BPN = "mrpt1"

ROS_BUILD_DEPENDS = " \
    assimp \
    boost \
    ffmpeg \
    freeglut \
    jpeg \
    libeigen \
    libpcap \
    libusb1 \
    opencv \
    python \
    python-numpy \
    ros1-octomap \
    suitesparse-cholmod \
    suitesparse-cxsparse \
    udev \
    wxwidgets \
    zlib \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    assimp \
    boost \
    ffmpeg \
    freeglut \
    jpeg \
    libeigen \
    libpcap \
    libusb1 \
    opencv \
    python \
    python-numpy \
    ros1-octomap \
    suitesparse-cholmod \
    suitesparse-cxsparse \
    udev \
    wxwidgets \
    zlib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    assimp \
    boost \
    ffmpeg \
    freeglut \
    jpeg \
    libeigen \
    libpcap \
    libusb1 \
    opencv \
    python \
    python-numpy \
    ros1-catkin \
    ros1-octomap \
    suitesparse-cholmod \
    suitesparse-cxsparse \
    udev \
    wxwidgets \
    zlib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/mrpt-ros-pkg-release/mrpt1-release/archive/release/melodic/mrpt1/1.5.9-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/mrpt1"
SRC_URI = "git://github.com/mrpt-ros-pkg-release/mrpt1-release;${ROS_BRANCH};protocol=https"
SRCREV = "1b5665da63d6654687ca95b371158b3d1847235b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
