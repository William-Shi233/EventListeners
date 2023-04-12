---
description: VillagerAcquireTradeEvent
---

# VillagerAcquireTradeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.VillagerAcquireTradeEvent

### 类描述

> Called whenever a villager acquires a new trade.
> 
> <p>
> 
> 当村民解锁新交易项时触发。
> 
> <p>
> 
> 译注：参见 `MineCraft Wiki` 中关于村民及流浪商人交易机制的相关页面 [https://minecraft.fandom.com/wiki/Trading#Mechanics](https://minecraft.fandom.com/wiki/Trading#Mechanics) 可知，村民每完成一次交易都会获得一定经验，经验值满后将会升级，并解锁新的交易项。

### 方法列表

#### getRecipe

方法声明: public MerchantRecipe getRecipe()

方法签名: ()Lorg/bukkit/inventory/MerchantRecipe;

> Get the recipe to be acquired.
> 
> @return the new recipe
> 
> <p>
> 
> 该方法用于获取新解锁的交易项。
> 
> @return 新解锁的交易项。

#### setRecipe

方法声明: public void setRecipe(@NotNull MerchantRecipe recipe)

方法签名: (Lorg/bukkit/inventory/MerchantRecipe;)V

> Set the recipe to be acquired.
> 
> @param recipe the new recipe
> 
> <p>
> 
> 该方法用于设置新解锁的交易项。
> 
> @param recipe 新解锁的交易项。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getEntity

方法声明: public AbstractVillager getEntity()

方法签名: ()Lorg/bukkit/entity/AbstractVillager;

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;