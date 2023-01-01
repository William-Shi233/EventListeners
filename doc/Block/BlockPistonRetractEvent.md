---
description: BlockPistonRetractEvent
---

# BlockPistonRetractEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockPistonEvent

                =>  org.bukkit.event.block.BlockPistonRetractEvent

### 类描述

> Called when a piston retracts

### 方法列表

#### getRetractLocation

方法声明: public Location getRetractLocation()

方法签名: ()Lorg/bukkit/Location;

> Gets the location where the possible moving block might be if the
>
> retracting piston is sticky.
>
> @return The possible location of the possibly moving block.

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