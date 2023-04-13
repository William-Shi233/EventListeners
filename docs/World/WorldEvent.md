---
description: WorldEvent
---

# WorldEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.world.WorldEvent

### 类描述

> Represents events within a world
> 
> <br>
> 
> 代表与世界有关的事件。
> 
> <br>
> 
> 译注：该事件未实现 `getHandlers()` 和 `getHandlerList()` 方法，无法直接监听。

### 方法列表

#### getWorld

方法声明: public World getWorld()

方法签名: ()Lorg/bukkit/World;

> Gets the world primarily involved with this event
> 
> @return World which caused this event
> 
> <br>
> 
> 该方法用于获取涉事世界。
> 
> @return 涉事世界。