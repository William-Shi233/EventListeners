---
description: PlayerRiptideEvent
---

# PlayerRiptideEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerRiptideEvent

### 类描述

> This event is fired when the player activates the riptide enchantment, using
>
> their trident to propel them through the air.
>
> <br>
>
> N.B. the riptide action is currently performed client side, so manipulating
>
> the player in this event may have undesired effects.

### 方法列表

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item containing the used enchantment.
>
> @return held enchanted item

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;