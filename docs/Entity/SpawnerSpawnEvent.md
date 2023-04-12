---
description: SpawnerSpawnEvent
---

# SpawnerSpawnEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntitySpawnEvent

                =>  org.bukkit.event.entity.SpawnerSpawnEvent

### 类描述

> Called when an entity is spawned into a world by a spawner.
> 
> If a Spawner Spawn event is cancelled, the entity will not spawn.
> 
> <p>
> 
> 当刷怪笼生成实体时触发。
> 
> 如果本事件被取消，则实体将不会生成。

### 方法列表

#### getSpawner

方法声明: public CreatureSpawner getSpawner()

方法签名: ()Lorg/bukkit/block/CreatureSpawner;

> 译注：无文档。该方法用于获取事件中的刷怪笼。