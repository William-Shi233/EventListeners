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
> <p>
> 
> 代表与世界有关的事件。
> 
> <p>
> 
> 译注：该事件未实现 `getHandlers` 和 `getHandlerList` 方法，无法直接监听。

### 方法列表

#### getWorld

方法声明: public World getWorld()

方法签名: ()Lorg/bukkit/World;

> Gets the world primarily involved with this event
> 
> @return World which caused this event
> 
> <p>
> 
> 获取事件中所涉的世界。
> 
> @return 触发事件的世界。