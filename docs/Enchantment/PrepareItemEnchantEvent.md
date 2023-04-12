---
description: PrepareItemEnchantEvent
---

# PrepareItemEnchantEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.inventory.InventoryEvent

            =>  org.bukkit.event.enchantment.PrepareItemEnchantEvent

### 类描述

> Called when an ItemStack is inserted in an enchantment table - can be
> 
> called multiple times
> 
> <br>
> 
> 当物品堆被放入附魔台时触发。本事件可能被触发很多次。
> 
> <br>
> 
> 译注：`PrepareItemEnchantEvent` 是在附魔备选项生成时触发的。比如玩家向周遭环绕着充足有效书架的附魔台中放入一本书，则会生成三个备选项，触发 `PrepareItemEnchantEvent` ，此时不会消耗经验。玩家可以将很多种不同的物品（如不同材质的剑、镐等）放入附魔台中，查看预期得到的附魔，多次触发 `PrepareItemEnchantEvent` 。而 `EnchantItemEvent` 则是在玩家点击了某个备选项，消耗了经验等级，实际完成附魔时触发的。

### 方法列表

#### getEnchanter

方法声明: public Player getEnchanter()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the player enchanting the item
> 
> @return enchanting player
> 
> <br>
> 
> 该方法用于获取附魔物品的玩家。
> 
> @return 附魔物品的玩家。

#### getEnchantBlock

方法声明: public Block getEnchantBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the block being used to enchant the item
> 
> @return the block used for enchanting
> 
> <br>
> 
> 该方法用于获取事件中的附魔台方块。
> 
> @return 事件中的附魔台方块。

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item to be enchanted.
> 
> @return ItemStack of item
> 
> <br>
> 
> 该方法用于获取将被附魔的物品堆对象。
> 
> @return 将被附魔的物品堆对象。

#### getExpLevelCostsOffered

方法声明: public int[] getExpLevelCostsOffered()

方法签名: ()[I

> Get a list of offered experience level costs of the enchantment.
> 
> @return experience level costs offered
> 
> @deprecated Use {@link #getOffers()} instead of this method
> 
> <br>
> 
> 该方法用于获取一个数组，其间按序存储有某个备选项所要求的最低经验等级。
> 
> @return 备选项所要求的最低经验等级列表。
> 
> @deprecated 该方法已过时。请使用 `getOffers()` 方法。

#### getOffers

方法声明: public EnchantmentOffer[] getOffers()

方法签名: ()[Lorg/bukkit/enchantments/EnchantmentOffer;

> Get a list of available {@link EnchantmentOffer} for the player. You can
> 
> modify the values to change the available offers for the player. An offer
> 
> may be null, if there isn't a enchantment offer at a specific slot. There
> 
> are 3 slots in the enchantment table available to modify.
> 
> @return list of available enchantment offers
> 
> <br>
> 
> 该方法用于获取一个数组，其间存储有全部附魔备选项信息。如欲修改玩家所见到的附魔备选项，可以直接修改本方法的返回值内的元素。本方法的返回值内的元素可能为 `null` ，这说明该槽位没有附魔备选项。一个附魔台中共有三个备选项槽位，可供插件进行修改。
> 
> @return 附魔备选项信息数组。

#### getEnchantmentBonus

方法声明: public int getEnchantmentBonus()

方法签名: ()I

> Get enchantment bonus in effect - corresponds to number of bookshelves
> 
> @return enchantment bonus
> 
> <br>
> 
> 该方法用于获取为当前附魔台提供加成的有效书架数目。
> 
> @return 为当前附魔台提供加成的有效书架数目。

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