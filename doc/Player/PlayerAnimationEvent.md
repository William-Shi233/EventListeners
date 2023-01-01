---
description: PlayerAnimationEvent
---

# PlayerAnimationEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerAnimationEvent

### 类描述

> Represents a player animation event

### 方法列表

#### getAnimationType

方法声明: public PlayerAnimationType getAnimationType()

方法签名: ()Lorg/bukkit/event/player/PlayerAnimationType;

> Get the type of this animation event
>
> @return the animation type

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;