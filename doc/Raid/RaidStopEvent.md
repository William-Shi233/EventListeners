---
description: RaidStopEvent
---

# RaidStopEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.world.WorldEvent

            =>  org.bukkit.event.raid.RaidEvent

                =>  org.bukkit.event.raid.RaidStopEvent

### 类描述

> Called when a {@link Raid} is stopped.

### 方法列表

#### getReason

方法声明: public Reason getReason()

方法签名: ()Lorg/bukkit/event/raid/RaidStopEvent/Reason;

> Returns the stop reason.
>
> @return Reason

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: Reason

#### PEACE

> Because the difficulty has been changed to peaceful.

#### TIMEOUT

> The raid took a long time without a final result.

#### FINISHED

> Finished the raid.

#### UNSPAWNABLE

> Couldn't find a suitable place to spawn raiders.

#### NOT_IN_VILLAGE

> The place where the raid occurs no longer be a village.