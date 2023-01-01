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
> <p>
>
> Warning: The order in which register and unregister events are called
>
> should not be relied upon.

### 方法列表

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;