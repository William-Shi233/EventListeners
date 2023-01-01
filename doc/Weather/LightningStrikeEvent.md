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

#### getCause

方法声明: public Cause getCause()

方法签名: ()Lorg/bukkit/event/weather/LightningStrikeEvent/Cause;

> Gets the cause of this lightning strike.
>
> @return strike cause

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: Cause

#### COMMAND

> Triggered by the /summon command.

#### CUSTOM

> Triggered by a Plugin.

#### SPAWNER

> Triggered by a Spawner.

#### TRIDENT

> Triggered by an enchanted trident.

#### TRAP

> Triggered by a skeleton horse trap.

#### WEATHER

> Triggered by weather.

#### UNKNOWN

> Unknown trigger.