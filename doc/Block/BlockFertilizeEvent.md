---
description: BlockFertilizeEvent
---

# BlockFertilizeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockFertilizeEvent

### 类描述

> Called with the block changes resulting from a player fertilizing a given
>
> block with bonemeal. Will be called after the applicable
>
> {@link StructureGrowEvent}.

### 方法列表

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the player that triggered the fertilization.
>
> @return triggering player, or null if not applicable

#### getBlocks

方法声明: public List<BlockState> getBlocks()

方法签名: ()Ljava/util/List;

> Gets a list of all blocks changed by the fertilization.
>
> @return list of all changed blocks

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancelled)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;