---
description: WeatherEvent
---

# WeatherEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.weather.WeatherEvent

### 类描述

> Represents a Weather-related event
> 
> <br>
> 
> 代表与天气有关的事件。
> 
> <br>
> 
> 译注：该事件未实现 `getHandlers()` 和 `getHandlerList()` 方法，无法直接监听。

### 方法列表

#### getWorld

方法声明: public final World getWorld()

方法签名: ()Lorg/bukkit/World;

> Returns the World where this event is occurring
> 
> @return World this event is occurring in
> 
> <br>
> 
> 该方法用于获取涉事世界。
> 
> @return 涉事世界。