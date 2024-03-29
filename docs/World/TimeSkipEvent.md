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
> If the event is cancelled the time will not change.
> 
> <br>
> 
> 当世界时间快进时触发。
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
> <br>
> 
> 该方法用于获取时间快进的原因。
> 
> @return 一个 `SkipReason` 枚举字段，用于确定时间快进的详细原因。

#### getSkipAmount

方法声明: public long getSkipAmount()

方法签名: ()J

> Gets the amount of time that was skipped.
> 
> @return Amount of time skipped
> 
> <br>
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
> <br>
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
> <br>
> 
> 用于确定时间快进原因的枚举。

#### COMMAND

> When time is changed using the vanilla /time command.
> 
> <br>
> 
> 使用原版指令 `/time` 导致快进。

#### CUSTOM

> When time is changed by a plugin.
> 
> <br>
> 
> 插件修改了时间。

#### NIGHT_SKIP

> When time is changed by all players sleeping in their beds and the
> 
> night skips.
> 
> <br>
> 
> 所有玩家都在床上睡觉，加速度过夜晚。
> 
> <br>
> 
> 译注：文档有误。所谓“所有玩家”，未必准确。由于 `playersSleepingPercentage` 这一 `GameRule` 的存在，加速度过夜晚未必要求所有玩家都睡觉，只需要高于某个百分比的玩家在睡觉即可。默认值为百分之百，即必须全部玩家就寝方可加速度过夜晚。因此文档才会称“所有玩家”均就寝方可加速度过夜晚，失之偏颇。