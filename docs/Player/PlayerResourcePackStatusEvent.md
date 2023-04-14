---
description: PlayerResourcePackStatusEvent
---

# PlayerResourcePackStatusEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerResourcePackStatusEvent

### 类描述

> Called when a player takes action on a resource pack request sent via
> 
> {@link Player#setResourcePack(java.lang.String)}.
> 
> <br>
> 
> 在插件调用 `Player#setResourcePack(java.lang.String)` 方法，要求客户端加载某个指定的资源包以后，客户端对该要求作出回应时触发。
> 
> <br>
> 
> 译注：参见 `MineCraft Wiki` 的相关页面 [https://minecraft.fandom.com/wiki/Resource_pack](https://minecraft.fandom.com/wiki/Resource_pack) 可知，服务端可以设置默认资源包，玩家有权选择是否下载并使用（防止服务端发来恶意内容）。与玩家的拒绝权相对应，服务器方面人员藉由修改配置项也可以将拒绝使用资源包的玩家踢出服务器。

### 方法列表

#### getStatus

方法声明: public Status getStatus()

方法签名: ()Lorg/bukkit/event/player/PlayerResourcePackStatusEvent/Status;

> Gets the status of this pack.
> 
> @return the current status
> 
> <br>
> 
> 该方法用于获取资源包加载的状态。
> 
> @return 一个 `Status` 枚举字段，用于确定资源包加载的状态。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: Status

> Status of the resource pack.
> 
> <br>
> 
> 用于确定资源包加载状态的枚举。

#### SUCCESSFULLY_LOADED

> The resource pack has been successfully downloaded and applied to the
> 
> client.
> 
> <br>
> 
> 资源包下载完毕，并被客户端加载了。

#### DECLINED

> The client refused to accept the resource pack.
> 
> <br>
> 
> 客户端拒绝使用资源包。

#### FAILED_DOWNLOAD

> The client accepted the pack, but download failed.
> 
> <br>
> 
> 客户端同意使用资源包，但下载失败了。

#### ACCEPTED

> The client accepted the pack and is beginning a download of it.
> 
> <br>
> 
> 客户端同意使用资源包，因此开始下载文件。