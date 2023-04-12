---
description: ItemMergeEvent
---

# ItemMergeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.ItemMergeEvent

### 类描述

> 译注：无文档。本事件在两个掉落的物品堆实体数量叠加，合并为一个实体时触发。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancelled)

方法签名: (Z)V

#### getEntity

方法声明: public Item getEntity()

方法签名: ()Lorg/bukkit/entity/Item;

> 译注：无文档。该方法用于获取合并过程中可能会消失的物品堆实体。

#### getTarget

方法声明: public Item getTarget()

方法签名: ()Lorg/bukkit/entity/Item;

> Gets the Item entity the main Item is being merged into.
> 
> @return The Item being merged with
> 
> <br>
> 
> 该方法用于获取合并过程中数量将会增加的物品堆实体。
> 
> @return 合并过程中数量将会增加的物品堆实体。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;