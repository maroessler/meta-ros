# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "multisense_ros"
AUTHOR = "Carnegie Robotics <support@carnegierobotics.com>"
HOMEPAGE = "https://bitbucket.org/crl/multisense_ros"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "multisense_ros"
ROS_BPN = "multisense_ros"

ROS_BUILD_DEPENDS = " \
    libjpeq-turbo \
    ros1-angles \
    ros1-cv-bridge \
    ros1-dynamic-reconfigure \
    ros1-genmsg \
    ros1-geometry-msgs \
    ros1-image-geometry \
    ros1-image-transport \
    ros1-message-generation \
    ros1-message-runtime \
    ros1-multisense-lib \
    ros1-rosbag \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-stereo-msgs \
    ros1-tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
    yaml-cpp-native \
"

ROS_EXPORT_DEPENDS = " \
    libjpeq-turbo \
    ros1-angles \
    ros1-cv-bridge \
    ros1-dynamic-reconfigure \
    ros1-genmsg \
    ros1-geometry-msgs \
    ros1-image-geometry \
    ros1-image-transport \
    ros1-message-generation \
    ros1-message-runtime \
    ros1-multisense-lib \
    ros1-rosbag \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-stereo-msgs \
    ros1-tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libjpeq-turbo \
    ros1-angles \
    ros1-cv-bridge \
    ros1-dynamic-reconfigure \
    ros1-genmsg \
    ros1-geometry-msgs \
    ros1-image-geometry \
    ros1-image-transport \
    ros1-message-generation \
    ros1-message-runtime \
    ros1-multisense-lib \
    ros1-rosbag \
    ros1-roscpp \
    ros1-sensor-msgs \
    ros1-std-msgs \
    ros1-stereo-msgs \
    ros1-tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/carnegieroboticsllc/multisense_ros-release/archive/release/melodic/multisense_ros/4.0.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/multisense_ros"
SRC_URI = "git://github.com/carnegieroboticsllc/multisense_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "2562c41415b1b3a947761999c7a4d087c770d782"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
