---
description: BlockIgniteEvent
---

# BlockIgniteEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockIgniteEvent

### 类描述

> Called when a block is ignited. If you want to catch when a Player places
>
> fire, you need to use {@link BlockPlaceEvent}.
>
> <p>
>
> If a Block Ignite event is cancelled, the block will not be ignited.

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getCause

方法声明: public IgniteCause getCause()

方法签名: ()Lorg/bukkit/event/block/BlockIgniteEvent/IgniteCause;

> Gets the cause of block ignite.
>
> @return An IgniteCause value detailing the cause of block ignition

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the player who ignited this block
>
> @return The Player that placed/ignited the fire block, or null if not ignited by a Player.

#### getIgnitingEntity

方法声明: public Entity getIgnitingEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the entity who ignited this block
>
> @return The Entity that placed/ignited the fire block, or null if not ignited by a Entity.

#### getIgnitingBlock

方法声明: public Block getIgnitingBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the block which ignited this block
>
> @return The Block that placed/ignited the fire block, or null if not ignited by a Block.

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: IgniteCause

> An enum to specify the cause of the ignite

#### LAVA

> Block ignition caused by lava.

#### FLINT_AND_STEEL

> Block ignition caused by a player or dispenser using flint-and-steel.

#### SPREAD

> Block ignition caused by dynamic spreading of fire.

#### LIGHTNING

> Block ignition caused by lightning.

#### FIREBALL

> Block ignition caused by an entity using a fireball.

#### ENDER_CRYSTAL

> Block ignition caused by an Ender Crystal.

#### EXPLOSION

> Block ignition caused by explosion.

#### ARROW

> Block ignition caused by a flaming arrow.