# Copyright (c) 2019-2020 LG Electronics, Inc.

DESCRIPTION = "All non-test packages for the target from files/crystal/cache.yaml"
LICENSE = "MIT"

inherit packagegroup
inherit ros_distro_melodic

PACKAGES = "${PN}"

RDEPENDS_${PN} = "${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES}"

# Requires Python 3; it is not used by any other ROS 1 package.
RDEPENDS_${PN}_remove = "ros1-catkin-virtualenv"
# Depends on blacklisted catkin-virtualenv
RDEPENDS_${PN}_remove = "ros1-haros-catkin"

# Contains only dev, dbg and staticdev files, so PN is empty and not created
RDEPENDS_${PN}_remove = "ros1-sophus"

# Contains only dev files, so PN is empty and not created
RDEPENDS_${PN}_remove = "ros1-qpmad"

# It is a fork of https://github.com/google/flatbuffers that's not used by any other ROS 1 package.
RDEPENDS_${PN}_remove = "ros1-flatbuffers"

# It is a "catkin-ized" edition of the upstream version that is not used by any other ROS 1 package.
RDEPENDS_${PN}_remove = "ros1-grpc"

# It is a "catkin-ized" edition of the upstream version that is not used by any other ROS 1 package.
RDEPENDS_${PN}_remove = "ros1-nanomsg"

# It has dependencies on Qt4 packages; it is not used by any other ROS 1 package.
RDEPENDS_${PN}_remove = "ros1-octovis"

# Expects jderobot header files in wrong directory (/opt/jderobot/include/jderobot/types/image.h) and not compatible with opencv version we're using
RDEPENDS_${PN}_remove = "ros1-jderobot-camviz"

# Generation of ROS package documentation will never be done on the target.
RDEPENDS_${PN}_remove = "ros1-rosdoc-lite"
# Depends on blacklisted rosdoc-lite
RDEPENDS_${PN}_remove = "ros1-jackal-tutorials"
RDEPENDS_${PN}_remove = "ros1-odom-frame-publisher"

# Fetches depot_tools during do_configure and then tries to use vpython which isn't in dependencies
RDEPENDS_${PN}_remove = "ros1-webrtc"
RDEPENDS_${PN}_remove = "ros1-webrtc-ros"

# Not compatible with newer libftdi included in meta-oe: https://github.com/kobuki-base/kobuki_ftdi/issues/3
RDEPENDS_${PN}_remove = "ros1-kobuki-ftdi"

# ERROR: Nothing PROVIDES 'UNRESOLVED-python-requests-oauthlib' (but generated-recipes/jsk-3rdparty/rostwitter_2.1.13-1.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-rostwitter"

# ERROR: Nothing PROVIDES 'UNRESOLVED-python-mechanize' (but generated-recipes/wifi-ddwrt/wifi-ddwrt_0.2.0.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-wifi-ddwrt"

# ERROR: Nothing PROVIDES 'UNRESOLVED-python-docker' (but generated-recipes/dockeros/dockeros_1.1.0-1.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-dockeros"

# ERROR: Nothing PROVIDES 'python-twisted-core' (but generated-recipes/linux-networking/multi-interface-roam_1.0.16-1.bb DEPENDS on or otherwise requires it). Close matches:
RDEPENDS_${PN}_remove = "ros1-multi-interface-roam"
RDEPENDS_${PN}_remove = "ros1-linux-networking"

# ERROR: Nothing PROVIDES 'UNRESOLVED-python-omniorb' (but generated-recipes/rtctree/rtctree_3.0.1.bb, generated-recipes/rtsprofile/rtsprofile_2.0.0-1.bb, generated-recipes/rtshell/rtshell_3.0.1-2.bb, generated-recipes/openrtm-aist-python/openrtm-aist-python_1.1.0.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-rtctree"
RDEPENDS_${PN}_remove = "ros1-rtsprofile"
RDEPENDS_${PN}_remove = "ros1-rtshell"
RDEPENDS_${PN}_remove = "ros1-openrtm-aist-python"

# ERROR: Nothing PROVIDES 'UNRESOLVED-libxmlrpc-c++"
RDEPENDS_${PN}_remove = "ros1-ifm3d"
RDEPENDS_${PN}_remove = "ros1-ifm3d-core"

# ERROR: Nothing PROVIDES 'UNRESOLVED-python-libpgm-pip' (but generated-recipes/jsk-3rdparty/pgm-learner_2.1.13-1.bb DEPENDS on or otherwise requires it)
# ERROR: Nothing PROVIDES 'UNRESOLVED-python-scipy' (but generated-recipes/jsk-3rdparty/pgm-learner_2.1.13-1.bb, generated-recipes/husky/husky-bringup_0.4.2-1.bb, generated-recipes/calibration/calibration-estimation_0.10.14.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-pgm-learner"

# ERROR: Nothing PROVIDES 'UNRESOLVED-python-scipy' (but generated-recipes/jsk-3rdparty/pgm-learner_2.1.13-1.bb, generated-recipes/husky/husky-bringup_0.4.2-1.bb, generated-recipes/calibration/calibration-estimation_0.10.14.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-calibration-estimation"
RDEPENDS_${PN}_remove = "ros1-calibration"
RDEPENDS_${PN}_remove = "ros1-husky-bringup"
# ERROR: Nothing PROVIDES 'husky-bringup' (but generated-recipes/husky/husky-robot_0.4.2-1.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-husky-robot"

# ERROR: Nothing PROVIDES 'UNRESOLVED-python-pyassimp' (but generated-recipes/moveit-python/moveit-python_0.3.3-1.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'pyassimp', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_PYASSIMP}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_PYASSIMP = " \
    ros1-exotica \
    ros1-exotica-core-task-maps \
    ros1-exotica-examples \
    ros1-exotica-ompl-solver \
    ros1-exotica-python \
    ros1-fetch-bringup \
    ros1-fetch-moveit-config \
    ros1-fetch-ros \
    ros1-moveit-commander \
    ros1-moveit-python \
    ros1-pilz-industrial-motion \
    ros1-pilz-robot-programming \
    ros1-simple-grasping \
"

# recipes depending on various unavailable python modules
# ERROR: Nothing PROVIDES 'UNRESOLVED-python-cairosvg' (but generated-recipes/fiducials/aruco-detect_0.11.0-1.bb DEPENDS on or otherwise requires it)
# ERROR: Nothing PROVIDES 'UNRESOLVED-python-joblib' (but generated-recipes/fiducials/aruco-detect_0.11.0-1.bb DEPENDS on or otherwise requires it)
# ERROR: Nothing PROVIDES 'UNRESOLVED-python-urlgrabber' (but generated-recipes/jsk-visualization/jsk-rqt-plugins_2.1.5.bb DEPENDS on or otherwise requires it)
# ERROR: Nothing PROVIDES 'UNRESOLVED-python-sklearn' (but generated-recipes/jsk-visualization/jsk-rqt-plugins_2.1.5.bb DEPENDS on or otherwise requires it)
# ERROR: Nothing PROVIDES 'UNRESOLVED-python-cairo' (but generated-recipes/rqt-bag/rqt-bag-plugins_0.4.12.bb DEPENDS on or otherwise requires it)
# ERROR: Nothing PROVIDES 'UNRESOLVED-python-opengl' (but generated-recipes/rqt-pose-view/rqt-pose-view_0.5.8.bb DEPENDS on or otherwise requires it)
# ERROR: Nothing RPROVIDES 'UNRESOLVED-python-termcolor' (but generated-recipes/criutils/criutils_0.1.3-2.bb RDEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'python-deps', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_PYTHON_DEPS}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_PYTHON_DEPS = " \
    ros1-aruco-detect \
    ros1-criutils \
    ros1-desktop \
    ros1-fiducials \
    ros1-handeye \
    ros1-jsk-rqt-plugins \
    ros1-rqt-bag-plugins \
    ros1-rqt-common-plugins \
    ros1-rqt-pose-view \
    ros1-rqt-py-trees \
    ros1-rqt-robot-plugins \
    ros1-viz \
"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'pyqt5', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_PYQT5}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_PYQT5 = " \
    ros1-adi-driver \
    ros1-cob-command-tools \
    ros1-cob-dashboard \
    ros1-dataspeed-pds-rqt \
    ros1-fmi-adapter-examples \
    ros1-gl-dependency \
    ros1-gundam-rx78-control \
    ros1-jderobot-drones \
    ros1-pilz-status-indicator-rqt \
    ros1-python-qt-binding \
    ros1-qt-gui \
    ros1-qt-gui-app \
    ros1-qt-gui-core \
    ros1-qt-gui-cpp \
    ros1-ros-controllers \
    ros1-rosmon \
    ros1-rqt \
    ros1-rqt-action \
    ros1-rqt-bag \
    ros1-rqt-console \
    ros1-rqt-controller-manager \
    ros1-rqt-dep \
    ros1-rqt-drone-teleop \
    ros1-rqt-ez-publisher \
    ros1-rqt-graph \
    ros1-rqt-ground-robot-teleop \
    ros1-rqt-gui \
    ros1-rqt-gui-cpp \
    ros1-rqt-gui-py \
    ros1-rqt-image-view \
    ros1-rqt-joint-trajectory-controller \
    ros1-rqt-joint-trajectory-plot \
    ros1-rqt-launch \
    ros1-rqt-launchtree \
    ros1-rqt-logger-level \
    ros1-rqt-moveit \
    ros1-rqt-msg \
    ros1-rqt-multiplot \
    ros1-rqt-nav-view \
    ros1-rqt-plot \
    ros1-rqt-publisher \
    ros1-rqt-py-common \
    ros1-rqt-py-console \
    ros1-rqt-reconfigure \
    ros1-rqt-robot-dashboard \
    ros1-rqt-robot-monitor \
    ros1-rqt-robot-steering \
    ros1-rqt-rosmon \
    ros1-rqt-rotors \
    ros1-rqt-runtime-monitor \
    ros1-rqt-rviz \
    ros1-rqt-service-caller \
    ros1-rqt-shell \
    ros1-rqt-srv \
    ros1-rqt-tf-tree \
    ros1-rqt-top \
    ros1-rqt-topic \
    ros1-rqt-web \
    ros1-sick-safetyscanners \
    ros1-visualstates \
    ros1-webkit-dependency \
"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'vtk-qt', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_VTK_QT}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_VTK_QT = " \
    ros1-ira-laser-tools \
    ros1-lvr2 \
    ros1-rc-cloud-accumulator \
    ros1-rtabmap \
    ros1-rtabmap-ros \
    ros1-simple-grasping \
