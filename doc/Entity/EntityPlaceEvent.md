---
description: EntityPlaceEvent
---

# EntityPlaceEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityPlaceEvent

### 类描述

> Triggered when a entity is created in the world by a player "placing" an item
>
> on a block.
>
> <br>
>
> Note that this event is currently only fired for four specific placements:
>
> armor stands, boats, minecarts, and end crystals.

### 方法列表

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Returns the player placing the entity
>
> @return the player placing the entity

#### getBlock

方法声明: public Block getBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Returns the block that the entity was placed on
>
> @return the block that the entity was placed on

#### getBlockFace

方法声明: public BlockFace getBlockFace()

方法签名: ()Lorg/bukkit/block/BlockFace;

> Returns the face of the block that the entity was placed on
>
> @return the face of the block that the entity was placed on

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