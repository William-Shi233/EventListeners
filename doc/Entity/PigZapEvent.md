---
description: PigZapEvent
---

# PigZapEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityTransformEvent

                =>  org.bukkit.event.entity.PigZapEvent

### 类描述

> Stores data for pigs being zapped

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getEntity

方法声明: public Pig getEntity()

方法签名: ()Lorg/bukkit/entity/Pig;

#### getLightning

方法声明: public LightningStrike getLightning()

方法签名: ()Lorg/bukkit/entity/LightningStrike;

> Gets the bolt which is striking the pig.
>
> @return lightning entity

#### getPigZombie

方法声明: public PigZombie getPigZombie()

方法签名: ()Lorg/bukkit/entity/PigZombie;

> Gets the zombie pig that will replace the pig, provided the event is
>
> not cancelled first.
>
> @return resulting entity
>
> @deprecated use {@link EntityTransformEvent#getTransformedEntity()}

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;