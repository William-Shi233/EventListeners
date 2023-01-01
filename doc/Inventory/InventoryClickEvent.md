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
> <p>
>
> Because InventoryClickEvent occurs within a modification of the Inventory,
>
> not all Inventory related methods are safe to use.
>
> <p>
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

### 方法列表

#### getSlotType

方法声明: public SlotType getSlotType()

方法签名: ()Lorg/bukkit/event/inventory/InventoryType/SlotType;

> Gets the type of slot that was clicked.
>
> @return the slot type

#### getCursor

方法声明: public ItemStack getCursor()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the current ItemStack on the cursor.
>
> @return the cursor ItemStack

#### getCurrentItem

方法声明: public ItemStack getCurrentItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the ItemStack currently in the clicked slot.
>
> @return the item in the clicked

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

#### setCurrentItem

方法声明: public void setCurrentItem(@Nullable ItemStack stack)

方法签名: (Lorg/bukkit/inventory/ItemStack;)V

> Sets the ItemStack currently in the clicked slot.
>
> @param stack the item to be placed in the current slot

#### getClickedInventory

方法声明: public Inventory getClickedInventory()

方法签名: ()Lorg/bukkit/inventory/Inventory;

> Gets the inventory corresponding to the clicked slot.
>
> @return inventory, or null if clicked outside
>
> @see InventoryView#getInventory(int)

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

#### getRawSlot

方法声明: public int getRawSlot()

方法签名: ()I

> The raw slot number clicked, ready for passing to {@link InventoryView
>
> #getItem(int)} This slot number is unique for the view.
>
> @return the slot number

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

#### getAction

方法声明: public InventoryAction getAction()

方法签名: ()Lorg/bukkit/event/inventory/InventoryAction;

> Gets the InventoryAction that triggered this event.
>
> <p>
>
> This action cannot be changed, and represents what the normal outcome
>
> of the event will be. To change the behavior of this
>
> InventoryClickEvent, changes must be manually applied.
>
> @return the InventoryAction that triggered this event.

#### getClick

方法声明: public ClickType getClick()

方法签名: ()Lorg/bukkit/event/inventory/ClickType;

> Gets the ClickType for this event.
>
> <p>
>
> This is insulated against changes to the inventory by other plugins.
>
> @return the type of inventory click

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;