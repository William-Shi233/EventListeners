---
description: PlayerToggleSneakEvent
---

# PlayerToggleSneakEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerToggleSneakEvent

### 类描述

> Called when a player toggles their sneaking state

### 方法列表

#### isSneaking

方法声明: public boolean isSneaking()

方法签名: ()Z

> Returns whether the player is now sneaking or not.
>
> @return sneaking state

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