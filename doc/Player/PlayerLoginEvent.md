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
> 
> 本事件存储了试图登录服务器的玩家的有关数据。
>
> 本事件是在玩家初始化过程的**较早**阶段触发的。如果需要操作玩家实体，建议推迟到 `PlayerJoinEvent` 监听器内执行。
>
> 译注：事件不是用来完成数据的持久化存储的。此处所谓“存储”意为事件的字段中含有一些与事件中玩家有关的信息，该事件从服务端底层得到这些信息，存储于一些字段中，再给插件进行读取。当插件处理完毕以后，事件对象应该被销毁。不能使用事件对象来对数据进行保存。
> 
> 在 `AsyncPlayerPreLoginEvent` 、`PlayerPreLoginEvent` 、`PlayerLoginEvent` 事件触发时，服务器里还不存在玩家实体。这几个事件是在客户端尝试与服务端建立联系时触发的，插件可以通过事件所提供的 `disallow()` 等方法拒绝客户端登录。这样拒绝时，服务端内不会出现玩家实体。玩家登录过程将会尽早被切断。而 `PlayerSpawnLocationEvent` 触发时玩家已经成功加入了服务器，即将生成玩家实体。该事件不可取消，也无法将玩家踢出服务器。`PlayerJoinEvent` 事件触发时，服务器内已经生成了玩家实体。可通过 `Player#kickPlayer(String)` 方法将玩家踢出服务器。

### 方法列表

#### getRealAddress

方法声明: public InetAddress getRealAddress()

方法签名: ()Ljava/net/InetAddress;

> Gets the connection address of this player, regardless of whether it has been spoofed or not.
>
> @return the player's connection address
>
> 该方法用于获取试图登录的玩家的真实 `IP` 地址，返回一个 `InetAddress` 类型的对象。无论玩家有没有对 `IP` 地址作掩盖，都会返回真实 `IP` 地址。
>
> @return 玩家的真实 `IP` 地址。

#### getResult

方法声明: public Result getResult()

方法签名: ()Lorg/bukkit/event/player/PlayerLoginEvent/Result;

> Gets the current result of the login, as an enum
>
> @return Current Result of the login
>
> 该方法用于获取目前的登录结果，返回一个 `PlayerLoginEvent.Result` 枚举值。
> 
> @return 目前的登录结果。

#### setResult

方法声明: public void setResult(@NotNull final Result result)

方法签名: (Lorg/bukkit/event/player/PlayerLoginEvent/Result;)V

> Sets the new result of the login, as an enum
>
> @param result New result to set
>
> 该方法用于设置登录结果，接收一个 `PlayerLoginEvent.Result` 枚举值作为参数。
> 
> @return 新的登录结果。

#### getKickMessage

方法声明: public String getKickMessage()

方法签名: ()Ljava/lang/String;

> Gets the current kick message that will be used if getResult() !=
>
> Result.ALLOWED
>
> @return Current kick message
>
> 该方法用于获取将展示给玩家的拒绝登录原因字符串。如果 `getResult() != Result.ALLOWED` 则将会把该字符串显示给玩家。
>
> @return 拒绝登录原因字符串。

#### setKickMessage

方法声明: public void setKickMessage(@NotNull final String message)

方法签名: (Ljava/lang/String;)V

> Sets the kick message to display if getResult() != Result.ALLOWED
>
> @param message New kick message
>
> 该方法用于设置将展示给玩家的拒绝登录原因字符串。如果 `getResult() != Result.ALLOWED` 则将会把该字符串显示给玩家。
>
> @param 拒绝登录原因字符串。

#### getHostname

方法声明: public String getHostname()

方法签名: ()Ljava/lang/String;

> Gets the hostname that the player used to connect to the server, or
>
> blank if unknown
>
> @return The hostname
>
> 该方法用于获取玩家连接服务器时所填写的主机名，如果未知则返回空字符串。
>
> @return 主机名。
>
> 译注：所谓“主机名”，指客户端在连接服务器时所填写的“服务器地址”，比如 `mc.hypixel.net` 等。

#### allow

方法声明: public void allow()

方法签名: ()V

> Allows the player to log in
>
> 该方法用于允许玩家登录。

#### disallow

方法声明: public void disallow(@NotNull final Result result, @NotNull final String message)

方法签名: (Lorg/bukkit/event/player/PlayerLoginEvent/Result;Ljava/lang/String;)V

> Disallows the player from logging in, with the given reason
>
> @param result New result for disallowing the player
>
> @param message Kick message to display to the user
> 
> 该方法用于以给定原因拒绝玩家登录。
>
> @param 不允许玩家登录的原因。
> 
> @param 将展示给玩家的拒绝登录原因字符串。

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
>
> 该方法用于获取试图登录的玩家的 `IP` 地址，返回一个 `InetAddress` 类型的对象。
>
> 该方法可用于替代 `player.getAddress()` ，因为后者在本事件触发时返回 `null` 。
>
> @return 玩家的 `IP` 地址。出于版本兼容性考虑，该方法有可能返回 `null` 。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: Result

> Basic kick reasons for communicating to plugins
> 
> 用于帮助插件确定玩家被踢出原因的枚举。
>
> 译注：玩家被允许登录也是该枚举的一个枚举项，本枚举并不只适用于玩家被踢出时。

#### ALLOWED

> The player is allowed to log in
>
> 玩家被允许登录。

#### KICK_FULL

> The player is not allowed to log in, due to the server being full
>
> 由于服务器人数已满，因而不允许登录。

#### KICK_BANNED

> The player is not allowed to log in, due to them being banned
>
> 由于玩家被服务器封禁，因而不允许登录。

#### KICK_WHITELIST

> The player is not allowed to log in, due to them not being on the
>
> white list
>
> 由于玩家不在服务器白名单内，因而不允许登录。

#### KICK_OTHER

> The player is not allowed to log in, for reasons undefined
>
> 由于未知原因，玩家不被允许登录。