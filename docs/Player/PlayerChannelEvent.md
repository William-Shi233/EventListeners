---
description: PlayerChannelEvent
---

# PlayerChannelEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerChannelEvent

### 类描述

> This event is called after a player registers or unregisters a new plugin
> 
> channel.
> 
> <br>
> 
> 当玩家注册或注销 `PluginChannel` 时触发。
> 
> <br>
> 
> 译注：`PluginChannel` 是 `Bukkit` 插件与客户端模组之间通信的工具。Izzel_Aliz 在其教程[《1.13+ 中 Forge 与 Bukkit 的通信》](https://www.mcbbs.net/thread-873219-1-1.html)及[《Forge | LiteLoader 与 Bukkit / Sponge 之间的通信 —— PluginMessengeChannel 与 FMLNetworkEvent》](https://www.mcbbs.net/thread-725571-1-1.html)中对此工具作了详尽阐述。
> 
> 在 `Bukkit API` 中，与 `PluginChannel` 相关的事件共有三个，分别是 `PlayerRegisterChannelEvent` 、`PlayerUnregisterChannelEvent` 和本事件。前两个事件是本事件的子类，似乎是在具体的情景下触发的（注册或注销 `PluginChannel` ），但都没有实现 `getHandlers()` 和 `getHandlerList()` 方法。本事件似乎是抽象的（字面上是与 `PluginChannel` 有关的事件），但反而实现了 `getHandlers()` 和 `getHandlerList()` 方法。
> 
> 当插件注册事件监听器时，服务端会调用事件类的 `getHandlers()` 和 `getHandlerList()` 方法，将监听器注册进去。而 `PlayerRegisterChannelEvent` 、`PlayerUnregisterChannelEvent` 继承 `PlayerChannelEvent` 类，所以注册这两个事件的监听器时，实际上是将监听器注册进了父类 `PlayerChannelEvent` 的 `HandlerList` 里。
> 
> 在 `Bukkit` 系列服务端中，`PlayerChannelEvent` 不会被触发。只有 `PlayerRegisterChannelEvent` 、`PlayerUnregisterChannelEvent` 这两个具体事件才会被触发。所以不能注册 `PlayerChannelEvent` 的监听器。其中的技术原理可以参考拙作 [《在 Bukkit 自定义事件中“继承父类HandlerList”做法的严重问题》](https://www.mcbbs.net/thread-1393526-1-1.html)一文。子类不实现 `getHandlers()` 和 `getHandlerList()` 方法，交由父类存储监听器，不是一种值得推荐的设计模式。

### 方法列表

#### getChannel

方法声明: public final String getChannel()

方法签名: ()Ljava/lang/String;

> 译注：无文档。该方法用于获取涉事 `PluginChannel` 字符串。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;