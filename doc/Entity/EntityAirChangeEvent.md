---
description: EntityAirChangeEvent
---

# EntityAirChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityAirChangeEvent

### 类描述

> Called when the amount of air an entity has remaining changes.

### 方法列表

#### getAmount

方法声明: public int getAmount()

方法签名: ()I

> Gets the amount of air the entity has left (measured in ticks).
>
> @return amount of air remaining

#### setAmount

方法声明: public void setAmount(int amount)

方法签名: (I)V

> Sets the amount of air remaining for the entity (measured in ticks.
>
> @param amount amount of air remaining

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