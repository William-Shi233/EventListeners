---
description: EntityDismountEvent
---

# EntityDismountEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.spigotmc.event.entity.EntityDismountEvent

### 类描述

> Called when an entity stops riding another entity.
> 
> <br>
> 
> 当实体退出骑乘状态，自另一实体身上离开时触发。

### 方法列表

#### getDismounted

方法声明: public Entity getDismounted()

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