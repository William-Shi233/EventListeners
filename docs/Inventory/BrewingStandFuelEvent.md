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
> 
> <p>
> 
> 当酿造台的燃料值由于消耗了某物品堆而增加时触发。
> 
> <p>
> 
> 译注：酿造台消耗烈焰粉获得燃料值。

### 方法列表

#### getFuel

方法声明: public ItemStack getFuel()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the ItemStack of the fuel before the amount was subtracted.
> 
> @return the fuel ItemStack
> 
> <p>
> 
> 该方法用于获取数量减少前的燃料物品堆。
> 
> @return 燃料物品堆。

#### getFuelPower

方法声明: public int getFuelPower()

方法签名: ()I

> Gets the fuel power for this fuel. Each unit of power can fuel one
> 
> brewing operation.
> 
> @return the fuel power for this fuel
> 
> <p>
> 
> 该方法用于获取燃料物品堆本次提供的燃料值。每一次酿造消耗一单位燃料值。
> 
> @return 燃料物品堆本次提供的燃料值。
> 
> <p>
> 
> 译注：在原版游戏中仅有烈焰粉一种物品可作燃料，因此本方法的返回值默认为 `20` 。返回值可能被其他插件以 `setFuelPower(int fuelPower)` 方法修改。

#### setFuelPower

方法声明: public void setFuelPower(int fuelPower)

方法签名: (I)V

> Sets the fuel power for this fuel. Each unit of power can fuel one
> 
> brewing operation.
> 
> @param fuelPower the fuel power for this fuel
> 
> <p>
> 
> 该方法用于设置燃料物品堆本次提供的燃料值。每一次酿造消耗一单位燃料值。
> 
> @param fuelPower 燃料物品堆本次提供的燃料值。
> 
> <p>
> 
> 译注：在原版游戏中仅有烈焰粉一种物品可作燃料，因此 `getFuelPower()` 方法的返回值默认为 `20` 。

#### isConsuming

方法声明: public boolean isConsuming()

方法签名: ()Z

> Gets whether the brewing stand's fuel will be reduced / consumed or not.
> 
> @return whether the fuel will be reduced or not
> 
> <p>
> 
> 该方法用于获取燃料物品堆是否将被消耗。
> 
> @return 燃料物品堆是否将被消耗。
> 
> <p>
> 
> 译注：如果本方法返回 `false` 且事件未被取消，则酿造台燃料值仍会增加，但燃料物品堆数量不会减少。

#### setConsuming

方法声明: public void setConsuming(boolean consuming)

方法签名: (Z)V

> Sets whether the brewing stand's fuel will be reduced / consumed or not.
> 
> @param consuming whether the fuel will be reduced or not
> 
> <p>
> 
> 该方法用于设置燃料物品堆是否将被消耗。
> 
> @param consuming 燃料物品堆是否将被消耗。
> 
> <p>
> 
> 译注：如果本方法参数传入 `false` 且事件未被取消，则酿造台燃料值仍会增加，但燃料物品堆数量不会减少。

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