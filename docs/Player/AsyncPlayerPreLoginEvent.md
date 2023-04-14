---
description: AsyncPlayerPreLoginEvent
---

# AsyncPlayerPreLoginEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.AsyncPlayerPreLoginEvent

### 类描述

> Stores details for players attempting to log in.
> 
> This event is asynchronous, and not run using main thread.
> 
> <br>
> 
> 本事件存储了试图登录服务器的玩家的有关数据。
> 
> 本事件是异步的，不会在主线程内触发。
> 
> <br>
> 
> 译注：`Mojang` 在设计 `MineCraft` 时，几乎没有考虑线程安全问题。整个 `MineCraft` 服务端中的大部分集合、大部分方法，都没有考虑异步操作。在 `MineCraft` 内部，如生成生物、如破坏方块等方法，都运行在主线程上，虽然效率低，但是这样一来也没有线程安全问题。一旦让插件在异步线程中操作 `MineCraft` 中的实体、方块、物品栏等对象，就可能出现并发修改等错误。整个 `MineCraft` 里几乎没有什么方法是线程安全的。除非某方法仅涉及到数据包的发送，否则它就不能运行在异步线程里。比如发送消息给玩家，这个方法仅仅涉及到玩家聊天消息相关数据包的发送，因此它可以异步运行。本事件运行在异步线程里，在异步线程中不可以调用 `Bukkit API` 里那些线程不安全的方法。如必为之，可用 `BukkitScheduler` 调度一个同步任务，使代码在主线程内运行。
> 
> 事件不是用来完成数据的持久化存储的。此处所谓“存储”意为事件的字段中含有一些与涉事玩家有关的信息，该事件从服务端底层得到这些信息，存储于一些字段中，再给插件进行读取。当插件处理完毕以后，事件对象应该被销毁。不能使用事件对象来对数据进行保存。
> 
> 在 `AsyncPlayerPreLoginEvent` 、`PlayerPreLoginEvent` 、`PlayerLoginEvent` 事件触发时，服务器里还不存在玩家实体。这几个事件是在客户端尝试与服务端建立联系时触发的，插件可以通过事件所提供的 `disallow()` 等方法拒绝客户端登录。这样拒绝时，服务端内不会出现玩家实体。玩家登录过程将会尽早被切断。而 `PlayerSpawnLocationEvent` 触发时玩家已经成功加入了服务器，即将生成玩家实体。该事件不可取消，也无法将玩家踢出服务器。`PlayerJoinEvent` 事件触发时，服务器内已经生成了玩家实体。可通过 `Player#kickPlayer(String)` 方法将玩家踢出服务器。

### 方法列表

#### getLoginResult

方法声明: public Result getLoginResult()

方法签名: ()Lorg/bukkit/event/player/AsyncPlayerPreLoginEvent/Result;

> Gets the current result of the login, as an enum
> 
> @return Current Result of the login
> 
> 该方法用于获取目前的登录结果，返回一个 `AsyncPlayerPreLoginEvent.Result` 枚举值。
> 
> @return 一个 `Result` 枚举字段，用于确定目前的登录结果。

#### getResult

方法声明: public PlayerPreLoginEvent.Result getResult()

方法签名: ()Lorg/bukkit/event/player/PlayerPreLoginEvent/Result;

> Gets the current result of the login, as an enum
> 
> @return Current Result of the login
> 
> @see #getLoginResult()
> 
> @deprecated This method uses a deprecated enum from {@link
> 
> PlayerPreLoginEvent}
> 
> <br>
> 
> 该方法用于获取目前的登录结果，返回一个 `PlayerPreLoginEvent.Result` 枚举值。
> 
> @return 一个 `Result` 枚举字段，用于确定目前的登录结果。
> 
> @see 参见本事件的 `getLoginResult()` 方法文档。
> 
> @deprecated 本方法所使用的 `PlayerPreLoginEvent.Result` 枚举已过时，请不要使用本方法，而是使用本事件的 `getLoginResult()` 方法。

#### setLoginResult

方法声明: public void setLoginResult(@NotNull final Result result)

方法签名: (Lorg/bukkit/event/player/AsyncPlayerPreLoginEvent/Result;)V

> Sets the new result of the login, as an enum
> 
> @param result New result to set
> 
> <br>
> 
> 该方法用于设置登录结果，接收一个 `AsyncPlayerPreLoginEvent.Result` 枚举值作为参数。
> 
> @param result 一个 `Result` 枚举字段，用于确定新的登录结果。

#### setResult

方法声明: public void setResult(@NotNull final PlayerPreLoginEvent.Result result)

方法签名: (Lorg/bukkit/event/player/PlayerPreLoginEvent/Result;)V

