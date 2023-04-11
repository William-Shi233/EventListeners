---
description: InventoryMoveItemEvent
---

# InventoryMoveItemEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.inventory.InventoryMoveItemEvent

### 类描述

> Called when some entity or block (e.g. hopper) tries to move items directly
>
> from one inventory to another.
>
> <p>
>
> When this event is called, the initiator may already have removed the item
>
> from the source inventory and is ready to move it into the destination
>
> inventory.
>
> <p>
>
> If this event is cancelled, the items will be returned to the source
>
> inventory, if needed.
>
> <p>
>
> If this event is not cancelled, the initiator will try to put the ItemStack
>
> into the destination inventory. If this is not possible and the ItemStack
>
> has not been modified, the source inventory slot will be restored to its
>
> former state. Otherwise any additional items will be discarded.
>
> 当某个实体或方块（如漏斗）尝试将物品在两个物品栏之间移动时触发。
>
> 本事件被触发时，物品堆可能已经被玩家从原物品栏取出，并且将要被放到另一个物品栏里。
>
> 如果本事件被取消，则如有必要，物品堆会被退回至原物品栏中。
>
> 如果本事件没有被取消，则物品堆将会被放入另一个物品栏中。如果这一操作无法实现，且物品堆对象未被修改过，则该物品堆原先所在的槽位将会刷新至物品堆移动前的状态。如果物品堆对象被修改过了，则插件额外增加的物品堆叠数量将会被舍弃。

### 方法列表

#### getSource

方法声明: public Inventory getSource()

方法签名: ()Lorg/bukkit/inventory/Inventory;

> Gets the Inventory that the ItemStack is being taken from
>
> @return Inventory that the ItemStack is being taken from
>
> 该方法用于获取物品堆原先所在的物品栏。
>
> @return 物品堆原先所在的物品栏。

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the ItemStack being moved; if modified, the original item will not
>
> be removed from the source inventory.
>
> @return ItemStack
>
> 该方法用于获取被移动的物品堆。如果插件使用 `setItem(ItemStack)` 方法修改了物品堆对象，则物品堆不会被从源物品栏中移除。
>
> @return 被移动的物品堆。

#### setItem

方法声明: public void setItem(@NotNull ItemStack itemStack)

方法签名: (Lorg/bukkit/inventory/ItemStack;)V

> Sets the ItemStack being moved; if this is different from the original
>
> ItemStack, the original item will not be removed from the source
>
> inventory.
>
> @param itemStack The ItemStack
>
> 该方法用于设置被移动的物品堆。如果本方法传入的参数与原先的物品堆对象不同，则原先的物品堆不会被从源物品栏中移除。
>
> @param itemStack 被移动的物品堆。
>
> 译注：所谓“原先的物品堆对象”，指在第一个事件监听器被调用以前，服务端原本将要移动的物品堆。

#### getDestination

方法声明: public Inventory getDestination()

方法签名: ()Lorg/bukkit/inventory/Inventory;

> Gets the Inventory that the ItemStack is being put into
>
> @return Inventory that the ItemStack is being put into
>
> 该方法用于获取物品堆将要被放入的物品栏。
>
> @return 物品堆将要被放入的物品栏。

#### getInitiator

方法声明: public Inventory getInitiator()

方法签名: ()Lorg/bukkit/inventory/Inventory;

> Gets the Inventory that initiated the transfer. This will always be
>
> either the destination or source Inventory.
>
> @return Inventory that initiated the transfer
>
> 该方法用于获取导致物品移动的物品栏。本方法的返回值是 `getSource()` 方法和 `getDestination()` 方法的返回值中的某一个。
>
> @return 导致物品移动的物品栏。

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