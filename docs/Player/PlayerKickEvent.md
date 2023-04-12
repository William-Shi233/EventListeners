---
description: PlayerKickEvent
---

# PlayerKickEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerKickEvent

### 类描述

> Called when a player gets kicked from the server
>
>
> 
> 当玩家从服务器中被踢出时触发。

### 方法列表

#### getReason

方法声明: public String getReason()

方法签名: ()Ljava/lang/String;

> Gets the reason why the player is getting kicked
>
> @return string kick reason
>
>
> 
> 该方法用于获取玩家被踢出的理由，理由以字符串形式表示。
>
> @return 玩家被踢出的理由。

#### getLeaveMessage

方法声明: public String getLeaveMessage()

方法签名: ()Ljava/lang/String;

> Gets the leave message send to all online players
>
> @return string kick reason
>
>
> 
> 该方法用于获取将要广播给全体玩家的退出消息。
>
> @return 将要广播给全体玩家的退出消息。
>
>
> 
> 译注：比如“William_Shi left the game”。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### setReason

方法声明: public void setReason(@NotNull String kickReason)

方法签名: (Ljava/lang/String;)V

> Sets the reason why the player is getting kicked
>
> @param kickReason kick reason
>
>
> 
> 该方法用于设置玩家被踢出的理由，理由以字符串形式表示。
> 
> @param kickReason 玩家被踢出的理由。

#### setLeaveMessage

方法声明: public void setLeaveMessage(@NotNull String leaveMessage)

方法签名: (Ljava/lang/String;)V

> Sets the leave message send to all online players
>
> @param leaveMessage leave message
>
>
> 
> 该方法用于设置将要广播给全体玩家的退出消息。
>
> @param leaveMessage 将要广播给全体玩家的退出消息。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;