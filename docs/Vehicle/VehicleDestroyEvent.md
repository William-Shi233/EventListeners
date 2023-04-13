---
description: VehicleDestroyEvent
---

# VehicleDestroyEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.vehicle.VehicleEvent

            =>  org.bukkit.event.vehicle.VehicleDestroyEvent

### 类描述

> Raised when a vehicle is destroyed, which could be caused by either a
> 
> player or the environment. This is not raised if the boat is simply
> 
> 'removed' due to other means.
> 
> <br>
> 
> 当载具遭玩家攻击或受环境因素的影响而被摧毁时触发。如果一艘船被其余手段直接“移除”，则本事件不会触发。
> 
> <br>
> 
> 译注：所谓“移除”，指插件调用 `Entity#remove()` 方法移除一艘船。此时不会触发本事件。

### 方法列表

#### getAttacker

方法声明: public Entity getAttacker()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the Entity that has destroyed the vehicle, potentially null
> 
> @return the Entity that has destroyed the vehicle, potentially null
> 
> <br>
> 
> 该方法用于获取摧毁载具的实体，可能为 `null` 。
> 
> @return 获取摧毁载具的实体，可能为 `null` 。

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