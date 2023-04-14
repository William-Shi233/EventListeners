---
description: InventoryEvent
---

# InventoryEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.inventory.InventoryEvent

### 类描述

> Represents a player related inventory event
> 
> <br>
> 
> 代表与玩家有关的物品栏事件。
> 
> <br>
> 
> 译注：该事件未实现 `getHandlers()` 和 `getHandlerList()` 方法，无法直接监听。

### 方法列表

#### getInventory

方法声明: public Inventory getInventory()

方法签名: ()Lorg/bukkit/inventory/Inventory;

> Gets the primary Inventory involved in this transaction
> 
> @return The upper inventory.
> 
> <br>
> 
> 该方法用于获取涉事物品栏。
> 
> @return 涉事物品栏。返回值是物品栏视图（即上下两个物品栏）中居于上方的物品栏。

#### getViewers

方法声明: public List<HumanEntity> getViewers()

方法签名: ()Ljava/util/List;

> Gets the list of players viewing the primary (upper) inventory involved
> 
> in this event
> 
> @return A list of people viewing.
> 
> <br>
> 
> 该方法返回一个列表，其间存储有全部打开着涉事物品栏（居于上方的物品栏）的玩家。
> 
> @return 打开着涉事物品栏的玩家列表。

#### getView

方法声明: public InventoryView getView()

方法签名: ()Lorg/bukkit/inventory/InventoryView;

> Gets the view object itself
> 
> @return InventoryView
> 
> <br>
> 
> 该方法用于获取涉事物品栏视图（由上下两个物品栏组成）。
> 
> @return 涉事物品栏视图。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;