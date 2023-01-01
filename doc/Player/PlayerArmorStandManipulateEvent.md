---
description: PlayerArmorStandManipulateEvent
---

# PlayerArmorStandManipulateEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerInteractEntityEvent

                =>  org.bukkit.event.player.PlayerArmorStandManipulateEvent

### 类描述

> Called when a player interacts with an armor stand and will either swap, retrieve or place an item.

### 方法列表

#### getPlayerItem

方法声明: public ItemStack getPlayerItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Returns the item held by the player. If this Item is null and the armor stand Item is also null,
>
> there will be no transaction between the player and the armor stand.
>
> If the Player's item is null, but the armor stand item is not then the player will obtain the armor stand item.
>
> In the case that the Player's item is not null, but the armor stand item is null, the players item will be placed on the armor stand.
>
> If both items are not null, the items will be swapped.
>
> In the case that the event is cancelled the original items will remain the same.
>
> @return the item held by the player.

#### getArmorStandItem

方法声明: public ItemStack getArmorStandItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Returns the item held by the armor stand.
>
> If this Item is null and the player's Item is also null, there will be no transaction between the player and the armor stand.
>
> If the Player's item is null, but the armor stand item is not then the player will obtain the armor stand item.
>
> In the case that the Player's item is not null, but the armor stand item is null, the players item will be placed on the armor stand.
>
> If both items are not null, the items will be swapped.
>
> In the case that the event is cancelled the original items will remain the same.
>
> @return the item held by the armor stand.

#### getSlot

方法声明: public EquipmentSlot getSlot()

方法签名: ()Lorg/bukkit/inventory/EquipmentSlot;

> Returns the raw item slot of the armor stand in this event.
>
> @return the index of the item obtained or placed of the armor stand.

#### getRightClicked

方法声明: public ArmorStand getRightClicked()

方法签名: ()Lorg/bukkit/entity/ArmorStand;

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;