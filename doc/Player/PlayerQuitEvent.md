---
description: PlayerQuitEvent
---

# PlayerQuitEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerQuitEvent

### 类描述

> Called when a player leaves a server

### 方法列表

#### getQuitMessage

方法声明: public String getQuitMessage()

方法签名: ()Ljava/lang/String;

> Gets the quit message to send to all online players
>
> @return string quit message

#### setQuitMessage

方法声明: public void setQuitMessage(@Nullable String quitMessage)

方法签名: (Ljava/lang/String;)V

> Sets the quit message to send to all online players
>
> @param quitMessage quit message

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;