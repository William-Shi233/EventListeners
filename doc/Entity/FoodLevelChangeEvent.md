---
description: FoodLevelChangeEvent
---

# FoodLevelChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.FoodLevelChangeEvent

### 类描述

> Called when a human entity's food level changes

### 方法列表

#### getEntity

方法声明: public HumanEntity getEntity()

方法签名: ()Lorg/bukkit/entity/HumanEntity;

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item that triggered this event, if any.
>
> @return an ItemStack for the item being consumed

#### getFoodLevel

方法声明: public int getFoodLevel()

方法签名: ()I

> Gets the resultant food level that the entity involved in this event
>
> should be set to.
>
> <p>
>
> Where 20 is a full food bar and 0 is an empty one.
>
> @return The resultant food level

#### setFoodLevel

方法声明: public void setFoodLevel(int level)

方法签名: (I)V

> Sets the resultant food level that the entity involved in this event
>
> should be set to
>
> @param level the resultant food level that the entity involved in this
>
> event should be set to

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