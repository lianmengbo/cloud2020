package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName GateWayConfig 
 * @Description TODO
 * @Author mengbo
 * @Date 2023/2/13 17:06
 * @Version 1.0
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator getRouter(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("router_test",r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        return  routes.build();
    }
}
