# Copyright (c) 2019 LG Electronics, Inc.

# ros1-moveit-ros-perception: 6 installed and not shipped files. [installed-vs-shipped]
inherit ros_insane_dev_so

do_configure_append() {
    # Fixes this:
    # moveit-ros-perception/1.0.2-1-r0/recipe-sysroot/usr/include/c++/8.2.0/cmath:45:15: fatal error: math.h: No such file or directory
    # moveit-ros-perception/1.0.2-1-r0/recipe-sysroot/usr/include/c++/8.2.0/cstdlib:75:15: fatal error: stdlib.h: No such file or directory
    sed -i 's/-isystem /-I/g' ${B}/build.ninja
}

EXTRA_OECMAKE += "${@bb.utils.contains('DISTRO_FEATURES', 'x11', '', '-DWITH_OPENGL=OFF', d)}"

ROS_BUILD_DEPENDS_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', '', 'freeglut', d)}"
ROS_EXPORT_DEPENDS_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', '', 'freeglut', d)}"
ROS_EXEC_DEPENDS_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', '', 'freeglut', d)}"

# mesa is recipe name, shouldn't be used in runtime dependencies
ROS_EXEC_DEPENDS_remove = "mesa"