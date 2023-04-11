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
> If a Block Ignite event is cancelled, the block will not be ignited.
>
> 当方块被点燃时触发。如果需要监听玩家放置一个火焰方块，请参见 `BlockPlaceEvent` 。
>
> 如果本事件被取消，则方块将不会被点燃。

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
>
> 该方法用于获取方块被点燃的原因。
>
> @return 方块被点燃的原因。

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the player who ignited this block
>
> @return The Player that placed/ignited the fire block, or null if not ignited by a Player.
>
> 该方法用于获取点燃方块的玩家。
>
> @return 点燃方块的玩家。如果方块不是被玩家点燃的，则返回 `null` 。

#### getIgnitingEntity

方法声明: public Entity getIgnitingEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the entity who ignited this block
>
> @return The Entity that placed/ignited the fire block, or null if not ignited by a Entity.
>
> 该方法用于获取点燃方块的实体。
>
> @return 点燃方块的实体。如果方块不是被实体点燃的，则返回 `null` 。

#### getIgnitingBlock

方法声明: public Block getIgnitingBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the block which ignited this block
>
> @return The Block that placed/ignited the fire block, or null if not ignited by a Block.
>
> 该方法用于获取点燃方块的火源方块。
>
> @return 点燃方块的火源方块。如果方块不是被其他方块点燃的，则返回 `null` 。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: IgniteCause

> An enum to specify the cause of the ignite
>
> 用于确定方块被点燃原因的枚举。

#### LAVA

> Block ignition caused by lava.
>
> 方块被岩浆点燃。

#### FLINT_AND_STEEL

> Block ignition caused by a player or dispenser using flint-and-steel.
>
> 玩家或发射器使用打火石点燃了方块。

#### SPREAD

> Block ignition caused by dynamic spreading of fire.
>
> 火焰方块蔓延，点燃了其他方块。

#### LIGHTNING

> Block ignition caused by lightning.
>
> 方块被闪电点燃。

#### FIREBALL

> Block ignition caused by an entity using a fireball.
>
> 方块被火焰弹点燃。

#### ENDER_CRYSTAL

> Block ignition caused by an Ender Crystal.
>
> 方块被末影水晶点燃。
>
> 译注：参见 `MineCraft Wiki` 上的页面 [https://minecraft.fandom.com/wiki/End_Crystal#Respawning_the_ender_dragon](https://minecraft.fandom.com/wiki/End_Crystal#Respawning_the_ender_dragon) 可知，如果在末地放置末影水晶，则其下方会自动生成一格火焰方块。

#### EXPLOSION

> Block ignition caused by explosion.
>
> 方块被一场爆炸点燃。

#### ARROW

> Block ignition caused by a flaming arrow.
>
> 方块被一支着火的箭矢点燃。
>
> 译注：比如参见 `MineCraft Wiki` 上的页面 [https://minecraft.fandom.com/wiki/Campfire#Usage](https://minecraft.fandom.com/wiki/Campfire#Usage) 可知，着火的箭矢能点燃熄灭的营火。