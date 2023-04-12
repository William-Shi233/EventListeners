---
description: StriderTemperatureChangeEvent
---

# StriderTemperatureChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.StriderTemperatureChangeEvent

### 类描述

> Called when a {@link Strider}'s temperature has changed as a result of
> 
> entering or exiting blocks it considers warm.
> 
> <p>
> 
> 当一只炽足兽的体温发生变化时触发。炽足兽踏足或离开被其判定为温暖的方块时，提问会发生变化。
> 
> <p>
> 
> 译注：参见 `MineCraft Wiki` 中的相关页面 [https://minecraft.fandom.com/wiki/Strider#Behavior](https://minecraft.fandom.com/wiki/Strider#Behavior) 可知，炽足兽如果离开了岩浆则会失温，致使其身体发紫、移动速度降低。回到岩浆上则恢复。

### 方法列表

#### getEntity

方法声明: public Strider getEntity()

方法签名: ()Lorg/bukkit/entity/Strider;

> 译注：无文档。该方法用于获取事件中的炽足兽。

#### isShivering

方法声明: public boolean isShivering()

方法签名: ()Z

> Get the Strider's new shivering state.
> 
> @return the new shivering state
> 
> <p>
> 
> 该方法用于获取炽足兽是否将会颤抖。
> 
> @return 炽足兽是否将会颤抖。
> 
> <p>
> 
> 译注：当炽足兽失温时，将会颤抖。本方法返回 `true` 说明炽足兽将要离开其判定为温暖的方块，将会失温。本方法返回 `false` 说明炽足兽将要重新踏上温暖的方块。

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