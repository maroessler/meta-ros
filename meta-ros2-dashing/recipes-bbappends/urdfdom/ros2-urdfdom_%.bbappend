# Copyright (c) 2019 LG Electronics, Inc.

inherit ros-insane

# The cmake subdirectory is under libdir/ROS_BPN instead of datadir/ROS_BPN.
FILES_${PN}-dev_prepend = " \
    ${libdir}/${ROS_BPN}/cmake \
"
