---
description: EntityEvent
---

# EntityEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

### 类描述

> Represents an Entity-related event

### 方法列表

#### getEntity

方法声明: public Entity getEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Returns the Entity involved in this event
>
> @return Entity who is involved in this event

#### getEntityType

方法声明: public EntityType getEntityType()

方法签名: ()Lorg/bukkit/entity/EntityType;

> Gets the EntityType of the Entity involved in this event.
>
> @return EntityType of the Entity involved in this event