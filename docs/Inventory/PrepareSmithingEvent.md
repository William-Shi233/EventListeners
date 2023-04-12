---
description: PrepareSmithingEvent
---

# PrepareSmithingEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.inventory.InventoryEvent

            =>  org.bukkit.event.inventory.PrepareSmithingEvent

### 类描述

> Called when an item is put in a slot for upgrade by a Smithing Table.
> 
> <br>
> 
> 当某个物品堆被置于锻造台上，即将被玩家使用下界合金升级时触发。

### 方法列表

#### getInventory

方法声明: public SmithingInventory getInventory()

方法签名: ()Lorg/bukkit/inventory/SmithingInventory;

> 译注：无文档。该方法用于获取锻造所使用的物品栏对象。

#### getResult

方法声明: public ItemStack getResult()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Get result item, may be null.
> 
> @return result item
> 
> <br>
> 
> 该方法用于获取锻造的结果物品堆。本方法的返回值可能为 `null` 。
> 
> @return 锻造的结果物品堆。

#### setResult

方法声明: public void setResult(@Nullable ItemStack result)

方法签名: (Lorg/bukkit/inventory/ItemStack;)V

> 译注：无文档。该方法用于设置锻造的结果物品堆。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;