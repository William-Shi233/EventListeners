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
>
> 当玩家从自己的物品栏内丢弃物品时触发。

### 方法列表

#### getItemDrop

方法声明: public Item getItemDrop()

方法签名: ()Lorg/bukkit/entity/Item;

> Gets the ItemDrop created by the player
>
> @return ItemDrop created by the player
>
> 该方法用于获取生成的物品实体。
>
> @return 生成的物品实体。
>
> 译注：该方法返回的是地面上的物品实体，而不是可以被装进物品栏里的物品堆。使用 `Item#getItemStack()` 方法获取被丢弃的物品堆。

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