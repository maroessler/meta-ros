inherit ros_distro_melodic

EXTRA_OECMAKE_prepend = "\
    -DCMAKE_PREFIX_PATH='${STAGING_DIR_HOST}${ros_prefix}' \
"

DEPENDS += "ros1-octomap"