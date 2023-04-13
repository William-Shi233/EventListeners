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
> 
> <br>
> 
> 当世界出生点被更改时触发。世界原出生点位置被囊括于本事件的字段中。
> 
> <br>
> 
> 译注：所谓“囊括”，指本事件记录了原出生点位置，用户可以调用 `getPreviousLocation()` 方法获取。

### 方法列表

#### getPreviousLocation

方法声明: public Location getPreviousLocation()

方法签名: ()Lorg/bukkit/Location;

> Gets the previous spawn location
> 
> @return Location that used to be spawn
> 
> <br>
> 
> 该方法用于获取世界原出生点的位置。
> 
> @return 世界原出生点的位置。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;