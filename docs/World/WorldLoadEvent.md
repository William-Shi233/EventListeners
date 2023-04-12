---
description: WorldLoadEvent
---

# WorldLoadEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.world.WorldEvent

            =>  org.bukkit.event.world.WorldLoadEvent

### 类描述

> Called when a World is loaded
> 
> <br>
> 
> 当一个世界被加载时触发。
> 
> <br>
> 
> 译注：从 `net.minecraft.server.v1_16_R3.MineCraftServer#loadWorld(String s)` 方法来看，首先对从未加载过的世界进行生成（或对旧版本存档进行升级），然后对每一个世界都触发一次 `WorldLoadEvent` 。因此 `WorldInitEvent` 应该指世界生成事件，每一个世界都只会被世界生成的代码操作一次。在这以后才会对每一个世界触发 `WorldLoadEvent` 。每一次开服时都应该触发 `WorldLoadEvent` ，但不一定触发 `WorldInitEvent` 。
> 
> 插件的 `plugin.yml` 内，除了 `main` 、`name` 这些常见字段以外，还有一个不常用的字段 `load` 。这个字段决定了插件的加载时机。如果没有指定加载时机，那么默认按 `load: POSTWORLD` 处理。从字面意思上就可以看出，默认配置下的插件是在世界以后加载的。也就是 `WorldInitEvent` 和 `WorldLoadEvent` 都触发以后，才会开始加载插件。为了监听上述两个事件，必须在 `plugin.yml` 里写上 `load: STARTUP` ，这样插件就会在世界以前被加载。

### 方法列表

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;