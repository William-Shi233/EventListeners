---
description: BlockFromToEvent
---

# BlockFromToEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockFromToEvent

### 类描述

> Represents events with a source block and a destination block, currently
>
> only applies to liquid (lava and water) and teleporting dragon eggs.
>
> <p>
>
> If a Block From To event is cancelled, the block will not move (the liquid
>
> will not flow).

### 方法列表

#### getFace

方法声明: public BlockFace getFace()

方法签名: ()Lorg/bukkit/block/BlockFace;

> Gets the BlockFace that the block is moving to.
>
> @return The BlockFace that the block is moving to

#### getToBlock

方法声明: public Block getToBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Convenience method for getting the faced Block.
>
> @return The faced Block

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