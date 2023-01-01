---
description: EntityTeleportEvent
---

# EntityTeleportEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityTeleportEvent

### 类描述

> Thrown when a non-player entity is teleported from one location to another.
>
> <br>
>
> This may be as a result of natural causes (Enderman, Shulker), pathfinding
>
> (Wolf), or commands (/teleport).

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getFrom

方法声明: public Location getFrom()

方法签名: ()Lorg/bukkit/Location;

> Gets the location that this entity moved from
>
> @return Location this entity moved from

#### setFrom

方法声明: public void setFrom(@NotNull Location from)

方法签名: (Lorg/bukkit/Location;)V

> Sets the location that this entity moved from
>
> @param from New location this entity moved from

#### getTo

方法声明: public Location getTo()

方法签名: ()Lorg/bukkit/Location;

> Gets the location that this entity moved to
>
> @return Location the entity moved to

#### setTo

方法声明: public void setTo(@Nullable Location to)

方法签名: (Lorg/bukkit/Location;)V

> Sets the location that this entity moved to
>
> @param to New Location this entity moved to

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;