---
description: VehicleDamageEvent
---

# VehicleDamageEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.vehicle.VehicleEvent

            =>  org.bukkit.event.vehicle.VehicleDamageEvent

### 类描述

> Raised when a vehicle receives damage.
> 
> <p>
> 
> 当载具受到伤害时触发。

### 方法列表

#### getAttacker

方法声明: public Entity getAttacker()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the Entity that is attacking the vehicle
> 
> @return the Entity that is attacking the vehicle
> 
> <p>
> 
> 该方法用于获取攻击载具的实体。
> 
> @return 攻击载具的实体。
> 
> <p>
> 
> 译注：可能返回 `null` ，因为载具也可能受到岩浆等形式的伤害。

#### getDamage

方法声明: public double getDamage()

方法签名: ()D

> Gets the damage done to the vehicle
> 
> @return the damage done to the vehicle
> 
> <p>
> 
> 该方法用于获取载具受到的伤害量。
> 
> @return 载具受到的伤害量。

#### setDamage

方法声明: public void setDamage(double damage)

方法签名: (D)V

> Sets the damage done to the vehicle
> 
> @param damage The damage
> 
> <p>
> 
> 该方法用于设置载具受到的伤害量。
> 
> @param damage 载具受到的伤害量。

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