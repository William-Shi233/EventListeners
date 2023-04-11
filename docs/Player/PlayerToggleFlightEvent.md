---
description: PlayerToggleFlightEvent
---

# PlayerToggleFlightEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerToggleFlightEvent

### 类描述

> Called when a player toggles their flying state
>
> 当玩家切换飞行状态时触发。
>
> 译注：所谓“切换飞行状态”，指玩家连续按下两次空格键，进入或退出飞行状态。

### 方法列表

#### isFlying

方法声明: public boolean isFlying()

方法签名: ()Z

> Returns whether the player is trying to start or stop flying.
>
> @return flying state
>
> 该方法用于获取玩家将要开始飞行还是取消飞行。
>
> @return 飞行状态。
>
> 译注：如果玩家即将开始飞行，则返回 `true` 。
> 
> 该方法的文档是准确的。`PlayerToggleFlightEvent` 、`PlayerToggleSneakEvent` 、`PlayerToggleSprintEvent` 三者的文档，仅有第一个事件（ `PlayerToggleFlightEvent` ）是准确的。

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