---
description: EntityPickupItemEvent
---

# EntityPickupItemEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityPickupItemEvent

### 类描述

> Thrown when a entity picks an item up from the ground

### 方法列表

#### getEntity

方法声明: public LivingEntity getEntity()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

#### getItem

方法声明: public Item getItem()

方法签名: ()Lorg/bukkit/entity/Item;

> Gets the Item picked up by the entity.
>
> @return Item

#### getRemaining

方法声明: public int getRemaining()

方法签名: ()I

> Gets the amount remaining on the ground, if any
>
> @return amount remaining on the ground

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