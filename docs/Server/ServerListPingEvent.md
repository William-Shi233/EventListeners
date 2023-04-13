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
> <b>Note:</b> The players in {@link #iterator()} will not be shown in the
> 
> server info if {@link Bukkit#getHideOnlinePlayers()} is true.
> 
> <br>
> 
> 当服务端接收到 `ServerListPing` 数据包时触发本事件。插件在监听器中可以调用 `iterator()` 方法遍历或删除服务端发回的在线玩家列表。
> 
> 注意，如果 `Bukkit#getHideOnlinePlayers()` 方法返回 `true` ，则 `iterator()` 方法返回值里的玩家不会在服务器信息中展示。
> 
> <br>
> 
> 译注：`ServerListPing` 是客户端发送给服务端的一种数据包，用于获取服务器的一系列信息，包括服务器现有在线人数、最大在线人数、服务器图标等。这些信息即客户端“多人游戏”页面所展示的服务器列表中各个服务器的信息。服务端在收到 `ServerListPing` 数据包以后，会给客户端发还 `Status Response` 数据包，告知客户端相关信息。通过本事件可以修改服务端发给客户端的服务器信息。插件可以将服务器最大在线人数改为 `-1` 人，亦可修改服务器图标，诸如此类。若操作得当，客户端会显示修改之后的信息。
> 
> 当鼠标悬停在服务器信息右上方的信号强度图标时，会显示一个列表，列表中展示了全部在线玩家的名称。可以通过 `iterator()` 方法对这个将要展示的列表进行遍历，也可以通过 `Iterator#remove()` 方法删除玩家。如果 `Bukkit#getHideOnlinePlayers()` 返回 `true` ，那么无论服务器内有多少人在线，都不会有任何玩家的用户名被展示。
> 
> 有关 `ServerListPing` 数据包和服务端 `Status Response` 数据包的具体格式和内容，请参见 [https://wiki.vg/Server_List_Ping](https://wiki.vg/Server_List_Ping) 页面。

### 方法列表

#### getAddress

方法声明: public InetAddress getAddress()

方法签名: ()Ljava/net/InetAddress;

> Get the address the ping is coming from.
> 
> @return the address
> 
> <br>
> 
> 该方法用于获取 `ServerListPing` 数据包的来源地址。
> 
> @return 数据包来源地址。

#### getMotd

方法声明: public String getMotd()

方法签名: ()Ljava/lang/String;

> Get the message of the day message.
> 
> @return the message of the day
> 
> <br>
> 
> 该方法用于获取将要发送的 `MOTD` 消息字符串。
> 
> @return `MOTD` 字符串。
> 
> <br>
> 
> 译注：所谓“MOTD”，即“Message of the Day”的简称，展示在服务器图标右侧，玩家自定义的服务器名称下方。该字符串的内容一般是服务器简介或宣传标语等。

#### setMotd

方法声明: public void setMotd(@NotNull String motd)

方法签名: (Ljava/lang/String;)V

> Change the message of the day message.
> 
> @param motd the message of the day
> 
> <br>
> 
> 该方法用于设置将要发送的 `MOTD` 消息字符串。
> 
> @param motd `MOTD` 字符串。
> 
> <br>
> 
> 译注：所谓“MOTD”，即“Message of the Day”的简称，展示在服务器图标右侧，玩家自定义的服务器名称下方。该字符串的内容一般是服务器简介或宣传标语等。

#### getNumPlayers

方法声明: public int getNumPlayers()

方法签名: ()I

> Get the number of players sent.
> 
> @return the number of players
> 
> <br>
> 
> 该方法用于获取将要发送的在线玩家人数。
> 
> @return 在线玩家人数。
> 
> <br>
> 
> 译注：参见 `iterator()` 方法。
> 
> 在 `1.16.5` 版本 `Spigot` 服务端中，本事件的 `numPlayers` 字段是一个以 `final` 修饰的变量，而且 `iterator()` 方法的方法体只有一行，是 `throw new UnsupportedOperationException();` ，故而无法遍历或修改玩家列表。

#### getMaxPlayers

方法声明: public int getMaxPlayers()

方法签名: ()I

> Get the maximum number of players sent.
> 
> @return the maximum number of players
> 
> <br>
> 
> 该方法用于获取将要发送的服务器在线玩家人数上限。
> 
> @return 在线玩家人数上限。

#### setMaxPlayers

方法声明: public void setMaxPlayers(int maxPlayers)

方法签名: (I)V

> Set the maximum number of players sent.
> 
> @param maxPlayers the maximum number of player
> 
> <br>
> 
> 该方法用于设置将要发送的服务器在线玩家人数上限。
> 
> @param maxPlayers 在线玩家人数上限。

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
> 
> <br>
> 
> 该方法用于设置将要发送给客户端的服务器图标。
> 
> @param icon 将要发送给客户端的服务器图标。
> 
> @throws 如果 `CachedServerIcon` 不是被触发本事件的开发者所创建的，则抛出 `IllegalArgumentException` 。部分实现类允许传入 `null` 作为参数。
> 
> @throws 如果触发本事件的开发者不允许设置服务器图标，则抛出 `UnsupportedOperationException` 。
> 
> <br>
> 
> 译注：此方法的文档强调了本事件不一定由服务端触发，也可能是由插件触发，实现的方式与 `Bukkit` 系列服务端可能不同。
> 
> 在 `1.16.5` 版本 `Spigot` 服务端中，本方法的方法体只有一行，是 `throw new UnsupportedOperationException();` ，故而无法设置服务端图标。

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
> Calling the {@link Iterator#remove()} method will force that particular
> 
> player to not be displayed on the player list, decrease the size
> 
> returned by {@link #getNumPlayers()}, and will not be returned again by
> 
> any new iterator.
> 
> <b>Note:</b> The players here will not be shown in the server info if
> 
> {@link Bukkit#getHideOnlinePlayers()} is true.
> 
> @throws UnsupportedOperationException if the caller of this event does
> 
> not support removing players
> 
> <br>
> 
> 如果调用 `Iterator#remove()` 方法，会让被删除的那个玩家不再在客户端的玩家列表预览里显示。同时也会让 `getNumPlayers()` 方法的返回值减小。如果在删除某个玩家以后，再次调用本方法以遍历玩家列表，则该位被删除的玩家不会出现在第二次遍历中。
> 
> 注意，如果 `Bukkit#getHideOnlinePlayers()` 返回 `true` ，则本方法所列的玩家均不会在客户端被显示。
> 
> @throws 如果触发本事件的开发者不允许插件删除在线玩家，会抛出 `UnsupportedOperationException` 。
> 
> <br>
> 
> 译注：本方法返回的 `Iterator` 中的项被删除以后，直接影响将要发送给客户端的在线玩家人数。这样客户端展示的在线玩家列表的长度才能与在线玩家人数相一致。因此没有 `setNumPlayers(int)` 这样的方法。
> 
> 此方法的文档强调了本事件不一定由服务端触发，也可能是由插件触发，实现的方式与 `Bukkit` 系列服务端可能不同。
> 
> 在 `1.16.5` 版本 `Spigot` 服务端中，本方法的方法体只有一行，是 `throw new UnsupportedOperationException();` ，因而无法遍历或修改玩家列表。