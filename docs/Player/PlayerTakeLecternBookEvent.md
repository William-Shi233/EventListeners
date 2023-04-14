---
description: PlayerTakeLecternBookEvent
---

# PlayerTakeLecternBookEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerTakeLecternBookEvent

### 类描述

> This event is called when a player clicks the button to take a book of a
> 
> Lectern. If this event is cancelled the book remains on the lectern.
> 
> <br>
> 
> 当玩家按 `Take Book` 按钮，从讲台上取下一本书时触发。如果本事件被取消，书将留在原处。
> 
> <br>
> 
> 译注：参见 `MineCraft Wiki` 的有关页面 [https://minecraft.fandom.com/wiki/Lectern?file=Lectern_GUI.png](https://minecraft.fandom.com/wiki/Lectern?file=Lectern_GUI.png) 可知，讲台界面有一 `Take Book` 按钮，用于将一本书从讲台上取下。

### 方法列表

#### getLectern

方法声明: public Lectern getLectern()

方法签名: ()Lorg/bukkit/block/Lectern;

> Gets the lectern involved.
> 
> @return the Lectern
> 
> <br>
> 
> 该方法用于获取涉事讲台方块。
> 
> @return 涉事讲台方块。

#### getBook

方法声明: public ItemStack getBook()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the current ItemStack on the lectern.
> 
> @return the ItemStack on the Lectern
> 
> <br>
> 
> 该方法用于获取讲台上现有的书本物品堆。
> 
> @return 讲台上的书本物品堆。

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