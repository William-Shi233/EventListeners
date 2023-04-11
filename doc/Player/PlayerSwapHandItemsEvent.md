---
description: PlayerSwapHandItemsEvent
---

# PlayerSwapHandItemsEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerSwapHandItemsEvent

### 类描述

> Called when a player swap items between main hand and off hand using the
>
> hotkey.
>
> 当玩家按下热键交换主副手中物品时触发。
>
> 译注：所谓“热键”，默认为 `F` 键。玩家按下 `F` 键交换左右手中物品时触发本事件。

### 方法列表

#### getMainHandItem

方法声明: public ItemStack getMainHandItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item switched to the main hand.
>
> @return item in the main hand
>
> 该方法用于获取将要被换至主手中的物品堆。
>
> @return 将要被换至主手中的物品堆。

#### setMainHandItem

方法声明: public void setMainHandItem(@Nullable ItemStack mainHandItem)

方法签名: (Lorg/bukkit/inventory/ItemStack;)V

> Sets the item in the main hand.
>
> @param mainHandItem new item in the main hand
>
> 该方法用于设置将要被换至主手中的物品堆。
>
> @param mainHandItem 将要被换至主手中的物品堆。

#### getOffHandItem

方法声明: public ItemStack getOffHandItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item switched to the off hand.
>
> @return item in the off hand
>
> 该方法用于获取将要被换至副手中的物品堆。
>
> @return 将要被换至副手中的物品堆。

#### setOffHandItem

方法声明: public void setOffHandItem(@Nullable ItemStack offHandItem)

方法签名: (Lorg/bukkit/inventory/ItemStack;)V

> Sets the item in the off hand.
>
> @param offHandItem new item in the off hand
>
> 该方法用于设置将要被换至副手中的物品堆。
>
> @param offHandItem 将要被换至副手中的物品堆。

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