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
> <br>
> 
> 当玩家自地上捡起箭矢时触发。
> 
> <br>
> 
> 译注：所谓“箭矢”，不是指被丢弃在地面上的物品堆，而是指射出后命中了方块的箭矢实体。玩家靠近箭矢实体时，该实体会自动消失，玩家背包中同时出现箭矢物品堆。如果该箭矢实体是一张附有“无限”附魔的弓所射出的，则玩家无法捡起。

### 方法列表

#### getArrow

方法声明: public AbstractArrow getArrow()

方法签名: ()Lorg/bukkit/entity/AbstractArrow;

> Get the arrow being picked up by the player
> 
> @return The arrow being picked up
> 
> <br>
> 
> 该方法用于获取涉事玩家捡起的箭矢实体。
> 
> @return 被捡起的箭矢实体。