---
description: EntityTargetLivingEntityEvent
---

# EntityTargetLivingEntityEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityTargetEvent

                =>  org.bukkit.event.entity.EntityTargetLivingEntityEvent

### 类描述

> Called when an Entity targets a {@link LivingEntity} and can only target
>
> LivingEntity's.

### 方法列表

#### getTarget

方法声明: public LivingEntity getTarget()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

#### setTarget

方法声明: public void setTarget(@Nullable Entity target)

方法签名: (Lorg/bukkit/entity/Entity;)V

> Set the Entity that you want the mob to target.
>
> <p>
>
> It is possible to be null, null will cause the entity to be
>
> target-less.
>
> <p>
>
> Must be a LivingEntity, or null.
>
> @param target The entity to target