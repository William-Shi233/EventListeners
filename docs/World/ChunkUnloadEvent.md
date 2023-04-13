---
description: ChunkUnloadEvent
---

# ChunkUnloadEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.world.WorldEvent

            =>  org.bukkit.event.world.ChunkEvent

                =>  org.bukkit.event.world.ChunkUnloadEvent

### 类描述

> Called when a chunk is unloaded
> 
> <br>
> 
> 当区块被卸载时触发。

### 方法列表

#### isSaveChunk

方法声明: public boolean isSaveChunk()

方法签名: ()Z

> Return whether this chunk will be saved to disk.
> 
> @return chunk save status
> 
> <br>
> 
> 该方法返回涉事区块是否会被保存到硬盘中。
> 
> @return 区块保存状态。
> 
> <br>
> 
> 译注：所谓“区块保存状态”，语焉不详。该方法在实际应用中几乎永远返回 `true` 。参见 [https://www.spigotmc.org/threads/how-to-listen-for-chunk-save-event.428297/](https://www.spigotmc.org/threads/how-to-listen-for-chunk-save-event.428297/) 中的讨论可知，区块保存着实体数据，而实体数据总是在不断变化，只要数据变化了，就理应将新数据写入硬盘保存。因此一个区块被卸载且其数据无需被写入硬盘的情况是极为少见的。

#### setSaveChunk

方法声明: public void setSaveChunk(boolean saveChunk)

方法签名: (Z)V

> Set whether this chunk will be saved to disk.
> 
> @param saveChunk chunk save status
> 
> <br>
> 
> 该方法用于设置涉事区块是否会被保存到硬盘中。
> 
> @param saveChunk 区块保存状态。
> 
> <br>
> 
> 译注见上。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;