---
description: VehicleBlockCollisionEvent
---

# VehicleBlockCollisionEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.vehicle.VehicleEvent

            =>  org.bukkit.event.vehicle.VehicleCollisionEvent

                =>  org.bukkit.event.vehicle.VehicleBlockCollisionEvent

### 类描述

> Raised when a vehicle collides with a block.
> 
> <br>
> 
> 当载具与方块相撞时触发。

### 方法列表

#### getBlock

方法声明: public Block getBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the block the vehicle collided with
> 
> @return the block the vehicle collided with
> 
> <br>
> 
> 该方法用于获取涉事载具撞上的方块。
> 
> @return 涉事载具撞上的方块。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;