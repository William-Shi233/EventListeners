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
> 代表与悬挂物有关的事件。
>
> 译注：该事件未实现 `getHandlers` 和 `getHandlerList` 方法，无法直接监听。

### 方法列表

#### getEntity

方法声明: public Hanging getEntity()

方法签名: ()Lorg/bukkit/entity/Hanging;

> Gets the hanging entity involved in this event.
>
> @return the hanging entity
>
> 获取事件中的悬挂物实体。
>
> @return 触发事件的悬挂物实体。