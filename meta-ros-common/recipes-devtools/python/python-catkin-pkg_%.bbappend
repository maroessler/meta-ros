inherit update-alternatives

ALTERNATIVE_${PN} = " \
    catkin_create_pkg \
    catkin_find_pkg \
    catkin_generate_changelog \
    catkin_package_version \
    catkin_prepare_release \
    catkin_tag_changelog \
    catkin_test_changelog \
    "
ALTERNATIVE_PRIORITY = "10"

do_install_append_class-native() {
    rm -rf ${D}${RECIPE_SYSROOT_NATIVE}/usr/bin/
}