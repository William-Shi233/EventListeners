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
>
> 当玩家在光标上有物品堆的情况下拖拽鼠标，将物品分置于各个格子中时触发。通过本事件的 `getType()` 方法可以获知拖拽动作具体是何类型。
>
> 由于本事件涉及到对物品栏内容的修改，在本事件的监听器中运行与物品栏有关的一些方法可能是不安全的。
>
> 在本事件的监听器中，绝不能对事件中的玩家或物品栏视图调用下列方法：
>
> <ul>
>
> <li> `HumanEntity#closeInventory()`
>
> <li> `HumanEntity#openInventory(Inventory)`
>
> <li> `HumanEntity#openWorkbench(Location, boolean)`
>
> <li> `HumanEntity#openEnchanting(Location, boolean)`
>
> <li> `InventoryView#close()`
>
> </ul>
>
> 如确有必要调用上述方法，请使用 `BukkitScheduler#runTask(Plugin, Runnable)` 调度一个任务，在下一 `tick` 执行方法。另外，上述列表并不一定完整，可能有其他方法同样不宜在本事件的监听器中使用。
>
> 假设触发本事件的 `HumanEntity` 对象是 `Player` 的子类，则如欲修改涉事物品栏所允许的物品堆最大堆叠数量或涉事物品栏的内容物，必须随后调用 `Player#updateInventory()` 以更新物品栏。
>
> 如果在监听器中对某个槽位中的物品堆作了修改，而事件本身的结果也对该槽位中的物品堆存在影响，则监听器中的修改可能会被覆盖。如必欲修改，应当取消本事件，然后在监听器中手动模拟事件结果。当然也可以使用 `BukkitScheduler#runTask(Plugin, Runnable)` 方法，在下一 `tick` 进行修改。

### 方法列表

#### getNewItems

方法声明: public Map<Integer, ItemStack> getNewItems()

方法签名: ()Ljava/util/Map;

> Gets all items to be added to the inventory in this drag.
>
> @return map from raw slot id to new ItemStack
>
> 该方法用于获取本次拖拽后将要被添加入物品栏的物品堆。
>
> @return 一个 `Map` ，其键为物品堆所在的槽位序号（ `raw slot` ），值为物品堆对象。
>
> 译注：表示某个序号对应的槽位内将被放置什么物品堆。

#### getRawSlots

方法声明: public Set<Integer> getRawSlots()

方法签名: ()Ljava/util/Set;

> Gets the raw slot ids to be changed in this drag.
>
> @return list of raw slot ids, suitable for getView().getItem(int)
>
> 该方法用于获取本次拖拽后内容物将要发生变化的槽位的序号（ `raw slot` ）。
>
> @return 槽位序号列表，其内元素可以作为 `getView().getItem(int)` 语句的参数。
>
> 译注：通过 `getView().getItem(int)` 语句，可以获取槽位内原有的物品堆。而 `getNewItems()` 方法可以获取将要被添加入槽位的新物品堆。
>
> 本方法返回的槽位序号在整个物品栏视图（即上下两个物品栏）中是唯一的。

#### getInventorySlots

方法声明: public Set<Integer> getInventorySlots()

方法签名: ()Ljava/util/Set;

> Gets the slots to be changed in this drag.
>
> @return list of converted slot ids, suitable for {@link
>
> org.bukkit.inventory.Inventory#getItem(int)}.
>
> 该方法用于获取本次拖拽后内容物将要发生变化的槽位的序号（ `slot` ）。
>
> @return 槽位序号列表，其内元素可以作为 `Inventory#getItem(int)` 语句的参数。
>
> 译注：通过 `Inventory#getItem(int)` 语句，可以获取槽位内原有的物品堆。而 `getNewItems()` 方法可以获取将要被添加入槽位的新物品堆。
> 
> 本方法返回的槽位序号在单个物品栏中是唯一的，但对于一个物品栏视图中的上下两个物品栏而言不是。两个物品栏中的不同格子可能对应相同的槽位序号。

#### getCursor

方法声明: public ItemStack getCursor()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the result cursor after the drag is done. The returned value is
>
> mutable.
>
> @return the result cursor
>
> 该方法用于获取拖拽后光标上的物品堆。本方法的返回值是可修改的。
>
> @return 拖拽后光标上的物品堆。

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
>
> 该方法用于设置拖拽后光标上的物品堆。
> 
> 通过本方法可以改变光标上的物品堆。改变拖动时受影响的槽位的内容物，是不会对光标上的物品堆产生影响的。改变光标上的物品堆以后，拖动时受影响的槽位的内容物也不会改变。
>
> @param 拖拽后光标上的物品堆。
>
> 译注：比如将数量为 `19` 的钻石物品堆沿着九个空格子拖拽，这样会在每个空格子里放置两颗钻石，并且玩家光标上还会剩余一颗钻石。如果用本方法将光标上的钻石数量改成十，不会让这九个格子里的钻石数量由二变为一。同理，如果让这九个格子里的钻石数量由二变为一，也不会使得光标上的钻石数量变成十。拖拽过程中所有受影响的格子里的内容物和光标上的物品堆，互相独立，各不干扰。

#### getOldCursor

方法声明: public ItemStack getOldCursor()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets an ItemStack representing the cursor prior to any modifications
>
> as a result of this drag.
>
> @return the original cursor
>
> 该方法用于获取拖拽以前光标上的物品堆。
>
> @return 拖拽以前光标上的物品堆。

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
>
> 该方法用于获取拖拽动作的 `DragType` ，此枚举可用于表示事件中的拖拽行为可能造成的影响。
>
> 事件中受到影响的物品堆及其所在的槽位序号（ `raw slot` ）可以通过本事件的 `getNewItems()` 方法访问。
>
> @return 拖拽动作的 `DragType` 。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;