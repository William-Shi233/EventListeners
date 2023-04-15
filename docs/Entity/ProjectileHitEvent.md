---
description: ProjectileHitEvent
---

# ProjectileHitEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.ProjectileHitEvent

### 类描述

> Called when a projectile hits an object
> 
> <br>
> 
> 当抛射物击中某物时触发。

### 方法列表

#### getEntity

方法声明: public Projectile getEntity()

方法签名: ()Lorg/bukkit/entity/Projectile;

> 译注：无文档。该方法用于获取击中目标的抛射物。

#### getHitBlock

方法声明: public Block getHitBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the block that was hit, if it was a block that was hit.
> 
> @return hit block or else null
> 
> <br>
> 
> 该方法用于获取抛射物击中的方块（前提是抛射物击中的是方块）。
> 
> @return 抛射物击中的方块，如击中的不是方块则返回 `null` 。

#### getHitBlockFace

方法声明: public BlockFace getHitBlockFace()

方法签名: ()Lorg/bukkit/block/BlockFace;

> Gets the block face that was hit, if it was a block that was hit and the
> 
> face was provided in the vent.
> 
> @return hit face or else null
> 
> <br>
> 
> 该方法用于获取抛射物击中的方块面（前提是抛射物击中的是方块，且事件对象记录了被击中的方块面信息）。
> 
> @return 抛射物击中的方块面，如击中的不是方块则返回 `null` 。

#### getHitEntity

方法声明: public Entity getHitEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the entity that was hit, if it was an entity that was hit.
> 
> @return hit entity or else null
> 
> <br>
> 
> 该方法用于获取抛射物击中的实体（前提是抛射物击中的是实体）。
> 
> @return 抛射物击中的实体，如击中的不是实体则返回 `null` 。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

> Whether to cancel the action that occurs when the projectile hits.
> 
> In the case of an entity, it will not collide (unless it's a firework,
> 
> then use {@link FireworkExplodeEvent}).
> 
> In the case of a block, some blocks (eg target block, bell) will not
> 
> perform the action associated.
> 
> This does NOT prevent block collisions, and explosions will still occur
> 
> unless their respective events are cancelled.
> 
> @param cancel true if you wish to cancel this event
> 
> <br>
> 
> 该方法用于设置是否要取消抛射物击中事件，取消本事件会导致抛射物击中时的一系列现象不再发生。
> 
> 如果抛射物击中的是实体，则抛射物将不会与实体相接触（除非抛射物是烟花火箭，此时需要进一步监听 `FireworkExplodeEvent` ）。
> 
> 如果抛射物击中的是方块，部分方块（如标靶、钟等）被击中后产生的后果将不再出现。（译注：标靶被击中会发出红石信号，钟会被抛射物所敲响）。
> 
> 即使取消了本事件，也不能防止抛射物与方块相撞。如果抛射物击中时将要引起爆炸，则爆炸会照常产生，除非与爆炸相应的事件也被取消。
> 
> @param cancel 如欲取消本事件，则传入 `true` 。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;