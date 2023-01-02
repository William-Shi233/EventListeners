---
description: WeatherChangeEvent
---

# WeatherChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.weather.WeatherEvent

            =>  org.bukkit.event.weather.WeatherChangeEvent

### 类描述

> Stores data for weather changing in a world
>
> 本事件存储了世界中天气改换的有关数据。
>
> 译注：事件不是用来完成数据的持久化存储的。此处所谓“存储”意为事件的字段中含有一些与事件中天气有关的信息，该事件从服务端底层得到这些信息，存储于一些字段中，再给插件进行读取。当插件处理完毕以后，事件对象应该被销毁。不能使用事件对象来对数据进行保存。
>
> 参见 `MineCraft Wiki` 中有关雷暴的页面 [https://minecraft.fandom.com/wiki/Thunderstorm#Thunder](https://minecraft.fandom.com/wiki/Thunderstorm#Thunder) 可知，世界天气只有“下雨”和“晴天”两种，雷暴是一种单独计算的状态。详见 `ThunderChangeEvent` 译注。由于只有下雨和晴天两种状态，因此本事件与 `ThunderChangeEvent` 一样，也使用布尔值表示天气。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### toWeatherState

方法声明: public boolean toWeatherState()

方法签名: ()Z

> Gets the state of weather that the world is being set to
>
> @return true if the weather is being set to raining, false otherwise
>
> 该方法用于获取世界将要切换为何种天气。
>
> @return 如果将要切换为下雨则返回 `true` ，否则返回 `false` 。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;