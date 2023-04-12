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
> If a Creature Spawn event is cancelled, the creature will not spawn.
> 
> <p>
> 
> 当某个生物生成时触发。
> 
> 如果本事件被取消，涉事生物将不会生成。

### 方法列表

#### getEntity

方法声明: public LivingEntity getEntity()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

> 译注：无文档。该方法用于获取事件中生成的实体。

#### getSpawnReason

方法声明: public SpawnReason getSpawnReason()

方法签名: ()Lorg/bukkit/event/entity/CreatureSpawnEvent/SpawnReason;

> Gets the reason for why the creature is being spawned.
> 
> @return A SpawnReason value detailing the reason for the creature being
> 
> spawned
> 
> <p>
> 
> 该方法用于获取生物生成的原因。
> 
> @return 生物生成的详细原因。以 `SpawnReason` 枚举表示。

### 枚举: SpawnReason

> An enum to specify the type of spawning
> 
> <p>
> 
> 用于确定生物生成原因的枚举。

#### NATURAL

> When something spawns from natural means
> 
> <p>
> 
> 生物自然生成。

#### JOCKEY

> When an entity spawns as a jockey of another entity (mostly spider
> 
> jockeys)
> 
> <p>
> 
> 某个类似骑士的实体乘着另外一个实体生成（主要指骷髅与蜘蛛组合而成的蜘蛛骑士）。

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
> 
> <p>
> 
> 区块生成时生成实体。
> 
> @deprecated 本字段已过时。在当前版本下，区块生成时实体已经存在，因此不会再触发生物生成事件。本字段从而失去意义。如欲监听区块生成时一并生成实体的情形，可以监听 `ChunkLoadEvent` 并通过 `ChunkLoadEvent#isNewChunk()` 和 `Chunk#getEntities()` 方法的组合实现。
> 
> <p>
> 
> 译注：首次加载某个区块时将会“生成”区块。`CreatureSpawnEvent.SpawnReason#CHUNK_GEN` 字段在旧版本下表示区块生成时，同时生成实体的情景。在新版本下，区块生成时不会一并生成实体。实体在区块生成以前就已经存在了。
> 
> 在新版本中，可以监听区块生成（使用 `ChunkLoadEvent` 事件监听器），但不能再通过 `CreatureSpawnEvent` 监听区块生成时一并生成实体的场景。如果一定需要监听该情景，可以先监听 `ChunkLoadEvent` ，此后再调用 `ChunkLoadEvent#isNewChunk()` 方法，该方法返回 `true` 时说明该区块是首次被加载，区块将会“生成”。通过 `Chunk#getEntities()` 可以获得区块内的全部实体。这样就间接获知了区块生成时，最早处于区块内的一些实体。
> 
> 旧版本中可以监听区块生成时一并生成实体的情况，新版本中可以监听区块生成，并在监听器中获取到区块内已有的实体。二者是比较接近的。

#### SPAWNER

> When a creature spawns from a spawner
> 
> <p>
> 
> 刷怪笼生成生物。

#### EGG

> When a creature spawns from an egg
> 
> <p>
> 
> 掷出的鸡蛋生成小鸡。

#### SPAWNER_EGG

> When a creature spawns from a Spawner Egg
> 
> <p>
> 
> 刷怪蛋生成生物。
> 
> <p>
> 
> 译注：指创造模式常用的，名为“生成某某某”的刷怪蛋。

#### LIGHTNING

> When a creature spawns because of a lightning strike
> 
> <p>
> 
> 由于雷击生成生物。
> 
> <p>
> 
> 译注：比如苦力怕遭到雷击，生成闪电苦力怕。

#### BUILD_SNOWMAN

> When a snowman is spawned by being built
> 
> <p>
> 
> 通过雪块和南瓜搭建特定结构，生成雪傀儡。

#### BUILD_IRONGOLEM

> When an iron golem is spawned by being built
> 
> <p>
> 
> 通过铁块和南瓜搭建特定结构，生成铁傀儡。

#### BUILD_WITHER

> When a wither boss is spawned by being built
> 
> <p>
> 
> 通过灵魂沙和凋零骷髅头颅搭建特定结构，生成凋零。

#### VILLAGE_DEFENSE

> When an iron golem is spawned to defend a village
> 
> <p>
> 
> 铁傀儡作为村庄的守护者而生成。

#### VILLAGE_INVASION

> When a zombie is spawned to invade a village
> 
> <p>
> 
> 僵尸作为村庄的入侵者而生成。

#### BREEDING

> When an animal breeds to create a child
> 
> <p>
> 
> 动物繁殖，生成动物宝宝。

#### SLIME_SPLIT

> When a slime splits
> 
> <p>
> 
> 史莱姆死后分裂，生成较小的史莱姆。

#### REINFORCEMENTS

