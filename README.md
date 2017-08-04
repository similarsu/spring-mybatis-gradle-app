# 多环境配置
## 如何配置
```text
修改根目录下的settings.gradle文件
```
## 如何使用
```bash
./gradlew clean run -Dprofile=prod
```

# docker-compose
## 启动
```bash
docker-compose up -d
```
## 数据库初始化
```bash
docker-compose up -d init
```
## 镜像重新构建
```bash
docker-compose build init
```