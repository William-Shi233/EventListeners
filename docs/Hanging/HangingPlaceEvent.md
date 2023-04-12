---
description: HangingPlaceEvent
---

# HangingPlaceEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.hanging.HangingEvent

            =>  org.bukkit.event.hanging.HangingPlaceEvent

### 类描述

> Triggered when a hanging entity is created in the world
> 
> <br>
> 
> 当悬挂物实体生成时触发。

### 方法列表

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Returns the player placing the hanging entity
> 
> @return the player placing the hanging entity
> 
> <br>
> 
> 该方法用于获取放置悬挂物的玩家。
> 
> @return 放置悬挂物的玩家。

#### getBlock

方法声明: public Block getBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Returns the block that the hanging entity was placed on
> 
> @return the block that the hanging entity was placed on
> 
> <br>
> 
> 该方法用于获取悬挂物所依附的方块。
> 
> @return 悬挂物所依附的方块。

#### getBlockFace

方法声明: public BlockFace getBlockFace()

方法签名: ()Lorg/bukkit/block/BlockFace;

> Returns the face of the block that the hanging entity was placed on
> 
> @return the face of the block that the hanging entity was placed on
> 
> <br>
> 
> 该方法用于获取悬挂物所依附的方块面。
> 
> @return 悬挂物所依附的方块面。

#### getItemStack

方法声明: public ItemStack getItemStack()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item from which the hanging entity originated
> 
> @return the item from which the hanging entity originated
> 
> <br>
> 
> 该方法用于获取放置悬挂物实体时所用到的物品堆对象。
> 
> @return 放置悬挂物实体时所用到的物品堆对象。
> 
> <br>
> 
> 译注：比如在方块侧面放置物品展示框时，本方法返回玩家手持的展示框物品堆。

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