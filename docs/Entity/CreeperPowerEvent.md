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
> If a Creeper Power event is cancelled, the Creeper will not be powered.
>
> 当苦力怕被闪电击中，生成闪电苦力怕时触发。
>
> 如果本事件被取消，苦力怕将不会被充能，无法成为闪电苦力怕。
>
> 译注：除了闪电击中外，如果有插件调用 `Creeper#setPowered(boolean)` 方法并传入 `true` ，使一只普通苦力怕得到能量，变为闪电苦力怕，也会触发本事件。如果有插件调用 `Creeper#setPowered(boolean)` 方法并传入 `false` ，使一只闪电苦力怕失去能量，变为普通苦力怕，也会触发本事件。
>
> 上述 `Creeper#setPowered(boolean)` 方法不会对苦力怕的当前充能状态和传入的参数进行任何校验，因此对一只闪电苦力怕调用该方法并传入 `true` ，不会有任何能量变化，但也会触发本事件。对普通苦力怕调用该方法并传入 `false` 也会触发本事件。
> 
> 只要调用上述方法时传入了 `true` 则 `getCause()` 方法一定会返回 `CreeperPowerEvent.SET_ON` ，无关于苦力怕原先的状态。传入 `false` 则一定会得到 `CreeperPowerEvent.SET_OFF` ，也无关于苦力怕原先的状态。

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

> 译注：无文档。该方法用于获取被充能的苦力怕。

#### getLightning

方法声明: public LightningStrike getLightning()

方法签名: ()Lorg/bukkit/entity/LightningStrike;

> Gets the lightning bolt which is striking the Creeper.
>
> @return The Entity for the lightning bolt which is striking the Creeper
>
> 该方法用于获取击中了苦力怕的闪电。
>
> @return 击中了苦力怕的闪电实体对象。

#### getCause

方法声明: public PowerCause getCause()

方法签名: ()Lorg/bukkit/event/entity/CreeperPowerEvent/PowerCause;

> Gets the cause of the creeper being (un)powered.
>
> @return A PowerCause value detailing the cause of change in power.
>
> 该方法用于获取苦力怕被充能或失去充能状态的原因。
>
> @return 苦力怕的能量发生变动的原因。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: PowerCause

> An enum to specify the cause of the change in power
>
> 用于确定苦力怕的能量发生变动的原因的枚举。

#### LIGHTNING

> Power change caused by a lightning bolt
>
> Powered state: true
>
> 由于被闪电击中，能量发生变化。
>
> 最终结果是苦力怕将会被充能。

#### SET_ON

> Power change caused by something else (probably a plugin)
>
> Powered state: true
>
> 由于受到某些其他因素影响（很可能是插件），能量发生变化。
>
> 最终结果是苦力怕将会被充能。

#### SET_OFF

> Power change caused by something else (probably a plugin)
>
> Powered state: false
>
> 由于受到某些其他因素影响（很可能是插件），能量发生变化。
>
> 最终结果是苦力怕将会失去能量，由闪电苦力怕变回普通苦力怕。