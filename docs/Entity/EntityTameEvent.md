---
description: EntityTameEvent
---

# EntityTameEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityTameEvent

### 类描述

> Thrown when a LivingEntity is tamed
> 
> <br>
> 
> 当某生物被驯服时触发。

### 方法列表

#### getEntity

方法声明: public LivingEntity getEntity()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

> 译注：无文档。该方法用于获取被驯服的生物。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getOwner

方法声明: public AnimalTamer getOwner()

方法签名: ()Lorg/bukkit/entity/AnimalTamer;

> Gets the owning AnimalTamer
> 
> @return the owning AnimalTamer
> 
> <br>
> 
> 该方法用于获取驯服生物的玩家。
> 
> @return 驯服生物的玩家。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;