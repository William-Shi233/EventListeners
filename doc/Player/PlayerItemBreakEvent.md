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
> After this event, the item's amount will be set to {@code item amount - 1}
>
> and its durability will be reset to 0.
>
> 当玩家的物品耐久度耗尽时触发，如一把铲子或一块打火石的耐久度耗尽。
>
> 本事件发生以后，该物品堆的数量将会减一，此后其耐久度将会重设为零。
>
> 译注：在 `1.13` 及以上版本中，正常情况下，拥有耐久度的工具是不可堆叠的，其数量最大为一。物品数量自减一以后物品将会消失。

### 方法列表

#### getBrokenItem

方法声明: public ItemStack getBrokenItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item that broke
>
> @return The broken item
>
> 该方法用于获取耐久耗尽的物品堆。
>
> @return 耐久耗尽的物品堆。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;