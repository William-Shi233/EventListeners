---
description: BlockSpreadEvent
---

# BlockSpreadEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockGrowEvent

                =>  org.bukkit.event.block.BlockFormEvent

                    =>  org.bukkit.event.block.BlockSpreadEvent

### 类描述

> Called when a block spreads based on world conditions.
>
> <p>
>
> Use {@link BlockFormEvent} to catch blocks that "randomly" form instead of
>
> actually spread.
>
> <p>
>
> Examples:
>
> <ul>
>
> <li>Mushrooms spreading.
>
> <li>Fire spreading.
>
> </ul>
>
> <p>
>
> If a Block Spread event is cancelled, the block will not spread.
>
> @see BlockFormEvent

### 方法列表

#### getSource

方法声明: public Block getSource()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the source block involved in this event.
>
> @return the Block for the source block involved in this event.

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;