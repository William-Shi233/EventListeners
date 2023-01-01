---
description: VehicleEntityCollisionEvent
---

# VehicleEntityCollisionEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.vehicle.VehicleEvent

            =>  org.bukkit.event.vehicle.VehicleCollisionEvent

                =>  org.bukkit.event.vehicle.VehicleEntityCollisionEvent

### 类描述

> Raised when a vehicle collides with an entity.

### 方法列表

#### getEntity

方法声明: public Entity getEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### isPickupCancelled

方法声明: public boolean isPickupCancelled()

方法签名: ()Z

#### setPickupCancelled

方法声明: public void setPickupCancelled(boolean cancel)

方法签名: (Z)V

#### isCollisionCancelled

方法声明: public boolean isCollisionCancelled()

方法签名: ()Z

#### setCollisionCancelled

方法声明: public void setCollisionCancelled(boolean cancel)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;