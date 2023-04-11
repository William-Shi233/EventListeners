---
description: ItemDespawnEvent
---

# ItemDespawnEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.ItemDespawnEvent

### 类描述

> This event is called when a {@link org.bukkit.entity.Item} is removed from
>
> the world because it has existed for 5 minutes.
>
> Cancelling the event results in the item being allowed to exist for 5 more
>
> minutes. This behavior is not guaranteed and may change in future versions.
>
> 当某个掉落的物品堆实体由于存在时间超过五分钟，因而将要被移除时触发。
>
> 目前而言，如果本事件被取消，则该物品堆实体可以在世界上继续存在五分钟。但不能保证未来的新版本中仍然如此。取消本事件所带来的一系列后果可能会在新版本中发生变化。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getEntity

方法声明: public Item getEntity()

方法签名: ()Lorg/bukkit/entity/Item;

> 译注：无文档。该方法用于获取事件中将要消失的物品堆。

#### getLocation

方法声明: public Location getLocation()

方法签名: ()Lorg/bukkit/Location;

> Gets the location at which the item is despawning.
>
> @return The location at which the item is despawning
>
> 该方法用于获取即将消失的物品堆实体所在的位置。
>
> @return 即将消失的物品堆实体所在的位置。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;