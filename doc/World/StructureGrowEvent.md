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

### 方法列表

#### getLocation

方法声明: public Location getLocation()

方法签名: ()Lorg/bukkit/Location;

> Gets the location of the structure.
>
> @return Location of the structure

#### getSpecies

方法声明: public TreeType getSpecies()

方法签名: ()Lorg/bukkit/TreeType;

> Gets the species type (birch, normal, pine, red mushroom, brown
>
> mushroom)
>
> @return Structure species

#### isFromBonemeal

方法声明: public boolean isFromBonemeal()

方法签名: ()Z

> Checks if structure was grown using bonemeal.
>
> @return True if the structure was grown using bonemeal.

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the player that created the structure.
>
> @return Player that created the structure, null if was not created
>
> manually

#### getBlocks

方法声明: public List<BlockState> getBlocks()

方法签名: ()Ljava/util/List;

> Gets a list of all blocks associated with the structure.
>
> @return list of all blocks associated with the structure.

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