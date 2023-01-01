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
> <p>
>
> If a Block Damage event is cancelled, the block will not be damaged.

### 方法列表

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the player damaging the block involved in this event.
>
> @return The player damaging the block involved in this event

#### getInstaBreak

方法声明: public boolean getInstaBreak()

方法签名: ()Z

> Gets if the block is set to instantly break when damaged by the player.
>
> @return true if the block should instantly break when damaged by the
>
> player

#### setInstaBreak

方法声明: public void setInstaBreak(boolean bool)

方法签名: (Z)V

> Sets if the block should instantly break when damaged by the player.
>
> @param bool true if you want the block to instantly break when damaged
>
> by the player

#### getItemInHand

方法声明: public ItemStack getItemInHand()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the ItemStack for the item currently in the player's hand.
>
> @return The ItemStack for the item currently in the player's hand

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