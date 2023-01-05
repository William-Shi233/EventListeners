---
description: RaidEvent
---

# RaidEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.world.WorldEvent

            =>  org.bukkit.event.raid.RaidEvent

### 类描述

> Represents events related to raids.
>
> 代表与袭击有关的事件。
>
> 译注：该事件未实现 `getHandlers` 和 `getHandlerList` 方法，无法直接监听。

### 方法列表

#### getRaid

方法声明: public Raid getRaid()

方法签名: ()Lorg/bukkit/Raid;

> Returns the raid involved with this event.
>
> @return Raid
>
> 获取事件中的袭击。
>
> @return 触发事件的袭击。