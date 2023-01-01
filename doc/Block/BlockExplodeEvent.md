---
description: BlockExplodeEvent
---

# BlockExplodeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockExplodeEvent

### 类描述

> Called when a block explodes

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### blockList

方法声明: public List<Block> blockList()

方法签名: ()Ljava/util/List;

> Returns the list of blocks that would have been removed or were removed
>
> from the explosion event.
>
> @return All blown-up blocks

#### getYield

方法声明: public float getYield()

方法签名: ()F

> Returns the percentage of blocks to drop from this explosion
>
> @return The yield.

#### setYield

方法声明: public void setYield(float yield)

方法签名: (F)V

> Sets the percentage of blocks to drop from this explosion
>
> @param yield The new yield percentage

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;