---
description: BatToggleSleepEvent
---

# BatToggleSleepEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.BatToggleSleepEvent

### 类描述

> Called when a bat attempts to sleep or wake up from its slumber.
>
> <p>
>
> If a Bat Toggle Sleep event is cancelled, the Bat will not toggle its sleep
>
> state.

### 方法列表

#### isAwake

方法声明: public boolean isAwake()

方法签名: ()Z

> Get whether or not the bat is attempting to awaken.
>
> @return true if trying to awaken, false otherwise

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;