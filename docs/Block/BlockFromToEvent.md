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
> If a Block From To event is cancelled, the block will not move (the liquid
>
> will not flow).
>
> 代表拥有源头方块和目的地方块的事件。目前而言，本事件只会在液体（水或岩浆）流淌时和龙蛋传送时触发。
>
> 如果本事件被取消，则方块不会移动（如果涉事方块为液体，则不会流淌）。

### 方法列表

#### getFace

方法声明: public BlockFace getFace()

方法签名: ()Lorg/bukkit/block/BlockFace;

> Gets the BlockFace that the block is moving to.
>
> @return The BlockFace that the block is moving to
>
> 该方法用于获取方块移动的方向。
>
> @return 方块移动的方向。

#### getToBlock

方法声明: public Block getToBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Convenience method for getting the faced Block.
>
> @return The faced Block
>
> 该方法用于获取方块移动的目的地。本方法简化了通过 `getFace()` 计算目的地位置的过程。
>
> @return 方块移动的目的地。

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