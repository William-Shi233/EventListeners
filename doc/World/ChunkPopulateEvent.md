---
description: ChunkPopulateEvent
---

# ChunkPopulateEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.world.WorldEvent

            =>  org.bukkit.event.world.ChunkEvent

                =>  org.bukkit.event.world.ChunkPopulateEvent

### 类描述

> Thrown when a new chunk has finished being populated.
>
> <p>
>
> If your intent is to populate the chunk using this event, please see {@link
>
> BlockPopulator}

### 方法列表

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;