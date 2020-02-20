# Blacklist all failing task for CI jobs to easily compare
# if "bitbake world" is getting better or worse

# LICENSE_FLAGS_WHITELIST restrictions
ROS_WORLD_SKIP_GROUPS += "world-license"

PNBLACKLIST[gstreamer1.0-plugins-bad] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'world-license', 'depends on faad2 which has a restricted license not whitelisted in LICENSE_FLAGS_WHITELIST', '', d)}"
PNBLACKLIST[omxplayer] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'world-license', 'depends on libav, libomxil which has a restricted license not whitelisted in LICENSE_FLAGS_WHITELIST', '', d)}"
PNBLACKLIST[gst-examples] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'world-license', 'depends on gstreamer1.0-plugins-bad which depends on faad2 which has a restricted license not whitelisted in LICENSE_FLAGS_WHITELIST', '', d)}"
PNBLACKLIST[packagegroup-core-x11-sato] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'world-license', 'depends on gst-examples which depends on gstreamer1.0-plugins-bad which depends on faad2 which has a restricted license not whitelisted in LICENSE_FLAGS_WHITELIST', '', d)}"
PNBLACKLIST[packagegroup-core-tools-testapps] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'world-license', 'depends on gst-examples which depends on gstreamer1.0-plugins-bad which depends on faad2 which has a restricted license not whitelisted in LICENSE_FLAGS_WHITELIST', '', d)}"

# vc4graphics-without-opengl restrictions for other than superflore generated recipes
PNBLACKLIST[gstreamer1.0-plugins-base] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'vc4graphics-without-opengl', 'depends on virtual/libgles2, virtual/egl which is not available for raspberrypi MACHINEs with vc4graphics in MACHINE_FEATURES, but without opengl in DISTRO_FEATURES', '', d)}"
PNBLACKLIST[gstreamer1.0-meta-base] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'vc4graphics-without-opengl', 'depends on gstreamer1.0-plugins-base which depends on virtual/libgles2, virtual/egl which is not available for raspberrypi MACHINEs with vc4graphics in MACHINE_FEATURES, but without opengl in DISTRO_FEATURES', '', d)}"
PNBLACKLIST[gstreamer1.0-rtsp-server] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'vc4graphics-without-opengl', 'depends on gstreamer1.0-plugins-base which depends on virtual/libgles2, virtual/egl which is not available for raspberrypi MACHINEs with vc4graphics in MACHINE_FEATURES, but without opengl in DISTRO_FEATURES', '', d)}"
PNBLACKLIST[gst-validate] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'vc4graphics-without-opengl', 'depends on gstreamer1.0-plugins-base which depends on virtual/libgles2, virtual/egl which is not available for raspberrypi MACHINEs with vc4graphics in MACHINE_FEATURES, but without opengl in DISTRO_FEATURES', '', d)}"
PNBLACKLIST[opencv] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'vc4graphics-without-opengl', 'depends on gstreamer1.0-plugins-base which depends on virtual/libgles2, virtual/egl which is not available for raspberrypi MACHINEs with vc4graphics in MACHINE_FEATURES, but without opengl in DISTRO_FEATURES', '', d)}"
PNBLACKLIST[gstreamer1.0-plugins-good] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'vc4graphics-without-opengl', 'depends on gstreamer1.0-plugins-base which depends on virtual/libgles2, virtual/egl which is not available for raspberrypi MACHINEs with vc4graphics in MACHINE_FEATURES, but without opengl in DISTRO_FEATURES', '', d)}"
PNBLACKLIST[libnice] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'vc4graphics-without-opengl', 'depends on gstreamer1.0-plugins-base which depends on virtual/libgles2, virtual/egl which is not available for raspberrypi MACHINEs with vc4graphics in MACHINE_FEATURES, but without opengl in DISTRO_FEATURES', '', d)}"
PNBLACKLIST[userland] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'vc4graphics-without-opengl', 'depends on libegl-mesa which is not available for raspberrypi MACHINEs with vc4graphics in MACHINE_FEATURES, but without opengl in DISTRO_FEATURES', '', d)}"

# Recipes failing because of svn fetcher issue
# http://lists.openembedded.org/pipermail/openembedded-devel/2020-February/205012.html
ROS_WORLD_SKIP_GROUPS += "world-svn-fetcher"
# meta-openembedded/meta-oe/recipes-support/samsung-soc-utils/s3c24xx-gpio_svn.bb:do_populate_lic
# meta-openembedded/meta-oe/recipes-support/samsung-soc-utils/s3c24xx-gpio_svn.bb:do_compile
PNBLACKLIST[s3c24xx-gpio] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'world-svn-fetcher', 'S does not point to correct directory with bitbake svn fetcher anymore', '', d)}"
# meta-openembedded/meta-oe/recipes-support/samsung-soc-utils/s3c64xx-gpio_svn.bb:do_populate_lic
# meta-openembedded/meta-oe/recipes-support/samsung-soc-utils/s3c64xx-gpio_svn.bb:do_compile
PNBLACKLIST[s3c64xx-gpio] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'world-svn-fetcher', 'S does not point to correct directory with bitbake svn fetcher anymore', '', d)}"
# meta-openembedded/meta-oe/recipes-support/wmiconfig/wmiconfig_svn.bb:do_patch
PNBLACKLIST[wmiconfig] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'world-svn-fetcher', 'S does not point to correct directory with bitbake svn fetcher anymore', '', d)}"
# meta-openembedded/meta-oe/recipes-support/usbpath/usbpath_svn.bb:do_patch
PNBLACKLIST[usbpath] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'world-svn-fetcher', 'S does not point to correct directory with bitbake svn fetcher anymore', '', d)}"
# meta-openembedded/meta-oe/recipes-core/packagegroups/packagegroup-meta-oe.bb
PNBLACKLIST[packagegroup-meta-oe] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'world-svn-fetcher', 'Depends on blacklisted packages like s3c24xx-gpio, s3c64xx-gpio, wmiconfig, usbpath', '', d)}"

# Other issues:
ROS_WORLD_SKIP_GROUPS += "world-issues"
PNBLACKLIST[wiringpi] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'world-issues', 'Fails to fetch: git.drogon.net[0: 188.246.205.22]: errno=Connection refused', '', d)}"
PNBLACKLIST[kernel-selftest] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'world-issues', 'Fails to build with rpi kernel: include/uapi/linux/bpf_perf_event.h:14:17: error: field regs has incomplete type', '', d)}"
PNBLACKLIST[ndctl] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'world-issues', 'Fails to build with systemd enabled (fixed in warrior with meta-oe commit 28303f2f70c7d9466689236a704f8e5cae481bd7 which added explicit --with-systemd): ndctl-v62+gitAUTOINC+11f560f404-r0 do_package: SYSTEMD_SERVICE_ndctl value ndctl-monitor.service does not exist', '', d)}"
PNBLACKLIST[pmdk] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'world-issues', 'Depends on blacklisted ndctl', '', d)}"
PNBLACKLIST[xf86-video-intel] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'world-issues', 'Fails to configure with qemux86-64: checking which acceleration method to use by default... configure: error: No default acceleration option', '', d)}"
PNBLACKLIST[packagegroup-meta-oe] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'world-issues', 'Depends on blacklisted packages like ndctl', '', d)}"