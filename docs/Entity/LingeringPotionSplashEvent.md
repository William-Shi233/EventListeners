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
> 
> <p>
> 
> 当喷溅型药水被泼洒于一片区域之上时触发。
> 
> <p>
> 
> 译注：本事件文档与 `PotionSplashEvent` 一致，不够准确。本事件在滞留型药水被泼洒在一片区域之上时触发。
> 
> 文档中提到“Splash Potion”，其中“Splash”意为喷溅。滞留型药水与喷溅型药水都可以被抛掷，而后喷溅。从这一角度看来，如将“Splash Potion”译作“可被泼洒的药水”，则本文档无误。但是“Splash Potion”在更多情况下系专有名词，仅指喷溅型药水，一般不用于指代滞留型药水。因此本文档不够准确。应当将“Splash Potion”改为“Lingering Potion”。

### 方法列表

#### getEntity

方法声明: public ThrownPotion getEntity()

方法签名: ()Lorg/bukkit/entity/ThrownPotion;

> 译注：无文档。该方法用于获取被掷出的药水瓶实体。

#### getAreaEffectCloud

方法声明: public AreaEffectCloud getAreaEffectCloud()

方法签名: ()Lorg/bukkit/entity/AreaEffectCloud;

> Gets the AreaEffectCloud spawned
> 
> @return The spawned AreaEffectCloud
> 
> <p>
> 
> 该方法用于获取将要生成的药水云实体。
> 
> @return 将要生成的药水云实体。

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