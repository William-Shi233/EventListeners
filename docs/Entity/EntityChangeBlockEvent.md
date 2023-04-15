---
description: EntityChangeBlockEvent
---

# EntityChangeBlockEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityChangeBlockEvent

### 类描述

> Called when any Entity changes a block and a more specific event is not available.
> 
> <br>
> 
> 当实体改变某个方块时触发。没有比本事件更为具体的事件。
> 
> <br>
> 
> 译注：所谓“非具体事件”与“具体事件”，类似于 `PlayerEvent` 与 `AsyncPlayerChatEvent` 之间的关系。“非具体事件”一般是对某一大类事件的抽象描述，是不可监听的。比如无法通过一个监听 `PlayerEvent` 的监听器来监听几十种“具体事件”。相对地，“具体事件”描述某种具体的现象，往往能直接监听。
> 
> “实体改变某个方块”这一表述很抽象。改变方块可以有很多种形式，比如将某个方块的材质改变（放置、摧毁方块）、比如改变方块含水状态（向楼梯、栅栏等方块内倒水）、比如改变方块生长阶段（催熟作物）等等。但是对于这些具体的变化，并没有相对应的事件。本事件的表述虽然很抽象，但目前没有更为具体的选择。涉及到实体对方块改变的情景只能通过本事件来监听。

### 方法列表

#### getBlock

方法声明: public Block getBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the block the entity is changing
> 
> @return the block that is changing
> 
> <br>
> 
> 该方法用于获取被实体所改变的方块对象。
> 
> @return 被实体所改变的方块对象。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getTo

方法声明: public Material getTo()

方法签名: ()Lorg/bukkit/Material;

> Gets the Material that the block is changing into
> 
> @return the material that the block is changing into
> 
> <br>
> 
> 该方法用于获取涉事方块将会拥有的新材质。
> 
> @return 涉事方块将会拥有的新材质。

#### getBlockData

方法声明: public BlockData getBlockData()

方法签名: ()Lorg/bukkit/block/data/BlockData;

> Gets the data for the block that would be changed into
> 
> @return the data for the block that would be changed into
> 
> <br>
> 
> 该方法用于获取涉事方块将会拥有的新块数据。
> 
> @return 涉事方块将会拥有的新块数据。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;