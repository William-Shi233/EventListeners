---
description: HangingEvent
---

# HangingEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.hanging.HangingEvent

### 类描述

> Represents a hanging entity-related event.
> 
> <br>
> 
> 代表与悬挂物有关的事件。
> 
> <br>
> 
> 译注：该事件未实现 `getHandlers()` 和 `getHandlerList()` 方法，无法直接监听。

### 方法列表

#### getEntity

方法声明: public Hanging getEntity()

方法签名: ()Lorg/bukkit/entity/Hanging;

> Gets the hanging entity involved in this event.
> 
> @return the hanging entity
> 
> <br>
> 
> 该方法用于获取涉事悬挂物实体。
> 
> @return 涉事悬挂物实体。