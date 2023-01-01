---
description: EntitySpawnEvent
---

# EntitySpawnEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntitySpawnEvent

### 类描述

> Called when an entity is spawned into a world.
>
> <p>
>
> If an Entity Spawn event is cancelled, the entity will not spawn.

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getLocation

方法声明: public Location getLocation()

方法签名: ()Lorg/bukkit/Location;

> Gets the location at which the entity is spawning.
>
> @return The location at which the entity is spawning

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;