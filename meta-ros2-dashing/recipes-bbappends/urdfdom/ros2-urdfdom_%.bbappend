# Copyright (c) 2019 LG Electronics, Inc.

inherit ros_insane_dev_so

# The cmake subdirectory is under libdir/ROS_BPN instead of datadir/ROS_BPN.
FILES_${PN}-dev_prepend = " \
    ${libdir}/${ROS_BPN}/cmake \
"

do_configure_append() {
    # Fixes this:
    # | fatal error: stdlib.h: No such file or directory
    # |   #include_next <stdlib.h>
    sed -i 's/-isystem /-I/g' ${B}/build.ninja
}
