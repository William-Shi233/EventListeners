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
>
> 
>
> 当一个区块被加载时触发。

### 方法列表

#### isNewChunk

方法声明: public boolean isNewChunk()

方法签名: ()Z

> Gets if this chunk was newly created or not.
>
> Note that if this chunk is new, it will not be populated at this time.
>
> @return true if the chunk is new, otherwise false
>
> 
>
> 该方法用于获取事件中的区块是否为在本次事件中新创建的。
>
> 注意，如果区块是新创建的，在此事件触发时它不会被 `populate` 。
> 
> @return 如果是新创建的区块则返回 `true` ，否则返回 `false` 。
>
> 
>
> 译注：所谓“新创建”，其意实为区块首次被加载。在区块第一次被加载时要进行世界生成的一些相关操作。每一个区块会且仅会被这种操作处理一次，就是在首次被加载时。以后再次被加载时，世界生成的代码也不会对其进行操作了。
> 
> 所谓 `populate` 其实是一个过时词汇。Yaossg 在其鸿篇[《浅析 1.13 世界生成》](https://yaossg.com/blog/1-13-worldgen/#%E5%8C%BA%E5%9D%97%E7%94%9F%E6%88%90%E6%A6%82%E8%BF%B0)中提出，“在过去，区块生成分为 Generation 和 Population 两个阶段，而在 1.13 以后，不再这样笼统的区分……”，因而此处不再赘述 `populate` 的技术细节。
>
> 所谓“在此事件触发时它不会被 `populate` ”，是指 `ChunkPopulateEvent` 在本事件之后触发，参见 `net.minecraft.server.v1_16_R3.Chunk#loadCallback` 方法。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;