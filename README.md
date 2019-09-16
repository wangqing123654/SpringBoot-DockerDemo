# SpringBoot-DockerDemo
## 仓库说明
这个仓库主要用来测试下微服务打成Docker镜像的一些方法,主要使用maven构建
可以按照分支名进行区分所用的构建插件或者方法，master分支仅保留说明文档，指向各分支的作用
## 本分支说明
- docker-maven-plugin  

此分支使用 maven的`docker-maven-plugin`插件，是maven插件中构建镜像功能很全面的一款了
- 可以在pom.xml中直接定义出来要做的操作，构建镜像
- 还可以在pom.xml中使用指定的Dockerfile来构建镜像

本分支只演示在pom.xml中使用Dockerfile构建镜像的步骤  

执行构建命令为`mvn clean package docker:build`