---
description: PluginEvent
---

# PluginEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.server.ServerEvent

            =>  org.bukkit.event.server.PluginEvent

### 类描述

> Used for plugin enable and disable events
> 
> <br>
> 
> 代表与插件加载、卸载有关的事件。
> 
> <br>
> 
> 译注：该事件未实现 `getHandlers()` 和 `getHandlerList()` 方法，无法直接监听。

### 方法列表

#### getPlugin

方法声明: public Plugin getPlugin()

方法签名: ()Lorg/bukkit/plugin/Plugin;

> Gets the plugin involved in this event
> 
> @return Plugin for this event
> 
> <br>
> 
> 该方法用于获取被加载/卸载的涉事插件。
> 
> @return 涉事插件。