---
description: EntityRegainHealthEvent
---

# EntityRegainHealthEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityRegainHealthEvent

### 类描述

> Stores data for health-regain events

### 方法列表

#### getAmount

方法声明: public double getAmount()

方法签名: ()D

> Gets the amount of regained health
>
> @return The amount of health regained

#### setAmount

方法声明: public void setAmount(double amount)

方法签名: (D)V

> Sets the amount of regained health
>
> @param amount the amount of health the entity will regain

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getRegainReason

方法声明: public RegainReason getRegainReason()

方法签名: ()Lorg/bukkit/event/entity/EntityRegainHealthEvent/RegainReason;

> Gets the reason for why the entity is regaining health
>
> @return A RegainReason detailing the reason for the entity regaining
>
> health

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: RegainReason

> An enum to specify the type of health regaining that is occurring

#### REGEN

> When a player regains health from regenerating due to Peaceful mode
>
> (difficulty=0)

#### SATIATED

> When a player regains health from regenerating due to their hunger
>
> being satisfied

#### EATING

> When a player regains health from eating consumables

#### ENDER_CRYSTAL

> When an ender dragon regains health from an ender crystal

#### MAGIC

> When a player is healed by a potion or spell

#### MAGIC_REGEN

> When a player is healed over time by a potion or spell

#### WITHER_SPAWN

> When a wither is filling its health during spawning

#### WITHER

> When an entity is damaged by the Wither potion effect

#### CUSTOM

> Any other reason not covered by the reasons above

> > An enum to specify the type of health regaining that is occurring