---
description: BlockBreakEvent
---

# BlockBreakEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockExpEvent

                =>  org.bukkit.event.block.BlockBreakEvent

### 类描述

> Called when a block is broken by a player.
>
> <p>
>
> If you wish to have the block drop experience, you must set the experience
>
> value above 0. By default, experience will be set in the event if:
>
> <ol>
>
> <li>The player is not in creative or adventure mode
>
> <li>The player can loot the block (ie: does not destroy it completely, by
>
> using the correct tool)
>
> <li>The player does not have silk touch
>
> <li>The block drops experience in vanilla Minecraft
>
> </ol>
>
> <p>
>
> Note:
>
> Plugins wanting to simulate a traditional block drop should set the block
>
> to air and utilize their own methods for determining what the default drop
>
> for the block being broken is and what to do about it, if anything.
>
> <p>
>
> If a Block Break event is cancelled, the block will not break and
>
> experience will not drop.

### 方法列表

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the Player that is breaking the block involved in this event.
>
> @return The Player that is breaking the block involved in this event

#### setDropItems

方法声明: public void setDropItems(boolean dropItems)

方法签名: (Z)V

> Sets whether or not the block will attempt to drop items as it normally
>
> would.
>
> If and only if this is false then {@link BlockDropItemEvent} will not be
>
> called after this event.
>
> @param dropItems Whether or not the block will attempt to drop items

#### isDropItems

方法声明: public boolean isDropItems()

方法签名: ()Z

> Gets whether or not the block will attempt to drop items.
>
> If and only if this is false then {@link BlockDropItemEvent} will not be
>
> called after this event.
>
> @return Whether or not the block will attempt to drop items

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V