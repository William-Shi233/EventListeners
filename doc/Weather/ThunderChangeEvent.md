---
description: ThunderChangeEvent
---

# ThunderChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.weather.WeatherEvent

            =>  org.bukkit.event.weather.ThunderChangeEvent

### 类描述

> Stores data for thunder state changing in a world

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### toThunderState

方法声明: public boolean toThunderState()

方法签名: ()Z

> Gets the state of thunder that the world is being set to
>
> @return true if the weather is being set to thundering, false otherwise

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;