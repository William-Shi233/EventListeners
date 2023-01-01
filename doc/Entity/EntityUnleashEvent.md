---
description: EntityUnleashEvent
---

# EntityUnleashEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityUnleashEvent

### 类描述

> Called immediately prior to an entity being unleashed.

### 方法列表

#### getReason

方法声明: public UnleashReason getReason()

方法签名: ()Lorg/bukkit/event/entity/EntityUnleashEvent/UnleashReason;

> Returns the reason for the unleashing.
>
> @return The reason

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: UnleashReason

#### HOLDER_GONE

> When the entity's leashholder has died or logged out, and so is
>
> unleashed

#### PLAYER_UNLEASH

> When the entity's leashholder attempts to unleash it

#### DISTANCE

> When the entity's leashholder is more than 10 blocks away

#### UNKNOWN