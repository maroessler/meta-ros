# Copyright (c) 2020 LG Electronics, Inc.

# ERROR: ros1-moveit-ros-occupancy-map-monitor-1.0.5-1-r0 do_package: QA Issue: ros1-moveit-ros-occupancy-map-monitor: Files/directories were installed but not shipped in any package:
#   /opt/ros/melodic/lib/libmoveit_ros_occupancy_map_monitor.so.1.0.5
# Please set FILES such that these items are packaged. Alternatively if they are unneeded, avoid installing them or delete them within do_install.
# ros1-moveit-ros-occupancy-map-monitor: 1 installed and not shipped files. [installed-vs-shipped]
inherit ros_insane_dev_so
