---
description: PrepareItemCraftEvent
---

# PrepareItemCraftEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.inventory.InventoryEvent

            =>  org.bukkit.event.inventory.PrepareItemCraftEvent

### 类描述

> 译注：无文档。当玩家在工作台或自身背包中，以合乎正确配方的方式摆放物品堆，可以预览合成结果时触发。

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
> 
> <p>
> 
> 该方法用于获取当前的物品堆摆放方式所契合的合成配方。如果本事件是由于玩家尝试将两把工具合二为一，修复耐久度而触发的，则该方法的返回值是一个临时创建的无规则合成配方，用于表示工具修复。

#### getInventory

方法声明: public CraftingInventory getInventory()

方法签名: ()Lorg/bukkit/inventory/CraftingInventory;

> @return The crafting inventory on which the recipe was formed.
> 
> @return 合成所使用的物品栏对象。

#### isRepair

方法声明: public boolean isRepair()

方法签名: ()Z

> Check if this event was triggered by a tool repair operation rather
> 
> than a crafting recipe.
> 
> @return True if this is a repair.
> 
> <p>
> 
> 该方法用于获取本次合成是否是由于玩家尝试将两把工具合二为一，修复耐久度而触发。
> 
> @return 如果是因为修复耐久度而触发，则返回 `true` 。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;