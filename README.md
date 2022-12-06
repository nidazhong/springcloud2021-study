# 项目简介

## 版本信息
- springboot： 2.7.4
- springCloud：2021.0.4
- springCloud-Alibaba: 2021.0.4
- jdk：17
- Graalvm: 22.3.0
- maven：3.6.3
- mysql: 8.0.x

可参考的使用最新版本的项目：https://gitee.com/techa/goodsKill/blob/master/pom.xml

附版本关系：https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E#%E7%BB%84%E4%BB%B6%E7%89%88%E6%9C%AC%E5%85%B3%E7%B3%BB

mysql-druid版本：https://blog.csdn.net/qq_51553982/article/details/122422660

sprinboot2.7教程：https://blog.csdn.net/f88069684/article/details/125296471

## 项目构建过程
- 1、EurekaServer7001
- 2、EurekaServer7002
- 3、demo-api-commons # 存放通用类、工具

## 安装必要软件
- mysql8: docker run -p 3308:3306 --name mysql8 -e MYSQL_ROOT_PASSWORD=123456  -d mysql:8.0.20