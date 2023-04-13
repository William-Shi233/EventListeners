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
> <br>
> 
> 当任意种类的 `CommandSender` （如玩家、后台等）尝试按下 `Tab` 键补全指令时触发。
> 
> 注意，由于客户端中相关代码的变化，玩家编辑指令本身时不会触发本事件。本事件只会在指令的参数被补全时触发。如果插件想要把某个指令从客户端 `Tab` 补全列表里移除，应该一并确保客户端没有执行对应指令的权限，或者监听 `PlayerCommandSendEvent` 以作出进一步限制。
> 
> <br>
> 
> 译注：所谓“指令本身”，指的是斜杠后面紧跟的那一个单词，而参数则是“指令本身”以后的那些以空格分割的单词。以 `/gamemode creative` 指令为例，“gamemode”是指令本身，“creative”是指令参数。
> 
> 即使客户端不能补全某个指令的参数，玩家仍然可以手动输入该指令并执行。如果不褫夺客户端执行对应指令的权限，虽然客户端在输入指令时会有一定困难，但仍然可以正常发送、执行指令。必须在服务端进行权限检查，或在 `PlayerCommandSendEvent` 当中拦截该指令，才能确保玩家真正意义上无法执行该指令。

### 方法列表

#### getSender

方法声明: public CommandSender getSender()

方法签名: ()Lorg/bukkit/command/CommandSender;

> Get the sender completing this command.
> 
> @return the {@link CommandSender} instance
> 
> <br>
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
> <br>
> 
> 该方法用于获取补全以前的指令字符串。补全结果是基于该字符串计算的。
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
> <br>
> 
> 该方法用于获取将要发送给补全指令者的补全建议列表。这一列表的顺序是有意义的。
> 
> 这一列表是可修改的。修改结果直接体现在客户端所显示的补全列表上。
> 
> @return 将要发送的补全建议列表。
> 
> <br>
> 
> 译注：所谓“这一列表的顺序是有意义的”，意指客户端会忠实反映服务端发来的列表的顺序。比如补全列表是 [a, b, c]，那么客户端也显示 [a, b, c]，当顺序改成 [a, c, b] 时，客户端会相应显示 [a, c, b]，而不是按照字母顺序重排。

#### setCompletions

方法声明: public void setCompletions(@NotNull List<String> completions)

方法签名: (Ljava/util/List;)V

> Set the completions offered, overriding any already set.
> 
> @param completions the new completions
> 
> <br>
> 
> 该方法用于设置将要发送给补全指令者的补全建议列表。调用本方法时传入的参数，会直接覆盖先前的插件所传入的列表。
> 
> @param completions 新的补全建议列表。
> 
> <br>
> 
> 译注：所谓“覆盖”，指调用本方法以后，原有的补全建议列表会被直接抛弃。比如在本事件触发以前，服务端将给客户端提供的补全列表是 [a, b, c]，某插件调用本方法并传入 [a, b]，则 `getCompletions()` 方法返回值立即变为 [a, b]，不会再存留原有的值，也不会将原有列表和现有列表作合并。

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