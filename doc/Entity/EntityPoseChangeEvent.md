---
description: EntityPoseChangeEvent
---

# EntityPoseChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityPoseChangeEvent

### 类描述

> Called when an entity changes its pose.
>
> @see Entity#getPose()
>
> 当实体改变自身的姿势时触发。
>
> @see 参见 `Entity#getPose()` 方法。

### 方法列表

#### getPose

方法声明: public Pose getPose()

方法签名: ()Lorg/bukkit/entity/Pose;

> Gets the entity's new pose.
>
> @return the new pose
>
> 该方法用于获取实体的新姿势。
>
> @return 实体的新姿势。
>
> 译注：调用 `Entity#getPose()` 方法可以获取实体原有的姿势。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;