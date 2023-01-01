---
description: PiglinBarterEvent
---

# PiglinBarterEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.PiglinBarterEvent

### 类描述

> Stores all data related to the bartering interaction with a piglin.
>
> This event can be triggered by a piglin picking up an item that's on its
>
> bartering list.

### 方法列表

#### getEntity

方法声明: public Piglin getEntity()

方法签名: ()Lorg/bukkit/entity/Piglin;

#### getInput

方法声明: public ItemStack getInput()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the input of the barter.
>
> @return The item that was used to barter with

#### getOutcome

方法声明: public List<ItemStack> getOutcome()

方法签名: ()Ljava/util/List;

> Returns a mutable list representing the outcome of the barter.
>
> @return A mutable list of the item the player will receive

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