---
description: PlayerItemDamageEvent
---

# PlayerItemDamageEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerItemDamageEvent

### 类描述

> Called when an item used by the player takes durability damage as a result of
>
> being used.

### 方法列表

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item being damaged.
>
> @return the item

#### getDamage

方法声明: public int getDamage()

方法签名: ()I

> Gets the amount of durability damage this item will be taking.
>
> @return durability change

#### setDamage

方法声明: public void setDamage(int damage)

方法签名: (I)V

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