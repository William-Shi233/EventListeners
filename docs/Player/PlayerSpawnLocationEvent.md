---
description: PlayerSpawnLocationEvent
---

# PlayerSpawnLocationEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.spigotmc.event.player.PlayerSpawnLocationEvent

### 类描述

> Called when player is about to spawn in a world after joining the server.
> 
> <p>
> 
> 当玩家成功登录服务器后，服务器即将生成玩家实体时触发。
> 
> <p>
> 
> 译注：在 `AsyncPlayerPreLoginEvent` 、`PlayerPreLoginEvent` 、`PlayerLoginEvent` 事件触发时，服务器里还不存在玩家实体。这几个事件是在客户端尝试与服务端建立联系时触发的，插件可以通过事件所提供的 `disallow()` 等方法拒绝客户端登录。这样拒绝时，服务端内不会出现玩家实体。玩家登录过程将会尽早被切断。而 `PlayerSpawnLocationEvent` 触发时玩家已经成功加入了服务器，即将生成玩家实体。该事件不可取消，也无法将玩家踢出服务器。`PlayerJoinEvent` 事件触发时，服务器内已经生成了玩家实体。可通过 `Player#kickPlayer(String)` 方法将玩家踢出服务器。

### 方法列表

#### getSpawnLocation

方法声明: public Location getSpawnLocation()

方法签名: ()Lorg/bukkit/Location;

> Gets player's spawn location.
> 
> If the player {@link Player#hasPlayedBefore()}, it's going to default to the location inside player.dat file.
> 
> For new players, the default spawn location is spawn of the main Bukkit world.
> 
> @return the spawn location
> 
> <p>
> 
> 该方法用于获取将要生成玩家实体的位置。
> 
> 如果 `Player#hasPlayedBefore()` 方法返回 `true` ，则可知玩家曾经上线过，此时将返回 `player.dat` 存档文件中记录的玩家上次离线时所在的位置。
> 
> 如果玩家从未进入过服务器，则返回 `Bukkit` 服务端主世界的世界重生点位置。
> 
> @return 将要生成玩家实体的位置。

#### setSpawnLocation

方法声明: public void setSpawnLocation(@NotNull Location location)

方法签名: (Lorg/bukkit/Location;)V

> Sets player's spawn location.
> 
> @param location the spawn location
> 
> <p>
> 
> 该方法用于设置将要生成玩家实体的位置。
> 
> @param location 将要生成玩家实体的位置。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;