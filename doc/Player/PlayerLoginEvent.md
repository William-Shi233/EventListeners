---
description: PlayerLoginEvent
---

# PlayerLoginEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerLoginEvent

### 类描述

> Stores details for players attempting to log in.
>
> <br>
>
> Note that this event is called <i>early</i> in the player initialization
>
> process. It is recommended that most options involving the Player
>
> <i>entity</i> be postponed to the {@link PlayerJoinEvent} instead.

### 方法列表

#### getRealAddress

方法声明: public InetAddress getRealAddress()

方法签名: ()Ljava/net/InetAddress;

> Gets the connection address of this player, regardless of whether it has been spoofed or not.
>
> @return the player's connection address

#### getResult

方法声明: public Result getResult()

方法签名: ()Lorg/bukkit/event/player/PlayerLoginEvent/Result;

> Gets the current result of the login, as an enum
>
> @return Current Result of the login

#### setResult

方法声明: public void setResult(@NotNull final Result result)

方法签名: (Lorg/bukkit/event/player/PlayerLoginEvent/Result;)V

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

#### getHostname

方法声明: public String getHostname()

方法签名: ()Ljava/lang/String;

> Gets the hostname that the player used to connect to the server, or
>
> blank if unknown
>
> @return The hostname

#### allow

方法声明: public void allow()

方法签名: ()V

> Allows the player to log in

#### disallow

方法声明: public void disallow(@NotNull final Result result, @NotNull final String message)

方法签名: (Lorg/bukkit/event/player/PlayerLoginEvent/Result;Ljava/lang/String;)V

> Disallows the player from logging in, with the given reason
>
> @param result New result for disallowing the player
>
> @param message Kick message to display to the user

#### getAddress

方法声明: public InetAddress getAddress()

方法签名: ()Ljava/net/InetAddress;

> Gets the {@link InetAddress} for the Player associated with this event.
>
> This method is provided as a workaround for player.getAddress()
>
> returning null during PlayerLoginEvent.
>
> @return The address for this player. For legacy compatibility, this may
>
> be null.

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

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