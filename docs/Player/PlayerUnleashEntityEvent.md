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
> <br>
> 
> 当实体身上的拴绳即将因玩家而被解开时触发。

### 方法列表

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Returns the player who is unleashing the entity.
> 
> @return The player
> 
> <br>
> 
> 该方法用于获取解开拴绳的玩家。
> 
> @return 涉事玩家。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V