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
> If an Entity Spawn event is cancelled, the entity will not spawn.
> 
> <br>
> 
> 当实体在世界中生成时触发。
> 
> 如果本事件被取消，涉事实体将不会生成。

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
> 
> <br>
> 
> 该方法用于获取涉事实体生成的位置。
> 
> @return 涉事实体生成的位置。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;