---
description: BlockPhysicsEvent
---

# BlockPhysicsEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockPhysicsEvent

### 类描述

> Thrown when a block physics check is called.
>
> <br>
>
> This event is a high frequency event, it may be called thousands of times per
>
> a second on a busy server. Plugins are advised to listen to the event with
>
> caution and only perform lightweight checks when using it.
>
> <br>
>
> In addition to this, cancelling the event is liable to leave the world in an
>
> inconsistent state. For example if you use the event to leave a block
>
> floating in mid air when that block has a requirement to be attached to
>
> something, there is no guarantee that the floating block will persist across
>
> server restarts or map upgrades.
>
> <br>
>
> Plugins should also note that where possible this event may only called for
>
> the "root" block of physics updates in order to limit event spam. Physics
>
> updates that cause other blocks to change their state may not result in an
>
> event for each of those blocks (usually adjacent). If you are concerned about
>
> monitoring these changes then you should check adjacent blocks yourself.

### 方法列表

#### getSourceBlock

方法声明: public Block getSourceBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the source block that triggered this event.
>
> Note: This will default to block if not set.
>
> @return The source block

#### getChangedType

方法声明: public Material getChangedType()

方法签名: ()Lorg/bukkit/Material;

> Gets the type of block that changed, causing this event
>
> @return Changed block's type

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