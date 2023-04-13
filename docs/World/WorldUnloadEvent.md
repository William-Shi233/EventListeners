---
description: WorldUnloadEvent
---

# WorldUnloadEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.world.WorldEvent

            =>  org.bukkit.event.world.WorldUnloadEvent

### 类描述

> Called when a World is unloaded
> 
> <br>
> 
> 当世界被卸载时触发。
> 
> <br>
> 
> 译注：参见 `org.bukkit.craftbukkit.v1_16_R3.CraftServer#unloadWorld(World, boolean)` 方法可知，当世界即将被卸载时，首先触发本事件。如果本事件未被取消，且需要保存世界数据，则触发 `WorldSaveEvent` 。

### 方法列表

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