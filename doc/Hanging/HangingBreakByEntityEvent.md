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

### 方法列表

#### getRemover

方法声明: public Entity getRemover()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the entity that removed the hanging entity.
>
> May be null, for example when broken by an explosion.
>
> @return the entity that removed the hanging entity