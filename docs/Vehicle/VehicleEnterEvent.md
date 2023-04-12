---
description: VehicleEnterEvent
---

# VehicleEnterEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.vehicle.VehicleEvent

            =>  org.bukkit.event.vehicle.VehicleEnterEvent

### 类描述

> Raised when an entity enters a vehicle.
> 
> <br>
> 
> 当实体乘上载具时触发。

### 方法列表

#### getEntered

方法声明: public Entity getEntered()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the Entity that entered the vehicle.
> 
> @return the Entity that entered the vehicle
> 
> <br>
> 
> 该方法用于获取乘上载具的实体。
> 
> @return 乘上载具的实体。

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