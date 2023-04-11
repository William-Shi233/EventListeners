---
description: BlockBreakEvent
---

# BlockBreakEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockExpEvent

                =>  org.bukkit.event.block.BlockBreakEvent

### 类描述

> Called when a block is broken by a player.
>
> <p>
>
> If you wish to have the block drop experience, you must set the experience
>
> value above 0. By default, experience will be set in the event if:
>
> <ol>
>
> <li>The player is not in creative or adventure mode
>
> <li>The player can loot the block (ie: does not destroy it completely, by
>
> using the correct tool)
>
> <li>The player does not have silk touch
>
> <li>The block drops experience in vanilla Minecraft
>
> </ol>
>
> <p>
>
> Note:
>
> Plugins wanting to simulate a traditional block drop should set the block
>
> to air and utilize their own methods for determining what the default drop
>
> for the block being broken is and what to do about it, if anything.
>
> <p>
>
> If a Block Break event is cancelled, the block will not break and
>
> experience will not drop.
>
> 当玩家破坏方块时触发。
>
> 如欲令涉事方块掉落经验，必须将掉落经验额设为零以上的值。默认情况下，如果符合以下条件，则涉事方块会掉落经验：
>
> <ol>
>
> <li>玩家不处于创造模式或冒险模式下。
>
> <li>玩家可以自涉事方块获取掉落物（即使用恰当工具破坏方块，而不是用错误的工具强行破坏之。如果强行破坏，固然可以令方块消失，但不会生成任何掉落物）。
>
> <li>玩家手持的工具未附有精准采集附魔。
>
> <li>在原版游戏规则下，破坏涉事方块会掉落经验。
>
> </ol>
>
> 注意，假如插件想要模拟某个方块被破坏并产生掉落物的过程，必须先将该方块的材质设为空气，然后利用自己的方法来确定被破坏的方块会产生什么掉落物，以及如何操作这些掉落物（确需操作时）。
>
> 如果本事件被取消，则方块将不会被破坏，也不会掉落经验。
>
> 译注：`BlockDamageEvent` 是在玩家开始挖掘时触发，只要左键点击了一瞬，就可以触发此事件。而 `BlockBreakEvent` 是在方块被完全破坏以后触发的。如果对该 `BlockBreakEvent` 对象调用 `isDropItems()` 方法，返回值不为 `false` ，且该 `BlockBreakEvent` 未被取消，则会在 `BlockBreakEvent` 触发后再触发 `BlockDropItemEvent` 。

### 方法列表

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the Player that is breaking the block involved in this event.
>
> @return The Player that is breaking the block involved in this event
>
> 该方法用于获取破坏方块的涉事玩家。
>
> @return 破坏方块的涉事玩家。

#### setDropItems

方法声明: public void setDropItems(boolean dropItems)

方法签名: (Z)V

> Sets whether or not the block will attempt to drop items as it normally
>
> would.
>
> If and only if this is false then {@link BlockDropItemEvent} will not be
>
> called after this event.
>
> @param dropItems Whether or not the block will attempt to drop items
>
> 该方法用于设置涉事方块是否会产生掉落物。
>
> 当且仅当 `isDropItems()` 方法返回 `false` 时，`BlockDropItemEvent` 不会在此事件之后触发。
>
> @param 涉事方块是否会产生掉落物。

#### isDropItems

方法声明: public boolean isDropItems()

方法签名: ()Z

> Gets whether or not the block will attempt to drop items.
>
> If and only if this is false then {@link BlockDropItemEvent} will not be
>
> called after this event.
>
> @return Whether or not the block will attempt to drop items
>
> 该方法用于获取涉事方块是否会产生掉落物。
>
> 当且仅当本方法返回 `false` 时，`BlockDropItemEvent` 不会在此事件之后触发。
>
> @return 涉事方块是否会产生掉落物。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V