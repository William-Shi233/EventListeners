---
description: BlockEvent
---

# BlockEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

### 类描述

> Represents a block related event.
> 
> <br>
> 
> 代表与方块有关的事件。
> 
> <br>
> 
> 译注：该事件未实现 `getHandlers()` 和 `getHandlerList()` 方法，无法直接监听。

### 方法列表

#### getBlock

方法声明: public final Block getBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the block involved in this event.
> 
> @return The Block which block is involved in this event
> 
> <br>
> 
> 该方法用于获取涉事方块。
> 
> @return 涉事方块。