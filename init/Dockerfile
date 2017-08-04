FROM alpine:3.6
MAINTAINER sutong <821192673@qq.com>
ENV  TIME_ZONE Asia/Shanghai
RUN echo "http://mirrors.ustc.edu.cn/alpine/v3.6/main/" > /etc/apk/repositories
RUN apk update && apk add --no-cache curl bash tzdata mysql-client \
    && echo "${TIME_ZONE}" > /etc/timezone \
    && ln -sf /usr/share/zoneinfo/${TIME_ZONE} /etc/localtime
ADD ./bin/ /mnt/bin/
ADD ./sql/ /mnt/sql/
RUN chmod +x /mnt/bin/*.sh
ENTRYPOINT ["/mnt/bin/init.sh"]