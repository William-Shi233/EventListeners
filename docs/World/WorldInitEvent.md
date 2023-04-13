---
description: WorldInitEvent
---

# WorldInitEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.world.WorldEvent

            =>  org.bukkit.event.world.WorldInitEvent

### 类描述

> Called when a World is initializing
> 
> <br>
> 
> 当世界被初始化时触发。
> 
> <br>
> 
> 译注：从 `net.minecraft.server.v1_16_R3.MineCraftServer#loadWorld(String s)` 方法来看，服务端在启动时首先对从未加载过的世界进行生成（或对旧版本存档进行升级），然后遍历每一个世界，分别触发一次 `WorldLoadEvent` 。因此 `WorldInitEvent` 应该指世界生成事件，每一个世界都只会被世界生成的代码操作一次。在这以后才会对每一个世界触发 `WorldLoadEvent` 。每一次开服时都应该触发 `WorldLoadEvent` ，但不一定触发 `WorldInitEvent` 。
> 
> 插件的 `plugin.yml` 内，除了 `main` 、`name` 这些常见字段以外，还有一个不常用的字段 `load` 。这个字段决定了插件的加载时机。插件加载时机共有两种，分别为 `load: POSTWORLD` 和 `load: STARTUP` 。如果没有指明加载时机，那么按 `load: POSTWORLD` 处理。从字面意思上就可以看出，默认配置下，插件的 `onEnable()` 方法是在服务端完成世界加载后才被调用的（POST 词缀是延后、在某事以后的意思）。即 `WorldInitEvent` 和 `WorldLoadEvent` 都触发以后，插件才会被加载，这样的插件很显然不可能监听到上述两个事件。为此，必须在 `plugin.yml` 里写上 `load: STARTUP` ，这样插件就会在世界加载以前优先加载，从而得以监听 `WorldInitEvent` 和 `WorldLoadEvent` 。

### 方法列表

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;