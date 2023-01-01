---
description: TradeSelectEvent
---

# TradeSelectEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.inventory.InventoryEvent

            =>  org.bukkit.event.inventory.InventoryInteractEvent

                =>  org.bukkit.event.inventory.TradeSelectEvent

### 类描述

> This event is called whenever a player clicks a new trade on the trades
>
> sidebar.
>
> <p>
>
> This event allows the user to get the index of the trade, letting them get
>
> the MerchantRecipe via the Merchant.

### 方法列表

#### getIndex

方法声明: public int getIndex()

方法签名: ()I

> Used to get the index of the trade the player clicked on.
>
> @return The index of the trade clicked by the player

#### getInventory

方法声明: public MerchantInventory getInventory()

方法签名: ()Lorg/bukkit/inventory/MerchantInventory;

#### getMerchant

方法声明: public Merchant getMerchant()

方法签名: ()Lorg/bukkit/inventory/Merchant;

> Get the Merchant involved.
>
> @return the Merchant

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;