---
description: FurnaceBurnEvent
---

# FurnaceBurnEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.inventory.FurnaceBurnEvent

### 类描述

> Called when an ItemStack is successfully burned as fuel in a furnace.
> 
> <br>
> 
> 当熔炉消耗燃料物品堆时触发。

### 方法列表

#### getFuel

方法声明: public ItemStack getFuel()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the fuel ItemStack for this event
> 
> @return the fuel ItemStack
> 
> <br>
> 
> 该方法用于获取涉事燃料物品堆。
> 
> @return 涉事燃料物品堆。

#### getBurnTime

方法声明: public int getBurnTime()

方法签名: ()I

> Gets the burn time for this fuel
> 
> @return the burn time for this fuel
> 
> <br>
> 
> 该方法用于获取涉事燃料物品堆可以维持燃烧的时间。
> 
> @return 涉事燃料物品堆可以维持燃烧的时间。

#### setBurnTime

方法声明: public void setBurnTime(int burnTime)

方法签名: (I)V

> Sets the burn time for this fuel
> 
> @param burnTime the burn time for this fuel
> 
> <br>
> 
> 该方法用于设置涉事燃料物品堆可以维持燃烧的时间。
> 
> @param burnTime 涉事燃料物品堆可以维持燃烧的时间。

#### isBurning

方法声明: public boolean isBurning()

方法签名: ()Z

> Gets whether the furnace's fuel is burning or not.
> 
> @return whether the furnace's fuel is burning or not.
> 
> <br>
> 
> 该方法用于获取熔炉是否会消耗燃料以保持燃烧。
> 
> @return 熔炉是否会消耗燃料以保持燃烧。

#### setBurning

方法声明: public void setBurning(boolean burning)

方法签名: (Z)V

> Sets whether the furnace's fuel is burning or not.
> 
> @param burning true if the furnace's fuel is burning
> 
> <br>
> 
> 该方法用于获取熔炉是否会消耗燃料以保持燃烧。
> 
> @param burning 如传入 `true` ，则熔炉会消耗燃料以保持燃烧。

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