---
description: PlayerItemMendEvent
---

# PlayerItemMendEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerItemMendEvent

### 类描述

> Represents when a player has an item repaired via the Mending enchantment.
>
> This event is fired directly before the {@link PlayerExpChangeEvent}, and the
>
> results of this event directly affect the {@link PlayerExpChangeEvent}.
>
> 当玩家的某件物品堆由于“经验修补”附魔而被修复时触发。
>
> 本事件会在 `PlayerExpChangeEvent` 前触发。`PlayerExpChangeEvent` 是紧随其后的，因此对本事件结果的修改直接影响到后续 `PlayerExpChangeEvent` 内的相关字段。
>
> 译注：参见 `MineCraft Wiki` 中的相关页面 [https://minecraft.fandom.com/wiki/Mending](https://minecraft.fandom.com/wiki/Mending) 可知，每当玩家捡起一颗经验球时，都会检查周身物品堆是否含有“经验修补”附魔。主手、副手、头盔、胸甲、护腿、靴子六个槽位的物品堆，只要耐久未满，都有相同概率得到修复（该概率和所在槽位、和现有耐久度都无关）。经验球内的一点经验值，可以给物品堆增加两点耐久度。如果经验值都被用于修复物品，则玩家无法增加经验。如果物品堆耐久已满且经验值有剩余，则玩家可以得到经验，这些剩余的经验不会被用于修复第二件物品堆（比如修复了主手物品堆以后，副手物品堆耐久未满且经验值有剩余，此时经验值不会被用于修复副手物品堆，而是直接进入玩家经验槽）。

### 方法列表

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Get the {@link ItemStack} to be repaired.
>
> This is not necessarily the item the player is holding.
>
> @return the item to be repaired
>
> 该方法用于获取将被修复的物品堆。
>
> 返回的物品堆不一定是玩家手持的物品堆。
>
> @return 将被修复的物品堆。
>
> 译注：玩家穿戴着的盔甲、副手所持的物品都有可能被修复。因此本方法返回的物品堆不一定是玩家主手所持的物品堆。

#### getExperienceOrb

方法声明: public ExperienceOrb getExperienceOrb()

方法签名: ()Lorg/bukkit/entity/ExperienceOrb;

> Get the experience orb triggering the event.
>
> @return the experience orb
>
> 该方法用于获取触发事件的经验球实体。
>
> @return 触发事件的经验球实体。

#### getRepairAmount

方法声明: public int getRepairAmount()

方法签名: ()I

> Get the amount the item is to be repaired.
>
> The default value is twice the value of the consumed experience orb
>
> or the remaining damage left on the item, whichever is smaller.
>
> @return how much damage will be repaired by the experience orb
>
> 该方法用于获取耐久度的增加量。
>
> 默认情况下，耐久度的增加量是“经验球所含经验值的两倍”和“物品堆耐久损耗量”二者的较小值。
>
> @return 耐久度的增加量。

#### setRepairAmount

方法声明: public void setRepairAmount(int amount)

方法签名: (I)V

> Set the amount the item will be repaired.
>
> Half of this value will be subtracted from the experience orb which initiated this event.
>
> @param amount how much damage will be repaired on the item
>
> 该方法用于设置耐久度的增加量。
>
> 涉事经验球实体所含经验值将会减去耐久度增量的一半。
>
> @param amount 耐久度的增加量。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancelled)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;