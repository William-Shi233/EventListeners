---
description: TimeSkipEvent
---

# TimeSkipEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.world.WorldEvent

            =>  org.bukkit.event.world.TimeSkipEvent

### 类描述

> Called when the time skips in a world.
>
> <p>
>
> If the event is cancelled the time will not change.

### 方法列表

#### getSkipReason

方法声明: public SkipReason getSkipReason()

方法签名: ()Lorg/bukkit/event/world/TimeSkipEvent/SkipReason;

> Gets the reason why the time has skipped.
>
> @return a SkipReason value detailing why the time has skipped

#### getSkipAmount

方法声明: public long getSkipAmount()

方法签名: ()J

> Gets the amount of time that was skipped.
>
> @return Amount of time skipped

#### setSkipAmount

方法声明: public void setSkipAmount(long skipAmount)

方法签名: (J)V

> Sets the amount of time to skip.
>
> @param skipAmount Amount of time to skip

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

### 枚举: SkipReason

> An enum specifying the reason the time skipped.

#### COMMAND

> When time is changed using the vanilla /time command.

#### CUSTOM

> When time is changed by a plugin.

#### NIGHT_SKIP

> When time is changed by all players sleeping in their beds and the
>
> night skips.