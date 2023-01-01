---
description: PlayerChangedWorldEvent
---

# PlayerChangedWorldEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerChangedWorldEvent

### 类描述

> Called when a player switches to another world.

### 方法列表

#### getFrom

方法声明: public World getFrom()

方法签名: ()Lorg/bukkit/World;

> Gets the world the player is switching from.
>
> @return  player's previous world

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;