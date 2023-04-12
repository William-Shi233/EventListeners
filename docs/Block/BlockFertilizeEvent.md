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
>
> 
>
> 当玩家给某方块施加骨粉以期催熟，引起方块变化时触发。本事件会在 `StructureGrowEvent` 之后触发。

### 方法列表

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the player that triggered the fertilization.
>
> @return triggering player, or null if not applicable
>
> 
>
> 该方法用于获取完成催熟行为的玩家。
>
> @return 完成催熟行为的玩家。如果无法获取则返回 `null` 。

#### getBlocks

方法声明: public List<BlockState> getBlocks()

方法签名: ()Ljava/util/List;

> Gets a list of all blocks changed by the fertilization.
>
> @return list of all changed blocks
>
> 
>
> 该方法用于获取一个列表，其间存储有全部因催熟行为而受影响的方块。
>
> @return 存储有全部因催熟行为而受影响的方块的列表。

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