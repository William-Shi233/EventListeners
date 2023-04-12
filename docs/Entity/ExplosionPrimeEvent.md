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
>
>
> 
> 当某实体将要爆炸时触发。

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
>
>
> 
> 该方法用于获取爆炸波及的半径。
>
> @return 爆炸波及的半径。

#### setRadius

方法声明: public void setRadius(float radius)

方法签名: (F)V

> Sets the radius of the explosion
>
> @param radius the radius of the explosion
>
>
> 
> 该方法用于设置爆炸波及的半径。
>
> @param radius 爆炸波及的半径。

#### getFire

方法声明: public boolean getFire()

方法签名: ()Z

> Gets whether this explosion will create fire or not
>
> @return true if this explosion will create fire
>
>
> 
> 该方法用于获取爆炸是否会引起火焰燃烧。
>
> @return 如返回 `true` 则本次爆炸会引起火焰燃烧。

#### setFire

方法声明: public void setFire(boolean fire)

方法签名: (Z)V

> Sets whether this explosion will create fire or not
>
> @param fire true if you want this explosion to create fire
>
>
> 
> 该方法用于设置爆炸是否会引起火焰燃烧。
>
> @param fire 如传入 `true` 则本次爆炸会引起火焰燃烧。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;