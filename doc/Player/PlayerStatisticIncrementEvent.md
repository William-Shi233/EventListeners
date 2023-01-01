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
> <p>
>
> This event is not called for some high frequency statistics, e.g. movement
>
> based statistics.

### 方法列表

#### getStatistic

方法声明: public Statistic getStatistic()

方法签名: ()Lorg/bukkit/Statistic;

> Gets the statistic that is being incremented.
>
> @return the incremented statistic

#### getPreviousValue

方法声明: public int getPreviousValue()

方法签名: ()I

> Gets the previous value of the statistic.
>
> @return the previous value of the statistic

#### getNewValue

方法声明: public int getNewValue()

方法签名: ()I

> Gets the new value of the statistic.
>
> @return the new value of the statistic

#### getEntityType

方法声明: public EntityType getEntityType()

方法签名: ()Lorg/bukkit/entity/EntityType;

> Gets the EntityType if {@link #getStatistic() getStatistic()} is an
>
> entity statistic otherwise returns null.
>
> @return the EntityType of the statistic

#### getMaterial

方法声明: public Material getMaterial()

方法签名: ()Lorg/bukkit/Material;

> Gets the Material if {@link #getStatistic() getStatistic()} is a block
>
> or item statistic otherwise returns null.
>
> @return the Material of the statistic

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