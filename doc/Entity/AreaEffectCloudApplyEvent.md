---
description: AreaEffectCloudApplyEvent
---

# AreaEffectCloudApplyEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.AreaEffectCloudApplyEvent

### 类描述

> Called when a lingering potion applies it's effects. Happens
>
> once every 5 ticks

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getEntity

方法声明: public AreaEffectCloud getEntity()

方法签名: ()Lorg/bukkit/entity/AreaEffectCloud;

#### getAffectedEntities

方法声明: public List<LivingEntity> getAffectedEntities()

方法签名: ()Ljava/util/List;

> Retrieves a mutable list of the effected entities
>
> <p>
>
> It is important to note that not every entity in this list
>
> is guaranteed to be effected.  The cloud may die during the
>
> application of its effects due to the depletion of {@link AreaEffectCloud#getDurationOnUse()}
>
> or {@link AreaEffectCloud#getRadiusOnUse()}
>
> @return the affected entity list

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;