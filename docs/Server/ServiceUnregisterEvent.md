---
description: ServiceUnregisterEvent
---

# ServiceUnregisterEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.server.ServerEvent

            =>  org.bukkit.event.server.ServiceEvent

                =>  org.bukkit.event.server.ServiceUnregisterEvent

### 类描述

> This event is called when a service is unregistered.
>
> Warning: The order in which register and unregister events are called
>
> should not be relied upon.
>
>
> 
> 当一个 `Service` 被注销时触发。
>
> 警告：各个 `Service` 的注册和注销事件的发生顺序是不可靠的，不能依赖这些事件的发生顺序来设计程序。
>
>
> 
> 译注：在 `Bukkit` 中，`Service` 不需要注销。此处所指的应当是 `ServiceProvider` 。详见 `ServiceEvent` 译注。

### 方法列表

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;