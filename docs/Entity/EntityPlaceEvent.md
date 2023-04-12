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
> Note that this event is currently only fired for four specific placements:
> 
> armor stands, boats, minecarts, and end crystals.
> 
> <br>
> 
> 当玩家对准方块“放置”物品堆，生成实体时触发。
> 
> 目前本事件仅在玩家放置如下四种特定实体时触发：盔甲架、船、矿车和末影水晶。

### 方法列表

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Returns the player placing the entity
> 
> @return the player placing the entity
> 
> <br>
> 
> 该方法用于获取放置实体的玩家。
> 
> @return 放置实体的玩家。

#### getBlock

方法声明: public Block getBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Returns the block that the entity was placed on
> 
> @return the block that the entity was placed on
> 
> <br>
> 
> 该方法用于获取放置实体时所依凭的方块。
> 
> @return 放置实体时所依凭的方块。

#### getBlockFace

方法声明: public BlockFace getBlockFace()

方法签名: ()Lorg/bukkit/block/BlockFace;

> Returns the face of the block that the entity was placed on
> 
> @return the face of the block that the entity was placed on
> 
> <br>
> 
> 该方法用于获取放置实体时所依凭的方块面。
> 
> @return 放置实体时所依凭的方块面。

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