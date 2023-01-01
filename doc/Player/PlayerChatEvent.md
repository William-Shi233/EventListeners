---
description: PlayerChatEvent
---

# PlayerChatEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerChatEvent

### 类描述

> Holds information for player chat and commands
>
> @deprecated This event will fire from the main thread and allows the use of
>
> all of the Bukkit API, unlike the {@link AsyncPlayerChatEvent}.
>
> <p>
>
> Listening to this event forces chat to wait for the main thread which
>
> causes delays for chat. {@link AsyncPlayerChatEvent} is the encouraged
>
> alternative for thread safe implementations.

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getMessage

方法声明: public String getMessage()

方法签名: ()Ljava/lang/String;

> Gets the message that the player is attempting to send
>
> @return Message the player is attempting to send

#### setMessage

方法声明: public void setMessage(@NotNull String message)

方法签名: (Ljava/lang/String;)V

> Sets the message that the player will send
>
> @param message New message that the player will send

#### setPlayer

方法声明: public void setPlayer(@NotNull final Player player)

方法签名: (Lorg/bukkit/entity/Player;)V

> Sets the player that this message will display as, or command will be
>
> executed as
>
> @param player New player which this event will execute as

#### getFormat

方法声明: public String getFormat()

方法签名: ()Ljava/lang/String;

> Gets the format to use to display this chat message
>
> @return String.Format compatible format string

#### setFormat

方法声明: public void setFormat(@NotNull final String format)

方法签名: (Ljava/lang/String;)V

> Sets the format to use to display this chat message
>
> @param format String.Format compatible format string

#### getRecipients

方法声明: public Set<Player> getRecipients()

方法签名: ()Ljava/util/Set;

> Gets a set of recipients that this chat message will be displayed to
>
> @return All Players who will see this chat message

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;