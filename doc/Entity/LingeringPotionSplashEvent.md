---
description: LingeringPotionSplashEvent
---

# LingeringPotionSplashEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.ProjectileHitEvent

                =>  org.bukkit.event.entity.LingeringPotionSplashEvent

### 类描述

> Called when a splash potion hits an area

### 方法列表

#### getEntity

方法声明: public ThrownPotion getEntity()

方法签名: ()Lorg/bukkit/entity/ThrownPotion;

#### getAreaEffectCloud

方法声明: public AreaEffectCloud getAreaEffectCloud()

方法签名: ()Lorg/bukkit/entity/AreaEffectCloud;

> Gets the AreaEffectCloud spawned
>
> @return The spawned AreaEffectCloud

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