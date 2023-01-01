---
description: VillagerReplenishTradeEvent
---

# VillagerReplenishTradeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.VillagerReplenishTradeEvent

### 类描述

> Called when a {@link Villager} is about to restock one of its trades.
>
> <p>
>
> If this event passes, the villager will reset the
>
> {@link MerchantRecipe#getUses() uses} of the affected {@link #getRecipe()
>
> MerchantRecipe} to <code>0</code>.

### 方法列表

#### getRecipe

方法声明: public MerchantRecipe getRecipe()

方法签名: ()Lorg/bukkit/inventory/MerchantRecipe;

> Get the recipe to replenish.
>
> @return the replenished recipe

#### setRecipe

方法声明: public void setRecipe(@NotNull MerchantRecipe recipe)

方法签名: (Lorg/bukkit/inventory/MerchantRecipe;)V

> Set the recipe to replenish.
>
> @param recipe the replenished recipe

#### getBonus

方法声明: public int getBonus()

方法签名: ()I

> Get the bonus uses added.
>
> @return the extra uses added
>
> @deprecated MC 1.14 has changed how villagers restock their trades. Use
>
> {@link MerchantRecipe#getUses()}.

#### setBonus

方法声明: public void setBonus(int bonus)

方法签名: (I)V

> Set the bonus uses added.
>
> @param bonus the extra uses added
>
> @deprecated MC 1.14 has changed how villagers restock their trades. This
>
> has no effect anymore.

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