"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'x11', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_X11}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_X11 = " \
    ros1-cob-collision-monitor \
    ros1-cob-obstacle-distance-moveit \
    ros1-exotica-aico-solver \
    ros1-exotica-cartpole-dynamics-solver \
    ros1-exotica-collision-scene-fcl \
    ros1-exotica-collision-scene-fcl-latest \
    ros1-exotica-core \
    ros1-exotica-ddp-solver \
    ros1-exotica-double-integrator-dynamics-solver \
    ros1-exotica-dynamics-solvers \
    ros1-exotica-ik-solver \
    ros1-exotica-ilqg-solver \
    ros1-exotica-ilqr-solver \
    ros1-exotica-levenberg-marquardt-solver \
    ros1-exotica-ompl-control-solver \
    ros1-exotica-pendulum-dynamics-solver \
    ros1-exotica-pinocchio-dynamics-solver \
    ros1-exotica-quadrotor-dynamics-solver \
    ros1-exotica-scipy-solver \
    ros1-exotica-time-indexed-rrt-connect-solver \
    ros1-fsrobo-r-trajectory-filters \
    ros1-image-pipeline \
    ros1-image-view \
    ros1-image-view2 \
    ros1-industrial-core \
    ros1-industrial-trajectory-filters \
    ros1-mapviz \
    ros1-mapviz-plugins \
    ros1-moveit-fake-controller-manager \
    ros1-moveit-planners \
    ros1-moveit-planners-ompl \
    ros1-moveit-plugins \
    ros1-moveit-pr2 \
    ros1-moveit-ros-benchmarks \
    ros1-moveit-ros-manipulation \
    ros1-moveit-ros-move-group \
    ros1-moveit-ros-perception \
    ros1-moveit-ros-planning \
    ros1-moveit-ros-planning-interface \
    ros1-moveit-ros-robot-interaction \
    ros1-moveit-ros-warehouse \
    ros1-moveit-runtime \
    ros1-moveit-sim-controller \
    ros1-mpc-local-planner-examples \
    ros1-multires-image \
    ros1-navigation-stage \
    ros1-navigation-tutorials \
    ros1-open-manipulator-controller \
    ros1-open-manipulator-with-tb3-tools \
    ros1-perception \
    ros1-pilz-trajectory-generation \
    ros1-pr2-moveit-config \
    ros1-rc-roi-manager-gui \
    ros1-rc-visard \
    ros1-robot-body-filter \
    ros1-roomba-stage \
    ros1-safe-teleop-stage \
    ros1-stage \
    ros1-stage-ros \
    ros1-teb-local-planner-tutorials \
    ros1-tile-map \
    ros1-tuw-checkerboard \
    ros1-tuw-marker-detection \
    ros1-uwsim-bullet \
"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'mongodb', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_MONGODB}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_MONGODB = " \
    ros1-mongodb-log \
    ros1-mongodb-store \
    ros1-warehouse-ros-mongo \
"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'vlc', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_VLC}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_VLC = " \
    ros1-cob-android \
    ros1-cob-android-script-server \
    ros1-cob-command-gui \
    ros1-cob-default-robot-behavior \
    ros1-cob-driver \
    ros1-cob-helper-tools \
    ros1-cob-mimic \
    ros1-cob-monitoring \
    ros1-cob-moveit-interface \
    ros1-cob-script-server \
    ros1-cob-sound \
    ros1-cob-teleop \
"

# ERROR: Nothing PROVIDES 'UNRESOLVED-python-pyusb-pip' (but generated-recipes/jsk-3rdparty/respeaker-ros_2.1.13-1.bb DEPENDS on or otherwise requires it)
# ERROR: Nothing PROVIDES 'UNRESOLVED-python-speechrecognition-pip' (but generated-recipes/jsk-3rdparty/respeaker-ros_2.1.13-1.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-respeaker-ros"

# ERROR: Nothing PROVIDES 'UNRESOLVED-python-catkin-tools' (but generated-recipes/jsk-3rdparty/collada-urdf-jsk-patch_2.1.13-1.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-collada-urdf-jsk-patch"

# ERROR: Nothing PROVIDES 'UNRESOLVED-python-avahi' (but generated-recipes/multimaster-fkie/master-discovery-fkie_0.8.12.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-master-discovery-fkie"
# ERROR: Nothing PROVIDES 'master-discovery-fkie' (but generated-recipes/multimaster-fkie/master-sync-fkie_0.8.12.bb DEPENDS on or otherwise requires it)
# ERROR: Nothing RPROVIDES 'master-discovery-fkie' (but generated-recipes/multimaster-fkie/master-sync-fkie_0.8.12.bb, generated-recipes/cpr-multimaster-tools/multimaster-launch_0.0.2-1.bb RDEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-master-sync-fkie"
RDEPENDS_${PN}_remove = "ros1-node-manager-fkie"
RDEPENDS_${PN}_remove = "ros1-multimaster-fkie"
# ERROR: Nothing RPROVIDES 'master-discovery-fkie' (but generated-recipes/multimaster-fkie/master-sync-fkie_0.8.12.bb, generated-recipes/cpr-multimaster-tools/multimaster-launch_0.0.2-1.bb RDEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-multimaster-launch"
# ERROR: Nothing PROVIDES 'multimaster-launch' (but generated-recipes/husky/husky-control_0.4.2-1.bb DEPENDS on or otherwise requires it)
# ERROR: Nothing RPROVIDES 'multimaster-launch' (but generated-recipes/husky/husky-control_0.4.2-1.bb, generated-recipes/cpr-multimaster-tools/cpr-multimaster-tools_0.0.2-1.bb RDEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-husky-control"
# ERROR: Nothing RPROVIDES 'multimaster-launch' (but generated-recipes/husky/husky-control_0.4.2-1.bb, generated-recipes/cpr-multimaster-tools/cpr-multimaster-tools_0.0.2-1.bb RDEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-cpr-multimaster-tools"
# ERROR: Nothing PROVIDES 'husky-control' (but generated-recipes/husky/husky-base_0.4.2-1.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-husky-base"

# ERROR: Nothing PROVIDES 'UNRESOLVED-python-cwiid' (but generated-recipes/joystick-drivers/wiimote_1.13.0-1.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-wiimote"
# ERROR: Nothing RPROVIDES 'wiimote' (but generated-recipes/joystick-drivers/joystick-drivers_1.13.0-1.bb RDEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-joystick-drivers"

# ERROR: Nothing PROVIDES 'UNRESOLVED-libopenvdb' (but generated-recipes/spatio-temporal-voxel-layer/spatio-temporal-voxel-layer_1.3.5-2.bb DEPENDS on or otherwise requires it)
# ERROR: Nothing PROVIDES 'UNRESOLVED-libopenexr-dev' (but generated-recipes/spatio-temporal-voxel-layer/spatio-temporal-voxel-layer_1.3.5-2.bb DEPENDS on or otherwise requires it)
# ERROR: Nothing PROVIDES 'UNRESOLVED-libopenvdb-dev' (but generated-recipes/spatio-temporal-voxel-layer/spatio-temporal-voxel-layer_1.3.5-2.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-spatio-temporal-voxel-layer"

# ERROR: Nothing PROVIDES 'UNRESOLVED-gfortran' (but generated-recipes/optpp-catkin/optpp-catkin_2.4.0-1.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-optpp-catkin"

# ERROR: Nothing PROVIDES 'UNRESOLVED-libopenni-dev' (but generated-recipes/openni-camera/openni-camera_1.11.1.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-openni-camera"
RDEPENDS_${PN}_remove = "ros1-openni-launch"

# ERROR: Nothing PROVIDES 'UNRESOLVED-gforth' (but generated-recipes/wge100-driver/wge100-camera-firmware_1.8.2-1.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-wge100-camera-firmware"

# ERROR: Nothing PROVIDES 'UNRESOLVED-arduino-core' (but generated-recipes/rosserial/rosserial-arduino_0.8.0.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-rosserial-arduino"

# ERROR: Nothing PROVIDES 'UNRESOLVED-coinor-libipopt-dev' (but generated-recipes/ifopt/ifopt_2.0.7-1.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-ifopt"
RDEPENDS_${PN}_remove = "ros1-towr-ros"
RDEPENDS_${PN}_remove = "ros1-control-box-rst"

# ERROR: Nothing PROVIDES 'UNRESOLVED-npm-native' (but generated-recipes/vapor-master/vapor-master_0.3.0.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-vapor-master"

# ERROR: Nothing PROVIDES 'UNRESOLVED-libopenscenegraph' (but generated-recipes/visualization-osg/osg-utils_1.0.2-2.bb, generated-recipes/visualization-osg/osg-interactive-markers_1.0.2-2.bb, generated-recipes/visualization-osg/osg-markers_1.0.2-2.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'osg', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_OSG}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_OSG = " \
    ros1-osg-interactive-markers \
    ros1-osg-markers \
    ros1-osg-utils \
    ros1-uwsim \
    ros1-uwsim-osgbullet \
    ros1-uwsim-osgocean \
    ros1-uwsim-osgworks \
"

# ERROR: Nothing PROVIDES 'UNRESOLVED-muparser' (but generated-recipes/ros-canopen/canopen-motor-node_0.8.2-1.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-canopen-motor-node"
RDEPENDS_${PN}_remove = "ros1-pilz-robots"
RDEPENDS_${PN}_remove = "ros1-prbt-pg70-support"
RDEPENDS_${PN}_remove = "ros1-prbt-grippers"

# ERROR: Nothing PROVIDES 'UNRESOLVED-java' (but generated-recipes/nao-meshes/nao-meshes_0.1.12-2.bb, generated-recipes/pepper-meshes/pepper-meshes_0.2.4-3.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-nao-meshes"
RDEPENDS_${PN}_remove = "ros1-pepper-meshes"

# ERROR: Nothing PROVIDES 'clang-tidy' (but generated-recipes/pilz-robots/pilz-utils_0.5.13-1.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-pilz-utils"
RDEPENDS_${PN}_remove = "ros1-prbt-moveit-config"

# ERROR: Nothing PROVIDES 'UNRESOLVED-libopenni2-dev' (but generated-recipes/openni2-camera/openni2-camera_0.4.2.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-openni2-camera"
RDEPENDS_${PN}_remove = "ros1-openni2-launch"

# ERROR: Nothing PROVIDES 'UNRESOLVED-libspnav-dev' (but generated-recipes/joystick-drivers/spacenav-node_1.13.0-1.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-spacenav-node"

# ERROR: Nothing PROVIDES 'UNRESOLVED-omniorb' (but generated-recipes/openrtm-aist/openrtm-aist_1.1.2-3.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-openrtm-aist"

# ERROR: Nothing PROVIDES 'ifopt' (but generated-recipes/towr/towr_1.4.1.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-towr"

# ERROR: Nothing PROVIDES 'pilz-utils' (but generated-recipes/pilz-robots/prbt-hardware-support_0.5.13-1.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-prbt-hardware-support"

# ERROR: Nothing PROVIDES 'osg-markers' (but generated-recipes/visualization-osg/visualization-osg_1.0.2-2.bb DEPENDS on or otherwise requires it)
# ERROR: Nothing PROVIDES 'osg-utils' (but generated-recipes/visualization-osg/visualization-osg_1.0.2-2.bb DEPENDS on or otherwise requires it)
# ERROR: Nothing PROVIDES 'osg-interactive-markers' (but generated-recipes/visualization-osg/visualization-osg_1.0.2-2.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-visualization-osg"

# ERROR: Nothing PROVIDES 'wge100-camera-firmware' (but generated-recipes/wge100-driver/wge100-driver_1.8.2-1.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-wge100-driver"

# ERROR: Nothing RPROVIDES 'canopen-motor-node' (but generated-recipes/pilz-robots/prbt-support_0.5.13-1.bb, generated-recipes/ros-canopen/ros-canopen_0.8.2-1.bb RDEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-prbt-support"
RDEPENDS_${PN}_remove = "ros1-ros-canopen"

# ERROR: Nothing RPROVIDES 'UNRESOLVED-python-tk' (but generated-recipes/cob-driver/cob-voltage-control_0.7.1-1.bb RDEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-cob-voltage-control"

