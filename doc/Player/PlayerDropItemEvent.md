---
description: PlayerDropItemEvent
---

# PlayerDropItemEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerDropItemEvent

### 类描述

> Thrown when a player drops an item from their inventory

### 方法列表

#### getItemDrop

方法声明: public Item getItemDrop()

方法签名: ()Lorg/bukkit/entity/Item;

> Gets the ItemDrop created by the player
>
> @return ItemDrop created by the player

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