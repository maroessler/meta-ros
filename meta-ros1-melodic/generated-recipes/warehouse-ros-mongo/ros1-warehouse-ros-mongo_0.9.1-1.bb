# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Implementation of warehouse_ros for MongoDB"
AUTHOR = "MoveIt Release Team <moveit_releasers@googlegroups.com>"
ROS_AUTHOR = "Bhaskara Marthi <bhaskara@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/warehouse_ros"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "warehouse_ros_mongo"
ROS_BPN = "warehouse_ros_mongo"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libmongoclient-dev} \
    ros1-class-loader \
    ros1-roscpp \
    ros1-rostime \
    ros1-std-msgs \
    ros1-warehouse-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ros1-class-loader \
    ros1-roscpp \
    ros1-rostime \
    ros1-std-msgs \
    ros1-warehouse-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-class-loader \
    ros1-roscpp \
    ros1-rostime \
    ros1-std-msgs \
    ros1-warehouse-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_mongodb} \
    ros1-rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/warehouse_ros_mongo-release/archive/release/melodic/warehouse_ros_mongo/0.9.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/warehouse_ros_mongo"
SRC_URI = "git://github.com/ros-gbp/warehouse_ros_mongo-release;${ROS_BRANCH};protocol=https"
SRCREV = "e79972b42fa5d60f15a90486fb876fb718f543af"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
