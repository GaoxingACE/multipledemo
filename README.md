# multipledemo
基于spring boot与dubbo分模块整合dao service service-impl 与controller
dao模块存放mybatis  mapper文件与mapper接口
service模块存放dubbo公共api接口
service-impl模块作为dubbo服务提供方，同时注入mybatis查询接口
web模块作为dubbo服务消费方,controller包下注入相应service实现。

zookeeper为windows单机节点
服务启用：启动zk后，启动service-impl下的启动类，再启动web下的启动类。
通过http://localhost:30036/swagger-ui.html即可测试相应接口
