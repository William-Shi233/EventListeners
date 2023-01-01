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

### 方法列表

#### getSource

方法声明: public Inventory getSource()

方法签名: ()Lorg/bukkit/inventory/Inventory;

> Gets the Inventory that the ItemStack is being taken from
>
> @return Inventory that the ItemStack is being taken from

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the ItemStack being moved; if modified, the original item will not
>
> be removed from the source inventory.
>
> @return ItemStack

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

#### getDestination

方法声明: public Inventory getDestination()

方法签名: ()Lorg/bukkit/inventory/Inventory;

> Gets the Inventory that the ItemStack is being put into
>
> @return Inventory that the ItemStack is being put into

#### getInitiator

方法声明: public Inventory getInitiator()

方法签名: ()Lorg/bukkit/inventory/Inventory;

> Gets the Inventory that initiated the transfer. This will always be
>
> either the destination or source Inventory.
>
> @return Inventory that initiated the transfer

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