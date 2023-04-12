---
description: PluginDisableEvent
---

# PluginDisableEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.server.ServerEvent

            =>  org.bukkit.event.server.PluginEvent

                =>  org.bukkit.event.server.PluginDisableEvent

### 类描述

> Called when a plugin is disabled.
>
>
> 
> 当一个插件被卸载时触发。
>
>
> 
> 译注：由 `org.bukkit.plugin.java.JavaPluginLoader#disablePlugin` 方法（参见该类第 `370` 行）可知，本事件在插件的 `onDisable` 方法调用以前被触发。

### 方法列表

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;