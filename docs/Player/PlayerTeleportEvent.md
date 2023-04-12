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
>
>
> 
> 本事件存储了玩家传送的有关数据。
>
>
> 
> 译注：事件不是用来完成数据的持久化存储的。此处所谓“存储”意为事件的字段中含有一些与事件中玩家有关的信息，该事件从服务端底层得到这些信息，存储于一些字段中，再给插件进行读取。当插件处理完毕以后，事件对象应该被销毁。不能使用事件对象来对数据进行保存。

### 方法列表

#### getCause

方法声明: public TeleportCause getCause()

方法签名: ()Lorg/bukkit/event/player/PlayerTeleportEvent/TeleportCause;

> Gets the cause of this teleportation event
>
> @return Cause of the event
>
>
> 
> 该方法用于获取玩家传送的原因。
>
> @return 玩家传送的原因。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: TeleportCause

> 译注：无文档。用于确定玩家传送原因的枚举。

#### ENDER_PEARL

> Indicates the teleporation was caused by a player throwing an Ender
>
> Pearl
>
> 
>
> 玩家掷出末影珍珠，因而发生传送。

#### COMMAND

> Indicates the teleportation was caused by a player executing a
>
> command
>
>
> 
> 玩家执行指令，因而发生传送。
>
>
> 
> 译注：如 `/tp` 指令。

#### PLUGIN

> Indicates the teleportation was caused by a plugin
>
>
> 
> 插件调用某些方法，因而发生传送。
>
>
> 
> 译注：如插件调用 `Player#teleport(Location location)` 方法。

#### NETHER_PORTAL

> Indicates the teleportation was caused by a player entering a
>
> Nether portal
>
> 
>
> 玩家步入下界传送门，因而发生传送。

#### END_PORTAL

> Indicates the teleportation was caused by a player entering an End
>
> portal
>
> 
>
> 玩家步入末地传送门，因而发生传送。

#### SPECTATE

> Indicates the teleportation was caused by a player teleporting to a
>
> Entity/Player via the spectator menu
>
> 
>
> 玩家在旁观模式界面中进行了选择，传送到某位玩家或某个实体身边。

#### END_GATEWAY

> Indicates the teleportation was caused by a player entering an End
>
> gateway
>
> 
>
> 玩家步入末地折跃门，因而发生传送。

#### CHORUS_FRUIT

> Indicates the teleportation was caused by a player consuming chorus
>
> fruit
>
>
> 
> 玩家服用紫颂果，因而发生传送。

#### UNKNOWN

> Indicates the teleportation was caused by an event not covered by
>
> this enum
>
>
> 
> 未知传送原因。玩家传送的原因不属于上述任何一种，本枚举暂时未能列出。