---
description: HangingBreakByEntityEvent
---

# HangingBreakByEntityEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.hanging.HangingEvent

            =>  org.bukkit.event.hanging.HangingBreakEvent

                =>  org.bukkit.event.hanging.HangingBreakByEntityEvent

### 类描述

> Triggered when a hanging entity is removed by an entity
>
> 当某个悬挂物实体被其他实体所移除时触发。

### 方法列表

#### getRemover

方法声明: public Entity getRemover()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the entity that removed the hanging entity.
>
> May be null, for example when broken by an explosion.
>
> @return the entity that removed the hanging entity
>
> 该方法用于获取将悬挂物移除的实体。
>
> 本方法可能返回 `null` ，如悬挂物被爆炸摧毁时。
>
> @return 将悬挂物移除的实体。