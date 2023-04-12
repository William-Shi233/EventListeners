---
description: EntityDamageByBlockEvent
---

# EntityDamageByBlockEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityDamageEvent

                =>  org.bukkit.event.entity.EntityDamageByBlockEvent

### 类描述

> Called when an entity is damaged by a block
> 
> <p>
> 
> 当实体由于方块而受到伤害时触发。

### 方法列表

#### getDamager

方法声明: public Block getDamager()

方法签名: ()Lorg/bukkit/block/Block;

> Returns the block that damaged the player.
> 
> @return Block that damaged the player
> 
> <p>
> 
> 该方法用于获取伤害了玩家的方块。
> 
> @return 伤害了玩家的方块。
> 
> <p>
> 
> 译注：文档有误。当玩家以外的实体受到来自方块的伤害时（比如当一只动物落入岩浆时），也会触发本事件。故此，所谓“伤害了玩家的方块”应改为“伤害了涉事实体的方块”。