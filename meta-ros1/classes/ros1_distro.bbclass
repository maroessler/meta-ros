# Copyright (c) 2019 LG Electronics, Inc.

inherit ros_distro

# Place metadata unique to ROS 1 distros here.
inherit ros_opt_prefix

# *.cmake files have hardcoded sysroot-s in them.
SSTATE_SCAN_FILES_append = " *.cmake"

DEPENDS_remove =  "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz', '', 'rviz', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz', '', 'rviz', d)}"

# TODO
# for some reason do_package_qa throws a warning that some ros1 packages depend on ros2
# don't know how to resolve that better for now
# WARNING: ros1-moveit-planners-ompl-1.0.2-1-r0 do_package_qa: QA Issue: ros1-moveit-planners-ompl rdepends on ros2-ompl, but it isn't a build dependency, missing ros2-ompl in DEPENDS or PACKAGECONFIG? [build-deps]
PRIVATE_LIBS_${PN} += "\
    libkdl_parser.so \
    libtf2_ros.so \
    libasync_web_server_cpp.so \
    libimage_transport.so \
    libclass_loader.so \
    libcv_bridge.so \
    liburdfdom_model.so.1.0 \
    liburdfdom_world.so.1.0 \
    libresource_retriever.so \
    libvoxel_grid.so \
    libdynamixel_sdk.so \
    libDepthImageToLaserScanROS.so \
    libDepthImageToLaserScan.so \
    liboctomap.so.1.9 \
    liboctomath.so.1.9 \
    libompl.so.15 \
"
