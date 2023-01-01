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
> <br>
>
> This event is fired directly before the {@link PlayerExpChangeEvent}, and the
>
> results of this event directly affect the {@link PlayerExpChangeEvent}.

### 方法列表

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Get the {@link ItemStack} to be repaired.
>
> This is not necessarily the item the player is holding.
>
> @return the item to be repaired

#### getExperienceOrb

方法声明: public ExperienceOrb getExperienceOrb()

方法签名: ()Lorg/bukkit/entity/ExperienceOrb;

> Get the experience orb triggering the event.
>
> @return the experience orb

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

#### setRepairAmount

方法声明: public void setRepairAmount(int amount)

方法签名: (I)V

> Set the amount the item will be repaired.
>
> Half of this value will be subtracted from the experience orb which initiated this event.
>
> @param amount how much damage will be repaired on the item

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