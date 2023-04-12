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
> If the ItemStack is modified the server will use the effects of the new
> 
> item and not remove the original one from the player's inventory.
> 
> If the event is cancelled the effect will not be applied and the item will
> 
> not be removed from the player's inventory.
> 
> <p>
> 
> 当玩家食用完某一物品后触发，比如食物、药水、牛奶等。
> 
> 如果食用的物品被插件修改了，那么服务端将会认为玩家食用的是修改后的物品，赋予玩家食用新的物品所带来的效果，原有物品堆将不会被消耗。
> 
> 如果本事件被取消，则食用事件中的物品所带来的效果将不会被赋给玩家，原有物品堆将不会被消耗。

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
> 
> <p>
> 
> 该方法用于获取玩家将要食用的物品堆。对本方法的返回值作修改是没有意义的。请使用 `setItem(org.bukkit.inventory.ItemStack)` 方法来替换玩家将要食用的物品堆。
> 
> @return 玩家将要食用的物品堆。

#### setItem

方法声明: public void setItem(@Nullable ItemStack item)

方法签名: (Lorg/bukkit/inventory/ItemStack;)V

> Set the item being consumed
> 
> @param item the item being consumed
> 
> <p>
> 
> 该方法用于设置玩家将要食用的物品堆。
> 
> @param item 玩家将要食用的物品堆。

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