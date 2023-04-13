---
description: ChunkEvent
---

# ChunkEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.world.WorldEvent

            =>  org.bukkit.event.world.ChunkEvent

### 类描述

> Represents a Chunk related event
> 
> <br>
> 
> 代表与区块有关的事件。
> 
> <br>
> 
> 译注：该事件未实现 `getHandlers()` 和 `getHandlerList()` 方法，无法直接监听。

### 方法列表

#### getChunk

方法声明: public Chunk getChunk()

方法签名: ()Lorg/bukkit/Chunk;

> Gets the chunk being loaded/unloaded
> 
> @return Chunk that triggered this event
> 
> <br>
> 
> 该方法用于获取被加载/卸载的涉事区块。
> 
> @return 涉事区块。
> 
> <br>
> 
> 译注：文档有误。此处“被加载/卸载的区块”一语不当，因为区块相关事件尚有 `ChunkPopulateEvent` ，而不仅仅是区块的加载和卸载。去除“被加载/卸载”，单留“涉事区块”，更适切。