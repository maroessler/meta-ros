# ERROR: ros2-dataflow-lite-1.1.2-1-r0 do_package_qa: QA Issue: -dev package contains non-symlink .so: ros2-dataflow-lite-dev path '/work/armv7at2hf-neon-fslc-linux-gnueabi/ros2-dataflow-lite/1.1.2-1-r0/packages-split/ros2-dataflow-lite-dev/usr/lib/libdataflow_lite.so' [dev-elf]
# ERROR: ros2-dataflow-lite-1.1.2-1-r0 do_package_qa: QA run found fatal errors. Please consider fixing them.
FILES_SOLIBSDEV = ""
FILES_${PN} += "${libdir}/*.so"

# EXTRA_OECMAKE_append = "\
#     -DAWSSDK_CORE_HEADER_FILE='${STAGING_DIR_HOST}${prefix}\include\aws\core\Aws.h' \
#     "