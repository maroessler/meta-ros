# Copyright (c) 2019 LG Electronics, Inc.

# All rviz recipes aren't available without qtbase
ROS_EXEC_DEPENDS_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt5', '', 'ros2-nav2-rviz-plugins', d)}"
