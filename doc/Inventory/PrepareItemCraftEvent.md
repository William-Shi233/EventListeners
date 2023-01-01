---
description: PrepareItemCraftEvent
---

# PrepareItemCraftEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.inventory.InventoryEvent

            =>  org.bukkit.event.inventory.PrepareItemCraftEvent

### 类描述

### 方法列表

#### getRecipe

方法声明: public Recipe getRecipe()

方法签名: ()Lorg/bukkit/inventory/Recipe;

> Get the recipe that has been formed. If this event was triggered by a
>
> tool repair, this will be a temporary shapeless recipe representing the
>
> repair.
>
> @return The recipe being crafted.

#### getInventory

方法声明: public CraftingInventory getInventory()

方法签名: ()Lorg/bukkit/inventory/CraftingInventory;

> @return The crafting inventory on which the recipe was formed.

#### isRepair

方法声明: public boolean isRepair()

方法签名: ()Z

> Check if this event was triggered by a tool repair operation rather
>
> than a crafting recipe.
>
> @return True if this is a repair.

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;