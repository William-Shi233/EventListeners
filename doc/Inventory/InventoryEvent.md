---
description: InventoryEvent
---

# InventoryEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.inventory.InventoryEvent

### 类描述

> Represents a player related inventory event

### 方法列表

#### getInventory

方法声明: public Inventory getInventory()

方法签名: ()Lorg/bukkit/inventory/Inventory;

> Gets the primary Inventory involved in this transaction
>
> @return The upper inventory.

#### getViewers

方法声明: public List<HumanEntity> getViewers()

方法签名: ()Ljava/util/List;

> Gets the list of players viewing the primary (upper) inventory involved
>
> in this event
>
> @return A list of people viewing.

#### getView

方法声明: public InventoryView getView()

方法签名: ()Lorg/bukkit/inventory/InventoryView;

> Gets the view object itself
>
> @return InventoryView

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;