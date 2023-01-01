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

#### getBlockPlaced

方法声明: public Block getBlockPlaced()

方法签名: ()Lorg/bukkit/block/Block;

> Clarity method for getting the placed block. Not really needed except
>
> for reasons of clarity.
>
> @return The Block that was placed

#### getBlockReplacedState

方法声明: public BlockState getBlockReplacedState()

方法签名: ()Lorg/bukkit/block/BlockState;

> Gets the BlockState for the block which was replaced. Material type air
>
> mostly.
>
> @return The BlockState for the block which was replaced.

#### getBlockAgainst

方法声明: public Block getBlockAgainst()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the block that this block was placed against
>
> @return Block the block that the new block was placed against

#### getItemInHand

方法声明: public ItemStack getItemInHand()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item in the player's hand when they placed the block.
>
> @return The ItemStack for the item in the player's hand when they
>
> placed the block

#### getHand

方法声明: public EquipmentSlot getHand()

方法签名: ()Lorg/bukkit/inventory/EquipmentSlot;

> Gets the hand which placed the block
>
> @return Main or off-hand, depending on which hand was used to place the block

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

#### setBuild

方法声明: public void setBuild(boolean canBuild)

方法签名: (Z)V

> Sets the canBuild state of this event. Set to true if you want the
>
> player to be able to build.
>
> @param canBuild true if you want the player to be able to build

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;