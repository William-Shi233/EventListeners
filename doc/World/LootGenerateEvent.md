---
description: LootGenerateEvent
---

# LootGenerateEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.world.WorldEvent

            =>  org.bukkit.event.world.LootGenerateEvent

### 类描述

> Called when a {@link LootTable} is generated in the world for an
>
> {@link InventoryHolder}.
>
> This event is NOT currently called when an entity's loot table has been
>
> generated (use {@link EntityDeathEvent#getDrops()}, but WILL be called by
>
> plugins invoking
>
> {@link LootTable#fillInventory(org.bukkit.inventory.Inventory, java.util.Random, LootContext)}.

### 方法列表

#### getEntity

方法声明: public Entity getEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Get the entity used as context for loot generation (if applicable).
>
> For inventories where entities are not required to generate loot, such as
>
> hoppers, null will be returned.
>
> This is a convenience method for
>
> {@code getLootContext().getLootedEntity()}.
>
> @return the entity

#### getInventoryHolder

方法声明: public InventoryHolder getInventoryHolder()

方法签名: ()Lorg/bukkit/inventory/InventoryHolder;

> Get the inventory holder in which the loot was generated.
>
> If the loot was generated as a result of the block being broken, the
>
> inventory holder will be null as this event is called post block break.
>
> @return the inventory holder

#### getLootTable

方法声明: public LootTable getLootTable()

方法签名: ()Lorg/bukkit/loot/LootTable;

> Get the loot table used to generate loot.
>
> @return the loot table

#### getLootContext

方法声明: public LootContext getLootContext()

方法签名: ()Lorg/bukkit/loot/LootContext;

> Get the loot context used to provide context to the loot table's loot
>
> generation.
>
> @return the loot context

#### setLoot

方法声明: public void setLoot(@Nullable Collection<ItemStack> loot)

方法签名: (Ljava/util/Collection;)V

> Set the loot to be generated. Null items will be treated as air.
>
> Note: the set collection is not the one which will be returned by
>
> {@link #getLoot()}.
>
> @param loot the loot to generate, null to clear all loot

#### getLoot

方法声明: public List<ItemStack> getLoot()

方法签名: ()Ljava/util/List;

> Get a mutable list of all loot to be generated.
>
> Any items added or removed from the returned list will be reflected in
>
> the loot generation. Null items will be treated as air.
>
> @return the loot to generate

#### isPlugin

方法声明: public boolean isPlugin()

方法签名: ()Z

> Check whether or not this event was called as a result of a plugin
>
> invoking
>
> {@link LootTable#fillInventory(org.bukkit.inventory.Inventory, java.util.Random, LootContext)}.
>
> @return true if plugin caused, false otherwise

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;