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
> 
> <br>
> 
> 当袭击中有一波袭击者生成时触发。
> 
> <br>
> 
> 译注：参见 `Minecraft Wiki` 中的有关页面 [https://minecraft.fandom.com/wiki/Raid#Raid_wave_spawning](https://minecraft.fandom.com/wiki/Raid#Raid_wave_spawning) 可知，每一波袭击在生成前先要寻找一个合适的位置来生成袭击者，如果三次尝试均以失败告终，则袭击直接结束，此时会触发 `RaidStopEvent` ，不会触发本事件。只有在寻找到合适的生成位置、袭击者生成完毕以后，才会触发本事件。只要生成了袭击者，就不会再次尝试寻找合适的位置，也就不再触发本事件了。这是由于场上袭击者数量不为零（ `net.minecraft.server.v1_16_R3.Raid#r()` 方法返回值不为零，该方法在 `Mojang Mapping` 中反混淆名为 `getTotalRaidersAlive()` ），因此 `G()` 方法（`Mojang Mapping` 名为 `shouldSpawnGroup()` ）返回 `false` ，跳出循环。

### 方法列表

#### getPatrolLeader

方法声明: public Raider getPatrolLeader()

方法签名: ()Lorg/bukkit/entity/Raider;

> Returns the patrol leader.
> 
> @return {@link Raider}
> 
> <br>
> 
> 该方法用于获取该波袭击中的小队长。
> 
> @return 一个 `Raider` 类型的实体对象。

#### getRaiders

方法声明: public List<Raider> getRaiders()

方法签名: ()Ljava/util/List;

> Returns all {@link Raider} that spawned in this wave.
> 
> @return an immutable list of raiders
> 
> <br>
> 
> 该方法用于获取一个列表，其间存储有该波袭击中生成的全部袭击者实体对象。
> 
> @return 一个不可修改的袭击者实体列表。
> 
> <br>
> 
> 译注：本事件触发时，所有袭击者已经生成完毕，这一过程是不可逆的，因此本事件无法取消，该方法返回的列表也不可修改。如果需要移除某些袭击者，只能采用 `Entity#remove()` 等方法删除。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;