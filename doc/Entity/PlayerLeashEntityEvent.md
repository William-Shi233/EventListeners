---
description: PlayerLeashEntityEvent
---

# PlayerLeashEntityEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.PlayerLeashEntityEvent

### 类描述

> Called immediately prior to a creature being leashed by a player.

### 方法列表

#### getLeashHolder

方法声明: public Entity getLeashHolder()

方法签名: ()Lorg/bukkit/entity/Entity;

> Returns the entity that is holding the leash.
>
> @return The leash holder

#### getEntity

方法声明: public Entity getEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Returns the entity being leashed.
>
> @return The entity

#### getPlayer

方法声明: public final Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Returns the player involved in this event
>
> @return Player who is involved in this event

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V