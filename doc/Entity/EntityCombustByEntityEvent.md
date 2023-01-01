---
description: EntityCombustByEntityEvent
---

# EntityCombustByEntityEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityCombustEvent

                =>  org.bukkit.event.entity.EntityCombustByEntityEvent

### 类描述

> Called when an entity causes another entity to combust.

### 方法列表

#### getCombuster

方法声明: public Entity getCombuster()

方法签名: ()Lorg/bukkit/entity/Entity;

> Get the entity that caused the combustion event.
>
> @return the Entity that set the combustee alight.