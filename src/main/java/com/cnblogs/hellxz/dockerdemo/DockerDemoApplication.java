package com.cnblogs.hellxz.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 打包成docker的服务demo
 *
 * @author Hellxz
 */
@RestController
@SpringBootApplication
public class DockerDemoApplication {

    @GetMapping("/greet")
    public String sayHi() {
        return "<h1>Hello Docker!<h1>";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerDemoApplication.class, args);
    }

}