# ERROR: Nothing RPROVIDES 'UNRESOLVED-python-pandas' (but generated-recipes/rosbag-pandas/rosbag-pandas_0.5.3.bb RDEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-rosbag-pandas"

# ERROR: Nothing RPROVIDES 'UNRESOLVED-python-scipy' (but generated-recipes/uuv-simulator/uuv-trajectory-control_0.6.13.bb RDEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-uuv-trajectory-control"

# ERROR: Nothing RPROVIDES 'UNRESOLVED-python-termcolor' (but generated-recipes/py-trees-ros/py-trees-ros_0.5.18.bb RDEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-py-trees-ros"

# ERROR: Nothing RPROVIDES 'UNRESOLVED-python-msgpack' (but generated-recipes/json-transport/json-transport_0.0.3.bb RDEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-json-transport"

# ERROR: Nothing RPROVIDES 'UNRESOLVED-python-catkin-lint' (but generated-recipes/fetch-tools/fetch-tools_0.2.1.bb RDEPENDS on or otherwise requires it)
# ERROR: Nothing RPROVIDES 'UNRESOLVED-python-argcomplete' (but generated-recipes/fetch-tools/fetch-tools_0.2.1.bb RDEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-fetch-tools"

# ERROR: Nothing RPROVIDES 'uuv-trajectory-control' (but generated-recipes/eca-a9/eca-a9-control_0.1.6.bb, generated-recipes/uuv-simulator/uuv-control-utils_0.6.13.bb RDEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-eca-a9-control"
RDEPENDS_${PN}_remove = "ros1-uuv-control-utils"

# ERROR: Nothing RPROVIDES 'UNRESOLVED-network-manager' (but generated-recipes/network-autoconfig/network-autoconfig_0.1.1-2.bb RDEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "ros1-network-autoconfig"

# ERROR: Nothing PROVIDES 'UNRESOLVED-libnlopt-dev' (but generated-recipes/trac-ik/trac-ik-lib_1.5.1-1.bb DEPENDS on or otherwise requires it)
# ERROR: Nothing PROVIDES 'UNRESOLVED-libnlopt0' (but generated-recipes/trac-ik/trac-ik-lib_1.5.1-1.bb DEPENDS on or otherwise requires it)
RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'trac-ik', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_LIBNLOPT0}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_LIBNLOPT0 = " \
    ros1-trac-ik \
    ros1-trac-ik-examples \
    ros1-trac-ik-kinematics-plugin \
    ros1-trac-ik-lib \
    ros1-trac-ik-python \
"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'ogre', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_OGRE}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_OGRE = " \
    ros1-abb \
    ros1-abb-irb2400-moveit-config \
    ros1-abb-irb6640-moveit-config \
    ros1-franka-example-controllers \
    ros1-franka-ros \
    ros1-moveit \   
    ros1-moveit-ros \
    ros1-moveit-ros-visualization \
    ros1-moveit-setup-assistant \
    ros1-moveit-visual-tools \
    ros1-open-manipulator \
    ros1-open-manipulator-moveit \
    ros1-open-manipulator-with-tb3 \
    ros1-open-manipulator-with-tb3-waffle-moveit \
    ros1-open-manipulator-with-tb3-waffle-pi-moveit \
    ros1-panda-moveit-config \
    ros1-rviz-visual-tools \
    ros1-seed-r7-bringup \
    ros1-seed-r7-moveit-config \   
    ros1-seed-r7-typef-moveit-config \
    ros1-vision-visp \
    ros1-visp \
    ros1-visp-auto-tracker \
    ros1-visp-bridge \
    ros1-visp-camera-calibration \
    ros1-visp-hand2eye-calibration \
    ros1-visp-tracker \
"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'qt5', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_META_QT5}', '', d)}"

ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_META_QT5 = " \
    ros1-adi-driver \
    ros1-agni-tf-tools \
    ros1-ainstein-radar \
    ros1-ainstein-radar-rviz-plugins \
    ros1-asmach-tutorials \
    ros1-cartographer-rviz \
    ros1-cis-camera \
    ros1-cob-command-tools \
    ros1-cob-dashboard \
    ros1-cob-manipulation \
    ros1-common-tutorials \
    ros1-dataspeed-pds-rqt \
    ros1-desktop \
    ros1-desktop-full \
    ros1-distance-map \
    ros1-distance-map-rviz \
    ros1-dynamixel-workbench \
    ros1-dynamixel-workbench-single-manager-gui \
    ros1-fetch-gazebo-demo \
    ros1-fetch-simulation \
    ros1-find-object-2d \
    ros1-fkie-potree-rviz-plugin \
    ros1-fmi-adapter-examples \
    ros1-franka-example-controllers \
    ros1-franka-ros \
    ros1-fsrobo-r \
    ros1-fsrobo-r-bringup \
    ros1-fsrobo-r-moveit-config \
    ros1-geometry-tutorials \
    ros1-gl-dependency \
    ros1-grid-map \
    ros1-grid-map-demos \
    ros1-grid-map-rviz-plugin \
    ros1-gundam-robot \
    ros1-gundam-rx78-control \
    ros1-husky-desktop \
    ros1-husky-viz \
    ros1-imagesift \
    ros1-imu-tools \
    ros1-jackal-desktop \
    ros1-jackal-viz \
    ros1-jderobot-drones \
    ros1-jsk-common \
    ros1-jsk-data \
    ros1-jsk-interactive \
    ros1-jsk-interactive-marker \
    ros1-jsk-interactive-test \
    ros1-jsk-pcl-ros \
    ros1-jsk-pcl-ros-utils \
    ros1-jsk-perception \
    ros1-jsk-recognition \
    ros1-jsk-recognition-utils \
    ros1-jsk-rqt-plugins \
    ros1-jsk-rviz-plugins \
    ros1-jsk-tools \
    ros1-jsk-visualization \
    ros1-kvh-geo-fog-3d \
    ros1-kvh-geo-fog-3d-rviz \
    ros1-libqt-concurrent \
    ros1-libqt-core \
    ros1-libqt-gui \
    ros1-libqt-opengl \
    ros1-libqt-opengl-rosdev \
    ros1-libqt-rosdev \
    ros1-libqt-svg-rosdev \
    ros1-libqt-network \
    ros1-libqt-widgets \
    ros1-librviz-tutorial \
    ros1-linux-networking \
    ros1-lvr2 \
    ros1-mapviz \
    ros1-mapviz-plugins \
    ros1-mir-gazebo \
    ros1-mir-robot \
    ros1-moveit \
    ros1-moveit-ros \
    ros1-moveit-ros-visualization \
    ros1-moveit-setup-assistant \
    ros1-mrpt-bridge \
    ros1-multi-map-server \
    ros1-multimaster-fkie \
    ros1-multires-image \
    ros1-neonavigation \
    ros1-neonavigation-launch \
    ros1-neonavigation-rviz-plugins \
    ros1-node-manager-fkie \
    ros1-octomap-rviz-plugins \
    ros1-open-manipulator \
    ros1-open-manipulator-control-gui \
    ros1-open-manipulator-with-tb3 \
    ros1-panda-moveit-config \
    ros1-pilz-robots \
    ros1-pilz-status-indicator-rqt \
    ros1-plotjuggler \
    ros1-pr2eus-tutorials \
    ros1-prbt-gazebo \
    ros1-prbt-grippers \
    ros1-prbt-moveit-config \
    ros1-prbt-pg70-support \
    ros1-python-qt-binding \
    ros1-qt-dotgraph \
    ros1-qt-gui \
    ros1-qt-gui-app \
    ros1-qt-gui-core \
    ros1-qt-gui-cpp \
    ros1-qt-gui-py-common \
    ros1-qt-qmake \
    ros1-rc-cloud-accumulator \
    ros1-ridgeback-desktop \
    ros1-ridgeback-viz \
    ros1-ros-controllers \
    ros1-ros-tutorials \
    ros1-rosbag-editor \
    ros1-rosmon \
    ros1-rqt \
    ros1-rqt-action \
    ros1-rqt-bag \
    ros1-rqt-bag-plugins \
    ros1-rqt-common-plugins \
    ros1-rqt-console \
    ros1-rqt-controller-manager \
    ros1-rqt-dep \
    ros1-rqt-drone-teleop \
    ros1-rqt-ez-publisher \
    ros1-rqt-graph \
    ros1-rqt-ground-robot-teleop \
    ros1-rqt-gui \
    ros1-rqt-gui-cpp \
    ros1-rqt-gui-py \
    ros1-rqt-image-view \
    ros1-rqt-joint-trajectory-controller \
    ros1-rqt-joint-trajectory-plot \
    ros1-rqt-launch \
    ros1-rqt-launchtree \
    ros1-rqt-logger-level \
    ros1-rqt-moveit \
    ros1-rqt-msg \
    ros1-rqt-multiplot \
    ros1-rqt-nav-view \
    ros1-rqt-plot \
    ros1-rqt-pose-view \
    ros1-rqt-publisher \
    ros1-rqt-py-common \
    ros1-rqt-py-console \
    ros1-rqt-py-trees \
    ros1-rqt-reconfigure \
    ros1-rqt-robot-dashboard \
    ros1-rqt-robot-monitor \
    ros1-rqt-robot-plugins \
    ros1-rqt-robot-steering \
    ros1-rqt-rosmon \
    ros1-rqt-rotors \
    ros1-rqt-runtime-monitor \
    ros1-rqt-rviz \
    ros1-rqt-service-caller \
    ros1-rqt-shell \
    ros1-rqt-srv \
    ros1-rqt-tf-tree \
    ros1-rqt-top \
    ros1-rqt-topic \
    ros1-rqt-web \
    ros1-rtabmap-ros \
    ros1-rviz \
    ros1-rviz-imu-plugin \
    ros1-rviz-plugin-tutorials \
    ros1-rviz-python-tutorial \
    ros1-rviz-visual-tools \
    ros1-seed-r7-bringup \
    ros1-seed-r7-moveit-config \
    ros1-seed-r7-ros-pkg \
    ros1-seed-r7-samples \
    ros1-seed-r7-typef-moveit-config \
    ros1-sick-safetyscanners \
    ros1-simple-grasping \
    ros1-slam-toolbox \
    ros1-swri-console \
    ros1-swri-profiler-tools \
    ros1-tile-map \
    ros1-towr-ros \
    ros1-trajectory-tracker-rviz-plugins \
    ros1-turtle-actionlib \
    ros1-turtle-tf \
    ros1-turtle-tf2 \
    ros1-turtlesim \
    ros1-turtlesim-dash-tutorial \
    ros1-urdf-sim-tutorial \
    ros1-urdf-tutorial \
    ros1-visualization-tutorials \
    ros1-visualstates \
    ros1-viz \
    ros1-warthog-desktop \
    ros1-warthog-viz \
    ros1-webkit-dependency \
"

# OE won't let us build ffmpeg unless LICENSE_FLAGS_WHITELIST contains "commerical".
RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'ffmpeg', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_FFMPEG}', '', d)}"

ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_FFMPEG = " \
    ros1-codec-image-transport \
    ros1-h264-encoder-core \
    ros1-h264-video-encoder \
    ros1-movie-publisher \
    ros1-mrpt1 \
    ros1-mrpt-bridge \
    ros1-mrpt-ekf-slam-2d \
    ros1-mrpt-ekf-slam-3d \
    ros1-mrpt-graphslam-2d \
    ros1-mrpt-icp-slam-2d \
    ros1-mrpt-local-obstacles \
    ros1-mrpt-localization \
    ros1-mrpt-map \
    ros1-mrpt-navigation \
    ros1-mrpt-rawlog \
    ros1-mrpt-rbpf-slam \
    ros1-mrpt-reactivenav2d \
    ros1-mrpt-slam \
    ros1-mvsim \
    ros1-parrot-arsdk \
    ros1-pose-cov-ops \
    ros1-rospilot \
    ros1-usb-cam \
    ros1-web-video-server \
"

