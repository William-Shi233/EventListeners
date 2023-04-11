---
description: InventoryPickupItemEvent
---

# InventoryPickupItemEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.inventory.InventoryPickupItemEvent

### 类描述

> Called when a hopper or hopper minecart picks up a dropped item.
>
> 当一个漏斗或漏斗矿车吸取掉落的物品堆实体时触发。

### 方法列表

#### getInventory

方法声明: public Inventory getInventory()

方法签名: ()Lorg/bukkit/inventory/Inventory;

> Gets the Inventory that picked up the item
>
> @return Inventory
>
> 该方法用于获取吸取了物品堆的物品栏。
>
> @return 吸取了物品堆的物品栏。

#### getItem

方法声明: public Item getItem()

方法签名: ()Lorg/bukkit/entity/Item;

> Gets the Item entity that was picked up
>
> @return Item
>
> 该方法用于获取被吸取的物品堆实体。
>
> @return 被吸取的物品堆实体。

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