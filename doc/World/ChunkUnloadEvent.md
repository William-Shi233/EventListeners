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

### 方法列表

#### isSaveChunk

方法声明: public boolean isSaveChunk()

方法签名: ()Z

> Return whether this chunk will be saved to disk.
>
> @return chunk save status

#### setSaveChunk

方法声明: public void setSaveChunk(boolean saveChunk)

方法签名: (Z)V

> Set whether this chunk will be saved to disk.
>
> @param saveChunk chunk save status

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;