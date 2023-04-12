---
description: ServerCommandEvent
---

# ServerCommandEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.server.ServerEvent

            =>  org.bukkit.event.server.ServerCommandEvent

### 类描述

> This event is called when a command is run by a non-player. It is
> 
> called early in the command handling process, and modifications in this
> 
> event (via {@link #setCommand(String)}) will be shown in the behavior.
> 
> Many plugins will have <b>no use for this event</b>, and you should
> 
> attempt to avoid using it if it is not necessary.
> 
> Some examples of valid uses for this event are:
> 
> <ul>
> 
> <li>Logging executed commands to a separate file
> 
> <li>Variable substitution. For example, replacing <code>${ip:Steve}</code>
> 
> with the connection IP of the player named Steve, or simulating the
> 
> <code>@a</code> and <code>@p</code> decorators used by Command Blocks
> 
> for plugins that do not handle it.
> 
> <li>Conditionally blocking commands belonging to other plugins.
> 
> <li>Per-sender command aliases. For example, after the console runs the
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
> Examples of incorrect uses are:
> 
> <ul>
> 
> <li>Using this event to run command logic
> 
> </ul>
> 
> If the event is cancelled, processing of the command will halt.
> 
> The state of whether or not there is a slash (<code>/</code>) at the
> 
> beginning of the message should be preserved. If a slash is added or
> 
> removed, unexpected behavior may result.
> 
> <p>
> 
> 当某一事物执行指令时触发，玩家除外。本事件在指令处理的过程中靠前运行，对本事件中字段的修改（比如 `setCommand(String)` ）可以在指令运行结果中体现。（译注：比如对于某个插件提供的指令而言，首先触发本事件，然后再运行 `CommandExecutor` 的相关方法。所以 `CommandExecutor` 中得到的参数 `String[] args` 可能是被监听器修改过的。原版指令大同小异。）
> 
> 很多插件无视此事件。如无必要，请避免使用本事件。
> 
> 列举一些本事件的正确应用场景如下：
> 
> <ul>
> 
> <li> 把服务器内运行的指令记录到单独的日志文件里。
> 
> <li> 替换变量。把 ${ip:Steve} 替换成名为 Steve 的玩家的实际 IP ，或者将命令方块中使用的选择器 @a 、@p 等作替换，适配其他插件提供的那些不支持选择器的命令。（译注：前一个用法类似于 Placeholder API 所作的工作，此处是将指令中的变量作替换，比如把 /ban ${ip:Steve} 改成 /ban 127.0.0.1 。后一个用法是将指令中的 @a 、@p 等选择器进行替换，比如把 /test @p 换成 /test William_Shi ，只不过这一功能侧重于插件的指令，因为原版指令基本都支持选择器。) 
> 
> <li> 按照某种条件，阻止运行指令。
> 
> <li> 指令别名。比如当后台执行 /calias cr gamemode creative 以后，下次后台执行 /cr 就自动替换为 /gamemode creative 。指令别名应当只是针对某一个发送者作替换的，如果要实现全局指令别名，那应当直接注册别名而不是监听本事件。（译注：所谓“针对某一个发送者”，情况类似对于玩家 A 而言，由于其使用了 /calias cr gamemode creative 指令，所以该玩家以后都可以用 /cr 来简写，而玩家 B 没有执行过  /calias cr gamemode creative 指令，所以不能使用简写。因此这些指令别名是针对部分玩家进行个性化配置的。全局别名则是所有玩家无需运行 /calias 指令也可以使用的别名。)
> 
> </ul>
> 
> 列举一些本事件的错误应用场景如下：
> 
> <ul>
> 
> <li>监听这个事件，并在其中写指令运行的逻辑。（译注：指不要在事件监听器里完成指令的执行。比如监听 /gamemode creative 指令以后，在监听器里取消事件，然后调用 setGameMode 方法来完成指令的执行。执行应该留给 CommandExecutor 完成。）
> 
> </ul>
> 
> 如果本事件被取消了，指令将不会被执行。
> 
> 本事件的 `getCommand` 方法所返回的字符串，有可能以斜杠 `/` 开头，也有可能不是。无论有没有斜杠，都请不要修改，保留原状。如果在指令字符串开头添加或删除斜杠，后果未知。

### 方法列表

#### getCommand

方法声明: public String getCommand()

方法签名: ()Ljava/lang/String;

> Gets the command that the user is attempting to execute from the
> 
> console
> 
> @return Command the user is attempting to execute
> 
> <p>
> 
> 该方法用于获取用户通过后台运行的指令字符串。
> 
> @return 用户通过后台运行的指令字符串。

#### setCommand

方法声明: public void setCommand(@NotNull String message)

方法签名: (Ljava/lang/String;)V

> Sets the command that the server will execute
> 
> @param message New message that the server will execute
> 
> <p>
> 
> 该方法用于设置后台将要运行的指令字符串。
> 
> @param message 用户将要通过后台运行的新指令。

#### getSender

方法声明: public CommandSender getSender()

方法签名: ()Lorg/bukkit/command/CommandSender;

> Get the command sender.
> 
> @return The sender
> 
> <p>
> 
> 该方法用于获取指令发送者。
> 
> @return 指令发送者。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V