---
description: InventoryDragEvent
---

# InventoryDragEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.inventory.InventoryEvent

            =>  org.bukkit.event.inventory.InventoryInteractEvent

                =>  org.bukkit.event.inventory.InventoryDragEvent

### 类描述

> This event is called when the player drags an item in their cursor across
>
> the inventory. The ItemStack is distributed across the slots the
>
> HumanEntity dragged over. The method of distribution is described by the
>
> DragType returned by {@link #getType()}.
>
> <p>
>
> Canceling this event will result in none of the changes described in
>
> {@link #getNewItems()} being applied to the Inventory.
>
> <p>
>
> Because InventoryDragEvent occurs within a modification of the Inventory,
>
> not all Inventory related methods are safe to use.
>
> <p>
>
> The following should never be invoked by an EventHandler for
>
> InventoryDragEvent using the HumanEntity or InventoryView associated with
>
> this event.
>
> <ul>
>
> <li>{@link HumanEntity#closeInventory()}
>
> <li>{@link HumanEntity#openInventory(Inventory)}
>
> <li>{@link HumanEntity#openWorkbench(Location, boolean)}
>
> <li>{@link HumanEntity#openEnchanting(Location, boolean)}
>
> <li>{@link InventoryView#close()}
>
> </ul>
>
> To invoke one of these methods, schedule a task using
>
> {@link BukkitScheduler#runTask(Plugin, Runnable)}, which will run the task
>
> on the next tick.  Also be aware that this is not an exhaustive list, and
>
> other methods could potentially create issues as well.
>
> <p>
>
> Assuming the EntityHuman associated with this event is an instance of a
>
> Player, manipulating the MaxStackSize or contents of an Inventory will
>
> require an Invocation of {@link Player#updateInventory()}.
>
> <p>
>
> Any modifications to slots that are modified by the results of this
>
> InventoryDragEvent will be overwritten. To change these slots, this event
>
> should be cancelled and the changes applied. Alternatively, scheduling a
>
> task using {@link BukkitScheduler#runTask(Plugin, Runnable)}, which would
>
> execute the task on the next tick, would work as well.

### 方法列表

#### getNewItems

方法声明: public Map<Integer, ItemStack> getNewItems()

方法签名: ()Ljava/util/Map;

> Gets all items to be added to the inventory in this drag.
>
> @return map from raw slot id to new ItemStack

#### getRawSlots

方法声明: public Set<Integer> getRawSlots()

方法签名: ()Ljava/util/Set;

> Gets the raw slot ids to be changed in this drag.
>
> @return list of raw slot ids, suitable for getView().getItem(int)

#### getInventorySlots

方法声明: public Set<Integer> getInventorySlots()

方法签名: ()Ljava/util/Set;

> Gets the slots to be changed in this drag.
>
> @return list of converted slot ids, suitable for {@link
>
> org.bukkit.inventory.Inventory#getItem(int)}.

#### getCursor

方法声明: public ItemStack getCursor()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the result cursor after the drag is done. The returned value is
>
> mutable.
>
> @return the result cursor

#### setCursor

方法声明: public void setCursor(@Nullable ItemStack newCursor)

方法签名: (Lorg/bukkit/inventory/ItemStack;)V

> Sets the result cursor after the drag is done.
>
> <p>
>
> Changing this item stack changes the cursor item. Note that changing
>
> the affected "dragged" slots does not change this ItemStack, nor does
>
> changing this ItemStack affect the "dragged" slots.
>
> @param newCursor the new cursor ItemStack

#### getOldCursor

方法声明: public ItemStack getOldCursor()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets an ItemStack representing the cursor prior to any modifications
>
> as a result of this drag.
>
> @return the original cursor

#### getType

方法声明: public DragType getType()

方法签名: ()Lorg/bukkit/event/inventory/DragType;

> Gets the DragType that describes the behavior of ItemStacks placed
>
> after this InventoryDragEvent.
>
> <p>
>
> The ItemStacks and the raw slots that they're being applied to can be
>
> found using {@link #getNewItems()}.
>
> @return the DragType of this InventoryDragEvent

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;