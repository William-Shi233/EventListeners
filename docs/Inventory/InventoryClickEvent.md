---
description: InventoryClickEvent
---

# InventoryClickEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.inventory.InventoryEvent

            =>  org.bukkit.event.inventory.InventoryInteractEvent

                =>  org.bukkit.event.inventory.InventoryClickEvent

### 类描述

> This event is called when a player clicks in an inventory.
> 
> Because InventoryClickEvent occurs within a modification of the Inventory,
> 
> not all Inventory related methods are safe to use.
> 
> The following should never be invoked by an EventHandler for
> 
> InventoryClickEvent using the HumanEntity or InventoryView associated with
> 
> this event:
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
> on the next tick. Also be aware that this is not an exhaustive list, and
> 
> other methods could potentially create issues as well.
> 
> Assuming the EntityHuman associated with this event is an instance of a
> 
> Player, manipulating the MaxStackSize or contents of an Inventory will
> 
> require an Invocation of {@link Player#updateInventory()}.
> 
> Modifications to slots that are modified by the results of this
> 
> InventoryClickEvent can be overwritten. To change these slots, this event
> 
> should be cancelled and all desired changes to the inventory applied.
> 
> Alternatively, scheduling a task using {@link BukkitScheduler#runTask(
> 
> Plugin, Runnable)}, which would execute the task on the next tick, would
> 
> work as well.
> 
> <p>
> 
> 当玩家在打开着物品栏的情况下点击鼠标时触发。
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

#### getSlotType

方法声明: public SlotType getSlotType()

方法签名: ()Lorg/bukkit/event/inventory/InventoryType/SlotType;

> Gets the type of slot that was clicked.
> 
> @return the slot type
> 
> <p>
> 
> 该方法用于获取玩家所点击的槽位的类型。
> 
> @return 槽位的类型。

#### getCursor

方法声明: public ItemStack getCursor()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the current ItemStack on the cursor.
> 
> @return the cursor ItemStack
> 
> <p>
> 
> 该方法用于获取玩家光标上现有的物品堆。
> 
> @return 玩家光标上现有的物品堆。

#### getCurrentItem

方法声明: public ItemStack getCurrentItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the ItemStack currently in the clicked slot.
> 
> @return the item in the clicked
> 
> <p>
> 
> 该方法用于获取被点击的槽位中现有的物品堆。
> 
> @return 被点击的槽位中现有的物品堆。

#### isRightClick

方法声明: public boolean isRightClick()

方法签名: ()Z

> Gets whether or not the ClickType for this event represents a right
> 
> click.
> 
> @return true if the ClickType uses the right mouse button.
> 
> @see ClickType#isRightClick()
> 
> <p>
> 
> 该方法用于获取玩家在点击时是否按下了鼠标右键。本方法的返回值是根据 `getClick()` 方法的返回值所确定的。
> 
> @return 如果玩家在点击时按下了鼠标右键则返回 `true` 。
> 
> @see 参见 `ClickType#isRightClick()` 方法。

#### isLeftClick

方法声明: public boolean isLeftClick()

方法签名: ()Z

> Gets whether or not the ClickType for this event represents a left
> 
> click.
> 
> @return true if the ClickType uses the left mouse button.
> 
> @see ClickType#isLeftClick()
> 
> <p>
> 
> 该方法用于获取玩家在点击时是否按下了鼠标左键。本方法的返回值是根据 `getClick()` 方法的返回值所确定的。
> 
> @return 如果玩家在点击时按下了鼠标左键则返回 `true` 。
> 
> @see 参见 `ClickType#isLeftClick()` 方法。

#### isShiftClick

方法声明: public boolean isShiftClick()

方法签名: ()Z

> Gets whether the ClickType for this event indicates that the key was
> 
> pressed down when the click was made.
> 
> @return true if the ClickType uses Shift or Ctrl.
> 
> @see ClickType#isShiftClick()
> 
> <p>
> 
> 该方法用于获取玩家在点击时是否按下了 `Shift` 键。本方法的返回值是根据 `getClick()` 方法的返回值所确定的。
> 
> @return 如果玩家在点击时按下了 `Shift` 键或 `Ctrl` 键则返回 `true` 。
> 
> @see 参见 `ClickType#isShiftClick()` 方法。

#### setCursor

方法声明: public void setCursor(@Nullable ItemStack stack)

方法签名: (Lorg/bukkit/inventory/ItemStack;)V

