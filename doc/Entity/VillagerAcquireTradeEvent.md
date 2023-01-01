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

### 方法列表

#### getRecipe

方法声明: public MerchantRecipe getRecipe()

方法签名: ()Lorg/bukkit/inventory/MerchantRecipe;

> Get the recipe to be acquired.
>
> @return the new recipe

#### setRecipe

方法声明: public void setRecipe(@NotNull MerchantRecipe recipe)

方法签名: (Lorg/bukkit/inventory/MerchantRecipe;)V

> Set the recipe to be acquired.
>
> @param recipe the new recipe

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