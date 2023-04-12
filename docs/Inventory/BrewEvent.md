---
description: BrewEvent
---

# BrewEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.inventory.BrewEvent

### 类描述

> Called when the brewing of the contents inside the Brewing Stand is
> 
> complete.
> 
> <p>
> 
> 当酿造台内的药水炼制完成时触发。

### 方法列表

#### getContents

方法声明: public BrewerInventory getContents()

方法签名: ()Lorg/bukkit/inventory/BrewerInventory;

> Gets the contents of the Brewing Stand.
> 
> <b>Note:</b> The brewer inventory still holds the items found prior to
> 
> the finalization of the brewing process, e.g. the plain water bottles.
> 
> @return the contents
> 
> <p>
> 
> 该方法用于获取酿造台物品栏内的物品。
> 
> 本事件触发时，酿造台物品栏内仍然存放着酿造完成以前的物品堆，比如无药水效果的水瓶等。
> 
> @return 酿造台物品栏内的物品。
> 
> <p>
> 
> 译注：所谓“酿造台物品栏”，指通过本事件的 `getBlock()` 方法获得酿造台方块对象，再通过其 `BlockState` 得到的酿造台物品栏。该物品栏内存放的是酿造前的物品，如水瓶等。通过本方法可以获得酿造后的结果，如药水等。

#### getFuelLevel

方法声明: public int getFuelLevel()

方法签名: ()I

> Gets the remaining fuel level.
> 
> @return the remaining fuel
> 
> <p>
> 
> 该方法用于获取剩余的燃料值。
> 
> @return 剩余的燃料值。

#### getResults

方法声明: public List<ItemStack> getResults()

方法签名: ()Ljava/util/List;

> Gets the resulting items in the Brewing Stand.
> 
> The returned list, in case of a server-created event instance, is
> 
> mutable. Any changes in the returned list will reflect in the brewing
> 
> result if the event is not cancelled. If the size of the list is reduced,
> 
> remaining items will be set to air.
> 
> @return List of {@link ItemStack} resulting for this operation
> 
> <p>
> 
> 该方法用于获取酿造台酿造的产物。
> 
> 如果本事件是由服务端触发，而非插件自行触发，则该方法会返回一个可修改的列表。只要本事件未被取消，则对该列表进行修改后，酿造结果也会相应发生改变。如果列表的大小减少了（指列表内有元素被删除），则酿造台内对应格子内的物品堆会被设为空气。
> 
> @return 一个物品堆列表，用于表示酿造结果。

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