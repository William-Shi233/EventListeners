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
> If your intent is to populate the chunk using this event, please see {@link
>
> BlockPopulator}
>
> 
>
> 当一个新区块完成 `populate` 过程后，该事件被触发。
>
> 如果足下的意图在于使用此事件来参与 `populate` 过程，请参见 `BlockPopulator` 类的相关说明。
>
> 
> 
> 译注：所谓“新区块”，其意实为首次被加载的区块。在区块第一次被加载时要进行世界生成的一些相关操作。每一个区块会且仅会被这种操作处理一次，就是在首次被加载时。以后再次被加载时，世界生成的代码也不会对其进行操作了。
> 
> 所谓 `populate` 其实是一个过时词汇。Yaossg 在其鸿篇[《浅析 1.13 世界生成》](https://yaossg.com/blog/1-13-worldgen/#%E5%8C%BA%E5%9D%97%E7%94%9F%E6%88%90%E6%A6%82%E8%BF%B0)中提出，“在过去，区块生成分为 Generation 和 Population 两个阶段，而在 1.13 以后，不再这样笼统的区分……”，因而此处不再赘述 `populate` 的技术细节。
> 
> 大概可以粗浅地将 `Generation` 阶段的工作理解为勾勒地形的轮廓，而 `Population` 阶段则生成了所有的结构、遗迹，用花花草草进行点缀等。`Bukkit API` 保留了这一过时词汇是为了确保其向后兼容性，即基于 `1.12` 版本 `Bukkit API` 编写的插件在 `1.13` 及以上版本的服务端也能正常加载、运行。
>
> 参见 `net.minecraft.server.v1_16_R3.Chunk#loadCallback` 方法。

### 方法列表

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;