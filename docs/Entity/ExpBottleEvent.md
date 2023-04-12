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
>
>
> 
> 当一个掷出的经验瓶击中某物，生成经验球时触发。

### 方法列表

#### getEntity

方法声明: public ThrownExpBottle getEntity()

方法签名: ()Lorg/bukkit/entity/ThrownExpBottle;

> 译注：无文档。该方法用于获取事件中的经验瓶实体。

#### getShowEffect

方法声明: public boolean getShowEffect()

方法签名: ()Z

> This method indicates if the particle effect should be shown.
>
> @return true if the effect will be shown, false otherwise
>
>
> 
> 该方法用于获取是否要显示相应粒子效果。
>
> @return 如果将要显示粒子效果，则返回 `true` 。反之则返回 `false` 。

#### setShowEffect

方法声明: public void setShowEffect(final boolean showEffect)

方法签名: (Z)V

> This method sets if the particle effect will be shown.
>
> This does not change the experience created.
>
> @param showEffect true indicates the effect will be shown, false
>
> indicates no effect will be shown
>
>
> 
> 该方法用于设置是否要显示相应粒子效果。
>
> 显示粒子效果与否不会影响经验球的生成量。
>
> @param showEffect 如果将要显示粒子效果，可传入 `true` 。反之则传入 `false` 。

#### getExperience

方法声明: public int getExperience()

方法签名: ()I

> This method retrieves the amount of experience to be created.
>
> The number indicates a total amount to be divided into orbs.
>
> @return the total amount of experience to be created
>
>
> 
> 该方法用于获取将要释放出的经验值总量。
>
> 本方法所返回的经验值总量将会被划分到多个经验球实体中。
>
> @return 将要释放出的经验值总量。

#### setExperience

方法声明: public void setExperience(final int exp)

方法签名: (I)V

> This method sets the amount of experience to be created.
>
> The number indicates a total amount to be divided into orbs.
>
> @param exp the total amount of experience to be created
>
>
> 
> 该方法用于设置将要释放出的经验值总量。
>
> 本方法所传入的经验值总量将会被划分到多个经验球实体中。
>
> @param exp 将要释放出的经验值总量。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;