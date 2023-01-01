---
description: BlockPistonExtendEvent
---

# BlockPistonExtendEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockPistonEvent

                =>  org.bukkit.event.block.BlockPistonExtendEvent

### 类描述

> Called when a piston extends

### 方法列表

#### getLength

方法声明: public int getLength()

方法签名: ()I

> Get the amount of blocks which will be moved while extending.
>
> @return the amount of moving blocks
>
> @deprecated slime blocks make the value of this method
>
> inaccurate due to blocks being pushed at the side

#### getBlocks

方法声明: public List<Block> getBlocks()

方法签名: ()Ljava/util/List;

> Get an immutable list of the blocks which will be moved by the
>
> extending.
>
> @return Immutable list of the moved blocks.

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;