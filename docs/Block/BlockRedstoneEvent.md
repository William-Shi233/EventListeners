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
> 
> <br>
> 
> 当红石信号强度发生变化时触发。

### 方法列表

#### getOldCurrent

方法声明: public int getOldCurrent()

方法签名: ()I

> Gets the old current of this block
> 
> @return The previous current
> 
> <br>
> 
> 该方法用于获取传导到涉事方块上的原有红石信号强度。
> 
> @return 原有的红石信号强度。

#### getNewCurrent

方法声明: public int getNewCurrent()

方法签名: ()I

> Gets the new current of this block
> 
> @return The new current
> 
> <br>
> 
> 该方法用于获取将要传导到涉事方块上的新红石信号强度。
> 
> @return 新的红石信号强度。

#### setNewCurrent

方法声明: public void setNewCurrent(int newCurrent)

方法签名: (I)V

> Sets the new current of this block
> 
> @param newCurrent The new current to set
> 
> <br>
> 
> 该方法用于设置将要传导到涉事方块上的新红石信号强度。
> 
> @param newCurrent 新的红石信号强度。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;