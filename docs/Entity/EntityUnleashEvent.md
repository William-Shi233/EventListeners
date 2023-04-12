---
description: EntityUnleashEvent
---

# EntityUnleashEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityUnleashEvent

### 类描述

> Called immediately prior to an entity being unleashed.
> 
> <br>
> 
> 当某个实体身上的拴绳被解开前触发。

### 方法列表

#### getReason

方法声明: public UnleashReason getReason()

方法签名: ()Lorg/bukkit/event/entity/EntityUnleashEvent/UnleashReason;

> Returns the reason for the unleashing.
> 
> @return The reason
> 
> <br>
> 
> 该方法用于获取拴绳解开的原因。
> 
> @return 拴绳解开的原因。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: UnleashReason

> 译注：无文档。用于确定拴绳解开原因的枚举。

#### HOLDER_GONE

> When the entity's leashholder has died or logged out, and so is
> 
> unleashed
> 
> <br>
> 
> 持有拴绳者死亡或退出服务器。
> 
> <br>
> 
> 译注：本字段文档用语易引起歧义。由于只有玩家可以“退出服务器”，所以“持有拴绳者死亡或退出服务器”，容易令人误以为持有拴绳者一定是玩家。非然。比如流浪商人身上拴有两只行商羊驼，当流浪商人死亡时拴绳自然解开。玩家死亡只是“持有拴绳者死亡”的一种特殊情况。本字段文档实际包括了“玩家死亡”、“非玩家的实体死亡”、“玩家退出服务器”这三种情况。

#### PLAYER_UNLEASH

> When the entity's leashholder attempts to unleash it
> 
> <br>
> 
> 持有拴绳的玩家主动解开拴绳。

#### DISTANCE

> When the entity's leashholder is more than 10 blocks away
> 
> <br>
> 
> 持有拴绳者距离被拴的实体超过十格远，拴绳断裂。

#### UNKNOWN

> 译注：无文档。未知原因。