---
description: SpongeAbsorbEvent
---

# SpongeAbsorbEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.SpongeAbsorbEvent

### 类描述

> Called when a sponge absorbs water from the world.
>
> <br>
>
> The world will be in its previous state, and {@link #getBlocks()} will
>
> represent the changes to be made to the world, if the event is not cancelled.
>
> <br>
>
> As this is a physics based event it may be called multiple times for "the
>
> same" changes.

### 方法列表

#### getBlocks

方法声明: public List<BlockState> getBlocks()

方法签名: ()Ljava/util/List;

> Get a list of all blocks to be removed by the sponge.
>
> <br>
>
> This list is mutable and contains the blocks in their removed state, i.e.
>
> having a type of {@link Material#AIR}.
>
> @return list of the to be removed blocks.

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