---
description: ServerListPingEvent
---

# ServerListPingEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.server.ServerEvent

            =>  org.bukkit.event.server.ServerListPingEvent

### 类描述

> Called when a server list ping is coming in. Displayed players can be
>
> checked and removed by {@link #iterator() iterating} over this event.
>
> <br>
>
> <b>Note:</b> The players in {@link #iterator()} will not be shown in the
>
> server info if {@link Bukkit#getHideOnlinePlayers()} is true.

### 方法列表

#### getAddress

方法声明: public InetAddress getAddress()

方法签名: ()Ljava/net/InetAddress;

> Get the address the ping is coming from.
>
> @return the address

#### getMotd

方法声明: public String getMotd()

方法签名: ()Ljava/lang/String;

> Get the message of the day message.
>
> @return the message of the day

#### setMotd

方法声明: public void setMotd(@NotNull String motd)

方法签名: (Ljava/lang/String;)V

> Change the message of the day message.
>
> @param motd the message of the day

#### getNumPlayers

方法声明: public int getNumPlayers()

方法签名: ()I

> Get the number of players sent.
>
> @return the number of players

#### getMaxPlayers

方法声明: public int getMaxPlayers()

方法签名: ()I

> Get the maximum number of players sent.
>
> @return the maximum number of players

#### setMaxPlayers

方法声明: public void setMaxPlayers(int maxPlayers)

方法签名: (I)V

> Set the maximum number of players sent.
>
> @param maxPlayers the maximum number of player

#### setServerIcon

方法声明: public void setServerIcon(@UndefinedNullability("implementation dependent") CachedServerIcon icon) throws IllegalArgumentException, UnsupportedOperationException

方法签名: (Lorg/bukkit/util/CachedServerIcon;)V

> Sets the server-icon sent to the client.
>
> @param icon the icon to send to the client
>
> @throws IllegalArgumentException if the {@link CachedServerIcon} is not
>
> created by the caller of this event; null may be accepted for some
>
> implementations
>
> @throws UnsupportedOperationException if the caller of this event does
>
> not support setting the server icon

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### iterator

方法声明: public Iterator<Player> iterator() throws UnsupportedOperationException

方法签名: ()Ljava/util/Iterator;

> {@inheritDoc}
>
> <p>
>
> Calling the {@link Iterator#remove()} method will force that particular
>
> player to not be displayed on the player list, decrease the size
>
> returned by {@link #getNumPlayers()}, and will not be returned again by
>
> any new iterator.
>
> <br>
>
> <b>Note:</b> The players here will not be shown in the server info if
>
> {@link Bukkit#getHideOnlinePlayers()} is true.
>
> @throws UnsupportedOperationException if the caller of this event does
>
> not support removing players