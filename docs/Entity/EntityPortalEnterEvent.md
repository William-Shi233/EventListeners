---
description: EntityPortalEnterEvent
---

# EntityPortalEnterEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityPortalEnterEvent

### 类描述

> Called when an entity comes into contact with a portal
> 
> <br>
> 
> 当实体步入传送门时触发。

### 方法列表

#### getLocation

方法声明: public Location getLocation()

方法签名: ()Lorg/bukkit/Location;

> Gets the portal block the entity is touching
> 
> @return The portal block the entity is touching
> 
> <br>
> 
> 该方法用于获取实体触及的传送门方块。
> 
> @return 实体触及的传送门方块。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;