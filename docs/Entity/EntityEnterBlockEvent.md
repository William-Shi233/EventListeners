---
description: EntityEnterBlockEvent
---

# EntityEnterBlockEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityEnterBlockEvent

### 类描述

> Called when an {@link Entity} enters a block and is stored in that block.
>
> This event is called for bees entering a bee hive.
>
> It is not called when a silverfish "enters" a stone block. For that listen to
>
> the {@link EntityChangeBlockEvent}.
>
> 当实体进入某个方块，且其数据被该方块储存时触发。
>
> 只有蜜蜂进入蜂巢时才会触发本事件。
>
> 当蠹虫“进入”石质方块时，不会触发本事件。请监听 `EntityChangeBlockEvent` 。

### 方法列表

#### getBlock

方法声明: public Block getBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Get the block the entity will enter.
>
> @return the block
>
> 该方法用于获取实体将进入的方块。
>
> @return 实体将进入的方块。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;