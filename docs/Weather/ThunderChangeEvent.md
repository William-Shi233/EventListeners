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
>
>
> 
> 本事件存储了世界中雷暴状态改换的有关数据。
>
>
> 
> 译注：事件不是用来完成数据的持久化存储的。此处所谓“存储”意为事件的字段中含有一些与事件中闪电有关的信息，该事件从服务端底层得到这些信息，存储于一些字段中，再给插件进行读取。当插件处理完毕以后，事件对象应该被销毁。不能使用事件对象来对数据进行保存。
>
> 在 `MineCraft` 游戏内，雷暴作为一种天气，无法和“下雨”、“晴天”并列。参见 `MineCraft Wiki` 中有关雷暴的页面 [https://minecraft.fandom.com/wiki/Thunderstorm#Thunder](https://minecraft.fandom.com/wiki/Thunderstorm#Thunder) 可知，世界天气只有“下雨”和“晴天”两种，二者在没有指令 `/weather clear` 影响时会交替出现。雷暴是一种单独计算的状态，下雨与晴天两种天气自成循环。只有在雷暴状态下且同时世界是下雨天气，才会引发雷暴。如果世界处于雷暴状态但天气为晴天，则不会发生雷暴。因此本事件中，雷暴状态直接采用布尔值表示处于雷暴状态与否。此页面，中文 `MineCraft Wiki` 质量很差，请参考英语原文。

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
>
>
> 
> 该方法用于获取世界将要切换为何种状态。
>
> @return 如果将要切换为雷暴状态则返回 `true` ，否则返回 `false` 。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;