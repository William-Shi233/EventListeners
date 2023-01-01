---
description: BrewingStandFuelEvent
---

# BrewingStandFuelEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.inventory.BrewingStandFuelEvent

### 类描述

> Called when an ItemStack is about to increase the fuel level of a brewing
>
> stand.

### 方法列表

#### getFuel

方法声明: public ItemStack getFuel()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the ItemStack of the fuel before the amount was subtracted.
>
> @return the fuel ItemStack

#### getFuelPower

方法声明: public int getFuelPower()

方法签名: ()I

> Gets the fuel power for this fuel. Each unit of power can fuel one
>
> brewing operation.
>
> @return the fuel power for this fuel

#### setFuelPower

方法声明: public void setFuelPower(int fuelPower)

方法签名: (I)V

> Sets the fuel power for this fuel. Each unit of power can fuel one
>
> brewing operation.
>
> @param fuelPower the fuel power for this fuel

#### isConsuming

方法声明: public boolean isConsuming()

方法签名: ()Z

> Gets whether the brewing stand's fuel will be reduced / consumed or not.
>
> @return whether the fuel will be reduced or not

#### setConsuming

方法声明: public void setConsuming(boolean consuming)

方法签名: (Z)V

> Sets whether the brewing stand's fuel will be reduced / consumed or not.
>
> @param consuming whether the fuel will be reduced or not

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