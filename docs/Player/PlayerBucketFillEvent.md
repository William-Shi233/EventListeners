---
description: PlayerBucketFillEvent
---

# PlayerBucketFillEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerBucketEvent

                =>  org.bukkit.event.player.PlayerBucketFillEvent

### 类描述

> Called when a player fills a bucket
> 
> <br>
> 
> 当玩家装满桶时触发。
> 
> <br>
> 
> 译注：本事件既会在玩家用桶装水、岩浆等方块时触发，也会在玩家用桶收集牛奶时触发。

### 方法列表

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;