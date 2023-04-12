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
>
>
> 
> 当玩家使用某物品，令其耐久度减少时触发。
>
>
> 
> 译注：当物品堆有“耐久”附魔，并且发挥作用使耐久度不减少时，本事件仍会触发。代码位于 `net.minecraft.server.v1_16_R3.ItemStack#isDamaged(int i, Random random, @Nullable EntityPlayer entityplayer)` ，参见该类第 `444` 行。对于物品即将受到的每一点耐久损失，都会作一次耐久附魔是否生效的判断，如果恰好生效则减免一点耐久损失。此后只要 `entityplayer != null` 即触发本事件，就算耐久损失被减免到零时亦然。

### 方法列表

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item being damaged.
>
> @return the item
>
>
> 
> 该方法用于获取耐久度减少的物品堆。
>
> @return 耐久度减少的物品堆。

#### getDamage

方法声明: public int getDamage()

方法签名: ()I

> Gets the amount of durability damage this item will be taking.
>
> @return durability change
>
>
> 
> 该方法用于获取耐久度的减少量。
>
> @return 耐久度的减少量。

#### setDamage

方法声明: public void setDamage(int damage)

方法签名: (I)V

> 译注：无文档。该方法用于设置耐久度的减少量。

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