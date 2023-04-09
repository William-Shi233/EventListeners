---
description: BlockPlaceEvent
---

# BlockPlaceEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockPlaceEvent

### 类描述

> Called when a block is placed by a player.
>
> <p>
>
> If a Block Place event is cancelled, the block will not be placed.
>
> 当玩家放置方块时触发。
>
> 如果本事件被取消，则方块将不会被放置。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the player who placed the block involved in this event.
>
> @return The Player who placed the block involved in this event
>
> 该方法用于获取事件中放下方块的玩家。
>
> @return 事件中放下方块的玩家。

#### getBlockPlaced

方法声明: public Block getBlockPlaced()

方法签名: ()Lorg/bukkit/block/Block;

> Clarity method for getting the placed block. Not really needed except
>
> for reasons of clarity.
>
> @return The Block that was placed
>
> 这是一个用于消除歧义的方法。该方法用于获取事件中被放置的方块。除了消除歧义以外，本方法没有什么作用。
>
> @return 事件中被放置的方块。
>
> 译注：本事件是 `BlockEvent` 的子类，因而继承有 `getBlock()` 方法。但 `getBlock()` 方法的字面意思是“事件中的方块”，存在歧义。“事件中的方块”，既可以指玩家在事件中新放下的那个方块，也可以指玩家放置方块时所点击的那个旧有方块（玩家依凭某一个已有的方块才能放下另一个方块，不能直接在虚空中右键空气然后放置方块）。为了消除歧义，特意用 `getBlockPlaced()` 方法指代玩家在事件中新放下的那个方块，用 `getBlockAgainst()` 方法指代旧有的方块。而 `getBlock()` 方法实际上和本方法是等同的，都指向新放下的那个方块。

#### getBlockReplacedState

方法声明: public BlockState getBlockReplacedState()

方法签名: ()Lorg/bukkit/block/BlockState;

> Gets the BlockState for the block which was replaced. Material type air
>
> mostly.
>
> @return The BlockState for the block which was replaced.
>
> 该方法用于获取被替代的方块的块状态。多数情况下其材质是空气。
>
> @return 被替代的方块的块状态。
>
> 译注：放置方块的过程实际上是摧毁该位置上原有的方块，然后放下新的方块。多数情况下，放置方块的过程是将空气取代为新的方块。但也有例外存在，比如在水底放置方块，会取代原有的水方块。本方法所返回的就是原先方块的块状态副本。

#### getBlockAgainst

方法声明: public Block getBlockAgainst()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the block that this block was placed against
>
> @return Block the block that the new block was placed against
>
> 该方法用于获取玩家放置方块时所依凭的那个旧有方块。
>
> @return 玩家放置方块时所依凭的那个旧有方块。
>
> 译注：玩家不能在虚空里直接右键空气放置方块，必须要对准一个已有的方块，依凭它放置新的方块。

#### getItemInHand

方法声明: public ItemStack getItemInHand()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item in the player's hand when they placed the block.
>
> @return The ItemStack for the item in the player's hand when they
>
> placed the block
>
> 该方法用于获取玩家放置方块时手持的物品堆。
>
> @return 玩家放置方块时手持的物品堆。

#### getHand

方法声明: public EquipmentSlot getHand()

方法签名: ()Lorg/bukkit/inventory/EquipmentSlot;

> Gets the hand which placed the block
>
> @return Main or off-hand, depending on which hand was used to place the block
>
> 该方法用于获取玩家放置方块时所用的手。
>
> @return 返回值取决于玩家放置方块时使用的是主手还是副手。

#### canBuild

方法声明: public boolean canBuild()

方法签名: ()Z

> Gets the value whether the player would be allowed to build here.
>
> Defaults to spawn if the server was going to stop them (such as, the
>
> player is in Spawn). Note that this is an entirely different check
>
> than BLOCK_CANBUILD, as this refers to a player, not universe-physics
>
> rule like cactus on dirt.
>
> @return boolean whether the server would allow a player to build here
>
> 该方法用于获取玩家是否有权在此放置方块。例如，玩家位于出生点附近时（或译作“主城当中”），服务器将会禁止该玩家放置方块。注意该方法与 `BLOCK_CANBUILD` 检查是截然不同的。本方法代表的是某一个特定玩家是否有权在特定的位置放下方块，而 `BLOCK_CANBUILD` 则是全游戏通用的物理规则，例如不能在泥土上放置仙人掌（译注：仙人掌只能种植在沙子上）。
>
> @return 服务器是否允许玩家在此放置方块。
>
> 译注：通过本事件，插件可以设定一个规则，比如不能在出生点附近放置方块。一旦玩家尝试在出生点附近放置方块，则调用 `setBuild(false)` 来禁止。这种规则是因服务器而异的，是某个插件设置的特殊的规则，检查某一个特定服务器内某一个特定玩家是否有权在某一个特定的位置放下方块。
> 
> 而仙人掌能否被种植在泥土上，是原版游戏的普遍规则。所谓 `BLOCK_CANBUILD` ，指 `BlockCanBuildEvent` 。该事件与 `BlockPlaceEvent` 一样，也在玩家放置方块时触发，但 `BlockCanBuildEvent` 用于确定方块是否被放置在一个符合原版游戏规则的位置。就如文档中所说的，仙人掌被种植在泥土上，不符合原版游戏的规则，因此不能通过 `BlockCanBuildEvent` 中的相关检查。
>
> 文档中所谓“Defaults to spawn”，意义不明，不译。

#### setBuild

方法声明: public void setBuild(boolean canBuild)

方法签名: (Z)V

> Sets the canBuild state of this event. Set to true if you want the
>
> player to be able to build.
>
> @param canBuild true if you want the player to be able to build
>
> 该方法用于设置是否允许玩家放置方块。如欲令玩家有权放置方块，则传入 `true` 。
>
> @param 如欲令玩家有权放置方块，则传入 `true` 。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;