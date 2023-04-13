---
description: VehicleUpdateEvent
---

# VehicleUpdateEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.vehicle.VehicleEvent

            =>  org.bukkit.event.vehicle.VehicleUpdateEvent

### 类描述

> Called when a vehicle updates
> 
> <br>
> 
> 当载具更新时触发。
> 
> <br>
> 
> 译注：本事件在 `net.minecraft.server.v1_16_R3.EntityBoat#tick()` 方法和 `net.minecraft.server.v1_16_R3.EntityMinecartAbstract#tick()` 方法中被触发。从逻辑来看，每个载具实体每刻都会触发一次本事件。在本事件触发以后，再判断涉事载具这一刻的位置与上一刻所处位置相比是否有变化，如有，则再触发 `VehicleMoveEvent` 。

### 方法列表

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;