> Sets the new result of the login, as an enum
> 
> @param result New result to set
> 
> @see #setLoginResult(Result)
> 
> @deprecated This method uses a deprecated enum from {@link
> 
> PlayerPreLoginEvent}
> 
> <br>
> 
> 该方法用于设置登录结果，接收一个 `PlayerPreLoginEvent.Result` 枚举值作为参数。
> 
> @param result 一个 `Result` 枚举字段，用于确定新的登录结果。
> 
> @see 参见本事件的 `setLoginResult(Result)` 方法文档。
> 
> @deprecated 本方法所使用的 `PlayerPreLoginEvent.Result` 枚举已过时，请不要使用本方法，而是使用本事件的 `setLoginResult(Result)` 方法。

#### getKickMessage

方法声明: public String getKickMessage()

方法签名: ()Ljava/lang/String;

> Gets the current kick message that will be used if getResult() !=
> 
> Result.ALLOWED
> 
> @return Current kick message
> 
> <br>
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
> <br>
> 
> 该方法用于设置将展示给玩家的拒绝登录原因字符串。如果 `getResult() != Result.ALLOWED` 则将会把该字符串显示给玩家。
> 
> @param message 拒绝登录原因字符串。

#### allow

方法声明: public void allow()

方法签名: ()V

> Allows the player to log in
> 
> <br>
> 
> 该方法用于允许玩家登录。

#### disallow

方法声明: public void disallow(@NotNull final Result result, @NotNull final String message)

方法签名: (Lorg/bukkit/event/player/AsyncPlayerPreLoginEvent/Result;Ljava/lang/String;)V

> Disallows the player from logging in, with the given reason
> 
> @param result New result for disallowing the player
> 
> @param message Kick message to display to the user
> 
> <br>
> 
> 该方法用于以给定原因拒绝玩家登录。
> 
> @param result 一个 `Result` 枚举字段，用于指明拒绝玩家登录的原因。
> 
> @param message 将展示给玩家的拒绝登录原因字符串。

#### disallow

方法声明: public void disallow(@NotNull final PlayerPreLoginEvent.Result result, @NotNull final String message)

方法签名: (Lorg/bukkit/event/player/PlayerPreLoginEvent/Result;Ljava/lang/String;)V

> Disallows the player from logging in, with the given reason
> 
> @param result New result for disallowing the player
> 
> @param message Kick message to display to the user
> 
> @see #disallow(Result, String)
> 
> @deprecated This method uses a deprecated enum from {@link
> 
> PlayerPreLoginEvent}
> 
> <br>
> 
> 该方法用于以给定原因拒绝玩家登录。
> 
> @param result 一个 `Result` 枚举字段，用于指明拒绝玩家登录的原因。
> 
> @param message 将展示给玩家的拒绝登录原因字符串。
> 
> @see 参见本事件的 `disallow(Result, String)` 方法文档。
> 
> @deprecated 本方法所使用的 `PlayerPreLoginEvent.Result` 枚举已过时，请不要使用本方法，而是使用本事件的 `disallow(@NotNull final Result result, @NotNull final String message)` 方法。

#### getName

方法声明: public String getName()

方法签名: ()Ljava/lang/String;

> Gets the player's name.
> 
> @return the player's name
> 
> <br>
> 
> 该方法用于获取涉事玩家的用户名。
> 
> @return 涉事玩家的用户名。

#### getAddress

方法声明: public InetAddress getAddress()

方法签名: ()Ljava/net/InetAddress;

> Gets the player IP address.
> 
> @return The IP address
> 
> <br>
> 
> 该方法用于获取涉事玩家的 `IP` 地址。
> 
> @return 涉事玩家的 `IP` 地址。

#### getUniqueId

方法声明: public UUID getUniqueId()

方法签名: ()Ljava/util/UUID;

> Gets the player's unique ID.
> 
> @return The unique ID
> 
> <br>
> 
> 该方法用于获取涉事玩家的 `UUID` 。
> 
> @return 涉事玩家的 `UUID` 。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: Result

> Basic kick reasons for communicating to plugins
> 
> <br>
> 
> 用于帮助插件确定玩家被踢出原因的枚举。
> 
> <br>
> 
> 译注：玩家被允许登录也是该枚举的一个枚举项，本枚举并不只适用于玩家被踢出时。

#### ALLOWED

> The player is allowed to log in
> 
> <br>
> 
> 玩家被允许登录。

#### KICK_FULL

> The player is not allowed to log in, due to the server being full
> 
> <br>
> 
> 由于服务器人数已满，因而不允许登录。

#### KICK_BANNED

> The player is not allowed to log in, due to them being banned
> 
> <br>
> 
> 由于玩家被服务器封禁，因而不允许登录。

#### KICK_WHITELIST

> The player is not allowed to log in, due to them not being on the
> 
> white list
> 
> <br>
> 
> 由于玩家不在服务器白名单内，因而不允许登录。

#### KICK_OTHER

> The player is not allowed to log in, for reasons undefined
> 
> <br>
> 
> 由于未知原因，玩家不被允许登录。