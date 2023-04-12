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
>
>
> 
> 当玩家重生时触发。
>
>
> 
> 译注：参见 `MineCraft Wiki` 的相关页面 [https://minecraft.fandom.com/wiki/Spawn](https://minecraft.fandom.com/wiki/Spawn) 可知，玩家的“重生点位置”是一个确定的点，而玩家复活时的位置则是重生点附近的一片区域内的某个随机位置，不在重生点的正上方。下文多次提到“重生点位置”，该位置仅能代表床、重生锚或世界重生点的位置，不能代表玩家实际所处的位置。

### 方法列表

#### getRespawnLocation

方法声明: public Location getRespawnLocation()

方法签名: ()Lorg/bukkit/Location;

> Gets the current respawn location
>
> @return Location current respawn location
>
>
> 
> 该方法用于获取当前的玩家重生点。
>
> @return 当前的玩家重生点。

#### setRespawnLocation

方法声明: public void setRespawnLocation(@NotNull Location respawnLocation)

方法签名: (Lorg/bukkit/Location;)V

> Sets the new respawn location
>
> @param respawnLocation new location for the respawn
>
>
> 
> 该方法用于设置新的玩家重生点。
>
> @param respawnLocation 新的玩家重生点。

#### isBedSpawn

方法声明: public boolean isBedSpawn()

方法签名: ()Z

> Gets whether the respawn location is the player's bed.
>
> @return true if the respawn location is the player's bed.
>
>
> 
> 该方法用于获取重生点位置是否为玩家的床。
>
> @return 如果重生点位置是玩家的床，则返回 `true` 。

#### isAnchorSpawn

方法声明: public boolean isAnchorSpawn()

方法签名: ()Z

> Gets whether the respawn location is the player's respawn anchor.
>
> @return true if the respawn location is the player's respawn anchor.
>
>
> 
> 该方法用于获取重生点位置是否为玩家的重生锚。
>
> @return 如果重生点位置是玩家的重生锚，则返回 `true` 。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;