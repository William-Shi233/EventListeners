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
> Use {@link BlockSpreadEvent} to catch blocks that actually spread and don't
> 
> just "randomly" form.
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
> If a Block Form event is cancelled, the block will not be formed.
> 
> @see BlockSpreadEvent
> 
> <p>
> 
> 当一应条件合适，某方块随机生成或开始向四周蔓延时触发。
> 
> 如欲监听某些方块蔓延的事件，请参见 `BlockSpreadEvent` 。本事件在方块“随机”生成时触发。
> 
> 本事件触发的情景包括：
> 
> <ul>
> 
> <li>在暴风雪天气下，地面生成雪方块。
> 
> <li>在针叶林、雪原等温度较低的生物群系里，水结冰。
> 
> <li>岩浆与水接触，生成圆石或黑曜石。
> 
> <li>混凝土粉末与水接触，生成混凝土方块。
> 
> </ul>
> 
> 如果本事件被取消，则不会生成新方块。
> 
> @see 参见 `BlockSpreadEvent` 。

### 方法列表

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;