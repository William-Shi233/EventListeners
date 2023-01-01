---
description: PlayerInteractAtEntityEvent
---

# PlayerInteractAtEntityEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerInteractEntityEvent

                =>  org.bukkit.event.player.PlayerInteractAtEntityEvent

### 类描述

> Represents an event that is called when a player right clicks an entity that
>
> also contains the location where the entity was clicked.
>
> <br>
>
> Note that the client may sometimes spuriously send this packet in addition to {@link PlayerInteractEntityEvent}.
>
> Users are advised to listen to this (parent) class unless specifically required.

### 方法列表

#### getClickedPosition

方法声明: public Vector getClickedPosition()

方法签名: ()Lorg/bukkit/util/Vector;

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;