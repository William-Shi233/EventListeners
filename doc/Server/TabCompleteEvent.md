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
>
> 当一个任意种类的 `CommandSender` （如玩家、后台等）尝试按下 `Tab` 键补全指令时触发。
>
> 注意，由于客户端实现的变化，如果是玩家正在编辑指令，那么本事件只会在指令的参数被补全时触发，而不是指令本身。
>
> 如果插件想要把指令本身从客户端 `Tab` 补全列表里移除，应该剥夺客户端执行对应指令的权限，或者监听 `PlayerCommandSendEvent` 。
>
> 译注：所谓“指令本身”，指的是斜杠后面紧跟的那一个单词，比如“gamemode”，而参数则是“指令本身”以后的那些以空格分割的单词，比如“creative”等。

### 方法列表

#### getSender

方法声明: public CommandSender getSender()

方法签名: ()Lorg/bukkit/command/CommandSender;

> Get the sender completing this command.
>
> @return the {@link CommandSender} instance
>
> 该方法用于获取补全指令者。
>
> @return `CommandSender` 的实例。

#### getBuffer

方法声明: public String getBuffer()

方法签名: ()Ljava/lang/String;

> Return the entire buffer which formed the basis of this completion.
>
> @return command buffer, as entered
>
> 该方法用于获取补全以前的指令字符串。补全列表的计算是基于该字符串进行的。
>
> @return 补全以前的指令字符串。

#### getCompletions

方法声明: public List<String> getCompletions()

方法签名: ()Ljava/util/List;

> The list of completions which will be offered to the sender, in order.
>
> This list is mutable and reflects what will be offered.
>
> @return a list of offered completions
>
> 该方法用于获取将要提供给发送者的补全建议列表。这一列表的顺序是有意义的。
>
> 这一列表是可修改的。修改结果直接体现在客户端所见的补全列表上。
>
> @return 将要提供给发送者的补全建议列表。
>
> 译注：所谓“这一列表的顺序是有意义的”，意指客户端会忠实反映服务端发来的列表的顺序。比如补全列表是 [a, b, c]，那么客户端也显示 [a, b, c]，当顺序改成 [a, c, b] 时，客户端会相应显示 [a, c, b]，而不是按照字母顺序重排。

#### setCompletions

方法声明: public void setCompletions(@NotNull List<String> completions)

方法签名: (Ljava/util/List;)V

> Set the completions offered, overriding any already set.
>
> @param completions the new completions
>
> 该方法用于设置将要提供给发送者的补全建议列表，覆盖已有的列表。
>
> @param completions 新的补全建议列表。

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