---
description: CauldronLevelChangeEvent
---

# CauldronLevelChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.CauldronLevelChangeEvent

### 类描述

> 译注：无文档。本事件在炼药锅内液面高度变化时触发。

### 方法列表

#### getEntity

方法声明: public Entity getEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Get entity which did this. May be null.
>
> @return acting entity
>
>
> 
> 该方法用于获取导致液面高度变化的实体。返回值可能为 `null` 。
>
> @return 导致液面高度变化的实体。

#### getReason

方法声明: public ChangeReason getReason()

方法签名: ()Lorg/bukkit/event/block/CauldronLevelChangeEvent/ChangeReason;

> 译注：无文档。该方法用于获取导致液面高度变化的原因。

#### getNewState

方法声明: public BlockState getNewState()

方法签名: ()Lorg/bukkit/block/BlockState;

> Gets the new state of the cauldron.
>
> @return The block state of the block that will be changed
>
>
> 
> 该方法用于获取涉事炼药锅的新块状态。
>
> @return 涉事炼药锅的新块状态。

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
>
>
> 
> @deprecated 炼药锅可以容纳的部分液体的液面高度无法用数字表示。

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
>
>
> 
> @deprecated 炼药锅可以容纳的部分液体的液面高度无法用数字表示。

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
>
>
> 
> @deprecated 炼药锅可以容纳的部分液体的液面高度无法用数字表示。

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

> 译注：无文档。用于确定液面高度变化原因的枚举。

#### BUCKET_FILL

> Player emptying the cauldron by filling their bucket.
>
>
> 
> 玩家用炼药锅中已有的液体把手中的空桶装满。

#### BUCKET_EMPTY

> Player filling the cauldron by emptying their bucket.
>
>
> 
> 玩家把手中桶内已有的液体倒入空炼药锅。

#### BOTTLE_FILL

> Player emptying the cauldron by filling their bottle.
>
>
> 
> 玩家用炼药锅中已有的液体把手中的空玻璃瓶装满。

#### BOTTLE_EMPTY

> Player filling the cauldron by emptying their bottle.
>
>
> 
> 玩家把手中玻璃瓶内已有的液体倒入空炼药锅。

#### BANNER_WASH

> Player cleaning their banner.
>
>
> 
> 玩家用炼药锅内的水清洗旗帜。

#### ARMOR_WASH

> Player cleaning their armor.
>
>
> 
> 玩家用炼药锅内的水清洗染色的皮革盔甲。

#### SHULKER_WASH

> Player cleaning a shulker box.
>
>
> 
> 玩家用炼药锅内的水清洗染色的潜影盒。

#### EXTINGUISH

> Entity being extinguished.
>
>
> 
> 身上着火的实体用炼药锅内的水灭火。

#### EVAPORATE

> Evaporating due to biome dryness.
>
>
> 
> 生物群系干燥程度太高，炼药锅内液体蒸发。

#### NATURAL_FILL

> Filling due to natural fluid sources, eg rain or dripstone.
>
>
> 
> 炼药锅被自然产生的液体所填充，比如雨滴或滴水石锥的水滴。

#### UNKNOWN

> Unknown.
>
>
> 
> 未知原因。