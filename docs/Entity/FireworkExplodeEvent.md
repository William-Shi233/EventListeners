---
description: FireworkExplodeEvent
---

# FireworkExplodeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.FireworkExplodeEvent

### 类描述

> Called when a firework explodes.
> 
> <br>
> 
> 当一枚烟花火箭爆炸时触发。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

> Set the cancelled state of this event. If the firework explosion is
> 
> cancelled, the firework will still be removed, but no particles will be
> 
> displayed.
> 
> @param cancel whether to cancel or not.
> 
> <br>
> 
> 该方法用于设置本事件取消与否。如果本事件被取消，则烟花火箭实体仍然会消失，但烟花相关的粒子效果将不会出现。
> 
> @param cancel 是否要取消事件。

#### getEntity

方法声明: public Firework getEntity()

方法签名: ()Lorg/bukkit/entity/Firework;

> 译注：无文档。该方法用于获取爆炸的烟花火箭。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;