# OE won't let us build gstreamer1.0-plugins-ugly unless LICENSE_FLAGS_WHITELIST contains "commerical".
RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'gst-ugly', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_GSTREAMER1.0_PLUGINS_UGLY}', '', d)}"

ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_GSTREAMER1.0_PLUGINS_UGLY = " \
    ros1-audio-capture \
    ros1-audio-common \
    ros1-audio-play \
    ros1-cis-camera \
    ros1-imagesift \
    ros1-jsk-3rdparty \
    ros1-jsk-common \
    ros1-jsk-data \
    ros1-jsk-interactive \
    ros1-jsk-interactive-marker \
    ros1-jsk-interactive-test \
    ros1-jsk-pcl-ros-utils \
    ros1-jsk-pcl-ros \
    ros1-jsk-perception \
    ros1-jsk-pr2eus \
    ros1-jsk-recognition \
    ros1-jsk-recognition-utils \
    ros1-jsk-rviz-plugins \
    ros1-jsk-tools \
    ros1-jsk-topic-tools \
    ros1-jsk-visualization \
    ros1-julius-ros \
    ros1-multi-map-server \
    ros1-pr2eus \
    ros1-pr2eus-moveit \
    ros1-pr2eus-tutorials \
    ros1-resized-image-transport \
    ros1-ros-speech-recognition \
    ros1-sound-play \
    ros1-tts \
    ros1-voice-text \
"

# NB. gazebo-msgs is a dependency of non-Gazebo packages, so it doesn't appear here.
RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'gazebo', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_GAZEBO}', '', d)}"

ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_GAZEBO = " \
    ros1-ainstein-radar \
    ros1-ainstein-radar-gazebo-plugins \
    ros1-ati-force-torque \
    ros1-audibot \
    ros1-audibot-gazebo \
    ros1-blender-gazebo \
    ros1-cob-common \
    ros1-cob-description \
    ros1-cob-gazebo-objects \
    ros1-cob-gazebo-plugins \
    ros1-cob-gazebo-ros-control \
    ros1-cob-gazebo-worlds \
    ros1-cob-grasp-generation \
    ros1-cob-hardware-config \
    ros1-cob-manipulation \
    ros1-cob-moveit-bringup \
    ros1-desistek-saga-control \
    ros1-desistek-saga-description \
    ros1-desistek-saga-gazebo \
    ros1-desktop-full \
    ros1-drone-wrapper \
    ros1-eca-a9-description \
    ros1-eca-a9-gazebo \
    ros1-eusurdf \
    ros1-fetch-gazebo \
    ros1-fetch-gazebo-demo \
    ros1-fetch-simulation \
    ros1-fetchit-challenge \
    ros1-fsrobo-r \
    ros1-fsrobo-r-bringup \
    ros1-fsrobo-r-description \
    ros1-fsrobo-r-moveit-config \
    ros1-gazebo-plugins \
    ros1-gazebo-ros \
    ros1-gazebo-ros-control \
    ros1-gazebo-ros-pkgs \
    ros1-gazebo-rosdev \
    ros1-gundam-robot \
    ros1-gundam-rx78-gazebo \
    ros1-hector-gazebo \
    ros1-hector-gazebo-plugins \
    ros1-hector-gazebo-thermal-camera \
    ros1-hector-gazebo-worlds \
    ros1-hector-sensors-gazebo \
    ros1-husky-gazebo \
    ros1-husky-simulator \
    ros1-igvc-self-drive-description \
    ros1-igvc-self-drive-gazebo \
    ros1-igvc-self-drive-gazebo-plugins \
    ros1-igvc-self-drive-sim \
    ros1-jackal-gazebo \
    ros1-jackal-simulator \
    ros1-jderobot-assets \
    ros1-jderobot-drones \
    ros1-ksql-airport \
    ros1-lauv-control \
    ros1-lauv-description \
    ros1-lauv-gazebo \
    ros1-mcmillan-airfield \
    ros1-mecanum-gazebo-plugin \
    ros1-mir-description \
    ros1-mir-driver \
    ros1-mir-gazebo \
    ros1-mir-navigation \
    ros1-mir-robot \
    ros1-nmea-gps-plugin \
    ros1-open-manipulator-gazebo \
    ros1-open-manipulator-simulations \
    ros1-open-manipulator-with-tb3-gazebo \
    ros1-open-manipulator-with-tb3-simulations \
    ros1-pr2-controller-configuration-gazebo \
    ros1-pr2-gazebo \
    ros1-pr2-gazebo-plugins \
    ros1-pr2-simulator \
    ros1-prbt-gazebo \
    ros1-raw-description \
    ros1-rexrov2-control \
    ros1-rexrov2-description \
    ros1-rexrov2-gazebo \
    ros1-ridgeback-gazebo \
    ros1-ridgeback-gazebo-plugins \
    ros1-ridgeback-simulator \
    ros1-rotors-gazebo \
    ros1-rotors-gazebo-plugins \
    ros1-rotors-simulator \
    ros1-sand-island \
    ros1-simulators \
    ros1-turtlebot3-gazebo \
    ros1-turtlebot3-simulations \
    ros1-urdf-sim-tutorial \
    ros1-usv-gazebo-plugins \
    ros1-uuv-descriptions \
    ros1-uuv-gazebo-plugins \
    ros1-uuv-gazebo-ros-plugins \
    ros1-uuv-gazebo-worlds \
    ros1-uuv-sensor-ros-plugins \
    ros1-uuv-simulator \
    ros1-uuv-world-plugins \
    ros1-uuv-world-ros-plugins \
    ros1-velodyne-gazebo-plugins \
    ros1-velodyne-simulator \
    ros1-vrx-gazebo \
    ros1-wamv-gazebo \
    ros1-warthog-gazebo \
    ros1-warthog-simulator \
    ros1-wave-gazebo \
    ros1-wave-gazebo-plugins \
    ros1-yosemite-valley \
"

# Depends on libqt4-dev from https://git.yoctoproject.org/cgit/cgit.cgi/meta-qt4
RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'qt4', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_META_QT4}', '', d)}"

ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_META_QT4 = " \
    ros1-hector-geotiff \
    ros1-hector-geotiff-plugins \
    ros1-hector-slam \
    ros1-hector-slam-launch \
    ros1-qt-ros \
    ros1-qt-tutorials \
"

# Depends on vlc from meta-multimedia
RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'multimedia', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_META_MULTIMEDIA}', '', d)}"

ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_META_MULTIMEDIA = " \
    ros1-cob-android \
    ros1-cob-android-script-server \
    ros1-cob-command-gui \
    ros1-cob-command-tools \
    ros1-cob-default-robot-behavior \
    ros1-cob-driver \
    ros1-cob-helper-tools \
    ros1-cob-mimic \
    ros1-cob-monitoring \
    ros1-cob-moveit-interface \
    ros1-cob-script-server \
    ros1-cob-sound \
    ros1-cob-teleop \
"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'wxpython', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_WXPYTHON}', '', d)}"

ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_WXPYTHON = " \
    ros1-executive-smach-visualization \
    ros1-seed-r7-ros-pkg \
    ros1-seed-r7-samples \
    ros1-smach-viewer \
"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'lisp', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_LISP}', '', d)}"

ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_LISP = " \
    ros1-actionlib-lisp \
    ros1-cl-tf \
    ros1-cl-tf2 \
    ros1-cl-transforms \
    ros1-cl-transforms-stamped \
    ros1-cl-urdf \
    ros1-cl-utils \
    ros1-eus-assimp \
    ros1-euslisp \
    ros1-geneus \
    ros1-genlisp \
    ros1-jskeus \
    ros1-jsk-model-tools \
    ros1-jsk-roseus \
    ros1-ros-emacs-utils \
    ros1-rosemacs \
    ros1-roseus \
    ros1-roseus-mongo \
    ros1-roseus-smach \
    ros1-roseus-tutorials \
    ros1-roslisp \
    ros1-roslisp-common \
    ros1-roslisp-repl \
    ros1-roslisp-utilities \
    ros1-slime-ros \
    ros1-slime-wrapper \
"

# Depends on mesa or libglu which requires opengl or vulkan DISTRO_FEATURE
RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'opengl', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_OPENGL}', '', d)}"

ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_OPENGL = " \
    ros1-abb \
    ros1-abb-irb2400-moveit-config \
    ros1-abb-irb6640-moveit-config \
    ros1-cob-collision-monitor \
    ros1-cob-obstacle-distance-moveit \
    ros1-cob-moveit-bringup \
    ros1-cob-moveit-interface \
    ros1-desktop-full \
    ros1-exotica \
    ros1-exotica-aico-solver \
    ros1-exotica-cartpole-dynamics-solver \
    ros1-exotica-collision-scene-fcl \
    ros1-exotica-collision-scene-fcl-latest \
    ros1-exotica-core \
    ros1-exotica-core-task-maps \
    ros1-exotica-ddp-solver \
    ros1-exotica-double-integrator-dynamics-solver \
    ros1-exotica-dynamics-solvers \
    ros1-exotica-examples \
    ros1-exotica-ik-solver \
    ros1-exotica-ilqg-solver \
    ros1-exotica-ilqr-solver \
    ros1-exotica-levenberg-marquardt-solver \
    ros1-exotica-ompl-solver \
    ros1-exotica-ompl-control-solver \
    ros1-exotica-pendulum-dynamics-solver \
    ros1-exotica-pinocchio-dynamics-solver \
    ros1-exotica-python \
    ros1-exotica-quadrotor-dynamics-solver \
    ros1-exotica-scipy-solver \
    ros1-exotica-time-indexed-rrt-connect-solver \
    ros1-fetch-bringup \
    ros1-fetch-moveit-config \
    ros1-fetch-ros \
    ros1-fsrobo-r-trajectory-filters \
    ros1-industrial-core \
    ros1-industrial-trajectory-filters \
    ros1-libg2o \
    ros1-moveit-commander \
    ros1-moveit-fake-controller-manager \
    ros1-moveit-planners \
    ros1-moveit-planners-ompl \
    ros1-moveit-plugins \
    ros1-moveit-pr2 \
    ros1-moveit-ros-benchmarks \
    ros1-moveit-ros-manipulation \
    ros1-moveit-ros-move-group \
    ros1-moveit-ros-perception \
    ros1-moveit-ros-planning \
    ros1-moveit-ros-planning-interface \
    ros1-moveit-ros-robot-interaction \
    ros1-moveit-ros-warehouse \
    ros1-moveit-runtime \
    ros1-moveit-sim-controller \
    ros1-moveit-visual-tools \
    ros1-mpc-local-planner-examples \
    ros1-navigation-stage \
    ros1-navigation-tutorials \
    ros1-open-manipulator-controller \
    ros1-open-manipulator-moveit \
    ros1-open-manipulator-with-tb3-tools \
    ros1-open-manipulator-with-tb3-waffle-moveit \
    ros1-open-manipulator-with-tb3-waffle-pi-moveit \
    ros1-pilz-industrial-motion \
    ros1-pilz-robot-programming \
    ros1-pilz-trajectory-generation \
    ros1-pr2-moveit-config \
    ros1-rc-visard \
    ros1-robot-body-filter \
    ros1-roomba-stage \
    ros1-rtabmap \
    ros1-rtabmap-ros \
    ros1-safe-teleop-stage \
    ros1-seed-r7-navigation \
    ros1-simulators \
    ros1-stage \
    ros1-stage-ros \
    ros1-teb-local-planner \
    ros1-teb-local-planner-tutorials \
    ros1-uwsim \
    ros1-uwsim-bullet \
    ros1-uwsim-osgbullet \
    ros1-uwsim-osgocean \
    ros1-uwsim-osgworks \
    ros1-wxwidgets \
    ros1-rc-roi-manager-gui \
    ros1-rqt-pose-view \
"

