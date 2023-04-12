---
description: PlayerInteractAtEntityEvent
---

# PlayerInteractAtEntityEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerInteractEntityEvent

                =>  org.bukkit.event.player.PlayerInteractAtEntityEvent

### 类描述

> Represents an event that is called when a player right clicks an entity that
> 
> also contains the location where the entity was clicked.
> 
> Note that the client may sometimes spuriously send this packet in addition to {@link PlayerInteractEntityEvent}.
> 
> Users are advised to listen to this (parent) class unless specifically required.
> 
> <br>
> 
> 当玩家右键实体时触发。本事件与父类 `PlayerInteractEntityEvent` 的区别在于前者存储了玩家点击时所瞄准的坐标。
> 
> 有时客户端会在 `PlayerInteractEntityEvent` 发生以后，错误地发送一个数据包，触发本事件。因此如非必要，建议用户监听 `PlayerInteractEntityEvent` 。
> 
> <br>
> 
> 译注：正常情况下，当玩家右键点击一次实体时，会先后触发 `PlayerInteractAtEntityEvent` 和 `PlayerInteractEntityEvent` 。异常情况下，客户端会错误地额外发送一个数据包，令 `PlayerInteractAtEntityEvent` 多触发一次。因此推荐监听 `PlayerInteractEntityEvent` 。
> 
> 具体而言， `PlayerInteractAtEntityEvent` 和 `PlayerInteractEntityEvent` 两事件都是客户端发来 `net.minecraft.server.v1_16_R3.PacketPlayInUseEntity` 数据包时触发的。参见 [https://wiki.vg/Protocol#Interact](https://wiki.vg/Protocol#Interact) 页面可知，该数据包可用于表示三种行为，分别是 `INTERACT` 、`INTERACT_AT` 和 `ATTACK` 。很显然，第一种行为触发 `PlayerInteractEntityEvent` ，第二种行为触发 `PlayerInteractAtEntityEvent` 。如果客户端异常地发来一个种类为 `INTERACT_AT` 的数据包，就可能导致 `PlayerInteractAtEntityEvent` 异常地触发一次。

### 方法列表

#### getClickedPosition

方法声明: public Vector getClickedPosition()

方法签名: ()Lorg/bukkit/util/Vector;

> 译注：无文档。玩家点击时所瞄准的坐标。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;