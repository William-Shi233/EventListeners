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
>
> 当世界时间因为种种原因快进时触发。
>
> 如果本事件被取消，则世界时间保持不变。

### 方法列表

#### getSkipReason

方法声明: public SkipReason getSkipReason()

方法签名: ()Lorg/bukkit/event/world/TimeSkipEvent/SkipReason;

> Gets the reason why the time has skipped.
>
> @return a SkipReason value detailing why the time has skipped
>
> 该方法用于获取时间快进的原因。
>
> @return 一个 `SkipReason` 枚举的值，用于确定时间快进的详细原因。

#### getSkipAmount

方法声明: public long getSkipAmount()

方法签名: ()J

> Gets the amount of time that was skipped.
>
> @return Amount of time skipped
>
> 该方法用于获取时间快进的量。
>
> @return 时间快进的量。

#### setSkipAmount

方法声明: public void setSkipAmount(long skipAmount)

方法签名: (J)V

> Sets the amount of time to skip.
>
> @param skipAmount Amount of time to skip
> 
> 该方法用于设置时间快进的量。
> 
> @param skipAmount 时间快进的量。

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
> 
> 用于确定时间快进原因的枚举。

#### COMMAND

> When time is changed using the vanilla /time command.
>
> 使用原版指令 `/time` 导致快进。

#### CUSTOM

> When time is changed by a plugin.
>
> 插件修改了时间。

#### NIGHT_SKIP

> When time is changed by all players sleeping in their beds and the
>
> night skips.
>
> 所有玩家都在床上睡觉，加速度过夜晚。
>
> 译注：由于 `playersSleepingPercentage` 这一 `GameRule` 的存在，加速度过夜晚未必要求所有玩家都睡觉，只需要高于某个百分比的玩家在睡觉即可，原版默认为 `100%` 。