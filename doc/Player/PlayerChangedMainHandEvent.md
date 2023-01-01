---
description: PlayerChangedMainHandEvent
---

# PlayerChangedMainHandEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerChangedMainHandEvent

### 类描述

> Called when a player changes their main hand in the client settings.

### 方法列表

#### getMainHand

方法声明: public MainHand getMainHand()

方法签名: ()Lorg/bukkit/inventory/MainHand;

> Gets the new main hand of the player. The old hand is still momentarily
>
> available via {@link Player#getMainHand()}.
>
> @return the new {@link MainHand} of the player

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;