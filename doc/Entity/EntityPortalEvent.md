---
description: EntityPortalEvent
---

# EntityPortalEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityTeleportEvent

                =>  org.bukkit.event.entity.EntityPortalEvent

### 类描述

> Called when a non-player entity is about to teleport because it is in
>
> contact with a portal.
>
> <p>
>
> For players see {@link org.bukkit.event.player.PlayerPortalEvent}

### 方法列表

#### setSearchRadius

方法声明: public void setSearchRadius(int searchRadius)

方法签名: (I)V

> Set the Block radius to search in for available portals.
>
> @param searchRadius the radius in which to search for a portal from the
>
> location

#### getSearchRadius

方法声明: public int getSearchRadius()

方法签名: ()I

> Gets the search radius value for finding an available portal.
>
> @return the currently set search radius

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;