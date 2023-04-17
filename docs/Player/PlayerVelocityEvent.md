---
description: PlayerVelocityEvent
---

# PlayerVelocityEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerVelocityEvent

### 类描述

> Called when the velocity of a player changes.
> 
> <br>
> 
> 当玩家的速度向量发生变化时触发。
> 
> <br>
> 
> 译注：本事件在玩家被击退时触发，比如受到伤害时。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getVelocity

方法声明: public Vector getVelocity()

方法签名: ()Lorg/bukkit/util/Vector;

> Gets the velocity vector that will be sent to the player
> 
> @return Vector the player will get
> 
> <br>
> 
> 该方法用于获取玩家即将拥有的速度向量。
> 
> @return 玩家即将拥有的速度向量。

#### setVelocity

方法声明: public void setVelocity(@NotNull Vector velocity)

方法签名: (Lorg/bukkit/util/Vector;)V

> Sets the velocity vector in meters per tick that will be sent to the player
> 
> @param velocity The velocity vector that will be sent to the player
> 
> <br>
> 
> 该方法用于设置玩家即将拥有的速度向量。该向量的单位是“米每刻”。
> 
> @param velocity 玩家即将拥有的速度向量。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;