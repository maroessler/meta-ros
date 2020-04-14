# Copyright (c) 2019 LG Electronics, Inc.

# EXTRA_OECMAKE_CMAKE = "\
#     -DCMAKE_PREFIX_PATH='${STAGING_DIR_HOST}${ros_prefix};${STAGING_DIR_HOST}${prefix}' \
#     "

# EXTRA_OECMAKE_CMAKE_class-native = "\
#     -DCMAKE_PREFIX_PATH='${STAGING_DIR_NATIVE}${ros_prefix}' \
#     "

# EXTRA_OECMAKE_append = "\
#     ${EXTRA_OECMAKE_CMAKE} \
#     -DBUILD_TESTING=OFF -DPYTHON_SOABI=${PYTHON_SOABI} \
#     -DCMAKE_INSTALL_PREFIX:PATH='${ros_prefix}' \
#     "

inherit cmake python3native