# There is unbuildable dependency on virtual/egl from gstreamer1.0-plugins-base because:
# 1) gstreamer1.0-plugins-base depends on virtual/egl because of "egl" PACKAGECONFIG
#
# 2) "egl" PACKAGECONFIG is enabled by
#    meta-raspberrypi/recipes-multimedia/gstreamer/gstreamer1.0-plugins-base_%.bbappend
#    PACKAGECONFIG_GL_rpi = "egl gles2"
#
#    without respecting the "opengl" in DISTRO_FEATURES like the recipe in oe-core does
#    openembedded-core/meta/recipes-multimedia/gstreamer/gstreamer1.0-plugins-base_1.14.4.bb:
#    PACKAGECONFIG_GL ?= "${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'gles2 egl', '', d)}"
#
# 3) virtual/egl is provided either by:
#    - userland (only without vc4graphics in MACHINE_FEATURES):
#      meta-raspberrypi/recipes-graphics/userland/userland_git.bb:PROVIDES += "${@bb.utils.contains("MACHINE_FEATURES", "vc4graphics", "", "virtual/libgles2 virtual/egl", d)}"
#    - mesa (selected with vc4graphics in MACHINE_FEATURES)
#      meta-raspberrypi/conf/machine/include/rpi-default-providers.inc:PREFERRED_PROVIDER_virtual/egl ?= "${@bb.utils.contains("MACHINE_FEATURES", "vc4graphics", "mesa", "userland", d)}"
#    - vc-graphics(-hardfp)
#      meta-raspberrypirecipes-graphics/vc-graphics/vc-graphics.inc:PROVIDES = "virtual/libgles2 virtual/egl"
#
# 4) vc-graphics(-hardfp) recipe are skipped in default setup, because with vc4graphics being
#    in MACHINE_FEATURES by default since:
#    https://github.com/agherzan/meta-raspberrypi/commit/690bdca57422447e49d4ef43862bf675e9acc28f
#    the PREFERRED_PROVIDER_virtual/libgles2 is set to mesa in:
#    conf/machine/include/rpi-default-providers.inc:PREFERRED_PROVIDER_virtual/libgles2 ?= "${@bb.utils.contains("MACHINE_FEATURES", "vc4graphics", "mesa", "userland", d)}"
#
#    resulting in skipping the other virtual/libgles2 providers:
#    vc-graphics-hardfp PROVIDES virtual/egl but was skipped: PREFERRED_PROVIDER_virtual/libgles2 set to mesa, not vc-graphics-hardfp
#    vc-graphics PROVIDES virtual/egl but was skipped: PREFERRED_PROVIDER_virtual/libgles2 set to mesa, not vc-graphics
#
# 5) mesa is skipped when neither opengl nor vulkan are in DISTRO_FEATURES
#
# 6) userland doesn't provide virtual/egl because we have the default vc4graphics
#    meta-raspberrypi/recipes-graphics/userland/userland_git.bb:PROVIDES += "${@bb.utils.contains("MACHINE_FEATURES", "vc4graphics", "", "virtual/libgles2 virtual/egl", d)}"
#    and it cannot be built anyway, because with the default vc4graphics it depends on libegl-mesa:
#    meta-raspberrypi/recipes-graphics/userland/userland_git.bb:RDEPENDS_${PN} += "${@bb.utils.contains("MACHINE_FEATURES", "vc4graphics", "libegl-mesa", "", d)}"
#    and libegl-mesa is provided only by mesa recipe from oe-core which in turn
#    requires either "opengl" or "vulkan" to be in DISTRO_FEATURES
#
# This causes a lot of unresolved dependencies in default setup with vc4graphics but without opengl.
# - with Yocto 2.6 Thud and older it worked, because vc4graphics wasn't enabled by default before:
#   https://github.com/agherzan/meta-raspberrypi/commit/690bdca57422447e49d4ef43862bf675e9acc28f
#
# To build these packages you have 3 options:
# A) Just add "opengl" to DISTRO_FEATURES and use the default vc4graphics with mesa providing virtual/egl
# B) Use DISABLE_VC4GRAPHICS added in
#    https://github.com/agherzan/meta-raspberrypi/commit/96c8459c9363cc6bf463aedf4d24f92a1ee7d6ba
#    to explicitly disable vc4graphics and use userland to provide virtual/egl
# C) Apply https://github.com/agherzan/meta-raspberrypi/pull/551 in meta-raspberrypi,
#    this part can be removed once upgrading to Yocto release with this applied
RDEPENDS_${PN}_remove_rpi = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'vc4graphics-without-opengl', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_OPENGL_AND_VC4GRAPHICS}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_OPENGL_AND_VC4GRAPHICS = " \
    ros1-ainstein-radar-tools \
    ros1-apriltag-ros \
    ros1-ar-track-alvar \
    ros1-aruco-detect \
    ros1-avt-vimba-camera \
    ros1-calibration \
    ros1-calibration-launch \
    ros1-calibration-setup-helper \
    ros1-camera-calibration \
    ros1-checkerboard-detector \
    ros1-cob-camera-sensors \
    ros1-cob-image-flip \
    ros1-cob-map-accessibility-analysis \
    ros1-cob-navigation \
    ros1-cob-object-detection-visualizer \
    ros1-cob-perception-common \
    ros1-cob-vision-utils \
    ros1-compressed-depth-image-transport \
    ros1-compressed-image-transport \
    ros1-costmap-converter \
    ros1-criutils \
    ros1-cv-bridge \
    ros1-cv-camera \
    ros1-depth-image-proc \
    ros1-depthcloud-encoder \
    ros1-depthimage-to-laserscan \
    ros1-distance-map-opencv \
    ros1-face-detector \
    ros1-fetch-calibration \
    ros1-fetch-depth-layer \
    ros1-fetch-navigation \
    ros1-fiducials \
    ros1-fiducial-slam \
    ros1-flir-boson-usb \
    ros1-freight-bringup \
    ros1-generic-throttle \
    ros1-grid-map-cv \
    ros1-grid-map-filters \
    ros1-grid-map-loader \
    ros1-grid-map-ros \
    ros1-grid-map-visualization \
    ros1-gscam \
    ros1-gstreamer1.0-plugins-base \
    ros1-gstreamer1.0-plugins-base-meta \
    ros1-handeye \
    ros1-hector-compressed-map-transport \
    ros1-image-cb-detector \
    ros1-image-geometry \
    ros1-image-pipeline \
    ros1-image-proc \
    ros1-image-publisher \
    ros1-image-rotate \
    ros1-image-transport-plugins \
    ros1-image-view \
    ros1-image-view2 \
    ros1-imagezero-image-transport \
    ros1-imagezero-ros \
    ros1-ipa-3d-fov-visualization \
    ros1-jsk-common-msgs \
    ros1-laser-cb-detector \
    ros1-leg-detector \
    ros1-libcmt \
    ros1-multi-object-tracking-lidar \
    ros1-multisense \
    ros1-multisense-bringup \
    ros1-multisense-cal-check \
    ros1-multisense-lib \
    ros1-multisense-ros \
    ros1-naoqi-driver \
    ros1-nerian-stereo \
    ros1-opencv \
    ros1-opencv-apps \
    ros1-openni-launch \
    ros1-openni2-launch \
    ros1-opt-camera \
    ros1-people \
    ros1-people-velocity-tracker \
    ros1-perception \
    ros1-photo \
    ros1-posedetection-msgs \
    ros1-realsense2-camera \
    ros1-rgbd-launch \
    ros1-robot-calibration \
    ros1-roseus-tutorials \
    ros1-slic \
    ros1-stereo-image-proc \
    ros1-swri-geometry-util \
    ros1-swri-image-util \
    ros1-swri-opencv-util \
    ros1-swri-route-util \
    ros1-swri-transform-util \
    ros1-theora-image-transport \
    ros1-turtlebot3-applications \
    ros1-turtlebot3-automatic-parking-vision \
    ros1-turtlebot3-autorace \
    ros1-turtlebot3-autorace-camera \
    ros1-turtlebot3-autorace-control \
    ros1-turtlebot3-autorace-core \
    ros1-turtlebot3-autorace-detect \
    ros1-turtlebot3-panorama \
    ros1-tuw-aruco \
    ros1-tuw-checkerboard \
    ros1-tuw-ellipses \
    ros1-tuw-geometry \
    ros1-tuw-marker-detection \
    ros1-tuw-marker-pose-estimation \
    ros1-usb-cam-controllers \
    ros1-video-stream-opencv \
    ros1-vision-opencv \
    ros1-vision-visp \
    ros1-visp \
    ros1-visp-auto-tracker \
    ros1-visp-bridge \
    ros1-visp-camera-calibration \
    ros1-visp-hand2eye-calibration \
    ros1-visp-tracker \
    ros1-webrtc-ros \
    ros1-yocs-localization-manager \
"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'unknown-compile', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_FAILING_TO_COMPILE}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_FAILING_TO_COMPILE = "\
    ros1-acado \
    ros1-ackermann-msgs \
    ros1-ainstein-radar-msgs \
    ros1-arbotix-msgs \
    ros1-asr-msgs \
    ros1-delphi-esr-msgs \
    ros1-delphi-mrr-msgs \
    ros1-delphi-srr-msgs \
    ros1-ibeo-msgs \
    ros1-kartech-linear-actuator-msgs \
    ros1-mobileye-560-660-msgs \
    ros1-neobotix-usboard-msgs \
    ros1-pacmod-msgs \
    ros1-radar-msgs \
    ros1-async-comm \
    ros1-audio-common-msgs \
    ros1-automotive-navigation-msgs \
    ros1-automotive-platform-msgs \
    ros1-aws-common \
    ros1-backward-ros \
    ros1-behaviortree-cpp \
    ros1-behaviortree-cpp-v3 \
    ros1-brics-actuator \
    ros1-calibration-msgs \
    ros1-cartesian-msgs \
    ros1-cob-actions \
    ros1-cob-msgs \
    ros1-cob-srvs \
    ros1-cob-control-msgs \
    ros1-libdlib \
    ros1-libphidgets \
    ros1-cob-object-detection-msgs \
    ros1-cob-perception-msgs \
    ros1-control-msgs \
    ros1-multimaster-msgs \
    ros1-dataspeed-pds-msgs \
    ros1-dataspeed-ulc-msgs \
    ros1-dbw-fca-msgs \
    ros1-dbw-mkz-msgs \
    ros1-test-diagnostic-aggregator \
    ros1-distance-map-msgs \
    ros1-dynamic-robot-state-publisher \
    ros1-dynamixel-workbench-msgs \
    ros1-smach-msgs \
    ros1-fcl-catkin \
    ros1-fkie-message-filters \
    ros1-four-wheel-steering-msgs \
    ros1-franka-hw \
    ros1-franka-msgs \
    ros1-franka-visualization \
    ros1-fsrobo-r-msgs \
    ros1-gazebo-msgs \
    ros1-graph-msgs \
    ros1-grid-map-msgs \
    ros1-hector-nav-msgs \
    ros1-husky-msgs \
    ros1-imagezero-ros \
    ros1-imagezero \
    ros1-industrial-msgs \
    ros1-jackal-msgs \
    ros1-assimp-devel \
    ros1-bayesian-belief-networks \
    ros1-downward \
    ros1-ff \
    ros1-ffha \
    ros1-julius \
    ros1-libsiftfast \
    ros1-nlopt \
    ros1-jsk-footstep-msgs \
    ros1-jsk-gui-msgs \
    ros1-jsk-hark-msgs \
    ros1-posedetection-msgs \
    ros1-speech-recognition-msgs \
    ros1-json-msgs \
    ros1-kinesis-video-msgs \
    ros1-kobuki-msgs \
    ros1-kvh-geo-fog-3d-msgs \
    ros1-leuze-msgs \
    ros1-lgsvl-msgs \
    ros1-libg2o \
    ros1-libuvc-camera \
    ros1-map-merge-3d \
    ros1-marker-msgs \
    ros1-marti-can-msgs \
    ros1-marti-common-msgs \
    ros1-marti-perception-msgs \
    ros1-marti-sensor-msgs \
    ros1-marti-status-msgs \
    ros1-marti-visualization-msgs \
    ros1-mav-msgs \
    ros1-mcl-3dl-msgs \
    ros1-md49-messages \
    ros1-mir-msgs \
    ros1-ml-classifiers \
    ros1-mbf-msgs \
    ros1-mrpt-msgs \
    ros1-multimaster-msgs-fkie \
    ros1-multisense-ros \
    ros1-naoqi-bridge-msgs \
    ros1-naoqi-libqi \
    ros1-nav2d-msgs \
    ros1-sbpl-lattice-planner \
    ros1-range-sensor-layer \
    ros1-costmap-cspace-msgs \
    ros1-map-organizer-msgs \
    ros1-planner-cspace-msgs \
    ros1-safety-limiter-msgs \
    ros1-trajectory-tracker-msgs \
    ros1-obj-to-pointcloud \
    ros1-nerian-stereo \
    ros1-network-interface \
    ros1-nmea-msgs \
    ros1-novatel-gps-msgs \
    ros1-novatel-msgs \
    ros1-object-recognition-msgs \
    ros1-octomap-msgs \
    ros1-dynamic-edt-3d \
    ros1-odva-ethernetip \
    ros1-open-manipulator-msgs \
    ros1-p2os-msgs \
    ros1-p2os-urdf \
    ros1-people-msgs \
    ros1-libphidget21 \
    ros1-power-msgs \
    ros1-pr2-common-action-msgs \
    ros1-pr2-description \
    ros1-pr2-msgs \
    ros1-pr2-controllers-msgs \
    ros1-pr2-mechanism-msgs \
    ros1-px4-msgs \
    ros1-rail-manipulation-msgs \
    ros1-rail-mesh-icp \
    ros1-rc-common-msgs \
    ros1-rc-dynamics-api \
    ros1-ridgeback-msgs \
    ros1-rslidar-msgs \
    ros1-robot-activity-msgs \
    ros1-robot-calibration-msgs \
    ros1-robot-controllers-msgs \
    ros1-nav-2d-msgs \
    ros1-concert-workflow-engine-msgs \
    ros1-gateway-msgs \
    ros1-can-msgs \
    ros1-canopen-master \
    ros1-controller-manager-msgs \
    ros1-position-controllers \
    ros1-ros-monitoring-msgs \
    ros1-roscpp-tutorials \
    ros1-rosauth \
    ros1-rosbag-editor \
    ros1-rosapi \
    ros1-rosbridge-library \
    ros1-rosbridge-msgs \
    ros1-rosmon-msgs \
    ros1-sainsmart-relay-usb \
    ros1-sbg-driver \
    ros1-sick-safetyscanners \
    ros1-sick-scan \
    ros1-soem \
    ros1-swri-profiler-msgs \
    ros1-tf2-server \
    ros1-tuw-airskin-msgs \
    ros1-tuw-multi-robot-msgs \
    ros1-tuw-object-msgs \
    ros1-ublox-msgs \
    ros1-um7 \
    ros1-underwater-sensor-msgs \
    ros1-uuv-auv-control-allocator \
    ros1-uuv-control-msgs \
    ros1-uuv-gazebo-ros-plugins-msgs \
    ros1-uuv-sensor-ros-plugins-msgs \
    ros1-uuv-thruster-manager \
    ros1-uuv-world-ros-plugins-msgs \
    ros1-variant-msgs \
    ros1-velodyne-msgs \
    ros1-view-controller-msgs \
    ros1-vision-msgs \
    ros1-vrpn-client-ros \
    ros1-wamv-description \
    ros1-warthog-msgs \
    ros1-xpp-msgs \
    ros1-zeroconf-msgs \
"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'unknown-configure', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_FAILING_TO_CONFIGURE}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_FAILING_TO_CONFIGURE = "\
    ros1-agni-tf-tools \
    ros1-ariles-ros \
    ros1-cartographer-rviz \
    ros1-libntcan \
    ros1-dccomms-ros-msgs \
    ros1-timestamp-tools \
    ros1-eigenpy \
    ros1-eml \
    ros1-epos2-motor-controller \
    ros1-find-object-2d \
    ros1-fkie-potree-rviz-plugin \
    ros1-fmi-adapter \
    ros1-hebi-cpp-api \
    ros1-hpp-fcl \
    ros1-husky-description \
    ros1-husky-navigation \
    ros1-rviz-imu-plugin \
    ros1-jackal-description \
    ros1-jackal-navigation \
    ros1-ps3joy \
    ros1-libcmt \
    ros1-rosping \
    ros1-slic \
    ros1-librealsense2 \
    ros1-mongodb-store \
    ros1-plotjuggler \
    ros1-pr2-mechanism-model \
    ros1-prosilica-gige-sdk \
    ros1-pyros-utils \
    ros1-qt-gui-cpp \
    ros1-rc-genicam-api \
    ros1-ridgeback-viz \
    ros1-ridgeback-navigation \
    ros1-allocators \
    ros1-rosatomic \
    ros1-turtlesim \
    ros1-stage \
    ros1-swri-console \
    ros1-tuw-geometry \
    ros1-um6 \
    ros1-librviz-tutorial \
    ros1-rviz-plugin-tutorials \
    ros1-rviz-python-tutorial \
    ros1-warehouse-ros-mongo \
    ros1-warthog-description \
    ros1-willow-maps \
    ros1-ypspur-ros \
"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'unknown-install', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_FAILING_TO_INSTALL}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_FAILING_TO_INSTALL = "\
    ros1-libreflexxestype2 \
"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'unknown-package_qa', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_FAILING_TO_PACKAGE_QA}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_FAILING_TO_PACKAGE_QA = "\
    ros1-apriltag-ros \
    ros1-cob-model-identifier \
    ros1-libpcan \
    ros1-cob-reflector-referencing \
    ros1-cob-safety-controller \
    ros1-flexbe-widget \
    ros1-mini-maxwell \
    ros1-jsk-network-tools \
    ros1-libfranka \
    ros1-swri-prefix-tools \
    ros1-octomap \
    ros1-rcdiscover \
    ros1-ridgeback-description \
    ros1-robot-upstart \
    ros1-tracetools \
    ros1-ypspur \
    ros1-yocs-ar-pair-approach \
"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'unknown-packagedata', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_FAILING_TO_PACKAGEDATA}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_FAILING_TO_PACKAGEDATA = "\
    ros1-opencv-apps \
"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'unknown-victim', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_FAILING_BECAUSE_OF_ITS_DEPS}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_FAILING_BECAUSE_OF_ITS_DEPS = "\
    ros1-abb-driver \
    ros1-abb-irb2400-moveit-plugins \
    ros1-abb-irb2400-support \
    ros1-abb-irb4400-support \
    ros1-abb-irb5400-support \
    ros1-abb-irb6600-support \
    ros1-abb-irb6640-support \
    ros1-ackermann-steering-controller \
    ros1-adi-driver \
    ros1-ainstein-radar-drivers \
    ros1-ainstein-radar-filters \
    ros1-ainstein-radar-rviz-plugins \
    ros1-ainstein-radar-tools \
    ros1-arbotix \
    ros1-arbotix-controllers \
    ros1-arbotix-python \
    ros1-arbotix-sensors \
    ros1-asmach-tutorials \
    ros1-astuff-sensor-msgs \
    ros1-ati-force-torque \
    ros1-automotive-autonomy-msgs \
    ros1-aws-ros1-common \
    ros1-calibration-launch \
    ros1-calibration-setup-helper \
    ros1-canopen-402 \
    ros1-canopen-chain-node \
    ros1-checkerboard-detector \
    ros1-chomp-motion-planner \
    ros1-clock-relay \
    ros1-cloudwatch-logger \
    ros1-cloudwatch-logs-common \
    ros1-cloudwatch-metrics-collector \
    ros1-cloudwatch-metrics-common \
    ros1-cob-3d-mapping-msgs \
    ros1-cob-base-drive-chain \
    ros1-cob-bms-driver \
    ros1-cob-canopen-motor \
    ros1-cob-cartesian-controller \
    ros1-cob-collision-monitor \
    ros1-cob-control \
    ros1-cob-control-mode-adapter \
    ros1-cob-dashboard \
    ros1-cob-elmo-homing \
    ros1-cob-extern \
    ros1-cob-frame-tracker \
    ros1-cob-gazebo-tools \
    ros1-cob-generic-can \
    ros1-cob-hand \
    ros1-cob-hand-bridge \
    ros1-cob-hardware-emulation \
    ros1-cob-image-flip \
    ros1-cob-linear-nav \
    ros1-cob-lookat-action \
    ros1-cob-map-accessibility-analysis \
    ros1-cob-mapping-slam \
    ros1-cob-navigation \
    ros1-cob-navigation-global \
    ros1-cob-navigation-slam \
    ros1-cob-object-detection-visualizer \
    ros1-cob-obstacle-distance \
    ros1-cob-obstacle-distance-moveit \
    ros1-cob-perception-common \
    ros1-cob-phidget-em-state \
    ros1-cob-phidget-power-state \
    ros1-cob-phidgets \
    ros1-cob-relayboard \
    ros1-cob-substitute \
    ros1-cob-trajectory-controller \
    ros1-cob-twist-controller \
    ros1-cob-undercarriage-ctrl \
    ros1-collada-urdf \
    ros1-combined-robot-hw-tests \
    ros1-common-tutorials \
    ros1-concert-msgs \
    ros1-control-toolbox \
    ros1-controller-manager \
    ros1-controller-manager-tests \
    ros1-costmap-cspace \
    ros1-costmap-queue \
    ros1-dataflow-lite \
    ros1-dataspeed-can \
    ros1-dataspeed-can-msg-filters \
    ros1-dataspeed-can-tools \
    ros1-dataspeed-can-usb \
    ros1-dataspeed-pds \
    ros1-dataspeed-pds-can \
    ros1-dataspeed-pds-rqt \
    ros1-dataspeed-pds-scripts \
    ros1-dataspeed-ulc \
    ros1-dataspeed-ulc-can \
    ros1-dbw-fca \
    ros1-dbw-fca-can \
    ros1-dbw-fca-joystick-demo \
    ros1-dbw-mkz \
    ros1-dbw-mkz-can \
    ros1-dbw-mkz-joystick-demo \
    ros1-dbw-mkz-twist-controller \
    ros1-dccomms-ros \
    ros1-default-cfg-fkie \
    ros1-derived-object-msgs \
    ros1-diff-drive-controller \
    ros1-distance-map \
    ros1-distance-map-core \
    ros1-distance-map-deadreck \
    ros1-distance-map-node \
    ros1-distance-map-opencv \
    ros1-distance-map-rviz \
    ros1-distance-map-tools \
    ros1-dlux-global-planner \
    ros1-dlux-plugins \
    ros1-driver-common \
    ros1-dwb-critics \
    ros1-dwb-local-planner \
    ros1-dwb-msgs \
    ros1-dwb-plugins \
    ros1-dynamixel-workbench \
    ros1-dynamixel-workbench-controllers \
    ros1-dynamixel-workbench-single-manager \
    ros1-dynamixel-workbench-single-manager-gui \
    ros1-eband-local-planner \
    ros1-effort-controllers \
    ros1-ethercat-hardware \
    ros1-ethercat-trigger-controllers \
    ros1-euscollada \
    ros1-executive-smach \
    ros1-exotica-aico-solver \
    ros1-exotica-cartpole-dynamics-solver \
    ros1-exotica-collision-scene-fcl \
    ros1-exotica-collision-scene-fcl-latest \
    ros1-exotica-core \
    ros1-exotica-ddp-solver \
    ros1-exotica-double-integrator-dynamics-solver \
    ros1-exotica-dynamics-solvers \
    ros1-exotica-ik-solver \
    ros1-exotica-ilqg-solver \
    ros1-exotica-ilqr-solver \
    ros1-exotica-levenberg-marquardt-solver \
    ros1-exotica-ompl-control-solver \
    ros1-exotica-pendulum-dynamics-solver \
    ros1-exotica-pinocchio-dynamics-solver \
    ros1-exotica-quadrotor-dynamics-solver \
    ros1-exotica-scipy-solver \
    ros1-exotica-time-indexed-rrt-connect-solver \
    ros1-face-detector \
    ros1-fake-joint \
    ros1-fake-joint-driver \
    ros1-fake-joint-launch \
    ros1-fetch-calibration \
    ros1-fetch-driver-msgs \
    ros1-fetch-drivers \
    ros1-fetch-ikfast-plugin \
    ros1-fetch-open-auto-dock \
    ros1-fetch-simple-linear-controller \
    ros1-fetch-teleop \
    ros1-file-management \
    ros1-fingertip-pressure \
    ros1-flexbe-behavior-engine \
    ros1-flexbe-core \
    ros1-flexbe-input \
    ros1-flexbe-mirror \
    ros1-flexbe-msgs \
    ros1-flexbe-onboard \
    ros1-flexbe-states \
    ros1-flexbe-testing \
    ros1-fmi-adapter-examples \
    ros1-four-wheel-steering-controller \
    ros1-franka-control \
    ros1-franka-gripper \
    ros1-freight-bringup \
    ros1-fsrobo-r-driver \
    ros1-fsrobo-r-trajectory-filters \
    ros1-geometric-shapes \
    ros1-geometry-tutorials \
    ros1-global-planner-tests \
    ros1-grasping-msgs \
    ros1-grid-map \
    ros1-grid-map-demos \
    ros1-grid-map-filters \
    ros1-grid-map-loader \
    ros1-grid-map-octomap \
    ros1-grid-map-ros \
    ros1-grid-map-rviz-plugin \
    ros1-grid-map-visualization \
    ros1-gripper-action-controller \
    ros1-gundam-rx78-control \
    ros1-health-metric-collector \
    ros1-hector-map-server \
    ros1-hector-trajectory-server \
    ros1-husky-cartographer-navigation \
    ros1-husky-desktop \
    ros1-husky-viz \
    ros1-ibeo-core \
    ros1-ibeo-lux \
    ros1-image-cb-detector \
    ros1-imagezero-image-transport \
    ros1-imu-tools \
    ros1-industrial-core \
    ros1-industrial-robot-client \
    ros1-industrial-robot-simulator \
    ros1-industrial-robot-status-controller \
    ros1-industrial-trajectory-filters \
    ros1-interval-intersection \
    ros1-ipr-extern \
    ros1-jackal-control \
    ros1-jackal-desktop \
    ros1-jackal-viz \
    ros1-joint-states-settler \
    ros1-joint-trajectory-action \
    ros1-joint-trajectory-action-tools \
    ros1-joint-trajectory-controller \
    ros1-joint-trajectory-generator \
    ros1-jointstick \
    ros1-joy-teleop \
    ros1-jsk-common-msgs \
    ros1-jsk-recognition-msgs \
    ros1-kinesis-manager \
    ros1-kinesis-video-streamer \
    ros1-kvh-geo-fog-3d \
    ros1-kvh-geo-fog-3d-driver \
    ros1-kvh-geo-fog-3d-rviz \
    ros1-laser-cb-detector \
    ros1-laser-tilt-controller-filter \
    ros1-leg-detector \
    ros1-leuze-bringup \
    ros1-leuze-phidget-driver \
    ros1-leuze-ros-drivers \
    ros1-leuze-rsl-driver \
    ros1-lex-common \
    ros1-lex-common-msgs \
    ros1-lex-node \
    ros1-libuvc-ros \
    ros1-lockfree \
    ros1-locomotor \
    ros1-locomotor-msgs \
    ros1-locomove-base \
    ros1-map-organizer \
    ros1-mapviz \
    ros1-mapviz-plugins \
    ros1-marti-nav-msgs \
    ros1-mav-comm \
    ros1-mav-planning-msgs \
    ros1-mbf-abstract-nav \
    ros1-mbf-costmap-nav \
    ros1-mbf-simple-nav \
    ros1-mcl-3dl \
    ros1-md49-base-controller \
    ros1-message-relay \
    ros1-mir-dwb-critics \
    ros1-mongodb-log \
    ros1-monocam-settler \
    ros1-move-base-flex \
    ros1-moveit-chomp-optimizer-adapter \
    ros1-moveit-controller-manager-example \
    ros1-moveit-core \
    ros1-moveit-fake-controller-manager \
    ros1-moveit-kinematics \
    ros1-moveit-msgs \
    ros1-moveit-planners \
    ros1-moveit-planners-chomp \
    ros1-moveit-planners-ompl \
    ros1-moveit-plugins \
    ros1-moveit-pr2 \
    ros1-moveit-ros-benchmarks \
    ros1-moveit-ros-control-interface \
    ros1-moveit-ros-manipulation \
    ros1-moveit-ros-move-group \
    ros1-moveit-ros-perception \
    ros1-moveit-ros-planning \
    ros1-moveit-ros-planning-interface \
    ros1-moveit-ros-robot-interaction \
    ros1-moveit-ros-warehouse \
    ros1-moveit-runtime \
    ros1-moveit-sim-controller \
    ros1-moveit-simple-controller-manager \
    ros1-mpc-local-planner \
    ros1-mpc-local-planner-examples \
    ros1-multires-image \
    ros1-multisense \
    ros1-multisense-bringup \
    ros1-multisense-cal-check \
    ros1-naoqi-driver \
    ros1-naoqi-libqicore \
    ros1-nav-2d-utils \
    ros1-nav-core-adapter \
    ros1-nav-core2 \
    ros1-nav-grid-iterators \
    ros1-nav-grid-pub-sub \
    ros1-nav2d \
    ros1-nav2d-exploration \
    ros1-nav2d-karto \
    ros1-nav2d-navigator \
    ros1-nav2d-remote \
    ros1-nav2d-tutorials \
    ros1-navigation-experimental \
    ros1-navigation-layers \
    ros1-navigation-stage \
    ros1-navigation-tutorials \
    ros1-neonavigation \
    ros1-neonavigation-launch \
    ros1-neonavigation-msgs \
    ros1-neonavigation-rviz-plugins \
    ros1-nmea-comms \
    ros1-nmea-navsat-driver \
    ros1-nmea-to-geopose \
    ros1-novatel-gps-driver \
    ros1-novatel-span-driver \
    ros1-ocean-battery-driver \
    ros1-octomap-mapping \
    ros1-octomap-ros \
    ros1-octomap-rviz-plugins \
    ros1-octomap-server \
    ros1-omron-os32c-driver \
    ros1-open-manipulator-control-gui \
    ros1-open-manipulator-controller \
    ros1-open-manipulator-teleop \
    ros1-open-manipulator-with-tb3-tools \
    ros1-p2os-driver \
    ros1-p2os-launch \
    ros1-pacmod \
    ros1-pacmod-game-control \
    ros1-pacmod3 \
    ros1-people \
    ros1-people-tracking-filter \
    ros1-people-velocity-tracker \
    ros1-phidgets-api \
    ros1-phidgets-drivers \
    ros1-phidgets-high-speed-encoder \
    ros1-phidgets-ik \
    ros1-phidgets-imu \
    ros1-pilz-control \
    ros1-pilz-msgs \
    ros1-pilz-trajectory-generation \
    ros1-pinocchio \
    ros1-planner-cspace \
    ros1-power-monitor \
    ros1-pr2-app-manager \
    ros1-pr2-apps \
    ros1-pr2-arm-kinematics \
    ros1-pr2-arm-move-ik \
    ros1-pr2-calibration-controllers \
    ros1-pr2-common \
    ros1-pr2-common-actions \
    ros1-pr2-controller-interface \
    ros1-pr2-controller-manager \
    ros1-pr2-controllers \
    ros1-pr2-dashboard-aggregator \
    ros1-pr2-ethercat-drivers \
    ros1-pr2-gripper-action \
    ros1-pr2-head-action \
    ros1-pr2-kinematics \
    ros1-pr2-mannequin-mode \
    ros1-pr2-mechanism \
    ros1-pr2-mechanism-controllers \
    ros1-pr2-mechanism-diagnostics \
    ros1-pr2-move-base \
    ros1-pr2-moveit-config \
    ros1-pr2-moveit-plugins \
    ros1-pr2-navigation \
    ros1-pr2-navigation-global \
    ros1-pr2-navigation-local \
    ros1-pr2-navigation-perception \
    ros1-pr2-navigation-slam \
    ros1-pr2-navigation-teleop \
    ros1-pr2-position-scripts \
    ros1-pr2-power-board \
    ros1-pr2-power-drivers \
    ros1-pr2-teleop \
    ros1-pr2-teleop-general \
    ros1-pr2-tilt-laser-interface \
    ros1-pr2-tuck-arms-action \
    ros1-pr2-tuckarm \
    ros1-prbt-ikfast-manipulator-plugin \
    ros1-prosilica-camera \
    ros1-qt-gui-core \
    ros1-rail-segmentation \
    ros1-rc-hand-eye-calibration-client \
    ros1-rc-pick-client \
    ros1-rc-roi-manager-gui \
    ros1-rc-tagdetect-client \
    ros1-rc-visard \
    ros1-rc-visard-driver \
    ros1-realsense2-camera \
    ros1-ridgeback-control \
    ros1-ridgeback-desktop \
    ros1-ridgeback-cartographer-navigation \
    ros1-robot \
    ros1-robot-activity \
    ros1-robot-activity-tutorials \
    ros1-robot-body-filter \
    ros1-robot-calibration \
    ros1-robot-controllers \
    ros1-robot-controllers-interface \
    ros1-robot-mechanism-controllers \
    ros1-robot-navigation \
    ros1-rocon-msgs \
    ros1-roomba-stage \
    ros1-ros-control \
    ros1-ros-control-boilerplate \
    ros1-ros-controllers \
    ros1-ros-realtime \
    ros1-ros-reflexxes \
    ros1-ros-tutorials \
    ros1-rosbridge-server \
    ros1-rosbridge-suite \
    ros1-rosmon \
    ros1-rosmon-core \
    ros1-rosrt \
    ros1-roswww \
    ros1-rotors-comm \
    ros1-rotors-control \
    ros1-rotors-hil-interface \
    ros1-rotors-joy-interface \
    ros1-rqt \
    ros1-rqt-controller-manager \
    ros1-rqt-gui-cpp \
    ros1-rqt-image-view \
    ros1-rqt-joint-trajectory-controller \
    ros1-rqt-multiplot \
    ros1-rqt-rosmon \
    ros1-rqt-rviz \
    ros1-rslidar \
    ros1-rslidar-driver \
    ros1-rslidar-pointcloud \
    ros1-safe-teleop-pr2 \
    ros1-safe-teleop-stage \
    ros1-safety-limiter \
    ros1-sbpl-recovery \
    ros1-schunk-libm5api \
    ros1-schunk-modular-robotics \
    ros1-schunk-powercube-chain \
    ros1-schunk-sdh \
    ros1-schunk-simulated-tactile-sensors \
    ros1-seed-r7-navigation \
    ros1-seed-r7-robot-interface \
    ros1-seed-r7-ros-controller \
    ros1-settlerlib \
    ros1-simple-message \
    ros1-single-joint-position-action \
    ros1-slam-toolbox \
    ros1-smach-ros \
    ros1-social-navigation-layers \
    ros1-socketcan-bridge \
    ros1-stage-ros \
    ros1-swri-image-util \
    ros1-swri-profiler \
    ros1-swri-profiler-tools \
    ros1-swri-roscpp \
    ros1-swri-route-util \
    ros1-swri-transform-util \
    ros1-teb-local-planner \
    ros1-teb-local-planner-tutorials \
    ros1-teleop-tools \
    ros1-teleop-tools-msgs \
    ros1-test-mavros \
    ros1-tf2-relay \
    ros1-tile-map \
    ros1-trajectory-tracker \
    ros1-trajectory-tracker-rviz-plugins \
    ros1-turtle-actionlib \
    ros1-turtle-tf \
    ros1-turtle-tf2 \
    ros1-turtlesim-dash-tutorial \
    ros1-tuw-aruco \
    ros1-tuw-checkerboard \
    ros1-tuw-ellipses \
    ros1-tuw-marker-detection \
    ros1-tuw-marker-pose-estimation \
    ros1-tuw-msgs \
    ros1-ubiquity-motor \
    ros1-ublox \
    ros1-ublox-gps \
    ros1-usb-cam-controllers \
    ros1-usb-cam-hardware \
    ros1-uuv-assistants \
    ros1-uuv-teleop \
    ros1-variant \
    ros1-variant-topic-test \
    ros1-variant-topic-tools \
    ros1-velocity-controllers \
    ros1-velodyne \
    ros1-velodyne-driver \
    ros1-velodyne-pointcloud \
    ros1-visualization-tutorials \
    ros1-volksbot-driver \
    ros1-warthog-control \
    ros1-warthog-desktop \
    ros1-warthog-viz \
    ros1-wge100-camera \
    ros1-xpp \
    ros1-xpp-examples \
    ros1-xpp-hyq \
    ros1-xpp-quadrotor \
    ros1-xpp-vis \
"

