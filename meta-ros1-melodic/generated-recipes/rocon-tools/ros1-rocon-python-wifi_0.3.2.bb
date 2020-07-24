# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The pythonwifi package is available through pypi, but not through a      deb package. This is copy of the package suitable for use through the     ROS ecosystem."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
ROS_AUTHOR = "Róman Joost"
HOMEPAGE = "http://pythonwifi.wikispot.org/"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=fe8b75cf0aba647401e1038bcd69ee74"

ROS_CN = "rocon_tools"
ROS_BPN = "rocon_python_wifi"

ROS_BUILD_DEPENDS = " \
    python-catkin-pkg \
"

ROS_BUILDTOOL_DEPENDS = " \
    ros1-catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/yujinrobot-release/rocon_tools-release/archive/release/melodic/rocon_python_wifi/0.3.2-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rocon_python_wifi"
SRC_URI = "git://github.com/yujinrobot-release/rocon_tools-release;${ROS_BRANCH};protocol=https"
SRCREV = "4d26b635fa9470700eb8ad2ad0eea83071776840"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
