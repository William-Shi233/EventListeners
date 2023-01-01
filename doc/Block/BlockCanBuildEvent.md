---
description: BlockCanBuildEvent
---

# BlockCanBuildEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockCanBuildEvent

### 类描述

> Called when we try to place a block, to see if we can build it here or not.
>
> <p>
>
> Note:
>
> <ul>
>
> <li>The Block returned by getBlock() is the block we are trying to place
>
> on, not the block we are trying to place.
>
> <li>If you want to figure out what is being placed, use {@link
>
> #getMaterial()} instead.
>
> </ul>

### 方法列表

#### isBuildable

方法声明: public boolean isBuildable()

方法签名: ()Z

> Gets whether or not the block can be built here.
>
> <p>
>
> By default, returns Minecraft's answer on whether the block can be
>
> built here or not.
>
> @return boolean whether or not the block can be built

#### setBuildable

方法声明: public void setBuildable(boolean cancel)

方法签名: (Z)V

> Sets whether the block can be built here or not.
>
> @param cancel true if you want to allow the block to be built here
>
> despite Minecraft's default behaviour

#### getMaterial

方法声明: public Material getMaterial()

方法签名: ()Lorg/bukkit/Material;

> Gets the Material that we are trying to place.
>
> @return The Material that we are trying to place

#### getBlockData

方法声明: public BlockData getBlockData()

方法签名: ()Lorg/bukkit/block/data/BlockData;

> Gets the BlockData that we are trying to place.
>
> @return The BlockData that we are trying to place

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the player who placed the block involved in this event.
>
> <br>
>
> May be null for legacy calls of the event.
>
> @return The Player who placed the block involved in this event

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;