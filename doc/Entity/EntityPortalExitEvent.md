---
description: EntityPortalExitEvent
---

# EntityPortalExitEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityTeleportEvent

                =>  org.bukkit.event.entity.EntityPortalExitEvent

### 类描述

> Called before an entity exits a portal.
>
> <p>
>
> This event allows you to modify the velocity of the entity after they have
>
> successfully exited the portal.

### 方法列表

#### getBefore

方法声明: public Vector getBefore()

方法签名: ()Lorg/bukkit/util/Vector;

> Gets a copy of the velocity that the entity has before entering the
>
> portal.
>
> @return velocity of entity before entering the portal

#### getAfter

方法声明: public Vector getAfter()

方法签名: ()Lorg/bukkit/util/Vector;

> Gets a copy of the velocity that the entity will have after exiting the
>
> portal.
>
> @return velocity of entity after exiting the portal

#### setAfter

方法声明: public void setAfter(@NotNull Vector after)

方法签名: (Lorg/bukkit/util/Vector;)V

> Sets the velocity that the entity will have after exiting the portal.
>
> @param after the velocity after exiting the portal

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;