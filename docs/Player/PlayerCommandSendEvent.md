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
> Commands may be removed from display using this event, but implementations
>
> are not required to securely remove all traces of the command. If secure
>
> removal of commands is required, then the command should be assigned a
>
> permission which is not granted to the player.
>
>
> 
> 当服务端内一系列可用指令被发送给玩家时触发。
>
> 通过监听此事件，可以将某个指令移除，使客户端不再显示它。然而这样做并不能保证该指令的一切蛛丝马迹都被抹去。如必欲完全移除一个指令，使某些玩家不能执行它，那么应当给该指令附加一个权限判断，只有拥有权限的玩家才能使用该指令，此后将权限有所择取地分配给玩家。
>
>
> 
> 译注：当调用 `Player#updateCommands()` 方法时，会触发此事件，并将服务端内所有已注册的指令发送给客户端。客户端会接收到包括指令名、指令各参数类型等信息在内的数据包，以便在玩家输入指令时进行格式检查和参数类型提示。如果修改了将要发送给客户端的指令列表，从中删去某个指令，那么客户端就会误认为该指令不存在，因而无从显示提示，只能将整段指令标记为红色。虽然如此，如果玩家执意发送该指令，则指令仍然照常运行。不让客户端知道有此指令只能称作治标，在指令执行前增加相应的检查才是治本的方法。

### 方法列表

#### getCommands

方法声明: public Collection<String> getCommands()

方法签名: ()Ljava/util/Collection;

> Returns a mutable collection of all top level commands to be sent.
>
> It is not legal to add entries to this collection, only remove them.
>
> Behaviour of adding entries is undefined.
>
> @return collection of all commands
>
>
> 
> 该方法用于获取一个可修改的集合，该集合中包含了将要发送给玩家的全部指令。这些指令都以字符串形式表示，且都为顶层（即指令本身，比如 `gamemode` 、`gamerule` 等，不包括指令的参数）。
>
> 不可以向此集合中添加元素，只能删除元素。
>
> 向此集合中加入元素后果未知。
>
> @return 包含将要发送给玩家的全部指令的集合。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;