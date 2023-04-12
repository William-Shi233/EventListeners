---
description: PlayerExpChangeEvent
---

# PlayerExpChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerExpChangeEvent

### 类描述

> Called when a players experience changes naturally
> 
> <br>
> 
> 当玩家经验值自然变化时触发。
> 
> <br>
> 
> 译注：当玩家死亡掉落经验时或使用指令改变经验时都不会触发此事件。只有玩家捡起经验球时才会触发。

### 方法列表

#### getAmount

方法声明: public int getAmount()

方法签名: ()I

> Get the amount of experience the player will receive
> 
> @return The amount of experience
> 
> <br>
> 
> 该方法用于获取玩家经验值的增量。
> 
> @return 经验值的增量。

#### setAmount

方法声明: public void setAmount(int amount)

方法签名: (I)V

> Set the amount of experience the player will receive
> 
> @param amount The amount of experience to set
> 
> <br>
> 
> 该方法用于设置玩家经验值的增量。
> 
> @param amount 经验值的增量。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;