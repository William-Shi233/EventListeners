---
description: PlayerPickupArrowEvent
---

# PlayerPickupArrowEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerPickupItemEvent

                =>  org.bukkit.event.player.PlayerPickupArrowEvent

### 类描述

> Thrown when a player picks up an arrow from the ground.
>
>
> 
> 当玩家自地上捡起一支箭矢时触发。

### 方法列表

#### getArrow

方法声明: public AbstractArrow getArrow()

方法签名: ()Lorg/bukkit/entity/AbstractArrow;

> Get the arrow being picked up by the player
>
> @return The arrow being picked up
>
>
> 
> 该方法用于获取玩家捡起的箭矢实体。
>
> @return 玩家捡起的箭矢实体。