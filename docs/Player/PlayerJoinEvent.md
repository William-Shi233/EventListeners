---
description: PlayerJoinEvent
---

# PlayerJoinEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerJoinEvent

### 类描述

> Called when a player joins a server
> 
> <br>
> 
> 玩家加入服务器时触发。
> 
> <br>
> 
> 在 `AsyncPlayerPreLoginEvent` 、`PlayerPreLoginEvent` 、`PlayerLoginEvent` 事件触发时，服务器里还不存在玩家实体。这几个事件是在客户端尝试与服务端建立联系时触发的，插件可以通过事件所提供的 `disallow()` 等方法拒绝客户端登录。这样拒绝时，服务端内不会出现玩家实体。玩家登录过程将会尽早被切断。而 `PlayerSpawnLocationEvent` 触发时玩家已经成功加入了服务器，即将生成玩家实体。该事件不可取消，也无法将玩家踢出服务器。`PlayerJoinEvent` 事件触发时，服务器内已经生成了玩家实体。可通过 `Player#kickPlayer(String)` 方法将玩家踢出服务器。

### 方法列表

#### getJoinMessage

方法声明: public String getJoinMessage()

方法签名: ()Ljava/lang/String;

> Gets the join message to send to all online players
> 
> @return string join message. Can be null
> 
> <br>
> 
> 该方法用于获取将要广播给全体玩家的欢迎消息。
> 
> @return 将要广播给全体玩家的欢迎消息。可能为 `null` 。
> 
> <br>
> 
> 译注：比如“William_Shi joined the game”。

#### setJoinMessage

方法声明: public void setJoinMessage(@Nullable String joinMessage)

方法签名: (Ljava/lang/String;)V

> Sets the join message to send to all online players
> 
> @param joinMessage join message. If null, no message will be sent
> 
> <br>
> 
> 该方法用于设置将要广播给全体玩家的欢迎消息。
> 
> @param joinMessage 将要广播给全体玩家的欢迎消息。如果传入 `null` 则不会发送任何消息。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;