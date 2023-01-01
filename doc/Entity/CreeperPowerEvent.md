---
description: CreeperPowerEvent
---

# CreeperPowerEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.CreeperPowerEvent

### 类描述

> Called when a Creeper is struck by lightning.
>
> <p>
>
> If a Creeper Power event is cancelled, the Creeper will not be powered.

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getEntity

方法声明: public Creeper getEntity()

方法签名: ()Lorg/bukkit/entity/Creeper;

#### getLightning

方法声明: public LightningStrike getLightning()

方法签名: ()Lorg/bukkit/entity/LightningStrike;

> Gets the lightning bolt which is striking the Creeper.
>
> @return The Entity for the lightning bolt which is striking the Creeper

#### getCause

方法声明: public PowerCause getCause()

方法签名: ()Lorg/bukkit/event/entity/CreeperPowerEvent/PowerCause;

> Gets the cause of the creeper being (un)powered.
>
> @return A PowerCause value detailing the cause of change in power.

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: PowerCause

> An enum to specify the cause of the change in power

#### LIGHTNING

> Power change caused by a lightning bolt
>
> <p>
>
> Powered state: true

#### SET_ON

> Power change caused by something else (probably a plugin)
>
> <p>
>
> Powered state: true

#### SET_OFF

> Power change caused by something else (probably a plugin)
>
> <p>
>
> Powered state: false