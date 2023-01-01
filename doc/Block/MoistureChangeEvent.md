---
description: MoistureChangeEvent
---

# MoistureChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.MoistureChangeEvent

### 类描述

> Called when the moisture level of a soil block changes.

### 方法列表

#### getNewState

方法声明: public BlockState getNewState()

方法签名: ()Lorg/bukkit/block/BlockState;

> Gets the new state of the affected block.
>
> @return new block state

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