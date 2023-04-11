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
>
> 代表与玩家有关的物品栏事件。
>
> 译注：本事件文档与 `InventoryEvent` 一致，必是舛错。本事件在玩家打开物品栏时触发。
>
> 玩家打开自己的背包时，不会触发本事件。打开自己的物品栏是纯粹的客户端行为。

### 方法列表

#### getPlayer

方法声明: public final HumanEntity getPlayer()

方法签名: ()Lorg/bukkit/entity/HumanEntity;

> Returns the player involved in this event
>
> @return Player who is involved in this event
>
> 该方法用于获取事件中打开物品栏的玩家。
>
> @return 事件中打开物品栏的玩家。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

> Gets the cancellation state of this event. A cancelled event will not
>
> be executed in the server, but will still pass to other plugins.
>
> If an inventory open event is cancelled, the inventory screen will not
>
> show.
>
> @return true if this event is cancelled
>
> 如果本事件被取消，则玩家客户端将不会显示物品栏界面。
>
> @return 如事件被取消，则返回 `true` 。
>
> 译注：原文第一段为所有 `isCancelled` 方法共用的文档，不赘。

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

> Sets the cancellation state of this event. A cancelled event will not
>
> be executed in the server, but will still pass to other plugins.
>
> If an inventory open event is cancelled, the inventory screen will not
>
> show.
>
> @param cancel true if you wish to cancel this event
>
> 如果本事件被取消，则玩家客户端将不会显示物品栏界面。
>
> @param cancel 如欲取消此事件，则传入 `true` 。
>
> 译注：原文第一段为所有 `setCancelled` 方法共用的文档，不赘。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;