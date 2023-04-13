---
description: VehicleCreateEvent
---

# VehicleCreateEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.vehicle.VehicleEvent

            =>  org.bukkit.event.vehicle.VehicleCreateEvent

### 类描述

> Raised when a vehicle is created.
> 
> <br>
> 
> 当载具被创建时触发。
> 
> <br>
> 
> 译注：本事件在 `net.minecraft.server.v1_16_R3.WorldServer#addEntity0(Entity, CreatureSpawnEvent.SpawnReason)` 方法中触发。任何实体生成，都无法绕过该方法。在上述方法中，经由 `CraftEventFactory#doEntityAddEventCalling(World, Entity, CreatureSpawnEvent.SpawnReason)` 判断，凡生成的实体系载具类型的，即触发本事件。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancelled)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;