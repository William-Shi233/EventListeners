---
description: EntityMountEvent
---

# EntityMountEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.spigotmc.event.entity.EntityMountEvent

### 类描述

> Called when an entity attempts to ride another entity.
>
>
> 
> 当某实体尝试骑乘另一实体时触发。

### 方法列表

#### getMount

方法声明: public Entity getMount()

方法签名: ()Lorg/bukkit/entity/Entity;

> 译注：无文档。该方法用于获取被骑乘的实体。

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