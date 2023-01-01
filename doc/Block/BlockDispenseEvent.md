---
description: BlockDispenseEvent
---

# BlockDispenseEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockDispenseEvent

### 类描述

> Called when an item is dispensed from a block.
>
> <p>
>
> If a Block Dispense event is cancelled, the block will not dispense the
>
> item.

### 方法列表

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item that is being dispensed. Modifying the returned item will
>
> have no effect, you must use {@link
>
> #setItem(org.bukkit.inventory.ItemStack)} instead.
>
> @return An ItemStack for the item being dispensed

#### setItem

方法声明: public void setItem(@NotNull ItemStack item)

方法签名: (Lorg/bukkit/inventory/ItemStack;)V

> Sets the item being dispensed.
>
> @param item the item being dispensed

#### getVelocity

方法声明: public Vector getVelocity()

方法签名: ()Lorg/bukkit/util/Vector;

> Gets the velocity in meters per tick.
>
> <p>
>
> Note: Modifying the returned Vector will not change the velocity, you
>
> must use {@link #setVelocity(org.bukkit.util.Vector)} instead.
>
> @return A Vector for the dispensed item's velocity

#### setVelocity

方法声明: public void setVelocity(@NotNull Vector vel)

方法签名: (Lorg/bukkit/util/Vector;)V

> Sets the velocity of the item being dispensed in meters per tick.
>
> @param vel the velocity of the item being dispensed

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