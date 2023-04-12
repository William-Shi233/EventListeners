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
> If this event passes, the villager will reset the
> 
> {@link MerchantRecipe#getUses() uses} of the affected {@link #getRecipe()
> 
> MerchantRecipe} to <code>0</code>.
> 
> <br>
> 
> 当村民将要为自己的某个交易项补货时触发。
> 
> 如果本事件没有被取消，则该 `MerchantRecipe` 的 `MerchantRecipe#getUses()` 将会被重置为零。
> 
> <br>
> 
> 译注：参见 `MineCraft Wiki` 中关于村民及流浪商人交易机制的相关页面 [https://minecraft.fandom.com/wiki/Trading#Mechanics](https://minecraft.fandom.com/wiki/Trading#Mechanics) 可知，村民的交易项不能无限制地交易。在交易一定次数后，该交易项会进入缺货状态，直至村民前往工作方块补货。
> 
> 所谓 `MerchantRecipe` ，即“交易项”。所谓 `MerchantRecipe#getUses()` ，即该交易项已经交易过的次数。如果交易次数达到上限则交易项缺货。补货会使得交易项的交易次数变为零。

### 方法列表

#### getRecipe

方法声明: public MerchantRecipe getRecipe()

方法签名: ()Lorg/bukkit/inventory/MerchantRecipe;

> Get the recipe to replenish.
> 
> @return the replenished recipe
> 
> <br>
> 
> 该方法用于获取将要补货的交易项。
> 
> @return 将要补货的交易项。

#### setRecipe

方法声明: public void setRecipe(@NotNull MerchantRecipe recipe)

方法签名: (Lorg/bukkit/inventory/MerchantRecipe;)V

> Set the recipe to replenish.
> 
> @param recipe the replenished recipe
> 
> <br>
> 
> 该方法用于设置将要补货的交易项。
> 
> @param recipe 将要补货的交易项。

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
> 
> <br>
> 
> @deprecated 该方法已过时。自 `1.14` 起，`MineCraft` 修改了村民为交易项补货的机制。请使用 `MerchantRecipe#getUses()` 方法。

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
> 
> <br>
> 
> @deprecated 该方法已过时。自 `1.14` 起，`MineCraft` 修改了村民为交易项补货的机制。本方法已经不会生效。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getEntity

方法声明: public AbstractVillager getEntity()

方法签名: ()Lorg/bukkit/entity/AbstractVillager;

> 译注：无文档。该方法用于获取将要补货的村民。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;