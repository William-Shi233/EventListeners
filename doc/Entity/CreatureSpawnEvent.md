---
description: CreatureSpawnEvent
---

# CreatureSpawnEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntitySpawnEvent

                =>  org.bukkit.event.entity.CreatureSpawnEvent

### 类描述

> Called when a creature is spawned into a world.
>
> <p>
>
> If a Creature Spawn event is cancelled, the creature will not spawn.

### 方法列表

#### getEntity

方法声明: public LivingEntity getEntity()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

#### getSpawnReason

方法声明: public SpawnReason getSpawnReason()

方法签名: ()Lorg/bukkit/event/entity/CreatureSpawnEvent/SpawnReason;

> Gets the reason for why the creature is being spawned.
>
> @return A SpawnReason value detailing the reason for the creature being
>
> spawned

### 枚举: SpawnReason

> An enum to specify the type of spawning

#### NATURAL

> When something spawns from natural means

#### JOCKEY

> When an entity spawns as a jockey of another entity (mostly spider
>
> jockeys)

#### CHUNK_GEN

> When a creature spawns due to chunk generation
>
> @deprecated no longer called, chunks are generated with entities
>
> already existing. Consider using {@link ChunkLoadEvent},
>
> {@link ChunkLoadEvent#isNewChunk()} and {@link Chunk#getEntities()}
>
> for similar effect.

#### SPAWNER

> When a creature spawns from a spawner

#### EGG

> When a creature spawns from an egg

#### SPAWNER_EGG

> When a creature spawns from a Spawner Egg

#### LIGHTNING

> When a creature spawns because of a lightning strike

#### BUILD_SNOWMAN

> When a snowman is spawned by being built

#### BUILD_IRONGOLEM

> When an iron golem is spawned by being built

#### BUILD_WITHER

> When a wither boss is spawned by being built

#### VILLAGE_DEFENSE

> When an iron golem is spawned to defend a village

#### VILLAGE_INVASION

> When a zombie is spawned to invade a village

#### BREEDING

> When an animal breeds to create a child

#### SLIME_SPLIT

> When a slime splits

#### REINFORCEMENTS

> When an entity calls for reinforcements

#### NETHER_PORTAL

> When a creature is spawned by nether portal

#### DISPENSE_EGG

> When a creature is spawned by a dispenser dispensing an egg

#### INFECTION

> When a zombie infects a villager

#### CURED

> When a villager is cured from infection

#### OCELOT_BABY

> When an ocelot has a baby spawned along with them

#### SILVERFISH_BLOCK

> When a silverfish spawns from a block

#### MOUNT

> When an entity spawns as a mount of another entity (mostly chicken
>
> jockeys)

#### TRAP

> When an entity spawns as a trap for players approaching

#### ENDER_PEARL

> When an entity is spawned as a result of ender pearl usage

#### SHOULDER_ENTITY

> When an entity is spawned as a result of the entity it is being
>
> perched on jumping or being damaged

#### DROWNED

> When a creature is spawned by another entity drowning

#### SHEARED

> When an cow is spawned by shearing a mushroom cow

#### EXPLOSION

> When eg an effect cloud is spawned as a result of a creeper exploding

#### RAID

> When an entity is spawned as part of a raid

#### PATROL

> When an entity is spawned as part of a patrol

#### BEEHIVE

> When a bee is released from a beehive/bee nest

#### PIGLIN_ZOMBIFIED

> When a piglin is converted to a zombified piglin.

#### SPELL

> When an entity is created by a cast spell.

#### FROZEN

> When an entity is shaking in Powder Snow and a new entity spawns.

#### COMMAND

> When a creature is spawned by the "/summon" command

#### CUSTOM

> When a creature is spawned by plugins

#### DEFAULT

> When an entity is missing a SpawnReason