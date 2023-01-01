---
description: EntityBlockFormEvent
---

# EntityBlockFormEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockGrowEvent

                =>  org.bukkit.event.block.BlockFormEvent

                    =>  org.bukkit.event.block.EntityBlockFormEvent

### 类描述

> Called when a block is formed by entities.
>
> <p>
>
> Examples:
>
> <ul>
>
> <li>Snow formed by a {@link org.bukkit.entity.Snowman}.
>
> <li>Frosted Ice formed by the Frost Walker enchantment.
>
> </ul>

### 方法列表

#### getEntity

方法声明: public Entity getEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Get the entity that formed the block.
>
> @return Entity involved in event