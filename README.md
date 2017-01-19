# spring cloud 学习代码与笔记
spring cloud 是一个基于Spring Boot的云应用开发工具集。提供了服务发现、配置管理、断路器、智能路由、控制总线、全局锁、集群会话管理等的一系列组件。


# Eureka 
Eureka 提供服務發現功能的組件. 是 [Spring Cloud Netflix](https://cloud.spring.io/spring-cloud-netflix/) 子項目的一個組件。
Spring Cloud Netflix 主要内容是对Netflix公司一系列开源产品的包装，它主要提供的模块包括：服务发现（Eureka），断路器（Hystrix），智能路有（Zuul），客户端负载均衡（Ribbon）等

# Feign
Feign 是一个声明式的Web Service客户端，它使得编写Web Serivce客户端变得更加简单。我们只需要使用Feign来创建一个接口并用注解来配置它既可完成，大大简化了Rest 接口的调用。

# Hystrix
断路器/熔断器, 当调用的服务不可用时，执行自定义的方法。避免了服务不可用的传递以及导致的系统雪崩。

# Zuul
服务网关。服务的统一对外访问接口。实现对服务的授权验证、负载均衡。

>服务网关是微服务架构中一个不可或缺的部分。通过服务网关统一向外系统提供REST API的过程中，除了具备服务路由、均衡负载功能之外，它还具备了权限控制等功能。
>Spring Cloud Netflix中的Zuul就担任了这样的一个角色，为微服务架构提供了前门保护的作用，同时将权限控制这些较重的非业务逻辑内容迁移到服务路由层面，使得服务集群主体能够具备更高的可复用性和可测试性

# reference

* http://projects.spring.io/spring-cloud/
* http://blog.didispace.com/categories/Spring-Cloud/page/2