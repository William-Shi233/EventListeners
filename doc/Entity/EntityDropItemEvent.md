---
description: EntityDropItemEvent
---

# EntityDropItemEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityDropItemEvent

### 类描述

> Thrown when an entity creates an item drop.

### 方法列表

#### getItemDrop

方法声明: public Item getItemDrop()

方法签名: ()Lorg/bukkit/entity/Item;

> Gets the Item created by the entity
>
> @return Item created by the entity

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