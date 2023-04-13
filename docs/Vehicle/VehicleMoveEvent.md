---
description: VehicleMoveEvent
---

# VehicleMoveEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.vehicle.VehicleEvent

            =>  org.bukkit.event.vehicle.VehicleMoveEvent

### 类描述

> Raised when a vehicle moves.
> 
> <br>
> 
> 当载具移动时触发。
> 
> <br>
> 
> 译注：本事件在 `net.minecraft.server.v1_16_R3.EntityBoat#tick()` 方法和 `net.minecraft.server.v1_16_R3.EntityMinecartAbstract#tick()` 方法中被触发。从逻辑来看，每个载具实体每刻都会触发一次 `VehicleUpdateEvent` 。在该事件触发以后，再判断涉事载具这一刻的位置与上一刻所处位置相比是否有变化，如有，则触发本事件。

### 方法列表

#### getFrom

方法声明: public Location getFrom()

方法签名: ()Lorg/bukkit/Location;

> Get the previous position.
> 
> @return Old position.
> 
> <br>
> 
> 该方法用于获取载具移动前的位置。
> 
> @return 移动前的旧位置。

#### getTo

方法声明: public Location getTo()

方法签名: ()Lorg/bukkit/Location;

> Get the next position.
> 
> @return New position.
> 
> <br>
> 
> 该方法用于获取载具移动后的位置。
> 
> @return 移动后的新位置。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;