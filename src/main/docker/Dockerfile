FROM openjdk:8-jdk-alpine

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS

# 添加jar到镜像中
ADD ./*.jar /app.jar

# 设置阿里alpine源、修正镜像时区为东8区、清除缓存
RUN \
    echo -e "https://mirrors.aliyun.com/alpine/latest-stable/main\nhttps://mirrors.aliyun.com/alpine/latest-stable/community" > /etc/apk/repositories && \
    apk add --no-cache tzdata && \
    cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && \
    echo "Asia/Shanghai" >  /etc/timezone && \
    rm -rf /var/cache/apk/*

# 默认暴露的端口号
EXPOSE 8080

# 容器启动后会执行的命令
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar" ]