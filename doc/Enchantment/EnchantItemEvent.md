---
description: EnchantItemEvent
---

# EnchantItemEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.inventory.InventoryEvent

            =>  org.bukkit.event.enchantment.EnchantItemEvent

### 类描述

> Called when an ItemStack is successfully enchanted (currently at
>
> enchantment table)

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

> Gets the item to be enchanted (can be modified)
>
> @return ItemStack of item

#### getExpLevelCost

方法声明: public int getExpLevelCost()

方法签名: ()I

> Gets the cost (minimum level) which is displayed as a number on the right
>
> hand side of the enchantment offer.
>
> @return experience level cost

#### setExpLevelCost

方法声明: public void setExpLevelCost(int level)

方法签名: (I)V

> Sets the cost (minimum level) which is displayed as a number on the right
>
> hand side of the enchantment offer.
>
> @param level - cost in levels

#### getEnchantsToAdd

方法声明: public Map<Enchantment, Integer> getEnchantsToAdd()

方法签名: ()Ljava/util/Map;

> Get map of enchantment (levels, keyed by type) to be added to item
>
> (modify map returned to change values). Note: Any enchantments not
>
> allowed for the item will be ignored
>
> @return map of enchantment levels, keyed by enchantment

#### whichButton

方法声明: public int whichButton()

方法签名: ()I

> Which button was pressed to initiate the enchanting.
>
> @return The button index (0, 1, or 2).

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