---
description: PlayerMoveEvent
---

# PlayerMoveEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerMoveEvent

### 类描述

> Holds information for player movement events

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

> Gets the cancellation state of this event. A cancelled event will not
>
> be executed in the server, but will still pass to other plugins
>
> <p>
>
> If a move or teleport event is cancelled, the player will be moved or
>
> teleported back to the Location as defined by getFrom(). This will not
>
> fire an event
>
> @return true if this event is cancelled

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

> Sets the cancellation state of this event. A cancelled event will not
>
> be executed in the server, but will still pass to other plugins
>
> <p>
>
> If a move or teleport event is cancelled, the player will be moved or
>
> teleported back to the Location as defined by getFrom(). This will not
>
> fire an event
>
> @param cancel true if you wish to cancel this event

#### getFrom

方法声明: public Location getFrom()

方法签名: ()Lorg/bukkit/Location;

> Gets the location this player moved from
>
> @return Location the player moved from

#### setFrom

方法声明: public void setFrom(@NotNull Location from)

方法签名: (Lorg/bukkit/Location;)V

> Sets the location to mark as where the player moved from
>
> @param from New location to mark as the players previous location

#### getTo

方法声明: public Location getTo()

方法签名: ()Lorg/bukkit/Location;

> Gets the location this player moved to
>
> @return Location the player moved to

#### setTo

方法声明: public void setTo(@NotNull Location to)

方法签名: (Lorg/bukkit/Location;)V

> Sets the location that this player will move to
>
> @param to New Location this player will move to

#### validateLocation

方法声明: private void validateLocation(@NotNull Location loc)

方法签名: (Lorg/bukkit/Location;)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;