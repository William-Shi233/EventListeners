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
> 
> <br>
> 
> 当袭击中止时触发。
> 
> <br>
> 
> 译注：当一次袭击中止（比如游戏难度切换为和平）时，会触发 `RaidStopEvent` ，然后结束，不会触发 `RaidFinishEvent` 。触发情况详列于下方。
> 
> 当一次袭击失败（袭击中心不在村庄范围内且已生成过至少一波袭击者）时，会触发 `RaidFinishEvent` ，此时 `RaidFinishEvent#getWinners()` 方法返回空列表，不会触发 `RaidStopEvent` 。
> 
> 当一次袭击胜利时，会先触发 `RaidFinishEvent` ，然后进行庆祝倒计时，庆祝完毕后触发 `RaidStopEvent` 。
> 
> 就袭击中止原因而言，一共有五种。与 `RaidStopEvent.Reason` 枚举项一一对应。
> 
> 其一是游戏难度被设为和平。和平状态下不能生成怪物，遑论产生袭击。
> 
> 其二是袭击持续时间过久。参见 `MineCraft Wiki` 中的相关页面 [https://minecraft.fandom.com/wiki/Raid#Expiring](https://minecraft.fandom.com/wiki/Raid#Expiring) 可知，当袭击持续了现实世界中的四十分钟以后，如果还没有胜利或失败，会中止。
> 
> 其三是袭击结束。袭击胜利时，先触发 `RaidFinishEvent` ，然后进行庆祝倒计时，庆祝完毕后触发 `RaidStopEvent` 。
> 
> 其四是无法找到合适位置生成袭击者。详见 `RaidSpawnWaveEvent` 译注。如果三次确定袭击者生成位置的尝试均失败，则袭击中止。
> 
> 其五是袭击中心不在村庄范围内。此时如果生成过至少一波袭击者，则判定为袭击失败，直接触发 `RaidFinishEvent` ，不会触发 `RaidStopEvent` 。如果袭击中心不属于任何村庄范围，且没有生成过袭击者，则触发 `RaidStopEvent` ，袭击中止。

### 方法列表

#### getReason

方法声明: public Reason getReason()

方法签名: ()Lorg/bukkit/event/raid/RaidStopEvent/Reason;

> Returns the stop reason.
> 
> @return Reason
> 
> <br>
> 
> 该方法用于获取袭击中止的原因。
> 
> @return 一个 `Reason` 枚举字段，用于确定袭击中止的详细原因。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: Reason

> 译注：无文档。该类系用于确定袭击中止原因的枚举。

#### PEACE

> Because the difficulty has been changed to peaceful.
> 
> <br>
> 
> 游戏难度被设置为和平。
> 
> <br>
> 
> 译注：见上。

#### TIMEOUT

> The raid took a long time without a final result.
> 
> <br>
> 
> 袭击旷日持久，并且没有最终结果。
> 
> <br>
> 
> 译注：见上。

#### FINISHED

> Finished the raid.
> 
> <br>
> 
> 袭击结束。
> 
> <br>
> 
> 译注：见上。

#### UNSPAWNABLE

> Couldn't find a suitable place to spawn raiders.
> 
> <br>
> 
> 无法找到合适位置生成袭击者。
> 
> <br>
> 
> 译注：见上。

#### NOT_IN_VILLAGE

> The place where the raid occurs no longer be a village.
> 
> <br>
> 
> 袭击发生处已经不再位于村庄范围内。
> 
> <br>
> 
> 译注：见上。