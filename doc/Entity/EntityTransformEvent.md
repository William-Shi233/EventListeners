---
description: EntityTransformEvent
---

# EntityTransformEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityTransformEvent

### 类描述

> Called when an entity is about to be replaced by another entity.

### 方法列表

#### getTransformedEntity

方法声明: public Entity getTransformedEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the entity that the original entity was transformed to.
>
> This returns the first entity in the transformed entity list.
>
> @return The transformed entity.
>
> @see #getTransformedEntities()

#### getTransformedEntities

方法声明: public List<Entity> getTransformedEntities()

方法签名: ()Ljava/util/List;

> Gets the entities that the original entity was transformed to.
>
> @return The transformed entities.

#### getTransformReason

方法声明: public TransformReason getTransformReason()

方法签名: ()Lorg/bukkit/event/entity/EntityTransformEvent/TransformReason;

> Gets the reason for the conversion that has occurred.
>
> @return The reason for conversion that has occurred.

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: TransformReason

#### CURED

> When a zombie gets cured and a villager is spawned.

#### FROZEN

> When an entity is shaking in Powder Snow and a new entity spawns.

#### INFECTION

> When a villager gets infected and a zombie villager spawns.

#### DROWNED

> When an entity drowns in water and a new entity spawns.

#### SHEARED

> When a mooshroom (or MUSHROOM_COW) is sheared and a cow spawns.

#### LIGHTNING

> When lightning strikes a entity.

#### SPLIT

> When a slime splits into multiple smaller slimes.

#### PIGLIN_ZOMBIFIED

> When a piglin converts to a zombified piglin.

#### UNKNOWN

> When reason is unknown.