> When an entity calls for reinforcements
> 
> <p>
> 
> 实体请求援助。
> 
> <p>
> 
> 译注：参见 `MineCraft Wiki` 中有关僵尸的相关页面 [https://minecraft.fandom.com/wiki/Zombie#Reinforcements](https://minecraft.fandom.com/wiki/Zombie#Reinforcements) 可知，在困难难度下，当僵尸受到伤害时，其有一定概率召唤增援，在其四周生成新的僵尸。

#### NETHER_PORTAL

> When a creature is spawned by nether portal
> 
> <p>
> 
> 下界传送门中生成实体。
> 
> <p>
> 
> 译注：参见 `MineCraft Wiki` 中有关僵尸猪灵的相关页面 [https://minecraft.fandom.com/wiki/Zombified_Piglin#Nether_portals](https://minecraft.fandom.com/wiki/Zombified_Piglin#Nether_portals) 可知，就每一个位于主世界的下界传送门方块而言，每个方块刻，其上都有一定概率生成僵尸猪灵。

#### DISPENSE_EGG

> When a creature is spawned by a dispenser dispensing an egg
> 
> <p>
> 
> 发射器中抛掷出鸡蛋，生成生物。

#### INFECTION

> When a zombie infects a villager
> 
> <p>
> 
> 僵尸感染了村民，生成僵尸村民。

#### CURED

> When a villager is cured from infection
> 
> <p>
> 
> 僵尸村民被治愈，恢复成村民。

#### OCELOT_BABY

> When an ocelot has a baby spawned along with them
> 
> <p>
> 
> 豹猫的宝宝在其亲属身边生成。

#### SILVERFISH_BLOCK

> When a silverfish spawns from a block
> 
> <p>
> 
> 蠹虫从被虫蚀的方块中生成。

#### MOUNT

> When an entity spawns as a mount of another entity (mostly chicken
> 
> jockeys)
> 
> <p>
> 
> 某个实体作为其他实体的坐骑生成（主要指僵尸与鸡组合而成的鸡骑士）。

#### TRAP

> When an entity spawns as a trap for players approaching
> 
> <p>
> 
> 玩家接近骷髅陷阱马，生成了实体。
> 
> <p>
> 
> 译注：参见 `MineCraft Wiki` 有关骷髅马的页面 [https://minecraft.fandom.com/wiki/Skeleton_Horse#Spawning](https://minecraft.fandom.com/wiki/Skeleton_Horse#Spawning) 可知骷髅陷阱马的行为。

#### ENDER_PEARL

> When an entity is spawned as a result of ender pearl usage
> 
> <p>
> 
> 玩家使用末影珍珠，生成实体。
> 
> <p>
> 
> 译注：指玩家使用末影珍珠后生成末影螨。

#### SHOULDER_ENTITY

> When an entity is spawned as a result of the entity it is being
> 
> perched on jumping or being damaged
> 
> <p>
> 
> 某实体原先停靠在另一实体身上，但被停靠的实体主动跳跃或受到伤害，导致身上的实体离开。
> 
> <p>
> 
> 译注：指停靠在玩家肩膀上的鹦鹉起飞。停靠状态下，鹦鹉仅是一个动画效果，并不是实体。起飞时会生成一个实体对象对应该鹦鹉。

#### DROWNED

> When a creature is spawned by another entity drowning
> 
> <p>
> 
> 实体溺水淹死，生成另一实体。

#### SHEARED

> When an cow is spawned by shearing a mushroom cow
> 
> <p>
> 
> 哞菇身上的蘑菇被玩家使用剪刀剪下，生成一只普通牛。

#### EXPLOSION

> When eg an effect cloud is spawned as a result of a creeper exploding
> 
> <p>
> 
> 当苦力怕爆炸时，生成一片药水云。
> 
> <p>
> 
> 译注：参见 `MineCraft Wiki` 的相关页面 [https://minecraft.fandom.com/wiki/Creeper#Behavior](https://minecraft.fandom.com/wiki/Creeper#Behavior) 可知，当一只携带药水效果的苦力怕自爆时，会生成一片药水云，该药水云所提供的药水效果类型与苦力怕身上的药水效果类型一致。

#### RAID

> When an entity is spawned as part of a raid
> 
> <p>
> 
> 怪物在某一波袭击中生成，作为进攻村庄的一员。

#### PATROL

> When an entity is spawned as part of a patrol
> 
> <p>
> 
> 生成掠夺者小队时，怪物作为其中一员而生成。

#### BEEHIVE

> When a bee is released from a beehive/bee nest
> 
> <p>
> 
> 蜜蜂从蜂巢或蜂箱中飞出。

#### PIGLIN_ZOMBIFIED

> When a piglin is converted to a zombified piglin.
> 
> <p>
> 
> 猪灵转化为僵尸猪灵。

#### COMMAND

> When a creature is spawned by the "/summon" command
> 
> <p>
> 
> 玩家使用 `summon` 指令生成生物。

#### CUSTOM

> When a creature is spawned by plugins
> 
> <p>
> 
> 插件生成生物。
> 
> <p>
> 
> 译注：指插件调用 `World#spawnEntity` 等方法生成实体。

#### DEFAULT

> When an entity is missing a SpawnReason
> 
> <p>
> 
> 生物生成原因未知。