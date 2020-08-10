# Copyright (c) 2020 LG Electronics, Inc.

do_configure_append() {
    # Fixes this:
    # franka-gripper/0.6.0-1-r0/recipe-sysroot/usr/include/c++/8.2.0/cmath:45:15: fatal error: math.h: No such file or directory
    # franka-gripper/0.6.0-1-r0/recipe-sysroot/usr/include/c++/8.2.0/cstdlib:75:15: fatal error: stdlib.h: No such file or directory
    sed -i 's/-isystem /-I/g' ${B}/build.ninja
}
