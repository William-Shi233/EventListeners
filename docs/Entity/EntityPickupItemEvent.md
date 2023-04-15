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
> 
> <br>
> 
> 当实体自地上捡起一件物品时触发。

### 方法列表

#### getEntity

方法声明: public LivingEntity getEntity()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

> 译注：无文档。该方法用于获取捡起物品的实体。

#### getItem

方法声明: public Item getItem()

方法签名: ()Lorg/bukkit/entity/Item;

> Gets the Item picked up by the entity.
> 
> @return Item
> 
> <br>
> 
> 该方法用于获取被捡起的物品堆实体。
> 
> @return 被捡起的物品堆实体。

#### getRemaining

方法声明: public int getRemaining()

方法签名: ()I

> Gets the amount remaining on the ground, if any
> 
> @return amount remaining on the ground
> 
> <br>
> 
> 该方法用于获取地上剩余的物品堆数量（如存在）。
> 
> @return 地上剩余的物品堆数量。

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