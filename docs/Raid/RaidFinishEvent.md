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
> 
> <br>
> 
> 当袭击以明确结果结束时触发。
> 
> <br>
> 
> 译注：当一次袭击中止（比如游戏难度切换为和平）时，会触发 `RaidStopEvent` ，然后结束，不会触发 `RaidFinishEvent` 。详见 `RaidStopEvent` 译注。
> 
> 当一次袭击失败（袭击中心不在村庄范围内且已生成过至少一波袭击者）时，会触发 `RaidFinishEvent` ，此时 `getWinners()` 方法返回空列表，不会触发 `RaidStopEvent` 。
> 
> 当一次袭击胜利时，会先触发 `RaidFinishEvent` ，然后进行庆祝倒计时，庆祝完毕后触发 `RaidStopEvent` 。

### 方法列表

#### getWinners

方法声明: public List<Player> getWinners()

方法签名: ()Ljava/util/List;

> Returns an immutable list contains all winners.
> 
> <b>Note: Players who are considered as heroes but were not online at the
> 
> end would not be included in this list.</b>
> 
> @return winners
> 
> <br>
> 
> 该方法用于获取一个不可修改列表，其间存储有全部获胜的玩家。
> 
> 注意，如果有玩家被视为村庄英雄们的一员，但袭击结束时不在线，那么该名玩家不会出现在此列表中。
> 
> @return 获胜玩家列表。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;