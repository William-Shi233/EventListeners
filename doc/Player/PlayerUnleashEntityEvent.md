---
description: PlayerUnleashEntityEvent
---

# PlayerUnleashEntityEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityUnleashEvent

                =>  org.bukkit.event.player.PlayerUnleashEntityEvent

### 类描述

> Called prior to an entity being unleashed due to a player's action.

### 方法列表

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Returns the player who is unleashing the entity.
>
> @return The player

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V