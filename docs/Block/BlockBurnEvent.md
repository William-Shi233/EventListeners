---
description: BlockBurnEvent
---

# BlockBurnEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockBurnEvent

### 类描述

> Called when a block is destroyed as a result of being burnt by fire.
> 
> If a Block Burn event is cancelled, the block will not be destroyed as a
> 
> result of being burnt by fire.
> 
> <br>
> 
> 当方块被火焰所烧毁时触发。
> 
> 如果本事件被取消，则涉事方块不会被火焰所烧毁。
> 
> <br>
> 
> 译注：有时，火焰在燃烧一段时间后自然熄灭，不会烧毁被点燃的方块。此时可以监听 `BlockFadeEvent` 。

### 方法列表

#### getIgnitingBlock

方法声明: public Block getIgnitingBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the block which ignited this block.
> 
> @return The Block that ignited and burned this block, or null if no
> 
> source block exists
> 
> <br>
> 
> 该方法用于获取点燃涉事方块的火源方块。
> 
> @return 点燃涉事方块的火源方块。如果火源方块不存在，则返回 `null` 。

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