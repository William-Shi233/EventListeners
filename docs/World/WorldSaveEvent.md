---
description: WorldSaveEvent
---

# WorldSaveEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.world.WorldEvent

            =>  org.bukkit.event.world.WorldSaveEvent

### 类描述

> Called when a World is saved.
> 
> <br>
> 
> 当世界被保存时触发。
> 
> <br>
> 
> 译注：参见 `org.bukkit.craftbukkit.v1_16_R3.CraftServer#unloadWorld(World, boolean)` 方法可知，当世界即将被卸载时，首先触发 `WorldUnloadEvent` 。如果本事件未被取消，且需要保存世界数据，则触发本事件。

### 方法列表

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;