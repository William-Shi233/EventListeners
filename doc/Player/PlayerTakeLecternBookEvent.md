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

### 方法列表

#### getLectern

方法声明: public Lectern getLectern()

方法签名: ()Lorg/bukkit/block/Lectern;

> Gets the lectern involved.
>
> @return the Lectern

#### getBook

方法声明: public ItemStack getBook()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the current ItemStack on the lectern.
>
> @return the ItemStack on the Lectern

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