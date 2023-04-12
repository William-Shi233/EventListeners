---
description: EntityToggleSwimEvent
---

# EntityToggleSwimEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityToggleSwimEvent

### 类描述

> Sent when an entity's swimming status is toggled.
>
>
> 
> 当实体游泳状态切换时触发。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### isSwimming

方法声明: public boolean isSwimming()

方法签名: ()Z

> 译注：无文档。该方法用于获取实体是否将要进入游泳状态。如本方法返回 `true` 则说明实体将开始游泳。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;