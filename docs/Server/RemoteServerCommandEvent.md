---
description: RemoteServerCommandEvent
---

# RemoteServerCommandEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.server.ServerEvent

            =>  org.bukkit.event.server.ServerCommandEvent

                =>  org.bukkit.event.server.RemoteServerCommandEvent

### 类描述

> This event is called when a command is received over RCON. See the javadocs
> 
> of {@link ServerCommandEvent} for more information.
> 
> <br>
> 
> 当服务器接收到由 `RCON` 控制台发送的指令时触发。详见 `ServerCommandEvent` 文档。
> 
> <br>
> 
> 译注：`RCON` 控制台使用 `RCON` 协议，让用户得以在服务端后台以外的地方远程执行指令。

### 方法列表

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;