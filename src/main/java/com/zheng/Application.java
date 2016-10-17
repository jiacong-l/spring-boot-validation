package com.zheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created by zhenglian on 2016/10/15.
 */
@SpringBootApplication
public class Application extends WebMvcConfigurationSupport {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {

        /**
         * setUseSuffixPatternMatch 默认为true
         * 表示访问/user是否匹配/user, /user.*
         * setUseTrailingSlashMatch 默认为true
         * 表示访问/user是否匹配/user/
         */
        configurer.setUseSuffixPatternMatch(true)
                .setUseTrailingSlashMatch(true);
    }
}
