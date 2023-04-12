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
> 
>
> 当一个自然结构试图生长时触发，比如树苗长成树木，比如小蘑菇长成巨型蘑菇。无论是自然长大或用骨粉催熟都会触发本事件。

### 方法列表

#### getLocation

方法声明: public Location getLocation()

方法签名: ()Lorg/bukkit/Location;

> Gets the location of the structure.
>
> @return Location of the structure
>
> 
>
> 该方法用于获取事件中的结构所处的位置。
>
> @return 事件中的结构所处的位置。

#### getSpecies

方法声明: public TreeType getSpecies()

方法签名: ()Lorg/bukkit/TreeType;

> Gets the species type (birch, normal, pine, red mushroom, brown
>
> mushroom)
>
> @return Structure species
>
> 
>
> 该方法用于获取事件中的结构的种类，如白桦木、橡木、云杉木、红色蘑菇、棕色蘑菇等。
>
> @return 结构的种类。
>
> 
>
> 译注：此处原文所列出的树种很不规范，`TreeType` 枚举字段中并没有 `PINE` 只有 `REDWOOD` ，表示云杉木，也没有所谓的 `NORMAL` 树种。应当以 `TreeType` 枚举为准，

#### isFromBonemeal

方法声明: public boolean isFromBonemeal()

方法签名: ()Z

> Checks if structure was grown using bonemeal.
>
> @return True if the structure was grown using bonemeal.
>
> 
>
> 该方法用于获取结构是否系骨粉催熟而生长。
>
> @return 如果使用了骨粉催熟则返回 `true` 。

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the player that created the structure.
>
> @return Player that created the structure, null if was not created
>
> manually
>
> 
>
> 该方法用于获取创建结构的玩家。
>
> @return 创建结构的玩家。如果不是人工催熟的情况则返回 `null` 。
>
> 
>
> 译注：所谓“创建”，指的仅仅是成功催熟树苗或蘑菇的玩家。并不是树苗或蘑菇的种植者。参见 `net.minecraft.server.v1_16_R3.BlockSapling#tick(IBlockData iblockdata, WorldServer worldserver, BlockPosition blockposition, Random random)` ，在该类第 `32-52` 行。

#### getBlocks

方法声明: public List<BlockState> getBlocks()

方法签名: ()Ljava/util/List;

> Gets a list of all blocks associated with the structure.
>
> @return list of all blocks associated with the structure.
>
>
> 
> 该方法用于获取一个列表，其间存储有全部同事件中结构相关的方块。
>
> @return 存储有全部同事件中结构相关的方块的列表。

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