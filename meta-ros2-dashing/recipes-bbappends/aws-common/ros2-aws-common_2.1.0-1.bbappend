# Copyright (c) 2019 LG Electronics, Inc.
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-Fix-AWS_COMMON_ROOT_DIR.patch"

DEPENDS += "aws-cpp-sdk curl openssl"

EXTRA_OECMAKE = "-DEXTERNAL_INSTALL_LOCATION=${STAGING_DIR_HOST}${prefix}"

do_configure_prepend() {
    # awssdk dependencies are built in separate recipe aws-cpp-sdk
    sed -i 's@^add_subdirectory(awssdk)@##add_subdirectory(awssdk)@g' ${S}/CMakeLists.txt
    sed -i '/^add_dependencies.*AWS_SDK_IMPORT)/d' ${S}/CMakeLists.txt
    # install doesn't respect set EXTERNAL_INSTALL_LOCATION
    sed -i 's@${PROJECT_BINARY_DIR}/external/${CMAKE_INSTALL_LIBDIR}@${STAGING_DIR_HOST}${libdir}@g' ${S}/CMakeLists.txt
}

# ERROR: ros2-aws-common-2.1.0-1-r0 do_package_qa: QA Issue: -dev package contains non-symlink .so: ros2-aws-common-dev path '/work/armv7at2hf-neon-fslc-linux-gnueabi/ros2-aws-common/2.1.0-1-r0/packages-split/ros2-aws-common-dev/usr/lib/libaws_common.so' [dev-elf]
# ERROR: ros2-aws-common-2.1.0-1-r0 do_package_qa: QA run found fatal errors. Please consider fixing them.
FILES_SOLIBSDEV = ""
FILES_${PN} += "${libdir}/*.so"