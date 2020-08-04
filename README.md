# dubbo-exam
dubbo example[kotlin]

## 说明
### 项目结构
1. api-interface 为接口定义工程包  公用
2. dubbo-service 包含服务提供方及调用方
3. 选择api-interface 执行如下命令：
>打依赖包，可以上传nexus,不可执行
```shell
mvn clean kotlin:compile install -D spring-boot.repackage.skip=true
```
4. dubbo-service 子模块可以单独打包部署，如果打包失败，可以尝试命令：
```shell
mvn clean kotlin:compile package
```
