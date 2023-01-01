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

#### getFuelLevel

方法声明: public int getFuelLevel()

方法签名: ()I

> Gets the remaining fuel level.
>
> @return the remaining fuel

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