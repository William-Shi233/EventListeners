---
description: PlayerCommandSendEvent
---

# PlayerCommandSendEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerCommandSendEvent

### 类描述

> This event is called when the list of available server commands is sent to
>
> the player.
>
> <br>
>
> Commands may be removed from display using this event, but implementations
>
> are not required to securely remove all traces of the command. If secure
>
> removal of commands is required, then the command should be assigned a
>
> permission which is not granted to the player.

### 方法列表

#### getCommands

方法声明: public Collection<String> getCommands()

方法签名: ()Ljava/util/Collection;

> Returns a mutable collection of all top level commands to be sent.
>
> <br>
>
> It is not legal to add entries to this collection, only remove them.
>
> Behaviour of adding entries is undefined.
>
> @return collection of all commands

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;