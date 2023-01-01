---
description: PlayerPortalEvent
---

# PlayerPortalEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerMoveEvent

                =>  org.bukkit.event.player.PlayerTeleportEvent

                    =>  org.bukkit.event.player.PlayerPortalEvent

### 类描述

> Called when a player is about to teleport because it is in contact with a
>
> portal which will generate an exit portal.
>
> <p>
>
> For other entities see {@link org.bukkit.event.entity.EntityPortalEvent}

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

#### getCanCreatePortal

方法声明: public boolean getCanCreatePortal()

方法签名: ()Z

> Returns whether the server will attempt to create a destination portal or
>
> not.
>
> @return whether there should create be a destination portal created

#### setCanCreatePortal

方法声明: public void setCanCreatePortal(boolean canCreatePortal)

方法签名: (Z)V

> Sets whether the server should attempt to create a destination portal or
>
> not.
>
> @param canCreatePortal Sets whether there should be a destination portal
>
> created

#### setCreationRadius

方法声明: public void setCreationRadius(int creationRadius)

方法签名: (I)V

> Sets the maximum radius the world is searched for a free space from the
>
> given location.
>
> If enough free space is found then the portal will be created there, if
>
> not it will force create with air-space at the target location.
>
> Does not apply to end portal target platforms which will always appear at
>
> the target location.
>
> @param creationRadius the radius in which to create a portal from the
>
> location

#### getCreationRadius

方法声明: public int getCreationRadius()

方法签名: ()I

> Gets the maximum radius the world is searched for a free space from the
>
> given location.
>
> If enough free space is found then the portal will be created there, if
>
> not it will force create with air-space at the target location.
>
> Does not apply to end portal target platforms which will always appear at
>
> the target location.
>
> @return the currently set creation radius

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;