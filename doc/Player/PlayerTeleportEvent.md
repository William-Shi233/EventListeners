---
description: PlayerTeleportEvent
---

# PlayerTeleportEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerMoveEvent

                =>  org.bukkit.event.player.PlayerTeleportEvent

### 类描述

> Holds information for player teleport events

### 方法列表

#### getCause

方法声明: public TeleportCause getCause()

方法签名: ()Lorg/bukkit/event/player/PlayerTeleportEvent/TeleportCause;

> Gets the cause of this teleportation event
>
> @return Cause of the event

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: TeleportCause

#### ENDER_PEARL

> Indicates the teleporation was caused by a player throwing an Ender
>
> Pearl

#### COMMAND

> Indicates the teleportation was caused by a player executing a
>
> command

#### PLUGIN

> Indicates the teleportation was caused by a plugin

#### NETHER_PORTAL

> Indicates the teleportation was caused by a player entering a
>
> Nether portal

#### END_PORTAL

> Indicates the teleportation was caused by a player entering an End
>
> portal

#### SPECTATE

> Indicates the teleportation was caused by a player teleporting to a
>
> Entity/Player via the spectator menu

#### END_GATEWAY

> Indicates the teleportation was caused by a player entering an End
>
> gateway

#### CHORUS_FRUIT

> Indicates the teleportation was caused by a player consuming chorus
>
> fruit

#### UNKNOWN

> Indicates the teleportation was caused by an event not covered by
>
> this enum