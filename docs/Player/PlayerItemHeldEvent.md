---
description: PlayerItemHeldEvent
---

# PlayerItemHeldEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerItemHeldEvent

### 类描述

> Fired when a player changes their currently held item
> 
> <p>
> 
> 当玩家切换手持物品堆时触发。
> 
> <p>
> 
> 译注：玩家滑动鼠标滚轮时或按下 `1-9` 数字键时，都可能会切换选中的槽位，从而切换手持物品堆。

### 方法列表

#### getPreviousSlot

方法声明: public int getPreviousSlot()

方法签名: ()I

> Gets the previous held slot index
> 
> @return Previous slot index
> 
> <p>
> 
> 该方法用于获取原先选中的槽位序号。
> 
> @return 原先选中的槽位序号。

#### getNewSlot

方法声明: public int getNewSlot()

方法签名: ()I

> Gets the new held slot index
> 
> @return New slot index
> 
> <p>
> 
> 该方法用于获取新选中的槽位序号。
> 
> @return 新选中的槽位序号。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;