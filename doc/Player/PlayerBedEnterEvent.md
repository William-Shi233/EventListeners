---
description: PlayerBedEnterEvent
---

# PlayerBedEnterEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerBedEnterEvent

### 类描述

> This event is fired when the player is almost about to enter the bed.

### 方法列表

#### getBedEnterResult

方法声明: public BedEnterResult getBedEnterResult()

方法签名: ()Lorg/bukkit/event/player/PlayerBedEnterEvent/BedEnterResult;

> This describes the default outcome of this event.
>
> @return the bed enter result representing the default outcome of this event

#### useBed

方法声明: public Result useBed()

方法签名: ()Lorg/bukkit/event/Event/Result;

> This controls the action to take with the bed that was clicked on.
>
> <p>
>
> In case of {@link org.bukkit.event.Event.Result#DEFAULT}, the default outcome is described by
>
> {@link #getBedEnterResult()}.
>
> @return the action to take with the interacted bed
>
> @see #setUseBed(org.bukkit.event.Event.Result)

#### setUseBed

方法声明: public void setUseBed(@NotNull Result useBed)

方法签名: (Lorg/bukkit/event/Event/Result;)V

> Sets the action to take with the interacted bed.
>
> <p>
>
> {@link org.bukkit.event.Event.Result#ALLOW} will result in the player sleeping, regardless of
>
> the default outcome described by {@link #getBedEnterResult()}.
>
> <br>
>
> {@link org.bukkit.event.Event.Result#DENY} will prevent the player from sleeping. This has the
>
> same effect as canceling the event via {@link #setCancelled(boolean)}.
>
> <br>
>
> {@link org.bukkit.event.Event.Result#DEFAULT} will result in the outcome described by
>
> {@link #getBedEnterResult()}.
>
> @param useBed the action to take with the interacted bed
>
> @see #useBed()

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

> Gets the cancellation state of this event. Set to true if you want to
>
> prevent the player from sleeping.
>
> <p>
>
> Canceling the event has the same effect as setting {@link #useBed()} to
>
> {@link org.bukkit.event.Event.Result#DENY}.
>
> <p>
>
> For backwards compatibility reasons this also returns true if
>
> {@link #useBed()} is {@link org.bukkit.event.Event.Result#DEFAULT} and the
>
> {@link #getBedEnterResult() default action} is to prevent bed entering.
>
> @return boolean cancellation state

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

> Sets the cancellation state of this event. A canceled event will not be
>
> executed in the server, but will still pass to other plugins.
>
> <p>
>
> Canceling this event will prevent use of the bed.
>
> @param cancel true if you wish to cancel this event

#### getBed

方法声明: public Block getBed()

方法签名: ()Lorg/bukkit/block/Block;

> Returns the bed block involved in this event.
>
> @return the bed block involved in this event

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: BedEnterResult

> Represents the default possible outcomes of this event.

#### OK

> The player will enter the bed.

#### NOT_POSSIBLE_HERE

> The world doesn't allow sleeping or saving the spawn point (eg,
>
> Nether, The End or Custom Worlds). This is based on
>
> {@link World#isBedWorks()} and {@link World#isNatural()}.
>
> Entering the bed is prevented and if {@link World#isBedWorks()} is
>
> false then the bed explodes.

#### NOT_POSSIBLE_NOW

> Entering the bed is prevented due to it not being night nor
>
> thundering currently.
>
> <p>
>
> If the event is forcefully allowed during daytime, the player will
>
> enter the bed (and set its bed location), but might get immediately
>
> thrown out again.

#### TOO_FAR_AWAY

> Entering the bed is prevented due to the player being too far away.

#### NOT_SAFE

> Entering the bed is prevented due to there being monsters nearby.

#### OTHER_PROBLEM

> Entering the bed is prevented due to there being some other problem.