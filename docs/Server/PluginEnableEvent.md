---
description: PluginEnableEvent
---

# PluginEnableEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.server.ServerEvent

            =>  org.bukkit.event.server.PluginEvent

                =>  org.bukkit.event.server.PluginEnableEvent

### 类描述

> Called when a plugin is enabled.
> 
> <br>
> 
> 当插件被启用时触发。
> 
> <br>
> 
> 译注：由 `org.bukkit.plugin.java.JavaPluginLoader#enablePlugin(Plugin)` 方法可知，本事件在插件的 `onEnable()` 方法调用完毕以后被触发。

### 方法列表

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;