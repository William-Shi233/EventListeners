---
description: EntityAirChangeEvent
---

# EntityAirChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityAirChangeEvent

### 类描述

> Called when the amount of air an entity has remaining changes.
> 
> <br>
> 
> 当实体剩余的氧气值变化时触发。
> 
> <br>
> 
> 译注：参见 `Minecraft Wiki` 中的相关页面 [https://minecraft.fandom.com/wiki/Damage#Drowning](https://minecraft.fandom.com/wiki/Damage#Drowning) 可知，大多数实体处于水中会消耗氧气。如果氧气不足，会缺氧淹死。

### 方法列表

#### getAmount

方法声明: public int getAmount()

方法签名: ()I

> Gets the amount of air the entity has left (measured in ticks).
> 
> @return amount of air remaining
> 
> <br>
> 
> 该方法用于获取实体剩余的氧气量（以刻为单位）。
> 
> @return 实体剩余的氧气量。

#### setAmount

方法声明: public void setAmount(int amount)

方法签名: (I)V

> Sets the amount of air remaining for the entity (measured in ticks.
> 
> @param amount amount of air remaining
> 
> <br>
> 
> 该方法用于设置实体剩余的氧气量（以刻为单位）。
> 
> @param amount 实体剩余的氧气量。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancelled)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;