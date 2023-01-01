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

### 方法列表

#### getEntity

方法声明: public LivingEntity getEntity()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

#### getBow

方法声明: public ItemStack getBow()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the bow ItemStack used to fire the arrow.
>
> @return the bow involved in this event

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

#### getProjectile

方法声明: public Entity getProjectile()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the projectile which will be launched by this event
>
> @return the launched projectile

#### setProjectile

方法声明: public void setProjectile(@NotNull Entity projectile)

方法签名: (Lorg/bukkit/entity/Entity;)V

> Replaces the projectile which will be launched
>
> @param projectile the new projectile

#### getHand

方法声明: public EquipmentSlot getHand()

方法签名: ()Lorg/bukkit/inventory/EquipmentSlot;

> Get the hand from which the bow was shot.
>
> @return the hand

#### getForce

方法声明: public float getForce()

方法签名: ()F

> Gets the force the arrow was launched with
>
> @return bow shooting force, up to 1.0

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
> <p>
>
> This value is ignored for entities where items are not required
>
> (skeletons, pillagers, etc.) or with crossbows (as no item is being
>
> consumed).
>
> @param consumeItem whether or not to consume the item

#### shouldConsumeItem

方法声明: public boolean shouldConsumeItem()

方法签名: ()Z

> Get whether or not the consumable item should be consumed in this event.
>
> @return true if consumed, false otherwise

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