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
>
>
> 
> 当活塞臂收回时触发。

### 方法列表

#### getRetractLocation

方法声明: public Location getRetractLocation()

方法签名: ()Lorg/bukkit/Location;

> Gets the location where the possible moving block might be if the
>
> retracting piston is sticky.
>
> @return The possible location of the possibly moving block.
>
>
> 
> 该方法用于获取涉事活塞系粘性活塞时，被移动的方块可能会处在的位置。
>
> @return 被移动的方块可能会处在的位置。

#### getBlocks

方法声明: public List<Block> getBlocks()

方法签名: ()Ljava/util/List;

> Get an immutable list of the blocks which will be moved by the
>
> extending.
>
> @return Immutable list of the moved blocks.
>
>
> 
> 该方法用于获取一个不可修改的列表，其间存储有全部因活塞臂收回而将发生移动的方块。
>
> @return 将要发生移动的方块列表。
>
>
> 
> 译注：本事件文档与 `BlockPistonExtendEvent#getBlocks()` 方法一致，必是舛错。所谓“extending”，应当改为“retracting”，即“活塞臂收回”，而非“活塞臂伸出”。译文中已纠正。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;