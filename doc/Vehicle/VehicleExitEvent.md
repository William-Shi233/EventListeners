---
description: VehicleExitEvent
---

# VehicleExitEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.vehicle.VehicleEvent

            =>  org.bukkit.event.vehicle.VehicleExitEvent

### 类描述

> Raised when a living entity exits a vehicle.

### 方法列表

#### getExited

方法声明: public LivingEntity getExited()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

> Get the living entity that exited the vehicle.
>
> @return The entity.

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