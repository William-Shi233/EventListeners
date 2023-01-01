---
description: BlockGrowEvent
---

# BlockGrowEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockGrowEvent

### 类描述

> Called when a block grows naturally in the world.
>
> <p>
>
> Examples:
>
> <ul>
>
> <li>Wheat
>
> <li>Sugar Cane
>
> <li>Cactus
>
> <li>Watermelon
>
> <li>Pumpkin
>
> <li>Turtle Egg
>
> </ul>
>
> <p>
>
> If a Block Grow event is cancelled, the block will not grow.

### 方法列表

#### getNewState

方法声明: public BlockState getNewState()

方法签名: ()Lorg/bukkit/block/BlockState;

> Gets the state of the block where it will form or spread to.
>
> @return The block state for this events block

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