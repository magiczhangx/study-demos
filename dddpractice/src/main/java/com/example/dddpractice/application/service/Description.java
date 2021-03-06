package com.example.dddpractice.application.service;


/**
 * 应用服务位于应用层中, 和领域服务不同 , 应用服务可以用于控制持久化事务(@Transactional经常用于这层)
 * 和安全认证, 或者向其他系统发送基于事件的消息通知(调用消息队列接口)
 * 另外还可以用于创建邮件发送给用户. 应用服务本身并不处理业务逻辑,是领域模型的直接客户
 * 轻量 , 主要用于协调对领域对象的操作, 比如聚合
 *
 * 常用用途: 接收来自用户界面的输入参数, 再通过 资源库 获取到聚合实例 , 然后执行相应的命令操作.
 *
 * 记住 , 应用服务 简单 , 没有业务逻辑 , 获取对象, 调用领域层, 调用持久化层等
 */
public class Description {
}
