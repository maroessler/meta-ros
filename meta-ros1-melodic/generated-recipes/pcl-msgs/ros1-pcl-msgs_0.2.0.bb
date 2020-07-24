# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Package containing PCL (Point Cloud Library)-related ROS messages."
AUTHOR = "Paul Bovbel <paul@bovbel.com>"
ROS_AUTHOR = "Open Perception"
HOMEPAGE = "http://wiki.ros.org/pcl_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pcl_msgs"
ROS_BPN = "pcl_msgs"

ROS_BUILD_DEPENDS = " \
    ros1-message-generation \
    ros1-sensor-msgs \
    ros1-std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-message-runtime \
    ros1-sensor-msgs \
    ros1-std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-message-runtime \
    ros1-sensor-msgs \
    ros1-std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/pcl_msgs-release/archive/release/melodic/pcl_msgs/0.2.0-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pcl_msgs"
SRC_URI = "git://github.com/ros-gbp/pcl_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "60ffbfa1eeb247501213bbaa6cbef73c2c6bf783"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
