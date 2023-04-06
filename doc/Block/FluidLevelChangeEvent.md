---
description: FluidLevelChangeEvent
---

# FluidLevelChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.FluidLevelChangeEvent

### 类描述

> Called when the fluid level of a block changes due to changes in adjacent
>
> blocks.
>
> 当某个方块的液面高度由于邻近方块的变化而产生改动时触发。

### 方法列表

#### getNewData

方法声明: public BlockData getNewData()

方法签名: ()Lorg/bukkit/block/data/BlockData;

> Gets the new data of the changed block.
>
> @return new data
>
> 该方法用于获取事件中发生改变的方块的新方块数据。
>
> @return 新的方块数据。

#### setNewData

方法声明: public void setNewData(@NotNull BlockData newData)

方法签名: (Lorg/bukkit/block/data/BlockData;)V

> Sets the new data of the changed block. Must be of the same Material as
>
> the old one.
>
> @param newData the new data
>
> 该方法用于设置事件中发生改变的方块的新方块数据。方块材质必须与原先保持一致。
>
> @param 新的方块数据。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancelled)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;