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
>
> 当一个实体身上的拴绳即将因玩家而被解开时触发。本事件在拴绳被解开以前触发。

### 方法列表

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Returns the player who is unleashing the entity.
>
> @return The player
>
> 该方法用于获取解开拴绳的玩家。
>
> @return 解开拴绳的玩家。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V