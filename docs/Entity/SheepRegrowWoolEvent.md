---
description: SheepRegrowWoolEvent
---

# SheepRegrowWoolEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.SheepRegrowWoolEvent

### 类描述

> Called when a sheep regrows its wool
> 
> <br>
> 
> 当某只已经被剪去毛的羊重新生长出羊毛时触发。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getEntity

方法声明: public Sheep getEntity()

方法签名: ()Lorg/bukkit/entity/Sheep;

> 译注：无文档。该方法用于获取涉事羊实体。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;