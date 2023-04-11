---
description: PlayerToggleSprintEvent
---

# PlayerToggleSprintEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerToggleSprintEvent

### 类描述

> Called when a player toggles their sprinting state
>
> 当玩家切换疾跑状态时触发。
>
> 译注：所谓“切换疾跑状态”，指玩家按下或松开 `W` 键，进入或退出疾跑状态。

### 方法列表

#### isSprinting

方法声明: public boolean isSprinting()

方法签名: ()Z

> Gets whether the player is now sprinting or not.
>
> @return sprinting state
>
> 该方法用于获取玩家当前是否正在疾跑。
>
> @return 疾跑状态。
>
> 译注：文档有误。该方法返回的是玩家是否即将疾跑，不是玩家当前的状态。如果玩家连续按下 `W` 键进入疾跑状态则返回 `true` 。
> 
> 该方法的文档是不准确的。`PlayerToggleFlightEvent` 、`PlayerToggleSneakEvent` 、`PlayerToggleSprintEvent` 三者的文档，仅有第一个事件（ `PlayerToggleFlightEvent` ）是准确的。

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