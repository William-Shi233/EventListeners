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
> Examples:
> 
> <ul>
> 
> <li>Snow formed by a {@link org.bukkit.entity.Snowman}.
> 
> <li>Frosted Ice formed by the Frost Walker enchantment.
> 
> </ul>
> 
> <br>
> 
> 当实体引起方块生成时触发。
> 
> 可能的触发情景：
> 
> <ul>
> 
> <li>雪傀儡在方块上行走，足底生成雪方块。
> 
> <li>实体穿戴附有“冰霜行者”附魔的靴子在水面上行走，足底生成冰方块。
> 
> </ul>

### 方法列表

#### getEntity

方法声明: public Entity getEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Get the entity that formed the block.
> 
> @return Entity involved in event
> 
> <br>
> 
> 该方法用于获取导致方块生成的实体。
> 
> @return 涉事实体。