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
>
>
> 
> 当方块引燃实体时触发。

### 方法列表

#### getCombuster

方法声明: public Block getCombuster()

方法签名: ()Lorg/bukkit/block/Block;

> The combuster can be lava or a block that is on fire.
>
> WARNING: block may be null.
>
> @return the Block that set the combustee alight.
>
>
> 
> （译注：该方法用于获取引起实体燃烧的方块。此句缺漏。）
>
>
> 
> 引起实体燃烧的方块可能是岩浆，也有可能是某个着火的方块。
>
> 本方法的返回值可能是 `null` 。
>
> @return 引起实体燃烧的方块。