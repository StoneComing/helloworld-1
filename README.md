1、服务名称：helloworld

2、默认服务中心地址为：https://100.125.1.34:30100 ，如果在测试环境，请修改 src/main/resources/microservice.yaml 文件
   属性：cse.service.registry.address

3、使用 Dockerfile 制作镜像包：

    一、执行 mvn install 命令打包
        # 请事先安装mvn插件并且将mvn添加到系统路径中

    二、执行 docker build -t user/name:version . 命令生成镜像
        # 请事先安装docker
        # openjdk是基础镜像，可以自行修改
        # 基础镜像可使用docker pull + imageName 命令从镜像仓库下载
        # 默认使用最新版本 latest，如果版本有变化，需要同步修改Dockerfile里面的版本号