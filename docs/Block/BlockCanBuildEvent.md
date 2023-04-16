---
description: BlockCanBuildEvent
---

# BlockCanBuildEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockCanBuildEvent

### 类描述

> Called when we try to place a block, to see if we can build it here or not.
> 
> Note:
> 
> <ul>
> 
> <li>The Block returned by getBlock() is the block we are trying to place
> 
> on, not the block we are trying to place.
> 
> <li>If you want to figure out what is being placed, use {@link
> 
> #getMaterial()} instead.
> 
> </ul>
> 
> <br>
> 
> 当玩家放置方块时触发。本事件用于检查玩家是否能放置方块。
> 
> 注意：`getBlock()` 方法所返回的方块，是玩家放置方块时所依凭的方块（译注：玩家对准这个方块点击右键），而不是玩家将要放下的那个方块。如果需要获取玩家将要放下何种方块，可以调用 `getMaterial()` 方法。
> 
> <br>
> 
> 译注：可参见 `BlockPlaceEvent#canBuild()` 方法文档。`BlockPlaceEvent` 与本事件都会在玩家放置方块时触发。但是二者的功用理应有所分别。
> 
> 通过 `BlockPlaceEvent` ，插件可以设定一个规则，比如不能在出生点附近放置方块。一旦玩家尝试在出生点附近放置方块，则调用 `setBuild(false)` 来禁止。这种规则是因服务器而异的，是某个插件设置的特殊的规则，检查某一个特定服务器内某一个特定玩家是否能够在某一个特定的位置放下方块。
> 
> 而本事件用于管理原版游戏中的普遍规则，例如“仙人掌不能被种植在泥土上，只能种植在沙子上”。`BlockCanBuildEvent` 用于确定方块是否被放置在一个符合原版游戏规则的位置。仙人掌被种植在泥土上，不符合原版游戏的规则，因此不能通过 `BlockCanBuildEvent` 中的相关检查。

### 方法列表

#### isBuildable

方法声明: public boolean isBuildable()

方法签名: ()Z

> Gets whether or not the block can be built here.
> 
> By default, returns Minecraft's answer on whether the block can be
> 
> built here or not.
> 
> @return boolean whether or not the block can be built
> 
> <br>
> 
> 该方法用于获取玩家是否能够放置方块。
> 
> 默认情况下，本方法会依据原版游戏规则判定此处是否可以放置涉事方块。
> 
> @return 玩家是否能够放置方块。

#### setBuildable

方法声明: public void setBuildable(boolean cancel)

方法签名: (Z)V

> Sets whether the block can be built here or not.
> 
> @param cancel true if you want to allow the block to be built here
> 
> despite Minecraft's default behaviour
> 
> <br>
> 
> 该方法用于设置玩家是否能够放置方块。
> 
> @param cancel 如果依据原版游戏规则判定此处不得放置涉事方块，但插件欲强制允许方块被放置，可传入 `true` 以越过原版游戏规则。

#### getMaterial

方法声明: public Material getMaterial()

方法签名: ()Lorg/bukkit/Material;

> Gets the Material that we are trying to place.
> 
> @return The Material that we are trying to place
> 
> <br>
> 
> 该方法用于获取被放置的方块的材质。
> 
> @return 被放置的方块的材质。

#### getBlockData

方法声明: public BlockData getBlockData()

方法签名: ()Lorg/bukkit/block/data/BlockData;

> Gets the BlockData that we are trying to place.
> 
> @return The BlockData that we are trying to place
> 
> <br>
> 
> 该方法用于获取被放置的方块的块数据。
> 
> @return 被放置的方块的块数据。

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the player who placed the block involved in this event.
> 
> May be null for legacy calls of the event.
> 
> @return The Player who placed the block involved in this event
> 
> <br>
> 
> 该方法用于获取放置涉事方块的玩家。
> 
> 当一些较为过时的代码触发本事件时，本方法可能返回 `null` 。
> 
> @return 放置涉事方块的玩家。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;
