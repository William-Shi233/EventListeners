---
description: EntityCombustByBlockEvent
---

# EntityCombustByBlockEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityCombustEvent

                =>  org.bukkit.event.entity.EntityCombustByBlockEvent

### 类描述

> Called when a block causes an entity to combust.

### 方法列表

#### getCombuster

方法声明: public Block getCombuster()

方法签名: ()Lorg/bukkit/block/Block;

> The combuster can be lava or a block that is on fire.
>
> <p>
>
> WARNING: block may be null.
>
> @return the Block that set the combustee alight.