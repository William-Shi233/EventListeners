---
description: PlayerStatisticIncrementEvent
---

# PlayerStatisticIncrementEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerStatisticIncrementEvent

### 类描述

> Called when a player statistic is incremented.
> 
> This event is not called for some high frequency statistics, e.g. movement
> 
> based statistics.
> 
> <br>
> 
> 当玩家的统计数据增长时触发。
> 
> 若有变动频繁的统计数据发生改变，比如与移动有关的数据项，则本事件不会被触发。

### 方法列表

#### getStatistic

方法声明: public Statistic getStatistic()

方法签名: ()Lorg/bukkit/Statistic;

> Gets the statistic that is being incremented.
> 
> @return the incremented statistic
> 
> <br>
> 
> 该方法用于获取增长的数据项。
> 
> @return 增长的数据项。

#### getPreviousValue

方法声明: public int getPreviousValue()

方法签名: ()I

> Gets the previous value of the statistic.
> 
> @return the previous value of the statistic
> 
> <br>
> 
> 该方法用于获取涉事数据项变动前的旧数据值。
> 
> @return 涉事数据项变动前的旧数据值。

#### getNewValue

方法声明: public int getNewValue()

方法签名: ()I

> Gets the new value of the statistic.
> 
> @return the new value of the statistic
> 
> <br>
> 
> 该方法用于获取涉事数据项变动后的新数据值。
> 
> @return 涉事数据项变动后的新数据值。

#### getEntityType

方法声明: public EntityType getEntityType()

方法签名: ()Lorg/bukkit/entity/EntityType;

> Gets the EntityType if {@link #getStatistic() getStatistic()} is an
> 
> entity statistic otherwise returns null.
> 
> @return the EntityType of the statistic
> 
> <br>
> 
> 该方法用于获取涉事数据项的实体种类。如果 `getStatistic()` 方法返回的数据项与实体有关，则返回对应的实体种类，否则返回 `null` 。
> 
> @return 数据项的实体种类。
> 
> <br>
> 
> 译注：许多与实体有关的统计数据项都共用了 `Statistic` 类下的同一个字段（即同一个数据项），但每一种实体都有一个独立的数据值。需要通过本方法来确定是哪一种实体。比如数据项是 `Statistic.ENTITY_KILLED_BY` ，且本方法返回 `EntityType.ZOMBIE` ，那么就说明增长的数据项是玩家被僵尸杀死的次数。`ENTITY_KILLED_BY` 仅仅代表“某一种实体击杀玩家次数”，不能指定是哪一种实体，只有配合本方法的返回值才能确定是哪一种实体击杀玩家的次数。

#### getMaterial

方法声明: public Material getMaterial()

方法签名: ()Lorg/bukkit/Material;

> Gets the Material if {@link #getStatistic() getStatistic()} is a block
> 
> or item statistic otherwise returns null.
> 
> @return the Material of the statistic
> 
> <br>
> 
> 该方法用于获取涉事数据项的实体种类。如果 `getStatistic()` 方法返回的数据项与物品或方块有关，则返回对应的材质种类，否则返回 `null` 。
> 
> @return 数据项的材质种类。
> 
> <br>
> 
> 译注：许多与方块、物品有关的统计数据项都共用了 `Statistic` 类下的同一个字段，但每一种方块或物品都有一个独立的数据值。需要通过本方法来确定是哪一种方块或物品。比如数据项是 `Statistic.BLOCK_MINED` ，且本方法返回 `Material.STONE` ，那么就说明增长的数据项是玩家破坏石头方块的次数。`BLOCK_MINED` 仅仅代表“破坏某一种方块次数”，不能指定是哪一种方块，只有配合本方法的返回值才能确定是玩家破坏哪一种方块的次数。

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