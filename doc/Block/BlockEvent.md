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
> 代表与方块有关的事件。
>
> 译注：该事件未实现 `getHandlers` 和 `getHandlerList` 方法，无法直接监听。

### 方法列表

#### getBlock

方法声明: public final Block getBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the block involved in this event.
>
> @return The Block which block is involved in this event
>
> 获取事件中的方块。
>
> @return 事件中的方块。