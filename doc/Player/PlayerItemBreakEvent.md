---
description: PlayerItemBreakEvent
---

# PlayerItemBreakEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerItemBreakEvent

### 类描述

> Fired when a player's item breaks (such as a shovel or flint and steel).
>
> <p>
>
> After this event, the item's amount will be set to {@code item amount - 1}
>
> and its durability will be reset to 0.

### 方法列表

#### getBrokenItem

方法声明: public ItemStack getBrokenItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item that broke
>
> @return The broken item

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;