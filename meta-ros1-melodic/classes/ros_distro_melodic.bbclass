# Every ROS recipe, generated or not, must contain "inherit ros_distro_${ROS_DISTRO}".
#
# Copyright (c) 2019 LG Electronics, Inc.

ROS_DISTRO = "melodic"
ROS_DISTRO_TYPE = "ros1"
ROS_VERSION = "1"
ROS_PYTHON_VERSION = "2"

inherit ros1_distro

# If not using Qt, drop all RDEPENDS on "python-qt-binding".
#ROS_EXEC_DEPENDS_remove = "${@bb.utils.contains('BBFILE_COLLECTIONS', 'qt5-layer', '', 'python-qt-binding', d)}"
# XXX TEMP until "python-qt-binding" builds
ROS_EXEC_DEPENDS_remove = "python-qt-binding"
