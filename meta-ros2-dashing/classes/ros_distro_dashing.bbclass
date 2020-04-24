# Every ROS recipe, generated or not, must contain "inherit ros_distro_${ROS_DISTRO}".
#
# Copyright (c) 2019 LG Electronics, Inc.

ROS_DISTRO = "dashing"
ROS_DISTRO_TYPE = "ros2"
ROS_VERSION = "2"
ROS_PYTHON_VERSION = "3"

inherit ros2_distro

require conf/ros-distro/include/dashing/ros-distro.inc
