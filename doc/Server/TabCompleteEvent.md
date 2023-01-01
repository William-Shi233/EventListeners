---
description: TabCompleteEvent
---

# TabCompleteEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.server.TabCompleteEvent

### 类描述

> Called when a {@link CommandSender} of any description (ie: player or
>
> console) attempts to tab complete.
>
> <br>
>
> Note that due to client changes, if the sender is a Player, this event will
>
> only begin to fire once command arguments are specified, not commands
>
> themselves. Plugins wishing to remove commands from tab completion are
>
> advised to ensure the client does not have permission for the relevant
>
> commands, or use {@link PlayerCommandSendEvent}.

### 方法列表

#### getSender

方法声明: public CommandSender getSender()

方法签名: ()Lorg/bukkit/command/CommandSender;

> Get the sender completing this command.
>
> @return the {@link CommandSender} instance

#### getBuffer

方法声明: public String getBuffer()

方法签名: ()Ljava/lang/String;

> Return the entire buffer which formed the basis of this completion.
>
> @return command buffer, as entered

#### getCompletions

方法声明: public List<String> getCompletions()

方法签名: ()Ljava/util/List;

> The list of completions which will be offered to the sender, in order.
>
> This list is mutable and reflects what will be offered.
>
> @return a list of offered completions

#### setCompletions

方法声明: public void setCompletions(@NotNull List<String> completions)

方法签名: (Ljava/util/List;)V

> Set the completions offered, overriding any already set.
>
> @param completions the new completions

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