RDEPENDS_${PN}_remove = "ros1-mvsim"
RDEPENDS_${PN}_remove = "ros1-trac-ik-lib"

# depends ros1-mrpt-bridge which depends qt5 and ffmpeg
RDEPENDS_${PN}_remove = "ros1-mrpt1"
RDEPENDS_${PN}_remove = "ros1-mrpt-bridge"
RDEPENDS_${PN}_remove = "ros1-mrpt-ekf-slam-2d"
RDEPENDS_${PN}_remove = "ros1-mrpt-ekf-slam-3d"
RDEPENDS_${PN}_remove = "ros1-mrpt-graphslam-2d"
RDEPENDS_${PN}_remove = "ros1-mrpt-icp-slam-2d"
RDEPENDS_${PN}_remove = "ros1-mrpt-local-obstacles"
RDEPENDS_${PN}_remove = "ros1-mrpt-localization"
RDEPENDS_${PN}_remove = "ros1-mrpt-map"
RDEPENDS_${PN}_remove = "ros1-mrpt-navigation"
RDEPENDS_${PN}_remove = "ros1-mrpt-rawlog"
RDEPENDS_${PN}_remove = "ros1-mrpt-rbpf-slam"
RDEPENDS_${PN}_remove = "ros1-mrpt-reactivenav2d"
RDEPENDS_${PN}_remove = "ros1-mrpt-slam"
RDEPENDS_${PN}_remove = "ros1-pose-cov-ops"

