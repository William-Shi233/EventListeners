---
description: PlayerLeashEntityEvent
---

# PlayerLeashEntityEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.PlayerLeashEntityEvent

### 类描述

> Called immediately prior to a creature being leashed by a player.
>
>
> 
> 当玩家用拴绳拴住某个实体前触发。
>
>
> 
> 译注：当玩家手持拴绳物品堆拴住实体时本事件会触发。当玩家已经拴住某个实体，并右键栅栏方块，将实体拴在栅栏上时，本事件也会触发。在后一种情形下，将会在栅栏上生成一个绳结实体。绳结实体属于悬挂物，因而会先触发 `HangingPlaceEvent` ，如该事件未被取消，则再触发本事件。

### 方法列表

#### getLeashHolder

方法声明: public Entity getLeashHolder()

方法签名: ()Lorg/bukkit/entity/Entity;

> Returns the entity that is holding the leash.
>
> @return The leash holder
>
>
> 
> 该方法用于获取持有拴绳的实体。
>
> @return 持有拴绳的实体。
>
>
> 
> 译注：如果是玩家手持拴绳物品堆拴住实体时，本方法返回事件中的玩家。如果是玩家将实体拴在栅栏上，则返回绳结实体。

#### getEntity

方法声明: public Entity getEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Returns the entity being leashed.
>
> @return The entity
>
> 
>
> 该方法用于被拴住的实体。
>
> @return 被拴住的实体。

#### getPlayer

方法声明: public final Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Returns the player involved in this event
>
> @return Player who is involved in this event
>
>
> 
> 该方法用于获取事件中的玩家。
>
> @return 事件中的玩家。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V