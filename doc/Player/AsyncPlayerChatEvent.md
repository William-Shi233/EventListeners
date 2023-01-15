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
>
> 当玩家发送聊天消息时触发。本事件虽然名为 `AsyncPlayerChatEvent` （异步玩家聊天事件），但也有可能同步触发，主要视触发原因而定。
>
> 本事件构造器提供了一个布尔值，用于确定本事件是异步还是同步触发的。如果本事件是异步触发的，那么它可能运行在任何一个异步线程上，主线程除外。在异步线程中，对 `Bukkit API` 的访问是有所限制的。
>
> 如果是玩家客户端发来数据包，触发了本事件，那么本事件是异步的。如果是一个插件强迫玩家发送聊天消息，那么本事件是同步的。
>
> 应当注意通过 `isAsynchronous` 方法检查本事件是否为异步触发，并视情况以妥善方法处理本事件。
>
> 译注：`Mojang` 在设计 `MineCraft` 时，几乎没有考虑线程安全问题。整个 `MineCraft` 服务端中的大部分集合、大部分方法，都没有考虑异步操作。在 `MineCraft` 内部，如生成生物、如破坏方块等方法，都运行在主线程上，虽然效率低，但是这样一来也没有线程安全问题。一旦让插件在异步线程中操作 `MineCraft` 中的实体、方块、物品栏等对象，就可能出现并发修改等错误。整个 `MineCraft` 里几乎没有什么方法是线程安全的。除非某方法仅涉及到数据包的发送，否则它就不能运行在异步线程里。比如发送消息给玩家，这个方法仅仅涉及到玩家聊天消息相关数据包的发送，因此它可以异步运行。本事件的文档一再警告用户检查事件是否异步触发，就是为了防止用户在异步线程中调用 `Bukkit API` 里那些线程不安全的方法。
> 
> 如果本事件是在主线程里被触发的（同步触发），那么本事件的所有监听器也都运行在主线程里，访问 `Bukkit API` 里的方法就没有线程安全问题。当插件强迫玩家发送聊天消息（比如通过 `Player#chat` 方法）时，本事件是同步触发的。在 `org.bukkit.craftbukkit.v1_16_R3.entity.CraftPlayer#chat` 方法中，调用了 `net.minecraft.server.v1_16_R3.PlayerConnection#chat` 方法，其中 `boolean async` 参数的值为 `false` 。在 `PlayerConnection` 类第 `1709` 行触发本事件时，向本事件构造器内传入了 `false` ，因此可见本事件是同步的。这种情况下访问 `Bukkit API` 里的方法安全无虞。
>
> 如果本事件是在异步线程里被触发的（异步触发），那么本事件的所有监听器也都运行在异步线程里。此处所谓“异步线程”可以是任何线程。当玩家客户端通过数据包发来聊天消息时，本事件是异步触发的。因为 `PlayerConnection#a(PacketPlayInChat)` 方法中调用了 `PlayerConnection#c(String s)` 方法，然后在第 `1648` 行调用 `chat` 方法，参数 `boolean async` 为 `true` 。故此，本事件是异步触发的。在这种情况下，`Bukkit API` 中的绝大多数方法都不可以被调用。如必为之，可用 `BukkitScheduler` 调度一个同步任务，使代码在主线程内运行。

### 方法列表

#### getMessage

方法声明: public String getMessage()

方法签名: ()Ljava/lang/String;

