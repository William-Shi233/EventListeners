---
description: EntityShootBowEvent
---

# EntityShootBowEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityShootBowEvent

### 类描述

> Called when a LivingEntity shoots a bow firing an arrow
> 
> <br>
> 
> 当某生物弯弓射箭时触发。

### 方法列表

#### getEntity

方法声明: public LivingEntity getEntity()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

> 译注：无文档。该方法用于获取射箭的实体。

#### getBow

方法声明: public ItemStack getBow()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the bow ItemStack used to fire the arrow.
> 
> @return the bow involved in this event
> 
> <br>
> 
> 该方法用于获取射箭所依凭的弓物品堆。
> 
> @return 事件中的弓物品堆。

#### getConsumable

方法声明: public ItemStack getConsumable()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Get the ItemStack to be consumed in this event (if any).
> 
> For instance, bows will consume an arrow ItemStack in a player's
> 
> inventory.
> 
> @return the consumable item
> 
> <br>
> 
> 该方法用于获取事件中被消耗的物品堆（如存在）。
> 
> 比如一张弓使用一次会消耗玩家背包中的一根箭矢。
> 
> @return 事件中被消耗的物品堆。

#### getProjectile

方法声明: public Entity getProjectile()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the projectile which will be launched by this event
> 
> @return the launched projectile
> 
> <br>
> 
> 该方法用于获取将要被射出的抛射物实体。
> 
> @return 将要被射出的抛射物实体。

#### setProjectile

方法声明: public void setProjectile(@NotNull Entity projectile)

方法签名: (Lorg/bukkit/entity/Entity;)V

> Replaces the projectile which will be launched
> 
> @param projectile the new projectile
> 
> <br>
> 
> 该方法用于设置将要被射出的抛射物实体。
> 
> @param projectile 将要被射出的抛射物实体。

#### getHand

方法声明: public EquipmentSlot getHand()

方法签名: ()Lorg/bukkit/inventory/EquipmentSlot;

> Get the hand from which the bow was shot.
> 
> @return the hand
> 
> <br>
> 
> 该方法用于获取射箭所用的是哪一侧手。
> 
> @return 射箭所用的是哪一侧手。
> 
> <br>
> 
> 译注：指主副手，而非左右手。

#### getForce

方法声明: public float getForce()

方法签名: ()F

> Gets the force the arrow was launched with
> 
> @return bow shooting force, up to 1.0
> 
> <br>
> 
> 该方法用于获取射箭时所用的力量大小。
> 
> @return 射箭时所用的力量大小，最大为一。

#### setConsumeItem

方法声明: public void setConsumeItem(boolean consumeItem)

方法签名: (Z)V

> Set whether or not the consumable item should be consumed in this event.
> 
> If set to false, it is recommended that a call to
> 
> {@link Player#updateInventory()} is made as the client may disagree with
> 
> the server's decision to not consume a consumable item.
> 
> This value is ignored for entities where items are not required
> 
> (skeletons, pillagers, etc.) or with crossbows (as no item is being
> 
> consumed).
> 
> @param consumeItem whether or not to consume the item
> 
> <br>
> 
> 该方法用于设置事件中是否要消耗物品堆。
> 
> 如果传入 `false` ，则建议在调用本方法后随附 `Player#updateInventory()` 语句，否则客户端有可能拒绝服务端发来的“不消耗物品堆”的决定。
> 
> 对于一些射箭或装填弩时不消耗箭矢的生物（如骷髅、如掠夺者等），本方法传入的参数会被忽略。
> 
> @param consumeItem 事件中是否要消耗物品堆。

#### shouldConsumeItem

方法声明: public boolean shouldConsumeItem()

方法签名: ()Z

> Get whether or not the consumable item should be consumed in this event.
> 
> @return true if consumed, false otherwise
> 
> <br>
> 
> 该方法用于获取事件中是否要消耗物品堆。
> 
> @return 如果将要消耗物品堆则返回 `true` ，否则返回 `false` 。

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