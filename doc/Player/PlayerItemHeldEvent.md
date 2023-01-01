---
description: PlayerItemHeldEvent
---

# PlayerItemHeldEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerItemHeldEvent

### 类描述

> Fired when a player changes their currently held item

### 方法列表

#### getPreviousSlot

方法声明: public int getPreviousSlot()

方法签名: ()I

> Gets the previous held slot index
>
> @return Previous slot index

#### getNewSlot

方法声明: public int getNewSlot()

方法签名: ()I

> Gets the new held slot index
>
> @return New slot index

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