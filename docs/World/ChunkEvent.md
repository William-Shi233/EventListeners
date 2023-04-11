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
> 代表与区块有关的事件。
>
> 译注：该事件未实现 `getHandlers` 和 `getHandlerList` 方法，无法直接监听。

### 方法列表

#### getChunk

方法声明: public Chunk getChunk()

方法签名: ()Lorg/bukkit/Chunk;

> Gets the chunk being loaded/unloaded
>
> @return Chunk that triggered this event
>
> 获取事件中被加载/卸载的区块。
>
> @return 触发事件的区块。
>
> 译注：此处“被加载/卸载的区块”一语不当，因为区块相关事件尚有 `ChunkPopulateEvent` 而不仅仅是区块的加载和卸载，此方法作“事件中的区块”解更适切。