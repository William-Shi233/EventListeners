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
> 
> <br>
> 
> 当载具与实体相撞时触发。

### 方法列表

#### getEntity

方法声明: public Entity getEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> 译注：无文档。从 `VehicleBlockCollisionEvent` 相关方法推测，该方法用于获取事件中的载具撞上的实体。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### isPickupCancelled

方法声明: public boolean isPickupCancelled()

方法签名: ()Z

> 译注：无文档。在服务端底层也没有对此方法的调用。窃猜测本方法没有任何实际意义和效果。

#### setPickupCancelled

方法声明: public void setPickupCancelled(boolean cancel)

方法签名: (Z)V

> 译注：无文档。在服务端底层也没有对 `isPickupCancelled` 方法的调用。窃猜测本方法没有任何实际意义和效果。

#### isCollisionCancelled

方法声明: public boolean isCollisionCancelled()

方法签名: ()Z

> 译注：无文档。在服务端底层也没有对此方法的调用。窃猜测本方法没有任何实际意义和效果。

#### setCollisionCancelled

方法声明: public void setCollisionCancelled(boolean cancel)

方法签名: (Z)V

> 译注：无文档。在服务端底层也没有对 `isCollisionCancelled` 方法的调用。窃猜测本方法没有任何实际意义和效果。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;