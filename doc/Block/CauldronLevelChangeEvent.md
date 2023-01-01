---
description: CauldronLevelChangeEvent
---

# CauldronLevelChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.CauldronLevelChangeEvent

### 类描述

### 方法列表

#### getEntity

方法声明: public Entity getEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Get entity which did this. May be null.
>
> @return acting entity

#### getReason

方法声明: public ChangeReason getReason()

方法签名: ()Lorg/bukkit/event/block/CauldronLevelChangeEvent/ChangeReason;

#### getNewState

方法声明: public BlockState getNewState()

方法签名: ()Lorg/bukkit/block/BlockState;

> Gets the new state of the cauldron.
>
> @return The block state of the block that will be changed

#### getOldLevel

方法声明: public int getOldLevel()

方法签名: ()I

> Gets the old level of the cauldron.
>
> @return old level
>
> @see #getBlock()
>
> @deprecated not all cauldron contents are Levelled

#### getNewLevel

方法声明: public int getNewLevel()

方法签名: ()I

> Gets the new level of the cauldron.
>
> @return new level
>
> @see #getNewState()
>
> @deprecated not all cauldron contents are Levelled

#### setNewLevel

方法声明: public void setNewLevel(int newLevel)

方法签名: (I)V

> Sets the new level of the cauldron.
>
> @param newLevel new level
>
> @see #getNewState()
>
> @deprecated not all cauldron contents are Levelled

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancelled)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: ChangeReason

#### BUCKET_FILL

> Player emptying the cauldron by filling their bucket.

#### BUCKET_EMPTY

> Player filling the cauldron by emptying their bucket.

#### BOTTLE_FILL

> Player emptying the cauldron by filling their bottle.

#### BOTTLE_EMPTY

> Player filling the cauldron by emptying their bottle.

#### BANNER_WASH

> Player cleaning their banner.

#### ARMOR_WASH

> Player cleaning their armor.

#### SHULKER_WASH

> Player cleaning a shulker box.

#### EXTINGUISH

> Entity being extinguished.

#### EVAPORATE

> Evaporating due to biome dryness.

#### NATURAL_FILL

> Filling due to natural fluid sources, eg rain or dripstone.

#### UNKNOWN

> Unknown.