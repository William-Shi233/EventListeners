---
description: AsyncPlayerChatEvent
---

# AsyncPlayerChatEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.AsyncPlayerChatEvent

### 类描述

> This event will sometimes fire synchronously, depending on how it was
>
> triggered.
>
> <p>
>
> The constructor provides a boolean to indicate if the event was fired
>
> synchronously or asynchronously. When asynchronous, this event can be
>
> called from any thread, sans the main thread, and has limited access to the
>
> API.
>
> <p>
>
> If a player is the direct cause of this event by an incoming packet, this
>
> event will be asynchronous. If a plugin triggers this event by compelling a
>
> player to chat, this event will be synchronous.
>
> <p>
>
> Care should be taken to check {@link #isAsynchronous()} and treat the event
>
> appropriately.

### 方法列表

#### getMessage

方法声明: public String getMessage()

方法签名: ()Ljava/lang/String;

> Gets the message that the player is attempting to send. This message
>
> will be used with {@link #getFormat()}.
>
> @return Message the player is attempting to send

#### setMessage

方法声明: public void setMessage(@NotNull String message)

方法签名: (Ljava/lang/String;)V

> Sets the message that the player will send. This message will be used
>
> with {@link #getFormat()}.
>
> @param message New message that the player will send

#### getFormat

方法声明: public String getFormat()

方法签名: ()Ljava/lang/String;

> Gets the format to use to display this chat message.
>
> <p>
>
> When this event finishes execution, the first format parameter is the
>
> {@link Player#getDisplayName()} and the second parameter is {@link
>
> #getMessage()}
>
> @return {@link String#format(String, Object...)} compatible format
>
> string

#### setFormat

方法声明: public void setFormat(@NotNull final String format) throws IllegalFormatException, NullPointerException

方法签名: (Ljava/lang/String;)V

> Sets the format to use to display this chat message.
>
> <p>
>
> When this event finishes execution, the first format parameter is the
>
> {@link Player#getDisplayName()} and the second parameter is {@link
>
> #getMessage()}
>
> @param format {@link String#format(String, Object...)} compatible
>
> format string
>
> @throws IllegalFormatException if the underlying API throws the
>
> exception
>
> @throws NullPointerException if format is null
>
> @see String#format(String, Object...)

#### getRecipients

方法声明: public Set<Player> getRecipients()

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
> @return All Players who will see this chat message

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;