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

### 方法列表

#### getDismounted

方法声明: public Entity getDismounted()

方法签名: ()Lorg/bukkit/entity/Entity;

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