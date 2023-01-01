---
description: RaidFinishEvent
---

# RaidFinishEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.world.WorldEvent

            =>  org.bukkit.event.raid.RaidEvent

                =>  org.bukkit.event.raid.RaidFinishEvent

### 类描述

> This event is called when a {@link Raid} was complete with a clear result.

### 方法列表

#### getWinners

方法声明: public List<Player> getWinners()

方法签名: ()Ljava/util/List;

> Returns an immutable list contains all winners.
>
> <br>
>
> <b>Note: Players who are considered as heroes but were not online at the
>
> end would not be included in this list.</b>
>
> @return winners

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;