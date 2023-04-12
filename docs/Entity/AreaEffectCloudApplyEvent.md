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
> 
> <br>
> 
> 当一瓶掷出的滞留型药水所留下的药水云向跻身其间的实体施加药水效果时触发。药水云每隔五个 `tick` 都会对厕身其中的实体施加药水效果。

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

> 译注：无文档。该方法用于获取事件中的药水云实体。

#### getAffectedEntities

方法声明: public List<LivingEntity> getAffectedEntities()

方法签名: ()Ljava/util/List;

> Retrieves a mutable list of the effected entities
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
> 
> <br>
> 
> 该方法用于获取一个可修改的列表，其间存储将要受到药水效果影响的实体。
> 
> 无法保证这个列表中的所有实体都会被施加药水效果。由于 `AreaEffectCloud#getDurationOnUse()` 和 `AreaEffectCloud#getRadiusOnUse()` 等方法的存在，药水云在给其他实体施加药水效果的过程中，可能会消失，导致其未能对影响范围内的全部实体都施加药水效果。
> 
> @return 将要受到药水效果影响的实体列表。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;