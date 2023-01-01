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

### 方法列表

#### getBlock

方法声明: public Block getBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the block the entity is changing
>
> @return the block that is changing

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

#### getBlockData

方法声明: public BlockData getBlockData()

方法签名: ()Lorg/bukkit/block/data/BlockData;

> Gets the data for the block that would be changed into
>
> @return the data for the block that would be changed into

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;