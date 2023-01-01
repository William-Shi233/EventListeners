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
> <p>
>
> If a Block Dispense Armor event is cancelled, the equipment will not be
>
> equipped on the target entity.

### 方法列表

#### getTargetEntity

方法声明: public LivingEntity getTargetEntity()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

> Get the living entity on which the armor was dispensed.
>
> @return the target entity