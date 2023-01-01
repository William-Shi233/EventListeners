---
description: PlayerLevelChangeEvent
---

# PlayerLevelChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerLevelChangeEvent

### 类描述

> Called when a players level changes

### 方法列表

#### getOldLevel

方法声明: public int getOldLevel()

方法签名: ()I

> Gets the old level of the player
>
> @return The old level of the player

#### getNewLevel

方法声明: public int getNewLevel()

方法签名: ()I

> Gets the new level of the player
>
> @return The new (current) level of the player

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;