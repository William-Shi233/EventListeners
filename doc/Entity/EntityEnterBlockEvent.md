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
> <p>
>
> This event is called for bees entering a bee hive.
>
> <br>
>
> It is not called when a silverfish "enters" a stone block. For that listen to
>
> the {@link EntityChangeBlockEvent}.

### 方法列表

#### getBlock

方法声明: public Block getBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Get the block the entity will enter.
>
> @return the block

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