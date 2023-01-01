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

### 方法列表

#### getFuel

方法声明: public ItemStack getFuel()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the fuel ItemStack for this event
>
> @return the fuel ItemStack

#### getBurnTime

方法声明: public int getBurnTime()

方法签名: ()I

> Gets the burn time for this fuel
>
> @return the burn time for this fuel

#### setBurnTime

方法声明: public void setBurnTime(int burnTime)

方法签名: (I)V

> Sets the burn time for this fuel
>
> @param burnTime the burn time for this fuel

#### isBurning

方法声明: public boolean isBurning()

方法签名: ()Z

> Gets whether the furnace's fuel is burning or not.
>
> @return whether the furnace's fuel is burning or not.

#### setBurning

方法声明: public void setBurning(boolean burning)

方法签名: (Z)V

> Sets whether the furnace's fuel is burning or not.
>
> @param burning true if the furnace's fuel is burning

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