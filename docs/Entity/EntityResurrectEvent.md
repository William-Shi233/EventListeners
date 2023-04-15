---
description: EntityResurrectEvent
---

# EntityResurrectEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityResurrectEvent

### 类描述

> Called when an entity dies and may have the opportunity to be resurrected.
> 
> Will be called in a cancelled state if the entity does not have a totem
> 
> equipped.
> 
> <br>
> 
> 当实体死亡且有机会复活时触发。如果实体没有手持不死图腾，则本事件在触发时就已然处于被取消状态。

### 方法列表

#### getEntity

方法声明: public LivingEntity getEntity()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

> 译注：无文档。该方法用于获取将要复活的实体。

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