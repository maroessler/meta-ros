# Copyright (c) 2019 LG Electronics, Inc.

# Create a ros.sh that sources ros/setup.sh, thereby setting up the ROS workspace for every login. Place it in a separate package
# which will be added to images when IMAGE_FEATURES contains "ros-implicit-workspace"
do_install_append() {
    mkdir -p ${D}${sysconfdir}/profile.d
    echo ". ${ros_prefix}/setup.sh" > ${D}${sysconfdir}/profile.d/ros.sh
}

PACKAGES =+ "${PN}-implicitworkspace"

FILES_${PN} += " \
    ${ros_prefix}/*setup.bash \
    ${ros_prefix}/*setup.sh \
    ${ros_prefix}/*setup.zsh \
    ${ros_prefix}/_order_packages.py \
"

FILES_${PN}-implicitworkspace = " \
    ${sysconfdir}/profile.d/ros.sh \
"

inherit ros_ament_cmake
