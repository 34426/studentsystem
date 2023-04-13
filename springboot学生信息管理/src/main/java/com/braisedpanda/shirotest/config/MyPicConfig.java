package com.braisedpanda.shirotest.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyPicConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/**")//前端url访问的路径，若有访问前缀，在访问时添加即可，这里不需添加。
                .addResourceLocations("file:D:\\BaiduNetdiskDownload\\project\\springboot学生信息管理\\springboot学生信息管理\\src\\main\\resources\\static\\images\\");//映射的服务器存放图片目录。
    }
}
