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

### 方法列表

#### getFrom

方法声明: public Location getFrom()

方法签名: ()Lorg/bukkit/Location;

> Get the previous position.
>
> @return Old position.

#### getTo

方法声明: public Location getTo()

方法签名: ()Lorg/bukkit/Location;

> Get the next position.
>
> @return New position.

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;