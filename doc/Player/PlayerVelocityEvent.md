---
description: PlayerVelocityEvent
---

# PlayerVelocityEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerVelocityEvent

### 类描述

> Called when the velocity of a player changes.

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getVelocity

方法声明: public Vector getVelocity()

方法签名: ()Lorg/bukkit/util/Vector;

> Gets the velocity vector that will be sent to the player
>
> @return Vector the player will get

#### setVelocity

方法声明: public void setVelocity(@NotNull Vector velocity)

方法签名: (Lorg/bukkit/util/Vector;)V

> Sets the velocity vector in meters per tick that will be sent to the player
>
> @param velocity The velocity vector that will be sent to the player

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;