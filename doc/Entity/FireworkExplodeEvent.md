---
description: FireworkExplodeEvent
---

# FireworkExplodeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.FireworkExplodeEvent

### 类描述

> Called when a firework explodes.

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

> Set the cancelled state of this event. If the firework explosion is
>
> cancelled, the firework will still be removed, but no particles will be
>
> displayed.
>
> @param cancel whether to cancel or not.

#### getEntity

方法声明: public Firework getEntity()

方法签名: ()Lorg/bukkit/entity/Firework;

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;