# depends on ros1-julius
RDEPENDS_${PN}_remove = "ros1-julius-ros"
RDEPENDS_${PN}_remove = "ros1-jsk-3rdparty"

# depends on UNRESOLVED-nkf
RDEPENDS_${PN}_remove = "ros1-voice-text"

# depends on ros1-cob-srvs
RDEPENDS_${PN}_remove = "ros1-cob-sound"

# depends on ros1-kobuki-ftdi
RDEPENDS_${PN}_remove = "ros1-kobuki-core"

# depends on geographiclib-tools
RDEPENDS_${PN}_remove = "ros1-mavros"

# depends on UNRESOLVED-python-speechrecognition-pip and ros1-ros-speech-recognition
RDEPENDS_${PN}_remove = "ros1-ros-speech-recognition"

# depends on blacklisted ros1-audio-common-msgs
RDEPENDS_${PN}_remove = "ros1-pr2eus"
RDEPENDS_${PN}_remove = "ros1-jsk-pr2eus"
RDEPENDS_${PN}_remove = "ros1-audio-common"
RDEPENDS_${PN}_remove = "ros1-jsk-topic-tools"
RDEPENDS_${PN}_remove = "ros1-resized-image-transport"
RDEPENDS_${PN}_remove = "ros1-tts"
RDEPENDS_${PN}_remove = "ros1-sound-play"
RDEPENDS_${PN}_remove = "ros1-audio-play"
RDEPENDS_${PN}_remove = "ros1-audio-capture"

