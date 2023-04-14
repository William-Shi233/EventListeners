---
description: PlayerPickupItemEvent
---

# PlayerPickupItemEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerPickupItemEvent

### 类描述

> Thrown when a player picks an item up from the ground
> 
> @deprecated {@link EntityPickupItemEvent}
> 
> <br>
> 
> 当玩家自地上捡起物品时触发。
> 
> @deprecated 本事件已过时。请监听 `EntityPickupItemEvent` 。

### 方法列表

#### getItem

方法声明: public Item getItem()

方法签名: ()Lorg/bukkit/entity/Item;

> Gets the Item picked up by the player.
> 
> @return Item
> 
> <br>
> 
> 译注：请使用 `EntityPickupItemEvent` 。本事件已经过时。

#### getRemaining

方法声明: public int getRemaining()

方法签名: ()I

> Gets the amount remaining on the ground, if any
> 
> @return amount remaining on the ground
> 
> <br>
> 
> 译注：请使用 `EntityPickupItemEvent` 。本事件已经过时。

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