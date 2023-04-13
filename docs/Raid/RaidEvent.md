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
> <br>
> 
> 代表与袭击有关的事件。
> 
> <br>
> 
> 译注：该事件未实现 `getHandlers()` 和 `getHandlerList()` 方法，无法直接监听。

### 方法列表

#### getRaid

方法声明: public Raid getRaid()

方法签名: ()Lorg/bukkit/Raid;

> Returns the raid involved with this event.
> 
> @return Raid
> 
> <br>
> 
> 该方法用于获取涉事袭击。
> 
> @return 涉事袭击。