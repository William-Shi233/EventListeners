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
> 
> <br>
> 
> 当喷溅型药水被泼洒于一片区域之上时触发。

### 方法列表

#### getEntity

方法声明: public ThrownPotion getEntity()

方法签名: ()Lorg/bukkit/entity/ThrownPotion;

> 译注：无文档。该方法用于获取被掷出的药水瓶实体。
> 
> 本方法完全等同于 `getPotion()` 方法。

#### getPotion

方法声明: public ThrownPotion getPotion()

方法签名: ()Lorg/bukkit/entity/ThrownPotion;

> Gets the potion which caused this event
> 
> @return The thrown potion entity
> 
> <br>
> 
> 该方法用于获取被掷出的药水瓶实体。
> 
> @return 被掷出的药水瓶实体。
> 
> <br>
> 
> 译注：本方法完全等同于 `getEntity()` 方法。

#### getAffectedEntities

方法声明: public Collection<LivingEntity> getAffectedEntities()

方法签名: ()Ljava/util/Collection;

> Retrieves a list of all effected entities
> 
> @return A fresh copy of the affected entity list
> 
> <br>
> 
> 该方法用于获取一个列表，其间存储有全部将会受到药水效果影响的实体。
> 
> @return 将会受到药水效果影响的实体列表的一份副本。
> 
> <br>
> 
> 译注：文档中称本方法的返回值类型为“列表”，但方法签名中返回值为 `Collection` 类型。
> 
> 在 `1.16.5` 版本 `Spigot` 服务端中，本方法返回值是一个 `ArrayList` 。然而本事件不一定是被服务端所触发的。如果由插件实现，则其所提供的集合类型未必是 `ArrayList` 类。因此建议不要随意将本方法的返回值由 `Collection` 转型为 `List` 或 `ArrayList` 。

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
> 
> <br>
> 
> 该方法用于获取某个给定实体受药水影响的程度。此程度由实体位置与药水落地位置之间的距离决定。
> 
> @param entity 传入该参数以确定将要查询哪一个实体受药水效果影响的程度。
> 
> @return 给定实体受药水影响的程度。如果为零，则说明该实体没有受药水影响。如果为一，则说明该实体受到了药水最大程度的影响。
> 
> <br>
> 
> 译注：参见 `Minecraft Wiki` 的相关页面 [https://minecraft.fandom.com/wiki/Splash_Potion#Using](https://minecraft.fandom.com/wiki/Splash_Potion#Using) 可知，实体离喷溅型药水落地的位置越近，受到药水效果的影响越深。对于瞬间治疗、瞬间伤害等瞬间效果而言，离药水落地的位置越近则药效越强（回复或失去的生命值越多）。对于非瞬间生效的药水效果而言，离药水落地的位置越近则药效持续的时间越长，但不论距离落地位置多远，药水效果的等级都是一致的。

#### setIntensity

方法声明: public void setIntensity(@NotNull LivingEntity entity, double intensity)

方法签名: (Lorg/bukkit/entity/LivingEntity;D)V

> Overwrites the intensity for a given entity
> 
> @param entity For which entity to define a new intensity
> 
> @param intensity relative to maximum effect
> 
> <br>
> 
> 该方法用于设置某个给定实体受药水影响的程度。
> 
> @param entity 传入该参数以确定将要设置哪一个实体受药水效果影响的程度。
> 
> @param intensity 给定实体受药水影响的程度。

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