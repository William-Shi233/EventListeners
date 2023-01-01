---
description: SpawnChangeEvent
---

# SpawnChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.world.WorldEvent

            =>  org.bukkit.event.world.SpawnChangeEvent

### 类描述

> An event that is called when a world's spawn changes. The world's previous
>
> spawn location is included.

### 方法列表

#### getPreviousLocation

方法声明: public Location getPreviousLocation()

方法签名: ()Lorg/bukkit/Location;

> Gets the previous spawn location
>
> @return Location that used to be spawn

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;