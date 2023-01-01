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

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

> @deprecated horse jumping was moved client side.

#### getEntity

方法声明: public AbstractHorse getEntity()

方法签名: ()Lorg/bukkit/entity/AbstractHorse;

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

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;