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

### 方法列表

#### getEnchanter

方法声明: public Player getEnchanter()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the player enchanting the item
>
> @return enchanting player

#### getEnchantBlock

方法声明: public Block getEnchantBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the block being used to enchant the item
>
> @return the block used for enchanting

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item to be enchanted.
>
> @return ItemStack of item

#### getExpLevelCostsOffered

方法声明: public int[] getExpLevelCostsOffered()

方法签名: ()[I

> Get a list of offered experience level costs of the enchantment.
>
> @return experience level costs offered
>
> @deprecated Use {@link #getOffers()} instead of this method

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

#### getEnchantmentBonus

方法声明: public int getEnchantmentBonus()

方法签名: ()I

> Get enchantment bonus in effect - corresponds to number of bookshelves
>
> @return enchantment bonus

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