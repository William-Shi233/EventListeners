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

### 方法列表

#### getEntity

方法声明: public LivingEntity getEntity()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

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

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;