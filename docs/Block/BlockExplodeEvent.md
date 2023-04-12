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
> 
> <p>
> 
> 当方块爆炸时触发。

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
> 
> <p>
> 
> 该方法用于获取一个列表，其间存储有全部受爆炸破坏的方块。
> 
> @return 全部受爆炸破坏的方块列表。

#### getYield

方法声明: public float getYield()

方法签名: ()F

> Returns the percentage of blocks to drop from this explosion
> 
> @return The yield.
> 
> <p>
> 
> 该方法用于获取爆炸中被炸毁方块的掉落概率。
> 
> @return 被炸毁方块的掉落概率。

#### setYield

方法声明: public void setYield(float yield)

方法签名: (F)V

> Sets the percentage of blocks to drop from this explosion
> 
> @param yield The new yield percentage
> 
> <p>
> 
> 该方法用于设置爆炸中被炸毁方块的掉落概率。
> 
> @param yield 被炸毁方块的掉落概率。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;