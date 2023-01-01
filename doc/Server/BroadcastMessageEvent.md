---
description: BroadcastMessageEvent
---

# BroadcastMessageEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.server.ServerEvent

            =>  org.bukkit.event.server.BroadcastMessageEvent

### 类描述

> Event triggered for server broadcast messages such as from
>
> {@link org.bukkit.Server#broadcast(String, String)}.
>
> <b>This event behaves similarly to {@link AsyncPlayerChatEvent} in that it
>
> should be async if fired from an async thread. Please see that event for
>
> further information.</b>

### 方法列表

#### getMessage

方法声明: public String getMessage()

方法签名: ()Ljava/lang/String;

> Get the message to broadcast.
>
> @return Message to broadcast

#### setMessage

方法声明: public void setMessage(@NotNull String message)

方法签名: (Ljava/lang/String;)V

> Set the message to broadcast.
>
> @param message New message to broadcast

#### getRecipients

方法声明: public Set<CommandSender> getRecipients()

方法签名: ()Ljava/util/Set;

> Gets a set of recipients that this chat message will be displayed to.
>
> <p>
>
> The set returned is not guaranteed to be mutable and may auto-populate
>
> on access. Any listener accessing the returned set should be aware that
>
> it may reduce performance for a lazy set implementation.
>
> <p>
>
> Listeners should be aware that modifying the list may throw {@link
>
> UnsupportedOperationException} if the event caller provides an
>
> unmodifiable set.
>
> @return All CommandSenders who will see this chat message

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancelled)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;