---
description: PlayerPreLoginEvent
---

# PlayerPreLoginEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerPreLoginEvent

### 类描述

> Stores details for players attempting to log in
> 
> @deprecated This event causes synchronization from the login thread; {@link
> 
> AsyncPlayerPreLoginEvent} is preferred to keep the secondary threads
> 
> asynchronous.
> 
> <p>
> 
> 本事件存储了试图登录服务器的玩家的有关数据。
> 
> 本事件已经过时。因为触发本事件时需要在登录线程里进行同步操作切回主线程再调用监听器。`AsyncPlayerPreLoginEvent` 是异步的，不会在主线程内触发，能让服务器主线程以外的其他线程保持异步状态，因而建议监听 `AsyncPlayerPreLoginEvent` 。
> 
> <p>
> 
> 译注：请使用 `AsyncPlayerPreLoginEvent` 。本事件已经过时。

### 方法列表

#### getResult

方法声明: public Result getResult()

方法签名: ()Lorg/bukkit/event/player/PlayerPreLoginEvent/Result;

> Gets the current result of the login, as an enum
> 
> @return Current Result of the login
> 
> <p>
> 
> 译注：请使用 `AsyncPlayerPreLoginEvent` 。本事件已经过时。

#### setResult

方法声明: public void setResult(@NotNull final Result result)

方法签名: (Lorg/bukkit/event/player/PlayerPreLoginEvent/Result;)V

> Sets the new result of the login, as an enum
> 
> @param result New result to set
> 
> <p>
> 
> 译注：请使用 `AsyncPlayerPreLoginEvent` 。本事件已经过时。

#### getKickMessage

方法声明: public String getKickMessage()

方法签名: ()Ljava/lang/String;

> Gets the current kick message that will be used if getResult() !=
> 
> Result.ALLOWED
> 
> @return Current kick message
> 
> <p>
> 
> 译注：请使用 `AsyncPlayerPreLoginEvent` 。本事件已经过时。

#### setKickMessage

方法声明: public void setKickMessage(@NotNull final String message)

方法签名: (Ljava/lang/String;)V

> Sets the kick message to display if getResult() != Result.ALLOWED
> 
> @param message New kick message
> 
> <p>
> 
> 译注：请使用 `AsyncPlayerPreLoginEvent` 。本事件已经过时。

#### allow

方法声明: public void allow()

方法签名: ()V

> Allows the player to log in
> 
> <p>
> 
> 译注：请使用 `AsyncPlayerPreLoginEvent` 。本事件已经过时。

#### disallow

方法声明: public void disallow(@NotNull final Result result, @NotNull final String message)

方法签名: (Lorg/bukkit/event/player/PlayerPreLoginEvent/Result;Ljava/lang/String;)V

> Disallows the player from logging in, with the given reason
> 
> @param result New result for disallowing the player
> 
> @param message Kick message to display to the user
> 
> <p>
> 
> 译注：请使用 `AsyncPlayerPreLoginEvent` 。本事件已经过时。

#### getName

方法声明: public String getName()

方法签名: ()Ljava/lang/String;

> Gets the player's name.
> 
> @return the player's name
> 
> <p>
> 
> 译注：请使用 `AsyncPlayerPreLoginEvent` 。本事件已经过时。

#### getAddress

方法声明: public InetAddress getAddress()

方法签名: ()Ljava/net/InetAddress;

> Gets the player IP address.
> 
> @return The IP address
> 
> <p>
> 
> 译注：请使用 `AsyncPlayerPreLoginEvent` 。本事件已经过时。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getUniqueId

方法声明: public UUID getUniqueId()

方法签名: ()Ljava/util/UUID;

> Gets the player's unique ID.
> 
> @return The unique ID
> 
> <p>
> 
> 译注：请使用 `AsyncPlayerPreLoginEvent` 。本事件已经过时。

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: Result

> Basic kick reasons for communicating to plugins
> 
> <p>
> 
> 译注：请使用 `AsyncPlayerPreLoginEvent` 。本事件已经过时。

#### ALLOWED

> The player is allowed to log in
> 
> <p>
> 
> 译注：请使用 `AsyncPlayerPreLoginEvent` 。本事件已经过时。

#### KICK_FULL

> The player is not allowed to log in, due to the server being full
> 
> <p>
> 
> 译注：请使用 `AsyncPlayerPreLoginEvent` 。本事件已经过时。

#### KICK_BANNED

> The player is not allowed to log in, due to them being banned
> 
> <p>
> 
> 译注：请使用 `AsyncPlayerPreLoginEvent` 。本事件已经过时。

#### KICK_WHITELIST

> The player is not allowed to log in, due to them not being on the
> 
> white list
> 
> <p>
> 
> 译注：请使用 `AsyncPlayerPreLoginEvent` 。本事件已经过时。

#### KICK_OTHER

> The player is not allowed to log in, for reasons undefined
> 
> <p>
> 
> 译注：请使用 `AsyncPlayerPreLoginEvent` 。本事件已经过时。