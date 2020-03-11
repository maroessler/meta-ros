# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "<p>       MoveIt package for the ABB IRB 6640.     </p>     <p>       An automatically generated package with all the configuration and launch       files for using the ABB IRB 6640 with the MoveIt Motion Planning       Framework.     </p>"
AUTHOR = "Levi Armstrong (Southwest Research Institute) <levi.armstrong@swri.org>"
ROS_AUTHOR = "MoveIt Setup Assistant <assistant@moveit.ros.org>"
HOMEPAGE = "http://ros.org/wiki/abb_irb6640_moveit_config"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "abb"
ROS_BPN = "abb_irb6640_moveit_config"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros1-abb-irb6640-support \
    ros1-industrial-robot-simulator \
    ros1-joint-state-publisher \
    ros1-moveit-planners-ompl \
    ros1-moveit-ros-move-group \
    ros1-moveit-ros-visualization \
    ros1-moveit-simple-controller-manager \
    ros1-robot-state-publisher \
    ros1-xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-industrial-release/abb-release/archive/release/melodic/abb_irb6640_moveit_config/1.3.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/abb_irb6640_moveit_config"
SRC_URI = "git://github.com/ros-industrial-release/abb-release;${ROS_BRANCH};protocol=https"
SRCREV = "1792bc3bb618a4f758995e71302cef1ed26e62ec"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}