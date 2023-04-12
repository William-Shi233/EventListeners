---
description: LightningStrikeEvent
---

# LightningStrikeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.weather.WeatherEvent

            =>  org.bukkit.event.weather.LightningStrikeEvent

### 类描述

> Stores data for lightning striking
> 
> <p>
> 
> 本事件存储了闪电的有关数据。
> 
> <p>
> 
> 译注：事件不是用来完成数据的持久化存储的。此处所谓“存储”意为事件的字段中含有一些与事件中闪电有关的信息，该事件从服务端底层得到这些信息，存储于一些字段中，再给插件进行读取。当插件处理完毕以后，事件对象应该被销毁。不能使用事件对象来对数据进行保存。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getLightning

方法声明: public LightningStrike getLightning()

方法签名: ()Lorg/bukkit/entity/LightningStrike;

> Gets the bolt which is striking the earth.
> 
> @return lightning entity
> 
> <p>
> 
> 该方法用于获取击中地面的闪电实体对象。
> 
> <p>
> 
> @return 闪电实体。

#### getCause

方法声明: public Cause getCause()

方法签名: ()Lorg/bukkit/event/weather/LightningStrikeEvent/Cause;

> Gets the cause of this lightning strike.
> 
> @return strike cause
> 
> <p>
> 
> 该方法用于获取闪电生成的原因。
> 
> <p>
> 
> @return 闪电生成的原因。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: Cause

> 译注：无文档。该类系用于确定闪电生成原因的枚举。

#### COMMAND

> Triggered by the /summon command.
> 
> <p>
> 
> 由于原版指令 `/summon` 导致闪电实体被召唤。

#### CUSTOM

> Triggered by a Plugin.
> 
> <p>
> 
> 由于插件生成了闪电实体。
> 
> <p>
> 
> 译注：如 `World#strikeLightning` 方法等。

#### SPAWNER

> Triggered by a Spawner.
> 
> <p>
> 
> 由于刷怪笼生成了闪电实体。

#### TRIDENT

> Triggered by an enchanted trident.
> 
> <p>
> 
> 由于附魔三叉戟生成了闪电实体。
> 
> <p>
> 
> 译注：参见 `MineCraft Wiki` 中的“引雷”页面 [https://minecraft.fandom.com/wiki/Channeling](https://minecraft.fandom.com/wiki/Channeling) 内容可知，此处的附魔当指“引雷”附魔。

#### TRAP

> Triggered by a skeleton horse trap.
> 
> <p>
> 
> 由于骷髅陷阱马导致闪电实体生成。
> 
> <p>
> 
> 译注：参见 `MineCraft Wiki` 有关骷髅马的页面 [https://minecraft.fandom.com/wiki/Skeleton_Horse#Spawning](https://minecraft.fandom.com/wiki/Skeleton_Horse#Spawning) 可知骷髅陷阱马的行为。

#### WEATHER

> Triggered by weather.
> 
> <p>
> 
> 由于雷雨天气导致闪电实体生成。

#### UNKNOWN

> Unknown trigger.
> 
> <p>
> 
> 未知原因。