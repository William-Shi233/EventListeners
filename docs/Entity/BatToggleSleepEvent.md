---
description: BatToggleSleepEvent
---

# BatToggleSleepEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.BatToggleSleepEvent

### 类描述

> Called when a bat attempts to sleep or wake up from its slumber.
>
> If a Bat Toggle Sleep event is cancelled, the Bat will not toggle its sleep
>
> state.
>
> 当一只蝙蝠从沉睡状态中醒来时，或从清醒状态陷入睡眠时触发。
>
> 如果本事件被取消了，则涉事蝙蝠的状态不会发生变化。
>
> 译注：所谓“状态不会发生变化”，指将要入睡的蝙蝠会保持清醒不再入睡，即将醒来的蝙蝠会继续沉睡。本事件名为“蝙蝠切换睡眠状态事件”，“睡眠状态”包括清醒和沉睡两种，当蝙蝠在二者之间切换时会触发本事件。自编程角度而言，入睡和醒来都可以看作是“睡眠状态”的切换。

### 方法列表

#### isAwake

方法声明: public boolean isAwake()

方法签名: ()Z

> Get whether or not the bat is attempting to awaken.
>
> @return true if trying to awaken, false otherwise
>
> 该方法用于获取蝙蝠是否将要醒来。
>
> @return 如返回 `true` 则代表蝙蝠正从沉睡状态中醒来，否则代表蝙蝠将要入睡。

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;