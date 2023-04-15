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
> This event allows you to modify the velocity of the entity after they have
> 
> successfully exited the portal.
> 
> <br>
> 
> 当实体自传送门中走出时触发。
> 
> 通过监听本事件，可以修改实体走出传送门时的速度向量。

### 方法列表

#### getBefore

方法声明: public Vector getBefore()

方法签名: ()Lorg/bukkit/util/Vector;

> Gets a copy of the velocity that the entity has before entering the
> 
> portal.
> 
> @return velocity of entity before entering the portal
> 
> <br>
> 
> 该方法用于获取涉事实体进入传送门前的速度向量的副本。
> 
> @return 涉事实体进入传送门前的速度向量。

#### getAfter

方法声明: public Vector getAfter()

方法签名: ()Lorg/bukkit/util/Vector;

> Gets a copy of the velocity that the entity will have after exiting the
> 
> portal.
> 
> @return velocity of entity after exiting the portal
> 
> <br>
> 
> 该方法用于获取涉事实体走出传送门后的速度向量的副本。
> 
> @return 涉事实体走出传送门后的速度向量。

#### setAfter

方法声明: public void setAfter(@NotNull Vector after)

方法签名: (Lorg/bukkit/util/Vector;)V

> Sets the velocity that the entity will have after exiting the portal.
> 
> @param after the velocity after exiting the portal
> 
> <br>
> 
> 该方法用于设置涉事实体走出传送门后的速度向量。
> 
> @param after 涉事实体走出传送门后的速度向量。


#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;