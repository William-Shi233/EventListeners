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
> 当玩家注册或注销 `PluginChannel` 时触发。
>
> 译注：`PluginChannel` 是 `Bukkit` 插件与客户端模组之间通信的工具。Izzel_Aliz 在其教程[《1.13+ 中 Forge 与 Bukkit 的通信》](https://www.mcbbs.net/thread-873219-1-1.html)及[《Forge | LiteLoader 与 Bukkit / Sponge 之间的通信 —— PluginMessengeChannel 与 FMLNetworkEvent》](https://www.mcbbs.net/thread-725571-1-1.html)中对此工具作了详尽阐述。

### 方法列表

#### getChannel

方法声明: public final String getChannel()

方法签名: ()Ljava/lang/String;

> 译注：无文档。该方法用于获取事件中的 `PluginChannel` 字符串。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;