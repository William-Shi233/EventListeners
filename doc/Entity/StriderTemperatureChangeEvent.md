---
description: StriderTemperatureChangeEvent
---

# StriderTemperatureChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.StriderTemperatureChangeEvent

### 类描述

> Called when a {@link Strider}'s temperature has changed as a result of
>
> entering or exiting blocks it considers warm.

### 方法列表

#### getEntity

方法声明: public Strider getEntity()

方法签名: ()Lorg/bukkit/entity/Strider;

#### isShivering

方法声明: public boolean isShivering()

方法签名: ()Z

> Get the Strider's new shivering state.
>
> @return the new shivering state

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancelled)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;