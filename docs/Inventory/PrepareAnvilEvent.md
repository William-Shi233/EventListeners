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
> 
> <br>
> 
> 当有物品堆被放入铁砧，即将被修复耐久时触发。

### 方法列表

#### getInventory

方法声明: public AnvilInventory getInventory()

方法签名: ()Lorg/bukkit/inventory/AnvilInventory;

> 译注：无文档。该方法用于获取事件中的铁砧物品栏。

#### getResult

方法声明: public ItemStack getResult()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Get result item, may be null.
> 
> @return result item
> 
> <br>
> 
> 该方法用于获取铁砧操作后的结果物品堆。返回值可能为 `null` 。
> 
> @return 铁砧操作后的结果物品堆。

#### setResult

方法声明: public void setResult(@Nullable ItemStack result)

方法签名: (Lorg/bukkit/inventory/ItemStack;)V

> 译注：无文档。该方法用于设置铁砧操作后的结果物品堆。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;