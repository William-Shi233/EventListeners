---
description: EntityDamageByEntityEvent
---

# EntityDamageByEntityEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityDamageEvent

                =>  org.bukkit.event.entity.EntityDamageByEntityEvent

### 类描述

> Called when an entity is damaged by an entity
> 
> <br>
> 
> 当实体被另一实体所伤害时触发。

### 方法列表

#### getDamager

方法声明: public Entity getDamager()

方法签名: ()Lorg/bukkit/entity/Entity;

> Returns the entity that damaged the defender.
> 
> @return Entity that damaged the defender.
> 
> <br>
> 
> 该方法用于获取对被害者造成了伤害的实体。
> 
> @return 对被害者造成了伤害的实体。