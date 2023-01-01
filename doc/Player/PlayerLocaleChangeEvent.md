---
description: PlayerLocaleChangeEvent
---

# PlayerLocaleChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerLocaleChangeEvent

### 类描述

> Called when a player changes their locale in the client settings.

### 方法列表

#### getLocale

方法声明: public String getLocale()

方法签名: ()Ljava/lang/String;

> @return the player's new locale
>
> @see Player#getLocale()

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;