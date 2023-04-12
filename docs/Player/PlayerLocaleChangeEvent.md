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
>
>
> 
> 当玩家在客户端设置中切换语言时触发。
>
>
> 
> 译注：所谓“客户端设置”，指在暂停时点击“选项”，再点击“语言”后所出现的界面。

### 方法列表

#### getLocale

方法声明: public String getLocale()

方法签名: ()Ljava/lang/String;

> @return the player's new locale
>
> @see Player#getLocale()
>
>
> 
> @return 玩家的新语言。
>
> @see 参见 `Player#getLocale()` 方法。
>
>
> 
> 译注：该方法用于获取玩家将使用的新语言。
>
> 本事件触发时，服务端还没有完成玩家语言切换，因此 `Player#getLocale()` 方法返回玩家原先使用的语言。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;