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
> 
> <p>
> 
> 当玩家破坏了某个方块，使得该方块产生掉落物时触发。
> 
> 如果“涉事方块被破坏”这一行为所对应的 `BlockBreakEvent` 被取消了，则本事件不会触发。
> 
> 如果对该 `BlockBreakEvent` 对象调用 `isDropItems()` 方法，返回值为 `false` ，则本事件不会触发。
> 
> 如果玩家破坏了一个多方块结构，此事件会被触发。比如玩家破坏了一格石头方块，石头的上方恰好有一支火把，则石头和火把都会掉落，并且触发两次本事件。
> 
> 在本事件触发时，方块已经被摧毁了。所以在监听器内调用继承自 `BlockEvent` 的 `getBlock()` 方法，往往会返回空气方块。如果需要获取事件中被破坏的方块的更多信息，可以调用 `getBlockState()` 方法。

### 方法列表

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the Player that is breaking the block involved in this event.
> 
> @return The Player that is breaking the block involved in this event
> 
> <p>
> 
> 该方法用于获取破坏涉事方块的玩家。
> 
> @return 破坏涉事方块的玩家。

#### getBlockState

方法声明: public BlockState getBlockState()

方法签名: ()Lorg/bukkit/block/BlockState;

> Gets the BlockState of the block involved in this event before it was
> 
> broken.
> 
> @return The BlockState of the block involved in this event
> 
> <p>
> 
> 该方法用于获取事件中被摧毁的方块在毁损以前的块状态。
> 
> @return 事件中被摧毁的方块在毁损以前的块状态。

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
> 
> <p>
> 
> 该方法用于获取一个列表，其间存储有被破坏的方块所产生的掉落物实体。
> 
> 本方法所返回的列表是可以修改的。如果从中删除某个元素，则该物品堆将不会掉落。但是不可以向列表中添加元素。
> 
> @return 被破坏的方块所产生的掉落物实体列表。

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