---
description: VehicleEvent
---

# VehicleEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.vehicle.VehicleEvent

### 类描述

> Represents a vehicle-related event.
> 
> <br>
> 
> 代表与载具有关的事件。
> 
> <br>
> 
> 译注：该事件未实现 `getHandlers` 和 `getHandlerList` 方法，无法直接监听。

### 方法列表

#### getVehicle

方法声明: public final Vehicle getVehicle()

方法签名: ()Lorg/bukkit/entity/Vehicle;

> Get the vehicle.
> 
> @return the vehicle
> 
> <br>
> 
> 获取事件中的载具。
> 
> @return 触发事件的载具。