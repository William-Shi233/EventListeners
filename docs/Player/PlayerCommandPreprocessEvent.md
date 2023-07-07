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
> <br>
> 
> 当玩家执行指令前触发。只要消息以斜杠 `/` 起首即视为指令。在指令处理的过程中，本事件在较先运行的环节内触发，对字段的修改（比如通过调用 `setMessage(String)` 方法）可以在运行结果中体现。（译注：比如对于某个插件提供的指令而言，首先触发本事件，然后再运行 `CommandExecutor` 的相关方法。所以 `CommandExecutor` 中得到的参数 `String[] args` 可能是被监听器修改过的。原版指令大同小异。）
> 
> 很多插件无视此事件。如无必要，请避免使用本事件。
> 
> 列举一些本事件的正确应用场景如下：
> 
> <ul>
> 
> <li> 把服务器内运行的指令记录到单独的日志文件里。
> 
> <li> 替换变量。把 ${nearbyPlayer} 替换成距离最近的玩家的实际玩家名，或者将命令方块中使用的选择器 @a 、@p 等作替换，适配某些插件注册的不支持原版选择器的命令。（译注：前一个用法类似于 Placeholder API 所作的工作，此处是将指令中的变量作替换，比如把 `/ban ${nearbyPlayer}` 改成 `/ban William_Shi` 。后一个用法是将指令中的 @a 、@p 等选择器进行替换，比如把 `/test @p` 换成 `/test William_Shi` 。这一功能是侧重于插件的指令而言的，因为原版指令基本都支持选择器。) 
> 
> <li> 按照某种条件，阻止运行指令。
> 
> <li> 为发送者提供个性化的指令别名。比如当后台执行 `/calias cr gamemode creative` 以后，下次后台执行 `/cr` 就自动替换为 `/gamemode creative` 。指令别名应当只是针对某一个发送者作替换的，如果要实现全局指令别名，那应当直接注册别名而不是监听本事件。（译注：所谓“个性化”，指的是某个指令别名只对某一个具体发送者生效。比如玩家 A 使用了 `/calias cr gamemode creative` 指令，所以该玩家以后都可以用 `/cr` 来简写 `/gamemode creative`，而玩家 B 没有执行过 `/calias cr gamemode creative` 指令，所以不能使用简写。这些指令别名是针对部分玩家进行个性化配置的。全局别名则是所有玩家无需运行 `/calias` 指令也可以使用的别名。所谓“calias”，是文档捏造的指令，即“command alias”的简写，字面意思是指令别名。第一个参数“cr”是简写，后面所有的参数并为接续，作为未经简化的指令。)
> 
> </ul>
> 
> 列举一些本事件的错误应用场景如下：
> 
> <ul>
> 
> <li>监听这个事件，并在其中写指令运行的逻辑。（译注：指不要在事件监听器里完成指令的执行。比如监听 `/gamemode creative` 指令以后，在监听器里取消事件，然后调用 `setGameMode(GameMode)` 方法来完成指令的执行。执行应该留给 `CommandExecutor` 完成。）
> 
> </ul>
> 
> 如果本事件被取消了，指令将不会被执行。
> 
> 本事件的 `getMessage()` 方法所返回的字符串，有可能以斜杠 `/` 开头，也有可能不是。无论有没有斜杠，都请不要修改，保留原状。如果在指令字符串开头添加或删除斜杠，后果未知。

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
> All commands begin with a special character; implementations do not
> 
> consider the first character when executing the content.
> 
> @return Message the player is attempting to send
> 
> <br>
> 
> 该方法用于获取玩家将要发送的指令字符串。
> 
> 所有指令都以一个特别的字符串起首。当执行指令时，第一个字符是不纳入考量的。
> 
> @return 玩家将要发送的指令字符串。
> 
> <br>
> 
> 译注：所谓“特别的字符串”，指斜杠 `/` 。

#### setMessage

方法声明: public void setMessage(@NotNull String command) throws IllegalArgumentException

方法签名: (Ljava/lang/String;)V

