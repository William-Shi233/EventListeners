---
description: FurnaceExtractEvent
---

# FurnaceExtractEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockExpEvent

                =>  org.bukkit.event.inventory.FurnaceExtractEvent

### 类描述

> This event is called when a player takes items out of the furnace

### 方法列表

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Get the player that triggered the event
>
> @return the relevant player

#### getItemType

方法声明: public Material getItemType()

方法签名: ()Lorg/bukkit/Material;

> Get the Material of the item being retrieved
>
> @return the material of the item

#### getItemAmount

方法声明: public int getItemAmount()

方法签名: ()I

> Get the item count being retrieved
>
> @return the amount of the item