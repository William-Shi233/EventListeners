---
description: ProjectileLaunchEvent
---

# ProjectileLaunchEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntitySpawnEvent

                =>  org.bukkit.event.entity.ProjectileLaunchEvent

### 类描述

> Called when a projectile is launched.
>
>
> 
> 当抛射物被发射时触发。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getEntity

方法声明: public Projectile getEntity()

方法签名: ()Lorg/bukkit/entity/Projectile;

> 译注：无文档。该方法用于获取被发射的抛射物。