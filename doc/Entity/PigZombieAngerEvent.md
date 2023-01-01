---
description: PigZombieAngerEvent
---

# PigZombieAngerEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.PigZombieAngerEvent

### 类描述

> Called when a Pig Zombie is angered by another entity.
>
> <p>
>
> If the event is cancelled, the pig zombie will not be angered.

### 方法列表

#### getTarget

方法声明: public Entity getTarget()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the entity (if any) which triggered this anger update.
>
> @return triggering entity, or null

#### getNewAnger

方法声明: public int getNewAnger()

方法签名: ()I

> Gets the new anger resulting from this event.
>
> @return new anger
>
> @see PigZombie#getAnger()

#### setNewAnger

方法声明: public void setNewAnger(int newAnger)

方法签名: (I)V

> Sets the new anger resulting from this event.
>
> @param newAnger the new anger
>
> @see PigZombie#setAnger(int)

#### getEntity

方法声明: public PigZombie getEntity()

方法签名: ()Lorg/bukkit/entity/PigZombie;

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