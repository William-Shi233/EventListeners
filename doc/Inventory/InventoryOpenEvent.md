---
description: InventoryOpenEvent
---

# InventoryOpenEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.inventory.InventoryEvent

            =>  org.bukkit.event.inventory.InventoryOpenEvent

### 类描述

> Represents a player related inventory event

### 方法列表

#### getPlayer

方法声明: public final HumanEntity getPlayer()

方法签名: ()Lorg/bukkit/entity/HumanEntity;

> Returns the player involved in this event
>
> @return Player who is involved in this event

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

> Gets the cancellation state of this event. A cancelled event will not
>
> be executed in the server, but will still pass to other plugins.
>
> <p>
>
> If an inventory open event is cancelled, the inventory screen will not
>
> show.
>
> @return true if this event is cancelled

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

> Sets the cancellation state of this event. A cancelled event will not
>
> be executed in the server, but will still pass to other plugins.
>
> <p>
>
> If an inventory open event is cancelled, the inventory screen will not
>
> show.
>
> @param cancel true if you wish to cancel this event

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;