# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Spring AMQP doc](https://geekdoc.top/docs/languages/java/spring/spring-amqp/2.3.11/reference/html/index.html)
* [MybatisPlus Reference Guide](https://baomidou.com/)
* [A useful Netty guide (chinese)](https://nyimac.gitee.io/2021/04/25/Netty%E5%9F%BA%E7%A1%80/)


### Guides

Application directory structure:

* config -configure your rabbitmq and mybatisPlus


* controller - I use UserController to add queues when a user login


* mapper - MybatisPlus mapper files


* message - your definition for mq messages and netty messages


* netty - netty server and self defined handlers


* pojo - your pojo


* rabbitmq - definition for listener and sender
  * service - utils to add and remove queues
    * impl - implements for service


* service - backend service
  * impl - implements for service


* utils - definition for the return message format and other stuff



