---
description: ChunkLoadEvent
---

# ChunkLoadEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.world.WorldEvent

            =>  org.bukkit.event.world.ChunkEvent

                =>  org.bukkit.event.world.ChunkLoadEvent

### 类描述

> Called when a chunk is loaded

### 方法列表

#### isNewChunk

方法声明: public boolean isNewChunk()

方法签名: ()Z

> Gets if this chunk was newly created or not.
>
> <p>
>
> Note that if this chunk is new, it will not be populated at this time.
>
> @return true if the chunk is new, otherwise false

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;