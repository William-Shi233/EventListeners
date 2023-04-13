---
description: StructureGrowEvent
---

# StructureGrowEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.world.WorldEvent

            =>  org.bukkit.event.world.StructureGrowEvent

### 类描述

> Event that is called when an organic structure attempts to grow (Sapling {@literal ->}
> 
> Tree), (Mushroom {@literal ->} Huge Mushroom), naturally or using bonemeal.
> 
> <br>
> 
> 当一个自然结构试图生长时触发（比如树苗长成树木，比如小蘑菇长成巨型蘑菇）。无论该结构系自然生长或系玩家用骨粉催熟，都能触发本事件。

### 方法列表

#### getLocation

方法声明: public Location getLocation()

方法签名: ()Lorg/bukkit/Location;

> Gets the location of the structure.
> 
> @return Location of the structure
> 
> <br>
> 
> 该方法用于获取涉事结构所处的位置。
> 
> @return 涉事结构所处的位置。

#### getSpecies

方法声明: public TreeType getSpecies()

方法签名: ()Lorg/bukkit/TreeType;

> Gets the species type (birch, normal, pine, red mushroom, brown
> 
> mushroom)
> 
> @return Structure species
> 
> <br>
> 
> 该方法用于获取涉事结构的种类（如白桦木、橡木、云杉木、红色蘑菇、棕色蘑菇等）。
> 
> @return 结构的种类。
> 
> <br>
> 
> 译注：文档有误。此处所列树种不知取自何处，`TreeType` 枚举字段中并没有 `PINE` 只有 `REDWOOD` ，表示云杉木，也没有所谓的 `NORMAL` 树种。不可采信，应当以 `TreeType` 枚举为准。

#### isFromBonemeal

方法声明: public boolean isFromBonemeal()

方法签名: ()Z

> Checks if structure was grown using bonemeal.
> 
> @return True if the structure was grown using bonemeal.
> 
> <br>
> 
> 该方法用于获取结构是否系因骨粉催熟而生长。
> 
> @return 如因骨粉催熟而生长则返回 `true` 。

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the player that created the structure.
> 
> @return Player that created the structure, null if was not created
> 
> manually
> 
> <br>
> 
> 该方法用于获取创建结构的玩家。
> 
> @return 创建结构的玩家。如果涉事结构非玩家手动创建，则返回 `null` 。
> 
> <br>
> 
> 译注：文档有误。所谓“创建”，易被理解为树苗或蘑菇的种植者。但该词所指的是使用骨粉催熟树苗或蘑菇的玩家。参见 `net.minecraft.server.v1_16_R3.BlockSapling#tick(IBlockData iblockdata, WorldServer worldserver, BlockPosition blockposition, Random random)` 方法。

#### getBlocks

方法声明: public List<BlockState> getBlocks()

方法签名: ()Ljava/util/List;

> Gets a list of all blocks associated with the structure.
> 
> @return list of all blocks associated with the structure.
> 
> <br>
> 
> 该方法用于获取一个列表，其间存储有全部同涉事结构相关的方块。
> 
> @return 存储有全部同涉事结构相关的方块的列表。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;