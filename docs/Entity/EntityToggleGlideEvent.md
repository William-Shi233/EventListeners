---
description: EntityToggleGlideEvent
---

# EntityToggleGlideEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityToggleGlideEvent

### 类描述

> Sent when an entity's gliding status is toggled with an Elytra.
> 
> Examples of when this event would be called:
> 
> <ul>
> 
> <li>Player presses the jump key while in midair and using an Elytra</li>
> 
> <li>Player lands on ground while they are gliding (with an Elytra)</li>
> 
> </ul>
> 
> This can be visually estimated by the animation in which a player turns horizontal.
> 
> <br>
> 
> 当实体的滑翔状态发生变化时触发。实体借助鞘翅可以进行滑翔。
> 
> 本事件被触发的情景包括：
> 
> <ul>
> 
> <li>穿有鞘翅的玩家在半空按下跳跃键</li>
> 
> <li>玩家（穿有鞘翅）滑翔时降落到地面上</li>
> 
> </ul>
> 
> 自视觉角度而言，玩家开始滑翔时会出现一段自垂直站立状态变为水平俯身状态的动画，因此很容易判断出玩家是将要进入滑翔状态还是终止滑翔。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### isGliding

方法声明: public boolean isGliding()

方法签名: ()Z

> 译注：无文档。该方法用于获取实体是否将要进入滑翔状态。如本方法返回 `true` 则说明实体将开始滑翔。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;