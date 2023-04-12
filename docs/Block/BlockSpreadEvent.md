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
> Use {@link BlockFormEvent} to catch blocks that "randomly" form instead of
>
> actually spread.
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
> If a Block Spread event is cancelled, the block will not spread.
>
> @see BlockFormEvent
>
>
> 
> 当一应条件合适，某方块开始向四周蔓延时触发。
>
> 如欲监听某些方块“随机”生成的事件，请参见 `BlockFormEvent` 。本事件在方块蔓延时触发。
>
> 本事件触发的情景包括：
>
> <ul>
>
> <li>蘑菇生长。
>
> <li>火焰蔓延。
>
> </ul>
>
> 如果本事件被取消，则方块不会蔓延。
>
> @see 参见 `BlockFormEvent` 。

### 方法列表

#### getSource

方法声明: public Block getSource()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the source block involved in this event.
>
> @return the Block for the source block involved in this event.
>
>
> 
> 该方法用于获取向外蔓延的源头方块。
>
> @return 事件中向外蔓延的源头方块。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;