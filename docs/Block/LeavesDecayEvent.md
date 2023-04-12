---
description: LeavesDecayEvent
---

# LeavesDecayEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.LeavesDecayEvent

### 类描述

> Called when leaves are decaying naturally.
> 
> If a Leaves Decay event is cancelled, the leaves will not decay.
> 
> <p>
> 
> 当树叶自然枯萎时触发。
> 
> 如果本事件被取消，则树叶不会枯萎。
> 
> <p>
> 
> 译注：本事件触发时，尚未进入掉落物生成阶段。因而通过本事件是无法获取到掉落的苹果、树苗等物品堆的。

### 方法列表

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