# SpringBoot-DockerDemo
## 仓库说明
这个仓库主要用来测试下微服务打成Docker镜像的一些方法,主要使用maven构建
可以按照分支名进行区分所用的构建插件或者方法，master分支仅保留说明文档，指向各分支的作用
## 本分支说明
- dockerfile-maven-plugin  

此分支使用 maven的`dockerfile-maven-plugin`插件，是maven插件中打镜像需要配置最少的一种插件，主要是为了演示与个人测试用

打包使用命令`mvn dockerfile:build`