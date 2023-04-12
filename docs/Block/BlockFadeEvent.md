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
> If a Block Fade event is cancelled, the block will not fade, melt or
> 
> disappear.
> 
> <p>
> 
> 当一应条件合适，某方块枯萎、融化或消失时触发。
> 
> 本事件触发的情景包括：
> 
> <ul>
> 
> <li>雪方块离光源过近，因而融化。
> 
> <li>冰方块离光源过近，因而融化。
> 
> <li>火焰在燃烧一段时间后自然熄灭，并且没有摧毁其下的燃料方块。
> 
> <li>由于缺少水源，珊瑚枯萎。
> 
> <li>由于小海龟破壳而出，海龟蛋方块破碎。
> 
> </ul>
> 
> 如果本事件被取消，则方块不会枯萎、融化或消失。

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
> 
> <p>
> 
> 该方法用于获取即将枯萎、融化或消失的方块的新块状态。
> 
> @return 即将枯萎、融化或消失的方块的新块状态。

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