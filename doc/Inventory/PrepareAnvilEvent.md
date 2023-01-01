---
description: PrepareAnvilEvent
---

# PrepareAnvilEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.inventory.InventoryEvent

            =>  org.bukkit.event.inventory.PrepareAnvilEvent

### 类描述

> Called when an item is put in a slot for repair by an anvil.

### 方法列表

#### getInventory

方法声明: public AnvilInventory getInventory()

方法签名: ()Lorg/bukkit/inventory/AnvilInventory;

#### getResult

方法声明: public ItemStack getResult()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Get result item, may be null.
>
> @return result item

#### setResult

方法声明: public void setResult(@Nullable ItemStack result)

方法签名: (Lorg/bukkit/inventory/ItemStack;)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;