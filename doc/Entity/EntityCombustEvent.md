---
description: EntityCombustEvent
---

# EntityCombustEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityCombustEvent

### 类描述

> Called when an entity combusts.
>
> <p>
>
> If an Entity Combust event is cancelled, the entity will not combust.

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getDuration

方法声明: public int getDuration()

方法签名: ()I

> @return the amount of time (in seconds) the combustee should be alight
>
> for

#### setDuration

方法声明: public void setDuration(int duration)

方法签名: (I)V

> The number of seconds the combustee should be alight for.
>
> <p>
>
> This value will only ever increase the combustion time, not decrease
>
> existing combustion times.
>
> @param duration the time in seconds to be alight for.

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;