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
>
>
> 
> 当实体引燃另一个实体时触发。

### 方法列表

#### getCombuster

方法声明: public Entity getCombuster()

方法签名: ()Lorg/bukkit/entity/Entity;

> Get the entity that caused the combustion event.
>
> @return the Entity that set the combustee alight.
>
>
> 
> 该方法用于获取造成另一个实体被引燃的实体。
>
> @return 造成另一个实体被引燃的实体。
>
>
> 
> 译注：本方法用于获取纵火者，而 `getEntity()` 方法用于获取被点燃的实体。