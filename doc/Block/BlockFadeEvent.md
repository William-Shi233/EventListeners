---
description: BlockFadeEvent
---

# BlockFadeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockFadeEvent

### 类描述

> Called when a block fades, melts or disappears based on world conditions
>
> <p>
>
> Examples:
>
> <ul>
>
> <li>Snow melting due to being near a light source.
>
> <li>Ice melting due to being near a light source.
>
> <li>Fire burning out after time, without destroying fuel block.
>
> <li>Coral fading to dead coral due to lack of water</li>
>
> <li>Turtle Egg bursting when a turtle hatches</li>
>
> </ul>
>
> <p>
>
> If a Block Fade event is cancelled, the block will not fade, melt or
>
> disappear.

### 方法列表

#### getNewState

方法声明: public BlockState getNewState()

方法签名: ()Lorg/bukkit/block/BlockState;

> Gets the state of the block that will be fading, melting or
>
> disappearing.
>
> @return The block state of the block that will be fading, melting or
>
> disappearing

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