---
description: PlayerBedLeaveEvent
---

# PlayerBedLeaveEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerBedLeaveEvent

### 类描述

> This event is fired when the player is leaving a bed.

### 方法列表

#### getBed

方法声明: public Block getBed()

方法签名: ()Lorg/bukkit/block/Block;

> Returns the bed block involved in this event.
>
> @return the bed block involved in this event

#### shouldSetSpawnLocation

方法声明: public boolean shouldSetSpawnLocation()

方法签名: ()Z

> Get if this event should set the new spawn location for the
>
> {@link Player}.
>
> <br>
>
> This does not remove any existing spawn location, only prevent it from
>
> being changed (if true).
>
> <br>
>
> To change a {@link Player}'s spawn location, use
>
> {@link Player#setBedSpawnLocation(Location)}.
>
> @return true if the spawn location will be changed

#### setSpawnLocation

方法声明: public void setSpawnLocation(boolean setBedSpawn)

方法签名: (Z)V

> Set if this event should set the new spawn location for the
>
> {@link Player}.
>
> <br>
>
> This will not remove any existing spawn location, only prevent it from
>
> being changed (if true).
>
> <br>
>
> To change a {@link Player}'s spawn location, use
>
> {@link Player#setBedSpawnLocation(Location)}.
>
> @param setBedSpawn true to change the new spawn location

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancelled)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;