> Gets the message that the player is attempting to send. This message
>
> will be used with {@link #getFormat()}.
>
> @return Message the player is attempting to send
>
> 该方法用于获取玩家尝试发送的消息字符串。这一字符串将会在 `getFormat()` 方法中被用到。
>
> @return 玩家尝试发送的消息字符串。

#### setMessage

方法声明: public void setMessage(@NotNull String message)

方法签名: (Ljava/lang/String;)V

> Sets the message that the player will send. This message will be used
>
> with {@link #getFormat()}.
>
> @param message New message that the player will send
>
> 该方法用于设置玩家尝试发送的消息字符串。这一字符串将会在 `getFormat()` 方法中被用到。
>
> @param 玩家尝试发送的消息字符串。

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
>
> 该方法用于获取聊天消息格式。
>
> 当本事件触发以后，格式中的第一个参数将会被替换为 `Player#getDisplayName()` ，第二个参数则替换为本事件 `getMessage()` 方法的返回值。
>
> @return 兼容 `String#format(String, Object...)` 方法的格式字符串。
>
> 译注：所谓“格式字符串”，指服务端将会以类似如下的方式处理消息：`String message = String.format(event.getFormat(), new Object[] { event.getPlayer().getDisplayName(), event.getMessage() });` ，因此这个方法的返回值要能作为 `JDK` 标准里的 `String.format` 方法的第一个参数来使用。
>
> 这个格式字符串的写法应当参阅 `Java` 官方文档中的说明 [https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html#syntax](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html#syntax) 。
>
> 格式字符串默认是 `<%1$s> %2$s` ，其中 `%1$` 指第一个参数（也就是 `getDisplayName()` 字符串），而 `s` 则是 `conversion` 的一种。由于提供的参数是字符串而不是某个实现了 `java.util.Formattable` 的类的实例，因此仅对参数调用 `toString()` 方法（此处没有任何意义）。第二个参数同理。所以原版的消息就是 `<发送者玩家名> 消息` 这样的格式。

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
>
> 该方法用于设置聊天消息格式。
>
> 当本事件触发以后，格式中的第一个参数将会被替换为 `Player#getDisplayName()` ，第二个参数则替换为本事件 `getMessage()` 方法的返回值。
>
> @param 兼容 `String#format(String, Object...)` 方法的格式字符串。
> 
> @throws 如果本方法底层的方法抛出了 `IllegalFormatException` ，则本方法继续向上抛出之。
> 
> @throws 如果传入参数为 `null` 则抛出 `NullPointerException` 。
>
> @see 参见 `String#format(String, Object...)` 方法文档。
> 
> 译注：关于格式字符串的相关说明见上。
> 
> 本方法会调用一次 `String.format` 方法来测试传入的格式字符串是不是合法，如果传入的格式字符串并不符合 `JDK` 标准的定义，则会抛出 `IllegalFormatException` 异常。

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
> 译注：其他插件提供的集合，`Bukkit API` 只能保证其实现类是 `java.util.Set` 的子类，但不能保证它可否修改，也不能保证它是不是 `Lazy Set` 。
>
> 所谓不可修改集合，即不能向其中添加删除元素。监听器只能遍历其中元素，不能通过修改 `Set` 的方式添加或删除一个接收聊天消息的对象，否则会抛出 `UnsupportedOperationException` 。
>
> 所谓 `Lazy Set` ，一般来说，指的是该 `Set` 对于性能低、开销大的方法尽可能地推迟运行。比如向 `Set` 中添加元素的方法（假设它名为 `add` 方法），开销比较大（有时候集合元素已满，需要对集合进行扩容才能装得下新元素，这种操作开销非常大）。那么在调用 `add` 方法时，不去立刻添加元素，而是先暂存新元素，推迟运行添加操作。等到要遍历集合的时候，由于再作推迟会影响读取结果，所以不得不把元素添加进集合。
> 
> 而文档中所指的 `Lazy Set` 主要是指 `org.bukkit.craftbukkit.v1_16_R3.util.LazyPlayerSet` 类。这个 `Set` 实现专门用于存储服务器内的全体玩家。但是遍历服务器内全体玩家列表的操作开销比较大。所以这个类的设计是只要读写 `Set` 的方法不被调用，就不向 `Set` 里添加任何玩家对象，让 `Set` 保持空白。一旦要读取时，就当场遍历服务器的在线玩家列表，把全体玩家对象写入该 `Set` 。这种设计适应了本事件的应用场景。正因为本方法返回的 `Set` 不一定是可以修改的，所以开发者未必能通过本方法的返回值来实现消息屏蔽等功能。故此，这个方法的用处就显得很小，往往不被使用。如果所有事件监听器都不去读取这个 `Set` ，那么就可以让 `Set` 的内容一直留空，不需要遍历服务器在线玩家列表，节约服务器开销。

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