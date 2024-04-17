package com.nan.mybatis2;

import com.nan.mybatis2.config.CrosFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.filter.CharacterEncodingFilter;

@MapperScan(value = "com.nan.mybatis2.mapper")
@SpringBootApplication


public class Mybatis2Application {
    @Configuration
    public class UtfConfig {
        @Bean
        public FilterRegistrationBean filterRegistrationBean() {
            FilterRegistrationBean registrationBean = new FilterRegistrationBean();
            CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
            characterEncodingFilter.setForceEncoding(true);
            characterEncodingFilter.setEncoding("utf-8");
            registrationBean.setFilter(characterEncodingFilter);
            return registrationBean;
        }

    }

    public static void main(String[] args) {
        SpringApplication.run(Mybatis2Application.class, args);
    }

    /**
     * 配置跨域访问的过滤器
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean registerFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.addUrlPatterns("/*");
        bean.setFilter(new CrosFilter());
        return bean;
    }


}
