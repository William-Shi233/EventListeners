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
>
> 当海绵方块吸水时触发。
>
> 在监听器被触发时，世界中涉事的方块尚且处于未被吸水的状态，通过本事件的 `getBlocks()` 方法可以获取在此次事件未被取消的前提下，世界中将会发生改变的一系列方块的有关信息。
>
> 本事件类同于 `BlockPhysicsEvent` ，是方块状态发生更新时触发的事件。对于“同一次”变化，本事件可能多次触发。
>
> 译注：参见 `BlockPhysicsEvent` 。

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
>
> 该方法用于获取一个列表，其间存储有全部将会被海绵所吸收的方块的块状态。
>
> 本方法返回的列表是可修改的，列表中的元素是吸水以后的方块状态。比如说，该状态的材质可能是 `Material#AIR` 。
>
> @return 将会被海绵所吸收的方块列表。
>
> 译注：所谓“状态的材质可能是 `Material#AIR` ”，指水方块被吸收后变为空气，因而可以佐证“列表中的元素是吸水以后的方块状态”这一说法。

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