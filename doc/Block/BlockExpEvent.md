---
description: BlockExpEvent
---

# BlockExpEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockExpEvent

### 类描述

> An event that's called when a block yields experience.

### 方法列表

#### getExpToDrop

方法声明: public int getExpToDrop()

方法签名: ()I

> Get the experience dropped by the block after the event has processed
>
> @return The experience to drop

#### setExpToDrop

方法声明: public void setExpToDrop(int exp)

方法签名: (I)V

> Set the amount of experience dropped by the block after the event has
>
> processed
>
> @param exp 1 or higher to drop experience, else nothing will drop

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;