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
>
> 当方块发射物品堆时触发。
>
> 如果本事件被取消，方块将不会发射出该物品。
>
> 译注：发射器或投掷器均可触发本事件。
>
> 发射器发射部分物品时存在特殊行为，比如发射剪刀时可以剪去羊毛、剪下哞菇身上的蘑菇等。该行为可通过 `BlockShearEntityEvent` 来监听。本事件先于 `BlockShearEntityEvent` 触发。如果本事件被取消，则 `BlockShearEntityEvent` 不会触发。

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
>
> 该方法用于获取被发射的物品堆。
>
> @return 被发射的物品堆。

#### setItem

方法声明: public void setItem(@NotNull ItemStack item)

方法签名: (Lorg/bukkit/inventory/ItemStack;)V

> Sets the item being dispensed.
>
> @param item the item being dispensed
>
> 该方法用于设置被发射的物品堆。
>
> @param 被发射的物品堆。

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
>
> 该方法用于获取被发射的物品的速度向量，单位为米每刻。
>
> 注意，直接修改本方法返回的 `Vector` 对象不会影响被发射的物品的速度。必须使用 `setVelocity(org.bukkit.util.Vector)` 才能修改该物品的速度。（译注：返回的向量是一个副本，修改这个副本不会对物品的速度产生影响。）
>
> @return 被发射的物品的速度向量。

#### setVelocity

方法声明: public void setVelocity(@NotNull Vector vel)

方法签名: (Lorg/bukkit/util/Vector;)V

> Sets the velocity of the item being dispensed in meters per tick.
>
> @param vel the velocity of the item being dispensed
>
> 该方法用于设置被发射的物品的速度向量，单位为米每刻。
>
> @param 被发射的物品的速度向量。

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