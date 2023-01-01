---
description: PlayerRespawnEvent
---

# PlayerRespawnEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerRespawnEvent

### 类描述

> Called when a player respawns.

### 方法列表

#### getRespawnLocation

方法声明: public Location getRespawnLocation()

方法签名: ()Lorg/bukkit/Location;

> Gets the current respawn location
>
> @return Location current respawn location

#### setRespawnLocation

方法声明: public void setRespawnLocation(@NotNull Location respawnLocation)

方法签名: (Lorg/bukkit/Location;)V

> Sets the new respawn location
>
> @param respawnLocation new location for the respawn

#### isBedSpawn

方法声明: public boolean isBedSpawn()

方法签名: ()Z

> Gets whether the respawn location is the player's bed.
>
> @return true if the respawn location is the player's bed.

#### isAnchorSpawn

方法声明: public boolean isAnchorSpawn()

方法签名: ()Z

> Gets whether the respawn location is the player's respawn anchor.
>
> @return true if the respawn location is the player's respawn anchor.

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;