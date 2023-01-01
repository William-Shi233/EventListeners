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

#### setSpawnLocation

方法声明: public void setSpawnLocation(@NotNull Location location)

方法签名: (Lorg/bukkit/Location;)V

> Sets player's spawn location.
>
> @param location the spawn location

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;