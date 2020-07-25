# Copyright (c) 2019-2020 LG Electronics, Inc.

# core-* OE images do not support development.
ROS_EXEC_DEPENDS_remove = "ros1-cmake-modules"
ROS_EXEC_DEPENDS_remove = "ros1-gencpp"
ROS_EXEC_DEPENDS_remove = "ros1-geneus"
ROS_EXEC_DEPENDS_remove = "ros1-genlisp"
ROS_EXEC_DEPENDS_remove = "ros1-genmsg"
ROS_EXEC_DEPENDS_remove = "ros1-gennodejs"
ROS_EXEC_DEPENDS_remove = "ros1-genpy"
ROS_EXEC_DEPENDS_remove = "ros1-message-generation"

# The dependency on roslisp isn't mandatory and roslisp is blacklisted
ROS_EXEC_DEPENDS_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'lisp', 'ros1-geneus ros1-genlisp ros1-roslisp', '', d)}"
