---
description: PlayerToggleSprintEvent
---

# PlayerToggleSprintEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerToggleSprintEvent

### 类描述

> Called when a player toggles their sprinting state

### 方法列表

#### isSprinting

方法声明: public boolean isSprinting()

方法签名: ()Z

> Gets whether the player is now sprinting or not.
>
> @return sprinting state

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