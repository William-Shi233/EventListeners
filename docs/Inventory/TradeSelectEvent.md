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
> This event allows the user to get the index of the trade, letting them get
>
> the MerchantRecipe via the Merchant.
>
> 
>
> 当玩家在交易界面侧栏选中某项交易时触发。
>
> 本事件允许用户获取被选中交易项的序号。对事件中的商人对象调用 `Merchant#getRecipe(int i)` 方法时，可以传入该序号，以获得 `MerchantRecipe` 类型的交易项信息。

### 方法列表

#### getIndex

方法声明: public int getIndex()

方法签名: ()I

> Used to get the index of the trade the player clicked on.
>
> @return The index of the trade clicked by the player
>
> 
>
> 该方法用于获取玩家所点击的交易项的序号。
>
> @return 玩家所点击的交易项的序号。

#### getInventory

方法声明: public MerchantInventory getInventory()

方法签名: ()Lorg/bukkit/inventory/MerchantInventory;

> 译注：无文档。该方法用于获取事件所涉及的交易物品栏对象。

#### getMerchant

方法声明: public Merchant getMerchant()

方法签名: ()Lorg/bukkit/inventory/Merchant;

> Get the Merchant involved.
>
> @return the Merchant
>
> 
>
> 该方法用于获取事件中的商人对象。
>
> @return 商人对象。
>
> 
>
> 译注：尽管此处的 `Merchant` 类型位于 `org.bukkit.inventory` 包下，但它代表的是商人实体（如村民、流浪商人等），而不是一种物品栏。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;