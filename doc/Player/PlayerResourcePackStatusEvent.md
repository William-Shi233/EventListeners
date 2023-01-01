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

### 方法列表

#### getStatus

方法声明: public Status getStatus()

方法签名: ()Lorg/bukkit/event/player/PlayerResourcePackStatusEvent/Status;

> Gets the status of this pack.
>
> @return the current status

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: Status

> Status of the resource pack.

#### SUCCESSFULLY_LOADED

> The resource pack has been successfully downloaded and applied to the
>
> client.

#### DECLINED

> The client refused to accept the resource pack.

#### FAILED_DOWNLOAD

> The client accepted the pack, but download failed.

#### ACCEPTED

> The client accepted the pack and is beginning a download of it.