---
description: BlockDropItemEvent
---

# BlockDropItemEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockDropItemEvent

### 类描述

> Called if a block broken by a player drops an item.
>
> If the block break is cancelled, this event won't be called.
>
> If isDropItems in BlockBreakEvent is set to false, this event won't be
>
> called.
>
> This event will also be called if the player breaks a multi block structure,
>
> for example a torch on top of a stone. Both items will have an event call.
>
> The Block is already broken as this event is called, so #getBlock() will be
>
> AIR in most cases. Use #getBlockState() for more Information about the broken
>
> block.

### 方法列表

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the Player that is breaking the block involved in this event.
>
> @return The Player that is breaking the block involved in this event

#### getBlockState

方法声明: public BlockState getBlockState()

方法签名: ()Lorg/bukkit/block/BlockState;

> Gets the BlockState of the block involved in this event before it was
>
> broken.
>
> @return The BlockState of the block involved in this event

#### getItems

方法声明: public List<Item> getItems()

方法签名: ()Ljava/util/List;

> Gets list of the Item drops caused by the block break.
>
> This list is mutable - removing an item from it will cause it to not
>
> drop. It is not legal however to add new items to the list.
>
> @return The Item the block caused to drop

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