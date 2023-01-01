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
> <br>
>
> A 'harvest' is when a block drops an item (usually some sort of crop) and
>
> changes state, but is not broken in order to drop the item.
>
> <br>
>
> This event is not called for when a block is broken, to handle that, listen
>
> for {@link org.bukkit.event.block.BlockBreakEvent} and
>
> {@link org.bukkit.event.block.BlockDropItemEvent}.

### 方法列表

#### getHarvestedBlock

方法声明: public Block getHarvestedBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the block that is being harvested.
>
> @return The block that is being harvested

#### getItemsHarvested

方法声明: public List<ItemStack> getItemsHarvested()

方法签名: ()Ljava/util/List;

> Gets a list of items that are being harvested from this block.
>
> @return A list of items that are being harvested from this block

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