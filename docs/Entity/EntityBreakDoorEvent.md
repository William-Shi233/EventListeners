---
description: EntityBreakDoorEvent
---

# EntityBreakDoorEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityChangeBlockEvent

                =>  org.bukkit.event.entity.EntityBreakDoorEvent

### 类描述

> Called when an {@link Entity} breaks a door
> 
> Cancelling the event will cause the event to be delayed
> 
> <p>
> 
> 当实体击破一扇门时触发。
> 
> 如果本事件被取消，实体破门而入的进程将会被延缓。

### 方法列表

#### getEntity

方法声明: public LivingEntity getEntity()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

> 译注：无文档。该方法用于获取事件中破门而入的实体。