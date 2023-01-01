---
description: BlockBurnEvent
---

# BlockBurnEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockBurnEvent

### 类描述

> Called when a block is destroyed as a result of being burnt by fire.
>
> <p>
>
> If a Block Burn event is cancelled, the block will not be destroyed as a
>
> result of being burnt by fire.

### 方法列表

#### getIgnitingBlock

方法声明: public Block getIgnitingBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the block which ignited this block.
>
> @return The Block that ignited and burned this block, or null if no
>
> source block exists

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