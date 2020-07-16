# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/maven-plugin/reference/html/#build-image)


# readme  每次修改要记录

# 2020-06-28 整合mybaties-plus   
1.修改pom,添加依赖
2.配置数据源
3.Mapper层，继承BaseMapper类 添加注解@Mapper
4.启动类，添加注解@MapperScan("Mapper全包名")

# 2020-06-28 整合druid 监控
1.修改pom,添加依赖
2.配置数据源及参数
3.添加配置类DruidConfiguration
4.访问路径：http://localhost:8001/druid/index.html

# 2020-06-28 整合swagger2-ui 
1.修改pom,添加依赖
2.添加配置类Swagger2Configuration
3.启动类添加注解 @EnableSwagger2
4.访问路径：http://localhost:8001/swagger-ui.html

# 2020-06-28 整合redis 
1.修改pom,添加依赖
2.配置数据源及参数
3.添加配置类RedisConfiguration

# 2020-07-10 整合拦截器
1.编写拦截器（日志拦截器，登录拦截器）
2.实现HandlerInterceptorAdapter接口，重写 三个方法
3.编写配置类webMvcConfiguration,实现WebMvcConfigurer 接口
4.重写方法addInterceptors方法
 



