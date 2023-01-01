---
description: ExplosionPrimeEvent
---

# ExplosionPrimeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.ExplosionPrimeEvent

### 类描述

> Called when an entity has made a decision to explode.

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getRadius

方法声明: public float getRadius()

方法签名: ()F

> Gets the radius of the explosion
>
> @return returns the radius of the explosion

#### setRadius

方法声明: public void setRadius(float radius)

方法签名: (F)V

> Sets the radius of the explosion
>
> @param radius the radius of the explosion

#### getFire

方法声明: public boolean getFire()

方法签名: ()Z

> Gets whether this explosion will create fire or not
>
> @return true if this explosion will create fire

#### setFire

方法声明: public void setFire(boolean fire)

方法签名: (Z)V

> Sets whether this explosion will create fire or not
>
> @param fire true if you want this explosion to create fire

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;