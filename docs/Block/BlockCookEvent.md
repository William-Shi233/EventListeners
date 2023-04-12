---
description: BlockCookEvent
---

# BlockCookEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockCookEvent

### 类描述

> Called when an ItemStack is successfully cooked in a block.
> 
> <p>
> 
> 当某物品堆在方块中被烹饪完毕时触发。

### 方法列表

#### getSource

方法声明: public ItemStack getSource()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the smelted ItemStack for this event
> 
> @return smelting source ItemStack
> 
> <p>
> 
> 该方法用于获取烹饪前的物品堆。
> 
> @return 烹饪前的物品堆。

#### getResult

方法声明: public ItemStack getResult()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the resultant ItemStack for this event
> 
> @return smelting result ItemStack
> 
> <p>
> 
> 该方法用于获取烹饪后的物品堆。
> 
> @return 烹饪后的物品堆。

#### setResult

方法声明: public void setResult(@NotNull ItemStack result)

方法签名: (Lorg/bukkit/inventory/ItemStack;)V

> Sets the resultant ItemStack for this event
> 
> @param result new result ItemStack
> 
> <p>
> 
> 该方法用于设置烹饪后的物品堆。
> 
> @param result 烹饪后的物品堆。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;