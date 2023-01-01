---
description: ServerLoadEvent
---

# ServerLoadEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.server.ServerEvent

            =>  org.bukkit.event.server.ServerLoadEvent

### 类描述

> This event is called when either the server startup or reload has completed.

### 方法列表

#### getType

方法声明: public LoadType getType()

方法签名: ()Lorg/bukkit/event/server/ServerLoadEvent/LoadType;

> Gets the context in which the server was loaded.
>
> @return the context in which the server was loaded

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: LoadType

> Represents the context in which the enclosing event has been completed.

#### STARTUP

#### RELOADnts the context in which the enclosing event has been completed.

#### RELOAD

> > Represents the context in which the enclosing event has been completed.