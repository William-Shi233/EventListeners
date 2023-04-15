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
> 
> <br>
> 
> 当实体将某个生物作为其目标时触发。只有目标是生物（有生命实体）时才会触发本事件。
> 
> <br>
> 
> 译注：文档有误。所谓“and can only target LivingEntity's”，词不成句。其意当为“如果目标是无生命实体，则不会触发本事件”。

### 方法列表

#### getTarget

方法声明: public LivingEntity getTarget()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

> 译注：无文档。该方法用于获取涉事实体的新目标。

#### setTarget

方法声明: public void setTarget(@Nullable Entity target)

方法签名: (Lorg/bukkit/entity/Entity;)V

> Set the Entity that you want the mob to target.
> 
> It is possible to be null, null will cause the entity to be
> 
> target-less.
> 
> Must be a LivingEntity, or null.
> 
> @param target The entity to target
> 
> <br>
> 
> 该方法用于设置涉事实体的新目标。
> 
> 本方法可以传入 `null` 作为参数，此时涉事实体将会失去目标。
> 
> 本方法只接受 `null` 或 `LivingEntity` 类型的对象作为参数。
> 
> @param target 涉事实体的新目标。