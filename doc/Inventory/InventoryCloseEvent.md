---
description: InventoryCloseEvent
---

# InventoryCloseEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.inventory.InventoryEvent

            =>  org.bukkit.event.inventory.InventoryCloseEvent

### 类描述

> Represents a player related inventory event
>
> 代表与玩家有关的物品栏事件。
>
> 译注：本事件文档与 `InventoryEvent` 一致，必是舛错。本事件在玩家关闭物品栏时触发。

### 方法列表

#### getPlayer

方法声明: public final HumanEntity getPlayer()

方法签名: ()Lorg/bukkit/entity/HumanEntity;

> Returns the player involved in this event
>
> @return Player who is involved in this event
>
> 该方法用于获取事件中的玩家。
>
> @return 事件中的玩家。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;