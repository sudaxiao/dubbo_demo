###restapi:dubbo接口
    提供者和消费者共用的接口。需要在服务者和消费者的pom.xml中引入
    
    
###consumer:消费者  
    用户的登录，注册
    登录和注册的接口均调用dubbo接口.
    可以简单的理解为消费者只是静态界面，不包含业务逻辑的处理
    
    
###provider:提供者
    包含了主要的业务逻辑处理。
    application.t=yml中包含了主要的配置。
    其中数据库的帐号密码均为我的腾讯云上数据库的密码。
    
启动之前要做的事情：
    首先执行provider模块中 resource下mysql/init.sql    生成基本的数据。
    然后在provider模块中,resource下 application.yml  配置数据库的帐号和密码
启动顺序：
    首先启动provider,然后启动consumer

本项目构成 ：springBoot+mybatis+dubbo+zookeeper+mysql+druid连接池

    
