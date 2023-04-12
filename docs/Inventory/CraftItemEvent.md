---
description: CraftItemEvent
---

# CraftItemEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.inventory.InventoryEvent

            =>  org.bukkit.event.inventory.InventoryInteractEvent

                =>  org.bukkit.event.inventory.InventoryClickEvent

                    =>  org.bukkit.event.inventory.CraftItemEvent

### 类描述

> Called when the recipe of an Item is completed inside a crafting matrix.
> 
> <p>
> 
> 当玩家在合成矩阵中合成物品时触发。
> 
> <p>
> 
> 译注：所谓“合成矩阵”，指工作台物品栏、玩家背包等界面上由 `9` 个或 `4` 个格子组成的正方形区域。在玩家背包界面合成物品或在工作台上合成物品都会触发本事件。

### 方法列表

#### getRecipe

方法声明: public Recipe getRecipe()

方法签名: ()Lorg/bukkit/inventory/Recipe;

> @return A copy of the current recipe on the crafting matrix.
> 
> <p>
> 
> @return 合成所使用的配方对象的副本。

#### getInventory

方法声明: public CraftingInventory getInventory()

方法签名: ()Lorg/bukkit/inventory/CraftingInventory;

> 译注：无文档。该方法用于获取合成时使用的物品栏。