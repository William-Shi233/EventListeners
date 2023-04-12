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
> 
> <br>
> 
> 当某个悬挂物实体被移除时触发。

### 方法列表

#### getCause

方法声明: public HangingBreakEvent.RemoveCause getCause()

方法签名: ()Lorg/bukkit/event/hanging/HangingBreakEvent/RemoveCause;

> Gets the cause for the hanging entity's removal
> 
> @return the RemoveCause for the hanging entity's removal
> 
> <br>
> 
> 该方法用于获取悬挂物被移除的原因。
> 
> @return 悬挂物被移除的原因。

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
> 
> <br>
> 
> 用于确定悬挂物移除原因的枚举。

#### ENTITY

> Removed by an entity
> 
> <br>
> 
> 被实体移除。

#### EXPLOSION

> Removed by an explosion
> 
> <br>
> 
> 被爆炸移除。

#### OBSTRUCTION

> Removed by placing a block on it
> 
> <br>
> 
> 由于在悬挂物所处的位置上有方块被放置而被移除。

#### PHYSICS

> Removed by destroying the block behind it, etc
> 
> <br>
> 
> 包括悬挂物背后的方块被摧毁在内的多种情况。
> 
> <br>
> 
> 译注：`Physics` 一词与方块状态的更新有关。悬挂物背后的方块被摧毁使得周遭环境发生更新。

#### DEFAULT

> Removed by an uncategorised cause removal
> 
> <br>
> 
> 由于某种未能归入其他类别的原因，悬挂物被移除。