> Sets the item on the cursor.
> 
> @param stack the new cursor item
> 
> @deprecated This changes the ItemStack in their hand before any
> 
> calculations are applied to the Inventory, which has a tendency to
> 
> create inconsistencies between the Player and the server, and to
> 
> make unexpected changes in the behavior of the clicked Inventory.
> 
> <p>
> 
> 该方法用于设置光标上的物品堆。
> 
> @deprecated 该方法已过时。本方法会在物品栏其他内容修改以前强行改变光标上的物品堆，有可能导致客户端和服务端之间数据不同步，让被点击的物品栏出现不符合预期的变化。

#### setCurrentItem

方法声明: public void setCurrentItem(@Nullable ItemStack stack)

方法签名: (Lorg/bukkit/inventory/ItemStack;)V

> Sets the ItemStack currently in the clicked slot.
> 
> @param stack the item to be placed in the current slot
> 
> <p>
> 
> 该方法用于设置被点击的槽位内的物品堆。
> 
> @param stack 将要置于被点击的槽位内的物品堆。

#### getClickedInventory

方法声明: public Inventory getClickedInventory()

方法签名: ()Lorg/bukkit/inventory/Inventory;

> Gets the inventory corresponding to the clicked slot.
> 
> @return inventory, or null if clicked outside
> 
> @see InventoryView#getInventory(int)
> 
> <p>
> 
> 该方法用于获取点击的物品栏。
> 
> @return 点击的物品栏。如果点击了物品栏以外的区域，则返回 `null` 。
> 
> @see 参见 `InventoryView#getInventory(int)` 方法。

#### getSlot

方法声明: public int getSlot()

方法签名: ()I

> The slot number that was clicked, ready for passing to
> 
> {@link Inventory#getItem(int)}. Note that there may be two slots with
> 
> the same slot number, since a view links two different inventories.
> 
> @return The slot number.
> 
> <p>
> 
> 该方法用于获取点击的槽位序号（ `slot` ），该序号可以作为 `Inventory#getItem(int)` 方法的参数，用于获取某个槽位上的物品堆。这个槽位序号在单个物品栏中是唯一的，但对于一个物品栏视图中的上下两个物品栏而言不是。两个物品栏中的不同格子可能对应相同的槽位序号。
> 
> @return 点击的槽位序号（ `slot` ）。

#### getRawSlot

方法声明: public int getRawSlot()

方法签名: ()I

> The raw slot number clicked, ready for passing to {@link InventoryView
> 
> #getItem(int)} This slot number is unique for the view.
> 
> @return the slot number
> 
> <p>
> 
> 该方法用于获取点击的槽位序号（ `raw slot` ），该序号可以作为 `InventoryView#getItem(int)` 方法的参数，用于获取某个槽位上的物品堆。这个槽位序号在整个物品栏视图（即上下两个物品栏）中是唯一的。
> 
> @return 点击的槽位序号（ `raw slot` ）。

#### getHotbarButton

方法声明: public int getHotbarButton()

方法签名: ()I

> If the ClickType is NUMBER_KEY, this method will return the index of
> 
> the pressed key (0-8).
> 
> @return the number on the key minus 1 (range 0-8); or -1 if not
> 
> a NUMBER_KEY action
> 
> <p>
> 
> 如果 `getClick()` 方法返回 `NUMBER_KEY` ，则本方法会返回按下的数字键的序号（ `0-8` ）。
> 
> @return 如果 `getClick()` 方法返回值不是 `NUMBER_KEY` 则返回 `-1` ，否则返回数字键上的数字减去一所得的值（ `0-8` ）。
> 
> <p>
> 
> 译注：在物品栏中可以通过按下 `1-9` 数字键来将物品快速移动到玩家背包的快捷栏。本方法的返回值是将 `1-9` 数字键上的数字减去一而得，范围即为 `0-8` 。

#### getAction

方法声明: public InventoryAction getAction()

方法签名: ()Lorg/bukkit/event/inventory/InventoryAction;

> Gets the InventoryAction that triggered this event.
> 
> This action cannot be changed, and represents what the normal outcome
> 
> of the event will be. To change the behavior of this
> 
> InventoryClickEvent, changes must be manually applied.
> 
> @return the InventoryAction that triggered this event.
> 
> <p>
> 
> 该方法用于获取触发事件的点击动作。
> 
> 本方法的返回值不会被插件所修改。它代表了事件在自然状态下的结果。如果要改变点击后所发生的结果，必须手动对物品栏做修改。
> 
> @return 触发事件的点击动作。

#### getClick

方法声明: public ClickType getClick()

方法签名: ()Lorg/bukkit/event/inventory/ClickType;

> Gets the ClickType for this event.
> 
> This is insulated against changes to the inventory by other plugins.
> 
> @return the type of inventory click
> 
> <p>
> 
> 该方法用于获取点击的类型。
> 
> 本方法的返回值不会被插件所修改。
> 
> @return 点击的类型。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;