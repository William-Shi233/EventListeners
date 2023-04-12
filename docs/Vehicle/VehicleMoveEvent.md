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
> <p>
> 
> 当载具移动时触发。

### 方法列表

#### getFrom

方法声明: public Location getFrom()

方法签名: ()Lorg/bukkit/Location;

> Get the previous position.
> 
> @return Old position.
> 
> <p>
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
> <p>
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