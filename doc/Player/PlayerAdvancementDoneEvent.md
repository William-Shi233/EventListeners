---
description: PlayerAdvancementDoneEvent
---

# PlayerAdvancementDoneEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerAdvancementDoneEvent

### 类描述

> Called when a player has completed all criteria in an advancement.

### 方法列表

#### getAdvancement

方法声明: public Advancement getAdvancement()

方法签名: ()Lorg/bukkit/advancement/Advancement;

> Get the advancement which has been completed.
>
> @return completed advancement

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;