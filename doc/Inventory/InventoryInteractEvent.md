---
description: InventoryInteractEvent
---

# InventoryInteractEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.inventory.InventoryEvent

            =>  org.bukkit.event.inventory.InventoryInteractEvent

### 类描述

> An abstract base class for events that describe an interaction between a
>
> HumanEntity and the contents of an Inventory.

### 方法列表

#### getWhoClicked

方法声明: public HumanEntity getWhoClicked()

方法签名: ()Lorg/bukkit/entity/HumanEntity;

> Gets the player who performed the click.
>
> @return The clicking player.

#### setResult

方法声明: public void setResult(@NotNull Result newResult)

方法签名: (Lorg/bukkit/event/Event/Result;)V

> Sets the result of this event. This will change whether or not this
>
> event is considered cancelled.
>
> @param newResult the new {@link org.bukkit.event.Event.Result} for this event
>
> @see #isCancelled()

#### getResult

方法声明: public Result getResult()

方法签名: ()Lorg/bukkit/event/Event/Result;

> Gets the {@link org.bukkit.event.Event.Result} of this event. The Result describes the
>
> behavior that will be applied to the inventory in relation to this
>
> event.
>
> @return the Result of this event.

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

> Gets whether or not this event is cancelled. This is based off of the
>
> Result value returned by {@link #getResult()}.  Result.ALLOW and
>
> Result.DEFAULT will result in a returned value of false, but
>
> Result.DENY will result in a returned value of true.
>
> <p>
>
> {@inheritDoc}
>
> @return whether the event is cancelled

#### setCancelled

方法声明: public void setCancelled(boolean toCancel)

方法签名: (Z)V

> Proxy method to {@link #setResult(org.bukkit.event.Event.Result)} for the Cancellable
>
> interface. {@link #setResult(org.bukkit.event.Event.Result)} is preferred, as it allows
>
> you to specify the Result beyond Result.DENY and Result.ALLOW.
>
> <p>
>
> {@inheritDoc}
>
> @param toCancel result becomes DENY if true, ALLOW if false