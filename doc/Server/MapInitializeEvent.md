---
description: MapInitializeEvent
---

# MapInitializeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.server.ServerEvent

            =>  org.bukkit.event.server.MapInitializeEvent

### 类描述

> Called when a map is initialized.

### 方法列表

#### getMap

方法声明: public MapView getMap()

方法签名: ()Lorg/bukkit/map/MapView;

> Gets the map initialized in this event.
>
> @return Map for this event

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;