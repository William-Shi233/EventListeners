---
description: PlayerHarvestBlockEvent
---

# PlayerHarvestBlockEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerHarvestBlockEvent

### 类描述

> This event is called whenever a player harvests a block.
> 
> A 'harvest' is when a block drops an item (usually some sort of crop) and
> 
> changes state, but is not broken in order to drop the item.
> 
> This event is not called for when a block is broken, to handle that, listen
> 
> for {@link org.bukkit.event.block.BlockBreakEvent} and
> 
> {@link org.bukkit.event.block.BlockDropItemEvent}.
> 
> <br>
> 
> 当玩家从方块中取得收获时触发。
> 
> 所谓“收获”，是指玩家俾使方块产生掉落物（常是某种作物物品堆）并改变了块状态，但并没有破坏方块。
> 
> 如果玩家破坏了方块，则不会触发本事件。如欲监听玩家破坏方块，可使用 `BlockBreakEvent` 和 `BlockDropItemEvent` 。
> 
> <br>
> 
> 译注：比如玩家右键浆果丛时，可以收获甜浆果物品堆，浆果丛的块状态（生长阶段）发生变化，但是浆果丛方块不会被破坏。因此收获甜浆果的过程中会触发此事件。

### 方法列表

#### getHarvestedBlock

方法声明: public Block getHarvestedBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the block that is being harvested.
> 
> @return The block that is being harvested
> 
> <br>
> 
> 该方法用于获取被收获的方块。
> 
> @return 被收获的方块。

#### getItemsHarvested

方法声明: public List<ItemStack> getItemsHarvested()

方法签名: ()Ljava/util/List;

> Gets a list of items that are being harvested from this block.
> 
> @return A list of items that are being harvested from this block
> 
> <br>
> 
> 该方法用于获取一个列表，其间存储了全部收获所得的物品堆。
> 
> @return 收获所得的物品堆列表。

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