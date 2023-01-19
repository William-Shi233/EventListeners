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
>
> 当服务器开启或重载完毕时触发。
>
> 译注：所谓“重载”指 `/reload` 指令，该指令常用于在不关闭服务器的前提下重启插件。
>
> 与 `WorldLoadEvent` 不同，本事件会在所有加载时机为 `POSTWORLD` 的插件全部加载完毕后触发，因此无需调整插件加载时机也可以监听到本事件。

### 方法列表

#### getType

方法声明: public LoadType getType()

方法签名: ()Lorg/bukkit/event/server/ServerLoadEvent/LoadType;

> Gets the context in which the server was loaded.
>
> @return the context in which the server was loaded
>
> 该方法用于获取服务器加载的上下文。
>
> @return 服务器加载的上下文。
> 
> 译注：所谓“上下文”，在程序设计中指的是开发者完成一项任务所需要的全部信息，或者程序运行所需要的一些基本信息的集合。此处文档里的 `Context` 一词失之宽泛，方法名中的 `Type` 更合适。本方法只是用来确定本事件是因为服务器开启而触发还是因为 `/reload` 指令被触发。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: LoadType

> Represents the context in which the enclosing event has been completed.
>
> 用于确定外部事件触发所在上下文的枚举。
> 
> 译注：所谓“上下文”一词较宽泛，此枚举只是用来确定本事件是因为服务器开启而触发还是因为 `/reload` 指令被触发。

#### STARTUP

> 译注：无文档。表示因为服务器开启而触发。

#### RELOAD

> 译注：无文档。表示因为执行了 `/reload` 指令而触发。