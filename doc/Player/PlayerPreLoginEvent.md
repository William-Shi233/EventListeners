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

### 方法列表

#### getResult

方法声明: public Result getResult()

方法签名: ()Lorg/bukkit/event/player/PlayerPreLoginEvent/Result;

> Gets the current result of the login, as an enum
>
> @return Current Result of the login

#### setResult

方法声明: public void setResult(@NotNull final Result result)

方法签名: (Lorg/bukkit/event/player/PlayerPreLoginEvent/Result;)V

> Sets the new result of the login, as an enum
>
> @param result New result to set

#### getKickMessage

方法声明: public String getKickMessage()

方法签名: ()Ljava/lang/String;

> Gets the current kick message that will be used if getResult() !=
>
> Result.ALLOWED
>
> @return Current kick message

#### setKickMessage

方法声明: public void setKickMessage(@NotNull final String message)

方法签名: (Ljava/lang/String;)V

> Sets the kick message to display if getResult() != Result.ALLOWED
>
> @param message New kick message

#### allow

方法声明: public void allow()

方法签名: ()V

> Allows the player to log in

#### disallow

方法声明: public void disallow(@NotNull final Result result, @NotNull final String message)

方法签名: (Lorg/bukkit/event/player/PlayerPreLoginEvent/Result;Ljava/lang/String;)V

> Disallows the player from logging in, with the given reason
>
> @param result New result for disallowing the player
>
> @param message Kick message to display to the user

#### getName

方法声明: public String getName()

方法签名: ()Ljava/lang/String;

> Gets the player's name.
>
> @return the player's name

#### getAddress

方法声明: public InetAddress getAddress()

方法签名: ()Ljava/net/InetAddress;

> Gets the player IP address.
>
> @return The IP address

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getUniqueId

方法声明: public UUID getUniqueId()

方法签名: ()Ljava/util/UUID;

> Gets the player's unique ID.
>
> @return The unique ID

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: Result

> Basic kick reasons for communicating to plugins

#### ALLOWED

> The player is allowed to log in

#### KICK_FULL

> The player is not allowed to log in, due to the server being full

#### KICK_BANNED

> The player is not allowed to log in, due to them being banned

#### KICK_WHITELIST

> The player is not allowed to log in, due to them not being on the
>
> white list

#### KICK_OTHER

> The player is not allowed to log in, for reasons undefined