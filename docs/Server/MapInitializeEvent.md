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
> 
> <br>
> 
> 当一份地图被初始化时触发。
> 
> <br>
> 
> 译注：此处的 `Map` 不是指保存键值对的集合，而是指由八张纸和一个指南针合成的地图物品堆。

### 方法列表

#### getMap

方法声明: public MapView getMap()

方法签名: ()Lorg/bukkit/map/MapView;

> Gets the map initialized in this event.
> 
> @return Map for this event
> 
> <br>
> 
> 该方法用于获取被初始化的涉事地图。
> 
> @return 涉事地图。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;