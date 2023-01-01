---
description: PlayerJoinEvent
---

# PlayerJoinEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerJoinEvent

### 类描述

> Called when a player joins a server

### 方法列表

#### getJoinMessage

方法声明: public String getJoinMessage()

方法签名: ()Ljava/lang/String;

> Gets the join message to send to all online players
>
> @return string join message. Can be null

#### setJoinMessage

方法声明: public void setJoinMessage(@Nullable String joinMessage)

方法签名: (Ljava/lang/String;)V

> Sets the join message to send to all online players
>
> @param joinMessage join message. If null, no message will be sent

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;