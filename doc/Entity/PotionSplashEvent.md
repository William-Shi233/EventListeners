---
description: PotionSplashEvent
---

# PotionSplashEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.ProjectileHitEvent

                =>  org.bukkit.event.entity.PotionSplashEvent

### 类描述

> Called when a splash potion hits an area

### 方法列表

#### getEntity

方法声明: public ThrownPotion getEntity()

方法签名: ()Lorg/bukkit/entity/ThrownPotion;

#### getPotion

方法声明: public ThrownPotion getPotion()

方法签名: ()Lorg/bukkit/entity/ThrownPotion;

> Gets the potion which caused this event
>
> @return The thrown potion entity

#### getAffectedEntities

方法声明: public Collection<LivingEntity> getAffectedEntities()

方法签名: ()Ljava/util/Collection;

> Retrieves a list of all effected entities
>
> @return A fresh copy of the affected entity list

#### getIntensity

方法声明: public double getIntensity(@NotNull LivingEntity entity)

方法签名: (Lorg/bukkit/entity/LivingEntity;)D

> Gets the intensity of the potion's effects for given entity; This
>
> depends on the distance to the impact center
>
> @param entity Which entity to get intensity for
>
> @return intensity relative to maximum effect; 0.0: not affected; 1.0:
>
> fully hit by potion effects

#### setIntensity

方法声明: public void setIntensity(@NotNull LivingEntity entity, double intensity)

方法签名: (Lorg/bukkit/entity/LivingEntity;D)V

> Overwrites the intensity for a given entity
>
> @param entity For which entity to define a new intensity
>
> @param intensity relative to maximum effect

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;