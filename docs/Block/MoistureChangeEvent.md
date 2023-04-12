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
> 
> <br>
> 
> 当耕地的湿度发生变化时触发。
> 
> <br>
> 
> 译注：参见 `MineCraft Wiki` 的相关页面 [https://minecraft.fandom.com/wiki/Farmland#Hydration](https://minecraft.fandom.com/wiki/Farmland#Hydration) 可知，耕地被开垦时处于干燥状态。处于雨中或周遭有水方块时，会在某个随机刻变得湿润。如果既不处于雨中又不毗邻水方块，且其上没有种植作物，则会退化为未开垦的泥土。

### 方法列表

#### getNewState

方法声明: public BlockState getNewState()

方法签名: ()Lorg/bukkit/block/BlockState;

> Gets the new state of the affected block.
> 
> @return new block state
> 
> <br>
> 
> 该方法用于获取涉事方块的新块状态。
> 
> @return 新的块状态。

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