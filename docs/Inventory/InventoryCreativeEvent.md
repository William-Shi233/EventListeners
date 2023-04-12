---
description: InventoryCreativeEvent
---

# InventoryCreativeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.inventory.InventoryEvent

            =>  org.bukkit.event.inventory.InventoryInteractEvent

                =>  org.bukkit.event.inventory.InventoryClickEvent

                    =>  org.bukkit.event.inventory.InventoryCreativeEvent

### 类描述

> This event is called when a player in creative mode puts down or picks up
>
> an item in their inventory / hotbar and when they drop items from their
>
> Inventory while in creative mode.
>
>
> 
> 当一个处于创造模式下的玩家从创造模式物品栏中拿取物品放入背包，或从背包中拿出物品丢入创造模式物品栏时触发。

### 方法列表

#### getCursor

方法声明: public ItemStack getCursor()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> 译注:无文档。该方法用于获取玩家光标上的物品堆。

#### setCursor

方法声明: public void setCursor(@NotNull ItemStack item)

方法签名: (Lorg/bukkit/inventory/ItemStack;)V

> 译注:无文档。该方法用于设置玩家光标上的物品堆。