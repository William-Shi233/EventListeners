---
description: PlayerItemConsumeEvent
---

# PlayerItemConsumeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerItemConsumeEvent

### 类描述

> This event will fire when a player is finishing consuming an item (food,
>
> potion, milk bucket).
>
> <br>
>
> If the ItemStack is modified the server will use the effects of the new
>
> item and not remove the original one from the player's inventory.
>
> <br>
>
> If the event is cancelled the effect will not be applied and the item will
>
> not be removed from the player's inventory.

### 方法列表

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item that is being consumed. Modifying the returned item will
>
> have no effect, you must use {@link
>
> #setItem(org.bukkit.inventory.ItemStack)} instead.
>
> @return an ItemStack for the item being consumed

#### setItem

方法声明: public void setItem(@Nullable ItemStack item)

方法签名: (Lorg/bukkit/inventory/ItemStack;)V

> Set the item being consumed
>
> @param item the item being consumed

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