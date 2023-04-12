---
description: SmithItemEvent
---

# SmithItemEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.inventory.InventoryEvent

            =>  org.bukkit.event.inventory.InventoryInteractEvent

                =>  org.bukkit.event.inventory.InventoryClickEvent

                    =>  org.bukkit.event.inventory.SmithItemEvent

### 类描述

> Called when the recipe of an Item is completed inside a smithing table.
> 
> <br>
> 
> 当玩家在锻造台内使用下界合金升级物品堆时触发。

### 方法列表

#### getInventory

方法声明: public SmithingInventory getInventory()

方法签名: ()Lorg/bukkit/inventory/SmithingInventory;

> 译注：无文档。该方法用于获取锻造所使用的物品栏对象。