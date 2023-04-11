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
>
> 当服务器内有广播消息时触发，如调用 `org.bukkit.Server#broadcast(String, String)` 方法时。
>
> **本事件与 `AsyncPlayerChatEvent` 类似。当本事件在异步线程内被触发时，监听器就在异步线程中被调用。详情请参见  `AsyncPlayerChatEvent` 文档。**
>
> 译注：参见 `AsyncPlayerChatEvent` 。

### 方法列表

#### getMessage

方法声明: public String getMessage()

方法签名: ()Ljava/lang/String;

> Get the message to broadcast.
>
> @return Message to broadcast
>
> 该方法用于获取将要被广播的消息。
>
> @return 将要被广播的消息。

#### setMessage

方法声明: public void setMessage(@NotNull String message)

方法签名: (Ljava/lang/String;)V

> Set the message to broadcast.
>
> @param message New message to broadcast
>
> 该方法用于设置将要被广播的消息。
>
> @param message 将要被广播的消息。

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
>
> 该方法用于获取一个 `Set` ，其间存储有全部将要接收该条广播消息的对象。
>
> 本方法返回的 `Set` 不一定是可以修改的，而且有可能在用户从其间取出值时进行自动填充。
>
> 使用本方法返回的 `Set` 时需要注意，如果该 `Set` 实现类采用某种 `Lazy Set` 实现，则监听器的性能可能会受影响。
>
> 使用时还需要注意，如果触发本事件的开发者提供了一个不可修改集合，则对返回的 `Set` 作修改会抛出 `UnsupportedOperationException` 。
>
> @return 全部将要接收该条广播消息的 `CommandSender` 对象。
>
> 译注：文档字里行间强调的核心内容只有一点，即本事件很有可能不是由服务端所触发，而是被其他插件所触发。
> 
> 其他插件提供的集合，`Bukkit API` 只能保证其实现类是 `java.util.Set` 的子类，但不能保证它可否修改，也不能保证它是不是 `Lazy Set` 。
>
> 所谓不可修改集合，即不能向其中添加删除元素。监听器只能遍历其中元素，不能通过修改 `Set` 的方式添加或删除一个接收广播消息的对象，否则会抛出 `UnsupportedOperationException` 。
>
> 所谓 `Lazy Set` ，指的是该 `Set` 对于性能低、开销大的方法尽可能地推迟运行。比如向 `Set` 中添加元素的方法（假设它名为 `add` 方法），开销比较大（有时候集合元素已满，需要对集合进行扩容才能装得下新元素，这种操作开销非常大）。那么在调用 `add` 方法时，不去立刻添加元素，而是先暂存新元素，推迟运行添加操作。等到要遍历集合的时候，由于再作推迟会影响读取结果，所以不得不把元素添加进集合。
>
> 因此，文档中说读取集合会影响性能，就是指 `Lazy Set` 把添加元素的方法一直推迟，直到监听器内读取 `Set` 中的元素时才将元素添加进去。那么读取时就产生了比较大的开销。
>
> 可参见 `AsyncPlayerChatEvent#getRecipients()` 方法的译注，其内介绍了 `Bukkit` 中的一种 `LazySet` 实现。

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