
# 框架构想

####后端从前之后分为：
    接口层(Controller):
        对外开放接口
    服务层(Service)：
        数据聚合，业务处理
    数据层(Dao + Eql)：
        数据查询，Eql只用来生成sql
    