RDEPENDS_${PN}_remove = "ros1-parrot-arsdk"
RDEPENDS_${PN}_remove = "ros1-h264-video-encoder"
RDEPENDS_${PN}_remove = "ros1-cob-teleop"
RDEPENDS_${PN}_remove = "ros1-rospilot"
RDEPENDS_${PN}_remove = "ros1-h264-encoder-core"
RDEPENDS_${PN}_remove = "ros1-h264-video-encoder-core"

RDEPENDS_${PN}_remove = "ros1-cob-script-server"
RDEPENDS_${PN}_remove = "ros1-cob-default-robot-behavior"
RDEPENDS_${PN}_remove = "ros1-cob-android-script-server"
RDEPENDS_${PN}_remove = "ros1-cob-android"
RDEPENDS_${PN}_remove = "ros1-cob-moveit-interface"
RDEPENDS_${PN}_remove = "ros1-cob-msgs"
RDEPENDS_${PN}_remove = "ros1-cob-helper-tools"
RDEPENDS_${PN}_remove = "ros1-cob-command-gui"
RDEPENDS_${PN}_remove = "ros1-cob-monitoring"
RDEPENDS_${PN}_remove = "ros1-cob-navigation-local"
RDEPENDS_${PN}_remove = "ros1-cob-interactive-teleop"
RDEPENDS_${PN}_remove = "ros1-leuze-description"
RDEPENDS_${PN}_remove = "ros1-turtlebot3-automatic-parking-vision"
RDEPENDS_${PN}_remove = "ros1-turtlebot3-applications"
RDEPENDS_${PN}_remove = "ros1-psen-scan"
RDEPENDS_${PN}_remove = "ros1-gundam-rx78-description"

RDEPENDS_${PN}_remove = "ros1-movie-publisher"

RDEPENDS_${PN}_remove = "ros1-pr2eus-moveit"

RDEPENDS_${PN}_remove = "ros1-turtlebot3-autorace-camera"
RDEPENDS_${PN}_remove = "ros1-turtlebot3-autorace"
RDEPENDS_${PN}_remove = "ros1-turtlebot3-autorace-core"
RDEPENDS_${PN}_remove = "ros1-turtlebot3-autorace-detect"
RDEPENDS_${PN}_remove = "ros1-turtlebot3-autorace-control"

RDEPENDS_${PN}_remove = "ros1-rviz"
RDEPENDS_${PN}_remove = "ros1-cob-interactive-teleop"
RDEPENDS_${PN}_remove = "packagegroup-ros-world-melodic"
RDEPENDS_${PN}_remove = "rover-image"
RDEPENDS_${PN}_remove = "ros1-cob-interactive-teleop-dev"
RDEPENDS_${PN}_remove = "ros1-cob-base-drive-chain"
RDEPENDS_${PN}_remove = "ros1-cob-driver"
RDEPENDS_${PN}_remove = "ros1-cob-generic-can"
RDEPENDS_${PN}_remove = "ros1-cob-elmo-homing"
RDEPENDS_${PN}_remove = "ros1-cob-canopen-motor"
RDEPENDS_${PN}_remove = "ros1-cob-undercarriage-ctrl"
RDEPENDS_${PN}_remove = "ros1-cob-driver-dev"
RDEPENDS_${PN}_remove = "ros1-cob-voltage-control"
RDEPENDS_${PN}_remove = "ros1-cob-phidgets"
RDEPENDS_${PN}_remove = "ros1-cob-relayboard"
RDEPENDS_${PN}_remove = "ros1-cob-bms-driver"
RDEPENDS_${PN}_remove = "ros1-python-qt-binding"
RDEPENDS_${PN}_remove = "ros1-joint-state-publisher-gui"
RDEPENDS_${PN}_remove = "ros1-joint-state-publisher-gui-dev"
RDEPENDS_${PN}_remove = "ros1-cob-mimic"
RDEPENDS_${PN}_remove = "ros1-cob-mimic-dev"
RDEPENDS_${PN}_remove = "ros1-cob-sound"
RDEPENDS_${PN}_remove = "vlc"
RDEPENDS_${PN}_remove = "vlc-dev"
RDEPENDS_${PN}_remove = "ros1-mavros-extras"
RDEPENDS_${PN}_remove = "ros1-mavros-extras-dev"
RDEPENDS_${PN}_remove = "ros1-mavros"
RDEPENDS_${PN}_remove = "ros1-mavros-dev"
RDEPENDS_${PN}_remove = "ros1-cob-sound-dev"
RDEPENDS_${PN}_remove = "UNRESOLVED-alsa-oss"
RDEPENDS_${PN}_remove = "ros1-cob-srvs"