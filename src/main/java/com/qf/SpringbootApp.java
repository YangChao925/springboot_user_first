package com.qf;


import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootApp extends SpringBootServletInitializer {
    public static void main(String[] args) {
        System.out.println("这是第一次测试pull,push");//代码改动后首先pull拉取git上面最新的代码，避免其他用户已经修改过了git上面的代码，直接提交会覆盖修改后的代码。
                                                            //之后在点击commit changs----进行标识更改

        SpringApplication.run(SpringbootApp.class);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

}
