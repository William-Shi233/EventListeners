---
description: PlayerCommandPreprocessEvent
---

# PlayerCommandPreprocessEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerCommandPreprocessEvent

### 类描述

> This event is called whenever a player runs a command (by placing a slash
>
> at the start of their message). It is called early in the command handling
>
> process, and modifications in this event (via {@link #setMessage(String)})
>
> will be shown in the behavior.
>
> <p>
>
> Many plugins will have <b>no use for this event</b>, and you should
>
> attempt to avoid using it if it is not necessary.
>
> <p>
>
> Some examples of valid uses for this event are:
>
> <ul>
>
> <li>Logging executed commands to a separate file
>
> <li>Variable substitution. For example, replacing
>
> <code>${nearbyPlayer}</code> with the name of the nearest other
>
> player, or simulating the <code>@a</code> and <code>@p</code>
>
> decorators used by Command Blocks in plugins that do not handle it.
>
> <li>Conditionally blocking commands belonging to other plugins. For
>
> example, blocking the use of the <code>/home</code> command in a
>
> combat arena.
>
> <li>Per-sender command aliases. For example, after a player runs the
>
> command <code>/calias cr gamemode creative</code>, the next time they
>
> run <code>/cr</code>, it gets replaced into
>
> <code>/gamemode creative</code>. (Global command aliases should be
>
> done by registering the alias.)
>
> </ul>
>
> <p>
>
> Examples of incorrect uses are:
>
> <ul>
>
> <li>Using this event to run command logic
>
> </ul>
>
> <p>
>
> If the event is cancelled, processing of the command will halt.
>
> <p>
>
> The state of whether or not there is a slash (<code>/</code>) at the
>
> beginning of the message should be preserved. If a slash is added or
>
> removed, unexpected behavior may result.

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

> Gets the command that the player is attempting to send.
>
> <p>
>
> All commands begin with a special character; implementations do not
>
> consider the first character when executing the content.
>
> @return Message the player is attempting to send

#### setMessage

方法声明: public void setMessage(@NotNull String command) throws IllegalArgumentException

方法签名: (Ljava/lang/String;)V

> Sets the command that the player will send.
>
> <p>
>
> All commands begin with a special character; implementations do not
>
> consider the first character when executing the content.
>
> @param command New message that the player will send
>
> @throws IllegalArgumentException if command is null or empty

#### setPlayer

方法声明: public void setPlayer(@NotNull final Player player) throws IllegalArgumentException

方法签名: (Lorg/bukkit/entity/Player;)V

> Sets the player that this command will be executed as.
>
> @param player New player which this event will execute as
>
> @throws IllegalArgumentException if the player provided is null

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
> it may reduce performance for a lazy set implementation. Listeners
>
> should be aware that modifying the list may throw {@link
>
> UnsupportedOperationException} if the event caller provides an
>
> unmodifiable set.
>
> @return All Players who will see this chat message
>
> @deprecated This method is provided for backward compatibility with no
>
> guarantee to the effect of viewing or modifying the set.

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;