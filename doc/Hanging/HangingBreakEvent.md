---
description: HangingBreakEvent
---

# HangingBreakEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.hanging.HangingEvent

            =>  org.bukkit.event.hanging.HangingBreakEvent

### 类描述

> Triggered when a hanging entity is removed

### 方法列表

#### getCause

方法声明: public HangingBreakEvent.RemoveCause getCause()

方法签名: ()Lorg/bukkit/event/hanging/HangingBreakEvent/RemoveCause;

> Gets the cause for the hanging entity's removal
>
> @return the RemoveCause for the hanging entity's removal

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

### 枚举: RemoveCause

> An enum to specify the cause of the removal

#### ENTITY

> Removed by an entity

#### EXPLOSION

> Removed by an explosion

#### OBSTRUCTION

> Removed by placing a block on it

#### PHYSICS

> Removed by destroying the block behind it, etc

#### DEFAULT

> Removed by an uncategorised cause removal

#### DEFAULT

> > An enum to specify the cause of the removal