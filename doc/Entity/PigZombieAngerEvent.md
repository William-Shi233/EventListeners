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
>
> 当某只僵尸猪灵被其他实体激怒时触发。
>
> 如果本事件被取消，则该僵尸猪灵将不会被激怒。

### 方法列表

#### getTarget

方法声明: public Entity getTarget()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the entity (if any) which triggered this anger update.
>
> @return triggering entity, or null
>
> 该方法用于获取导致猪灵愤怒程度变化的实体（如存在）。
>
> @return 导致猪灵愤怒程度变化的实体，如没有则返回 `null` 。

#### getNewAnger

方法声明: public int getNewAnger()

方法签名: ()I

> Gets the new anger resulting from this event.
>
> @return new anger
>
> @see PigZombie#getAnger()
>
> 该方法用于获取僵尸猪灵将要拥有的愤怒等级。
>
> @return 僵尸猪灵将要拥有的愤怒等级。
>
> @see 参见 `PigZombie#getAnger()` 方法。

#### setNewAnger

方法声明: public void setNewAnger(int newAnger)

方法签名: (I)V

> Sets the new anger resulting from this event.
>
> @param newAnger the new anger
>
> @see PigZombie#setAnger(int)
>
> 该方法用于设置僵尸猪灵将要拥有的愤怒等级。
>
> @param 僵尸猪灵将要拥有的愤怒等级。
>
> @see 参见 `PigZombie#setAnger(int)` 方法。

#### getEntity

方法声明: public PigZombie getEntity()

方法签名: ()Lorg/bukkit/entity/PigZombie;

> 译注：无文档。该方法用于获取被激怒的僵尸猪灵。

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