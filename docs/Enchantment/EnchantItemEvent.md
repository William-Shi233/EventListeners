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
> 
> <p>
> 
> 当玩家为某物品堆完成附魔时触发（目前本事件仅会在玩家使用附魔台附魔时触发）。
> 
> <p>
> 
> 译注：所谓“仅会在玩家使用附魔台附魔时触发”，指使用铁砧附魔时不触发本事件。
> 
> `PrepareItemEnchantEvent` 是在附魔备选项生成时触发的。比如玩家向周遭环绕着充足有效书架的附魔台中放入一本书，则会生成三个备选项，触发 `PrepareItemEnchantEvent` ，此时不会消耗经验。玩家可以将很多种不同的物品（如不同材质的剑、镐等）放入附魔台中，查看预期得到的附魔，多次触发 `PrepareItemEnchantEvent` 。而 `EnchantItemEvent` 则是在玩家点击了某个备选项，消耗了经验等级，实际完成附魔时触发的。

### 方法列表

#### getEnchanter

方法声明: public Player getEnchanter()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the player enchanting the item
> 
> @return enchanting player
> 
> <p>
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
> <p>
> 
> 该方法用于获取事件中的附魔台方块。
> 
> @return 事件中的附魔台方块。

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item to be enchanted (can be modified)
> 
> @return ItemStack of item
> 
> <p>
> 
> 该方法用于获取将被附魔的物品堆对象（该对象可以直接修改）。
> 
> @return 将被附魔的物品堆对象。
> 
> <p>
> 
> 译注：本方法所返回的物品堆还没有被附魔。当所有监听器被调用完毕后，将会以本方法所返回的物品堆为基础，添加附魔。本事件没有 `setItem(ItemStack)` 方法，因此需要直接修改 `getItem()` 方法所返回的物品堆对象，比如对返回值调用 `setItemMeta(ItemMeta)` 方法等。

#### getExpLevelCost

方法声明: public int getExpLevelCost()

方法签名: ()I

> Gets the cost (minimum level) which is displayed as a number on the right
> 
> hand side of the enchantment offer.
> 
> @return experience level cost
> 
> <p>
> 
> 该方法用于获取界面右侧所显示的附魔需求的最低经验等级。
> 
> @return 附魔需求的最低经验等级。
> 
> <p>
> 
> 译注：本方法所返回的是十级、二十级、三十级这样的附魔所需最低等级。玩家附魔实际消耗的等级是固定的（十级附魔消耗一级经验等级，二十级附魔消耗二级经验等级，三十级附魔消耗三级经验等级）。但是随着书架数量的增减，玩家附魔所需要达到的等级会发生变化。如果需要获取实际消耗的等级，可以使用 `whichButton()` 方法进行计算。

#### setExpLevelCost

方法声明: public void setExpLevelCost(int level)

方法签名: (I)V

> Sets the cost (minimum level) which is displayed as a number on the right
> 
> hand side of the enchantment offer.
> 
> @param level - cost in levels
> 
> <p>
> 
> 该方法用于设置界面右侧所显示的附魔需求的最低经验等级。
> 
> @param level 附魔需求的最低经验等级。

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
> 
> <p>
> 
> 该方法用于获取一个 `Map` ，其键为附魔类型，值为附魔等级，用于存储将要添加到物品堆上的全部附魔。可以修改本方法的返回值来修改附魔结果。如果向该 `Map` 中添加某种不可以被附魔到事件中的物品堆上的附魔，则该附魔会被忽略。
> 
> @return 一个 `Map` ，其键为附魔类型，值为附魔等级。
> 
> <p>
> 
> 译注：比如将要给钻石镐添加五级效率附魔，则该方法返回的 `Map` 中，将存在一个键值对，其键为 `Enchantment.DIG_SPEED` ，值为 `5` 。

#### whichButton

方法声明: public int whichButton()

方法签名: ()I

> Which button was pressed to initiate the enchanting.
> 
> @return The button index (0, 1, or 2).
> 
> <p>
> 
> 该方法用于获取附魔时所点击的按钮序号。
> 
> @return 按钮序号（范围为 `[0, 2]` ）。
> 
> <p>
> 
> 译注：即附魔台界面右侧的三个附魔选项，每个选项对应不同的经验等级消耗。玩家附魔实际消耗的等级是固定的（十级附魔消耗一级经验等级，二十级附魔消耗二级经验等级，三十级附魔消耗三级经验等级）。本方法返回值加一，即为玩家实际消耗的经验等级数。随着书架数量的增减，玩家附魔所需要达到的等级会发生变化。如果需要获取附魔最低所需等级，可以调用 `getExpLevelCost()` 方法。

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