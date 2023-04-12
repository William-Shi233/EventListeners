---
description: BlockDamageEvent
---

# BlockDamageEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockDamageEvent

### 类描述

> Called when a block is damaged by a player.
>
> If a Block Damage event is cancelled, the block will not be damaged.
>
>
> 
> 当玩家尝试挖掘方块时触发。
>
> 如果本事件被取消，则方块将不会再处于被挖掘中的状态。
>
>
> 
> 译注：本事件是在玩家开始挖掘时触发，只要左键点击了一瞬，就可以触发此事件。而 `BlockBreakEvent` 是在方块被完全破坏以后触发的。如果对该 `BlockBreakEvent` 对象调用 `isDropItems()` 方法，返回值不为 `false` ，且该 `BlockBreakEvent` 未被取消，则会在 `BlockBreakEvent` 触发后再触发 `BlockDropItemEvent` 。
> 
> 客户端显示可能存在延迟，有时取消事件后，挖掘方块的玩家仍然可以观察到挖掘过程中方块上的裂纹，即使停止挖掘，这个裂纹仍然不会消失。此时可以从其他玩家的视角来观察，以确定挖掘是否停止。

### 方法列表

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the player damaging the block involved in this event.
>
> @return The player damaging the block involved in this event
>
>
> 
> 该方法用于获取挖掘方块的玩家。
>
> @return 挖掘方块的玩家。

#### getInstaBreak

方法声明: public boolean getInstaBreak()

方法签名: ()Z

> Gets if the block is set to instantly break when damaged by the player.
>
> @return true if the block should instantly break when damaged by the
>
> player
>
> 
>
> 该方法用于获取玩家是否能瞬间破坏方块。
>
> @return 如果玩家可以瞬间破坏方块，则返回 `true` 。

#### setInstaBreak

方法声明: public void setInstaBreak(boolean bool)

方法签名: (Z)V

> Sets if the block should instantly break when damaged by the player.
>
> @param bool true if you want the block to instantly break when damaged
>
> by the player
>
> 
>
> 该方法用于设置玩家是否能瞬间破坏方块。
>
> @param bool 如欲令玩家可以瞬间破坏方块，则传入 `true` 。

#### getItemInHand

方法声明: public ItemStack getItemInHand()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the ItemStack for the item currently in the player's hand.
>
> @return The ItemStack for the item currently in the player's hand
>
>
> 
> 该方法用于获取玩家手持的物品堆。
>
> @return 玩家手持的物品堆。

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