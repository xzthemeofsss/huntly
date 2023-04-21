# 使用 lcomplete/huntly 作为基础镜像
FROM lcomplete/huntly

# 在容器内创建 /data 目录
RUN mkdir /data

# 设置容器启动时的默认命令
CMD ["npm", "start"]

# 暴露容器内部的 80 端口
EXPOSE 80

# 定义挂载点，将主机当前目录下的 data 目录映射到容器内的 /data 目录
VOLUME ["/data"]