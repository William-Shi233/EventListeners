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
> This event is a high frequency event, it may be called thousands of times per
>
> a second on a busy server. Plugins are advised to listen to the event with
>
> caution and only perform lightweight checks when using it.
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
> Plugins should also note that where possible this event may only called for
>
> the "root" block of physics updates in order to limit event spam. Physics
>
> updates that cause other blocks to change their state may not result in an
>
> event for each of those blocks (usually adjacent). If you are concerned about
>
> monitoring these changes then you should check adjacent blocks yourself.
>
>
> 
> 当服务器进行一次方块物理状态检查时触发。
>
> 这个事件会被服务器频繁触发。在某些大型服务器里，该事件每秒可能会触发上千次。如欲监听本事件，一定要慎之又慎，监听器里最好只写一些简单而轻量的检查。
>
> 另外，如果取消本事件，则世界可能会变得很不协调。比如，插件作者可以取消本事件，以俾使某一个必须依附于其他方块存在的方块悬浮于半空。但是如果服务器重启或存档版本升级，这个浮空方块可能就无法保持原状。
>
> 插件作者还需要注意，有时候为了防止事件井喷式触发，本事件可能仅对引起大片方块物理状态更新的那个源头方块触发一次。周遭其他方块的状态虽然也发生了更新，但是未必会依次触发本事件（尤其是毗邻源头方块的那些方块）。如果一定要监听到每一个方块的物理状态变化，只能手动检查毗邻方块的状态。
>
>
> 
> 译注：所谓“物理状态检查”，其实就是方块状态更新。比如，有一片自然生成的浮空沙子，破坏掉边缘的一块，就会产生连锁反应，所有沙子全部坠落，这就是方块状态更新。方块被破坏（或方块被放置、活塞移动、水的流动，等等）会导致方块更新。在更新中，方块将检查自身的位置是否合法。沙子是不能浮空的，因而浮空的沙子处于不合法的位置，应当坠落。在服务器启动并加载地图时，就会进行许多次方块状态更新。在玩家游玩时，也有可能引起连锁反应，在极短时间内触发本事件很多次。因此监听本事件必须慎重。

### 方法列表

#### getSourceBlock

方法声明: public Block getSourceBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the source block that triggered this event.
>
> Note: This will default to block if not set.
>
> @return The source block
>
>
> 
> 该方法用于获取发生状态更新的方块。
>
> 如未经特别指定，本方法的返回值与本事件继承自 `BlockEvent` 的 `getBlock()` 方法的返回值等同。
>
> @return 发生状态更新的方块。

#### getChangedType

方法声明: public Material getChangedType()

方法签名: ()Lorg/bukkit/Material;

> Gets the type of block that changed, causing this event
>
> @return Changed block's type
>
>
> 
> 该方法用于获取发生状态更新的方块的材质。
>
> @return 发生状态更新的方块的材质。

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