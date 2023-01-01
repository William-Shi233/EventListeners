---
description: BlockMultiPlaceEvent
---

# BlockMultiPlaceEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockPlaceEvent

                =>  org.bukkit.event.block.BlockMultiPlaceEvent

### 类描述

> Fired when a single block placement action of a player triggers the
>
> creation of multiple blocks(e.g. placing a bed block). The block returned
>
> by {@link #getBlockPlaced()} and its related methods is the block where
>
> the placed block would exist if the placement only affected a single
>
> block.

### 方法列表

#### getReplacedBlockStates

方法声明: public List<BlockState> getReplacedBlockStates()

方法签名: ()Ljava/util/List;

> Gets a list of blockstates for all blocks which were replaced by the
>
> placement of the new blocks. Most of these blocks will just have a
>
> Material type of AIR.
>
> @return immutable list of replaced BlockStates