> Sets the command that the player will send.
> 
> All commands begin with a special character; implementations do not
> 
> consider the first character when executing the content.
> 
> @param command New message that the player will send
> 
> @throws IllegalArgumentException if command is null or empty
> 
> <br>
> 
> 该方法用于设置玩家将要发送的指令字符串。
> 
> 所有指令都以一个特别的字符串起首。当执行指令时，第一个字符是不纳入考量的。
> 
> @param command 玩家将要发送的指令字符串。 
> 
> @throws 如果传入的参数为 `null` 或为空字符串，则抛出 `IllegalArgumentException` 。
> 
> <br>
> 
> 译注：所谓“特别的字符串”，指斜杠 `/` 。

#### setPlayer

方法声明: public void setPlayer(@NotNull final Player player) throws IllegalArgumentException

方法签名: (Lorg/bukkit/entity/Player;)V

> Sets the player that this command will be executed as.
> 
> @param player New player which this event will execute as
> 
> @throws IllegalArgumentException if the player provided is null
> 
> <br>
> 
> 该方法用于设置指令将以何玩家的身份执行。
> 
> @param player 将执行指令的玩家。
> 
> @throws 如果传入的参数为 `null` ，则抛出 `IllegalArgumentException` 。

#### getRecipients

方法声明: public Set<Player> getRecipients()

方法签名: ()Ljava/util/Set;

> Gets a set of recipients that this chat message will be displayed to.
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
> 
> <br>
> 
> 该方法用于获取一个 `Set` ，其间存储有全部将要接收该条聊天消息的对象。
> 
> 本方法返回的 `Set` 不一定是可以修改的，而且有可能在用户从其间取出值时进行自动填充。
> 
> 使用本方法返回的 `Set` 时需要注意，如果该 `Set` 实现类采用某种 `Lazy Set` 实现，则监听器的性能可能会受影响。
> 
> 使用时还需要注意，如果触发本事件的开发者提供了一个不可修改集合，则对返回的 `Set` 作修改会抛出 `UnsupportedOperationException` 。
> 
> @return 全部将要接收该条聊天消息的玩家对象。
> 
> @deprecated 该方法已过时。出于版本向下兼容性（高版本服务端兼容基于低版本 `Bukkit API` 所编写的插件）考虑，仍予以保留，但无法保证修改集合或遍历集合时会发生什么。
> 
> <br>
> 
> 译注：如果本事件并非服务端所触发，而是插件所触发，则就本方法返回的集合而言，`Bukkit API` 只能保证其实现类是 `java.util.Set` 的下级类，但不能保证它可否修改，也不能保证它是不是 `Lazy Set` 。
> 
> 所谓不可修改集合，即不能向其中添加删除元素。监听器只能遍历其中元素，不能通过修改 `Set` 的方式添加或删除一个接收聊天消息的对象，否则会抛出 `UnsupportedOperationException` 。
> 
> 所谓 `Lazy Set` ，一般来说，指的是该 `Set` 对于性能低、开销大的方法尽可能地推迟运行。比如向 `Set` 中添加元素的方法（假设它名为 `add` 方法），开销比较大（有时候集合元素已满，需要对集合进行扩容才能装得下新元素，这种操作开销非常大）。那么在调用 `add` 方法时，不去立刻添加元素，而是先暂存新元素，推迟运行添加操作。等到要遍历集合的时候，由于再作推迟会影响读取结果，所以不得不把元素添加进集合。
> 
> 而文档中所指的 `Lazy Set` 主要是指 `org.bukkit.craftbukkit.v1_16_R3.util.LazyPlayerSet` 类。这个 `Set` 实现专门用于存储服务器内的全体玩家。但是遍历服务器内全体玩家列表的操作开销比较大。所以这个类的设计是只要读写 `Set` 的方法不被调用，就不向 `Set` 里添加任何玩家对象，让 `Set` 保持空白。一旦要读取时，就当场遍历服务器的在线玩家列表，把全体玩家对象写入该 `Set` 。这种设计适应了本事件的应用场景。正因为本方法返回的 `Set` 不一定是可以修改的，所以开发者未必能通过本方法的返回值来实现消息屏蔽等功能。故此，这个方法的用处就显得很小，往往不被使用。如果所有事件监听器都不去读取这个 `Set` ，那么就可以让 `Set` 的内容一直留空，不需要遍历服务器在线玩家列表，节约服务器开销。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;