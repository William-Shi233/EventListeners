---
description: ExpBottleEvent
---

# ExpBottleEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.ProjectileHitEvent

                =>  org.bukkit.event.entity.ExpBottleEvent

### 类描述

> Called when a ThrownExpBottle hits and releases experience.

### 方法列表

#### getEntity

方法声明: public ThrownExpBottle getEntity()

方法签名: ()Lorg/bukkit/entity/ThrownExpBottle;

#### getShowEffect

方法声明: public boolean getShowEffect()

方法签名: ()Z

> This method indicates if the particle effect should be shown.
>
> @return true if the effect will be shown, false otherwise

#### setShowEffect

方法声明: public void setShowEffect(final boolean showEffect)

方法签名: (Z)V

> This method sets if the particle effect will be shown.
>
> <p>
>
> This does not change the experience created.
>
> @param showEffect true indicates the effect will be shown, false
>
> indicates no effect will be shown

#### getExperience

方法声明: public int getExperience()

方法签名: ()I

> This method retrieves the amount of experience to be created.
>
> <p>
>
> The number indicates a total amount to be divided into orbs.
>
> @return the total amount of experience to be created

#### setExperience

方法声明: public void setExperience(final int exp)

方法签名: (I)V

> This method sets the amount of experience to be created.
>
> <p>
>
> The number indicates a total amount to be divided into orbs.
>
> @param exp the total amount of experience to be created

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;