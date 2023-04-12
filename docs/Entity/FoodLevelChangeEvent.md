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
>
>
> 
> 当玩家饱食度变化时触发。

### 方法列表

#### getEntity

方法声明: public HumanEntity getEntity()

方法签名: ()Lorg/bukkit/entity/HumanEntity;

> 译注：无文档。该方法用于获取饱食度变化的玩家。

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item that triggered this event, if any.
>
> @return an ItemStack for the item being consumed
>
>
> 
> 该方法用于获取引起了饱食度变化的物品堆（如存在）。
>
> @return 引起了饱食度变化的物品堆。

#### getFoodLevel

方法声明: public int getFoodLevel()

方法签名: ()I

> Gets the resultant food level that the entity involved in this event
>
> should be set to.
>
> Where 20 is a full food bar and 0 is an empty one.
>
> @return The resultant food level
>
>
> 
> 该方法用于获取玩家饱食度的新值。
>
> 如果本方法返回二十，说明玩家饱食度将会填满饱食度栏，如果本方法返回零，说明玩家饱食度栏将会变空。
>
> @return 玩家饱食度的新值。

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
>
>
> 
> 该方法用于设置玩家饱食度的新值。
>
> @param level 玩家饱食度的新值。

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