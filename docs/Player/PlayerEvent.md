---
description: PlayerEvent
---

# PlayerEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

### 类描述

> Represents a player related event
> 
> <br>
> 
> 代表与玩家有关的事件。
> 
> <br>
> 
> 译注：该事件未实现 `getHandlers()` 和 `getHandlerList()` 方法，无法直接监听。

### 方法列表

#### getPlayer

方法声明: public final Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Returns the player involved in this event
> 
> @return Player who is involved in this event
> 
> <br>
> 
> 该方法用于获取涉事玩家。
> 
> @return 涉事玩家。