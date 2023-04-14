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
> 
> <br>
> 
> 本类是一个抽象类，作为一些具体事件的基类使用。本类的子事件用于描述 `HumanEntity` 对象和物品栏之间的交互行为。
> 
> <br>
> 
> 译注：该事件未实现 `getHandlers()` 和 `getHandlerList()` 方法，无法直接监听。

### 方法列表

#### getWhoClicked

方法声明: public HumanEntity getWhoClicked()

方法签名: ()Lorg/bukkit/entity/HumanEntity;

> Gets the player who performed the click.
> 
> @return The clicking player.
> 
> <br>
> 
> 该方法用于获取点击物品栏的玩家。
> 
> @return 点击物品栏的玩家。

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
> 
> <br>
> 
> 该方法用于设置事件的结果。本方法会影响事件取消与否。
> 
> @param newResult 事件的新结果。
> 
> @see 参见本事件 `isCancelled()` 方法。

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
> 
> <br>
> 
> 该方法用于获取事件的结果。通过本方法的返回值，可以预估涉事物品栏将会发生的变化。
> 
> @return 事件的结果。
> 
> <br>
> 
> 译注：参见本事件 `isCancelled()` 方法。

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
> {@inheritDoc}
> 
> @return whether the event is cancelled
> 
> <br>
> 
> 该方法用于获取事件取消与否。本方法的返回值是基于本事件的 `getResult()` 方法而计算的。如果 `getResult()` 方法返回 `Result.ALLOW` 或 `Result.DEFAULT` 则本方法返回 `false` ，而若 `getResult()` 方法返回 `Result.DENY` 则本方法返回 `true` 。 
> 
> @return 事件取消与否。
> 
> <br>
> 
> 译注：`isCancelled()` 和 `setCancelled(boolean)` 方法是较为传统的，使用布尔值表示事件取消与否。而 `getResult()` 和 `setResult(Event.Result)` 方法，所使用的是 `Event.Result` ，不是布尔值。`Event.Result` 所承载的含义比布尔值更精确。其枚举字段中，`ALLOW` 代表强行允许，`DENY` 代表强行禁止，而 `DEFAULT` 代表的是“按照原版游戏规则处理”。所谓“原版游戏规则”，即没有任何监听器插手的情况下，事件的“默认”结果。
>
> `setCancelled(boolean)` 方法仍然可以使用，它会对参数作处理，将传入的 `true` 转变为 `Result.DENY` ，传入的 `false` 转变为 `Result.ALLOW` 。虽然如此，`setResult(Event.Result)` 方法可以使事件顺其自然地发生，这是布尔值无法替代的。有时，部分插件作者希望覆盖其之前的所有监听器对事件的操作结果，但又不是强行允许事件发生，这就可以用到 `Result.DEFAULT` 。

#### setCancelled

方法声明: public void setCancelled(boolean toCancel)

方法签名: (Z)V

> Proxy method to {@link #setResult(org.bukkit.event.Event.Result)} for the Cancellable
> 
> interface. {@link #setResult(org.bukkit.event.Event.Result)} is preferred, as it allows
> 
> you to specify the Result beyond Result.DENY and Result.ALLOW.
> 
> {@inheritDoc}
> 
> @param toCancel result becomes DENY if true, ALLOW if false
> 
> <br>
> 
> 本方法是 `Cancellable` 接口 `setResult(org.bukkit.event.Event.Result)` 方法的代理。推荐使用 `setResult(org.bukkit.event.Event.Result)` 替代本方法，因为前者可以用于指定 `Result.DENY` 和 `Result.ALLOW` 以外的结果。
> 
> @param toCancel 如果传入 `true` 则事件结果变为 `Result.DENY` ，传入 `false` 则事件结果变为 `Result.ALLOW` 。
> 
> <br>
> 
> 译注：如果使用 `setResult(org.bukkit.event.Event.Result)` 方法，可以指定 `Result.DEFAULT` 为事件结果，而本方法不能。
> 
> 参见本事件 `isCancelled()` 方法。