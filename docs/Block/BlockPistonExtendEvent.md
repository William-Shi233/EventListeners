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
> 
> <br>
> 
> 当活塞臂伸出时触发。

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
> 
> <br>
> 
> 该方法用于获取活塞伸出时将会推动的方块数量。
> 
> @return 活塞伸出时将会推动的方块数量。
> 
> @deprecated 该方法已过时。由于粘液块可以粘住四周的方块，使其一起被活塞推动，而本方法未能作相应计算，因而其所返回的数值已经不准确。

#### getBlocks

方法声明: public List<Block> getBlocks()

方法签名: ()Ljava/util/List;

> Get an immutable list of the blocks which will be moved by the
> 
> extending.
> 
> @return Immutable list of the moved blocks.
> 
> <br>
> 
> 该方法用于获取一个不可修改的列表，其间存储有全部因活塞臂伸出而将发生移动的方块。
> 
> @return 将要发生移动的方块列表。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;