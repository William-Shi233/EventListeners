---
description: BlockDispenseArmorEvent
---

# BlockDispenseArmorEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockDispenseEvent

                =>  org.bukkit.event.block.BlockDispenseArmorEvent

### 类描述

> Called when an equippable item is dispensed from a block and equipped on a
> 
> nearby entity.
> 
> If a Block Dispense Armor event is cancelled, the equipment will not be
> 
> equipped on the target entity.
> 
> <br>
> 
> 当某件可以被穿戴的物品堆自发射器中被发射，且自动穿戴到周围的某个实体身上时触发。
> 
> 如果本事件被取消，则该物品堆将不会被自动穿戴到涉事实体身上。

### 方法列表

#### getTargetEntity

方法声明: public LivingEntity getTargetEntity()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

> Get the living entity on which the armor was dispensed.
> 
> @return the target entity
> 
> <br>
> 
> 该方法用于获取将要穿上被发射的盔甲物品堆的实体。
> 
> @return 将要穿上被发射的盔甲物品堆的实体。