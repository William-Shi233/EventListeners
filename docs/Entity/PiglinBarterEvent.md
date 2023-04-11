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
> 
> 本事件存储了玩家与猪灵交易的有关数据。
>
> 当猪灵拾起某样列于其交易列表内的物品堆时，本事件会被触发。
>
> 译注：事件不是用来完成数据的持久化存储的。此处所谓“存储”意为事件的字段中含有一些与事件中被击中的猪有关的信息，该事件从服务端底层得到这些信息，存储于一些字段中，再给插件进行读取。当插件处理完毕以后，事件对象应该被销毁。不能使用事件对象来对数据进行保存。

### 方法列表

#### getEntity

方法声明: public Piglin getEntity()

方法签名: ()Lorg/bukkit/entity/Piglin;

> 译注：无文档。该方法用于获取与玩家交易的猪灵。

#### getInput

方法声明: public ItemStack getInput()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the input of the barter.
>
> @return The item that was used to barter with
>
> 该方法用于获取玩家在交易过程中向猪灵提供的物品堆。
>
> @return 玩家在交易过程中向猪灵提供的物品堆。

#### getOutcome

方法声明: public List<ItemStack> getOutcome()

方法签名: ()Ljava/util/List;

> Returns a mutable list representing the outcome of the barter.
>
> @return A mutable list of the item the player will receive
>
> 该方法用于获取一个可修改的列表，其间存储有交易的全部产出。
>
> @return 交易产出的物品列表，用于存储玩家将会在交易中得到的物品堆。

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