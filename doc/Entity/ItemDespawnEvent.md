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
> <p>
>
> Cancelling the event results in the item being allowed to exist for 5 more
>
> minutes. This behavior is not guaranteed and may change in future versions.

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

#### getLocation

方法声明: public Location getLocation()

方法签名: ()Lorg/bukkit/Location;

> Gets the location at which the item is despawning.
>
> @return The location at which the item is despawning

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;