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

### 方法列表

#### getCursor

方法声明: public ItemStack getCursor()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

#### setCursor

方法声明: public void setCursor(@NotNull ItemStack item)

方法签名: (Lorg/bukkit/inventory/ItemStack;)V