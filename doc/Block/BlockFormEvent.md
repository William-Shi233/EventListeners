---
description: BlockFormEvent
---

# BlockFormEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockGrowEvent

                =>  org.bukkit.event.block.BlockFormEvent

### 类描述

> Called when a block is formed or spreads based on world conditions.
>
> <p>
>
> Use {@link BlockSpreadEvent} to catch blocks that actually spread and don't
>
> just "randomly" form.
>
> <p>
>
> Examples:
>
> <ul>
>
> <li>Snow forming due to a snow storm.
>
> <li>Ice forming in a snowy Biome like Taiga or Tundra.
>
> <li> Obsidian / Cobblestone forming due to contact with water.
>
> <li> Concrete forming due to mixing of concrete powder and water.
>
> </ul>
>
> <p>
>
> If a Block Form event is cancelled, the block will not be formed.
>
> @see BlockSpreadEvent

### 方法列表

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;