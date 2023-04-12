---
description: EntityEvent
---

# EntityEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

### 类描述

> Represents an Entity-related event
> 
> <br>
> 
> 代表与实体有关的事件。
> 
> <br>
> 
> 译注：该事件未实现 `getHandlers` 和 `getHandlerList` 方法，无法直接监听。

### 方法列表

#### getEntity

方法声明: public Entity getEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Returns the Entity involved in this event
> 
> @return Entity who is involved in this event
> 
> <br>
> 
> 获取事件中的实体。
> 
> @return 触发事件的实体。

#### getEntityType

方法声明: public EntityType getEntityType()

方法签名: ()Lorg/bukkit/entity/EntityType;

> Gets the EntityType of the Entity involved in this event.
> 
> @return EntityType of the Entity involved in this event
> 
> <br>
> 
> 获取事件中实体的类型。
> 
> @return 事件中实体的类型。