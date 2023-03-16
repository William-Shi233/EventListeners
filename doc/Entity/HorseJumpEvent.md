---
description: HorseJumpEvent
---

# HorseJumpEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.HorseJumpEvent

### 类描述

> Called when a horse jumps.
>
> 当一匹马跳跃时触发。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

> @deprecated horse jumping was moved client side.
>
> @deprecated 该方法已过时。马的跳跃动作已经是客户端行为了。

#### getEntity

方法声明: public AbstractHorse getEntity()

方法签名: ()Lorg/bukkit/entity/AbstractHorse;

> 译注：无文档。该方法用于获取事件中跳跃的马。

#### getPower

方法声明: public float getPower()

方法签名: ()F

> Gets the power of the jump.
>
> <p>
>
> Power is a value that defines how much of the horse's jump strength
>
> should be used for the jump. Power is effectively multiplied times
>
> the horse's jump strength to determine how high the jump is; 0
>
> represents no jump strength while 1 represents full jump strength.
>
> Setting power to a value above 1 will use additional jump strength
>
> that the horse does not usually have.
>
> <p>
>
> Power does not affect how high the horse is capable of jumping, only
>
> how much of its jumping capability will be used in this jump. To set
>
> the horse's overall jump strength, see {@link
>
> AbstractHorse#setJumpStrength(double)}.
>
> @return jump strength
>
> 该方法用于获取跳跃的能量。
>
> 跳跃的能量决定了马所具备的跳跃能力有几分将要发挥到此次跳跃中去。能量与马的跳跃力量相乘，就决定了此次跳跃所能达到的高度。如果能量为零，则马将无法发挥任何力量。如果能量为一，则马将发挥全部力量。如果有插件将马的能量设为大于一的值，则马将会发挥超乎常规的力量。
>
> 能量不会影响一匹马所能跳过的最大高度，能量只能决定马跳跃的能力将会发挥多少。如果要提高马的跳跃能力，请参见 `bstractHorse#setJumpStrength(double)` 方法。
>
> @return 跳跃的能量。

#### setPower

方法声明: public void setPower(float power)

方法签名: (F)V

> Sets the power of the jump.
>
> <p>
>
> Jump power can be set to a value above 1.0 which will increase the
>
> strength of this jump above the horse's actual jump strength.
>
> <p>
>
> Setting the jump power to 0 will result in the jump animation still
>
> playing, but the horse not leaving the ground. Only canceling this
>
> event will result in no jump animation at all.
>
> @param power power of the jump
>
> @deprecated horse jumping was moved client side.
>
> 该方法设置获取跳跃的能量。
>
> 如果将马的能量设为大于一的值，则马将会发挥超乎常规的力量。
>
> 如果将马的能量设为零，则跳跃动画仍将被播放，但马不会离地。只有取消本事件才能让跳跃动画取消播放。
>
> @param 跳跃的能量。
>
> @deprecated 该方法已过时。马的跳跃动作已经是客户端行为了。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;