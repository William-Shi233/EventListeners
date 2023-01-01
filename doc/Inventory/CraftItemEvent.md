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

### 方法列表

#### getRecipe

方法声明: public Recipe getRecipe()

方法签名: ()Lorg/bukkit/inventory/Recipe;

> @return A copy of the current recipe on the crafting matrix.

#### getInventory

方法声明: public CraftingInventory getInventory()

方法签名: ()Lorg/bukkit/inventory/CraftingInventory;