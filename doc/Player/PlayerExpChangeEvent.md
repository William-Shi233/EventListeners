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

### 方法列表

#### getAmount

方法声明: public int getAmount()

方法签名: ()I

> Get the amount of experience the player will receive
>
> @return The amount of experience

#### setAmount

方法声明: public void setAmount(int amount)

方法签名: (I)V

> Set the amount of experience the player will receive
>
> @param amount The amount of experience to set

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;