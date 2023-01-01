---
description: ArrowBodyCountChangeEvent
---

# ArrowBodyCountChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.ArrowBodyCountChangeEvent

### 类描述

> Called when an arrow enters or exists an entity's body.

### 方法列表

#### isReset

方法声明: public boolean isReset()

方法签名: ()Z

> Whether the event was called because the entity was reset.
>
> @return was reset

#### getOldAmount

方法声明: public int getOldAmount()

方法签名: ()I

> Gets the old amount of arrows in the entity's body.
>
> @return amount of arrows

#### getNewAmount

方法声明: public int getNewAmount()

方法签名: ()I

> Get the new amount of arrows in the entity's body.
>
> @return amount of arrows

#### setNewAmount

方法声明: public void setNewAmount(int newAmount)

方法签名: (I)V

> Sets the final amount of arrows in the entity's body.
>
> @param newAmount amount of arrows

#### getEntity

方法声明: public LivingEntity getEntity()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;