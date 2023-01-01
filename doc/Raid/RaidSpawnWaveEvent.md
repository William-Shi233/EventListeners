---
description: RaidSpawnWaveEvent
---

# RaidSpawnWaveEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.world.WorldEvent

            =>  org.bukkit.event.raid.RaidEvent

                =>  org.bukkit.event.raid.RaidSpawnWaveEvent

### 类描述

> Called when a raid wave spawns.

### 方法列表

#### getPatrolLeader

方法声明: public Raider getPatrolLeader()

方法签名: ()Lorg/bukkit/entity/Raider;

> Returns the patrol leader.
>
> @return {@link Raider}

#### getRaiders

方法声明: public List<Raider> getRaiders()

方法签名: ()Ljava/util/List;

> Returns all {@link Raider} that spawned in this wave.
>
> @return an immutable list of raiders

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;