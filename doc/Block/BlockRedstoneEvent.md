---
description: BlockRedstoneEvent
---

# BlockRedstoneEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockRedstoneEvent

### 类描述

> Called when a redstone current changes

### 方法列表

#### getOldCurrent

方法声明: public int getOldCurrent()

方法签名: ()I

> Gets the old current of this block
>
> @return The previous current

#### getNewCurrent

方法声明: public int getNewCurrent()

方法签名: ()I

> Gets the new current of this block
>
> @return The new current

#### setNewCurrent

方法声明: public void setNewCurrent(int newCurrent)

方法签名: (I)V

> Sets the new current of this block
>
> @param newCurrent The new current to set

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;