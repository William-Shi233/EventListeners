---
description: BlockPistonEvent
---

# BlockPistonEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockPistonEvent

### 类描述

> Called when a piston block is triggered

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancelled)

方法签名: (Z)V

#### isSticky

方法声明: public boolean isSticky()

方法签名: ()Z

> Returns true if the Piston in the event is sticky.
>
> @return stickiness of the piston

#### getDirection

方法声明: public BlockFace getDirection()

方法签名: ()Lorg/bukkit/block/BlockFace;

> Return the direction in which the piston will operate.
>
> @return direction of the piston