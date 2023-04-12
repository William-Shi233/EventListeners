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
> 
> <br>
> 
> 当玩家放置单个方块的动作致使多个方块被放置时触发，比如玩家放置一张床。本事件的 `getBlockPlaced()` 方法以及其他有关方法，会假定玩家放置的只是单个方块，没有连带放置其他方块，然后返回此假设下玩家所放置的那个方块的位置。
> 
> <br>
> 
> 译注：所谓“放置单个方块的动作”，指点击一次右键。玩家放置一张床时，尽管只点击了一次右键，但放下了床头和床尾两个床方块。本事件是 `BlockPlaceEvent` 的子类，继承有 `getBlockPlaced()` 等方法，但这些方法都是针对玩家放置单个方块的情况而言的，只能返回一个方块对象，而不是多个方块对象组成的列表。因此本事件中，这些方法的返回值必须基于“玩家放置了一个方块”的假设来运行，把玩家一次放置多个方块的情况看作是玩家先放置了一个方块，然后衍生出其他方块。比如玩家在平地上放置一张床，可以认为床尾是第一个被放置的方块（玩家点击了床尾下方的方块，消耗了床物品堆，放置了床尾），然后基于床尾的朝向衍生出了床头。

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
> 
> <br>
> 
> 该方法用于获取一个列表，其间存储有全部被替代的方块的块状态。多数情况下其材质是空气。
> 
> @return 被替代的方块的块状态列表。该列表是不可修改的。
> 
> <br>
> 
> 译注：放置方块的过程实际上是摧毁该位置上原有的方块，然后放下新的方块。多数情况下，放置方块的过程是将空气取代为新的方块。但也有例外存在，比如在水底放置方块，会取代原有的水方块。本方法所返回的列表中的元素就是原先方块的块状态副本。