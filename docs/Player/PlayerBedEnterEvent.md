---
description: PlayerBedEnterEvent
---

# PlayerBedEnterEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerBedEnterEvent

### 类描述

> This event is fired when the player is almost about to enter the bed.
> 
> <p>
> 
> 当玩家将要在床上就寝时触发。
> 
> <p>
> 
> 译注：所谓“将要”，指本事件在玩家躺下以前触发。如果取消本事件，玩家就无法上床就寝。
> 
> 这个事件类所包含的方法，在不同版本间屡经更迭。
> 
> 在高版本 `API` 中，有一个 `getBedEnterResult()` 方法，返回玩家右键床后得到的各种结果，比如床在下界或末地爆炸、比如周围有怪物在游荡所以无法就寝等。由于本事件并没有 `setBedEnterResult(BedEnterResult)` 方法，因此无论插件开发者怎么调用 `setCancelled(true)` 去取消事件，`getBedEnterResult()` 方法的返回值都固定不变，不会被影响。 `getBedEnterResult()` 方法的返回值就是事件的“默认”结果，是没有任何插件修改时，玩家右键床所出现的结果。
> 
> 在旧版本的 `Bukkit API` 中，没有 `getBedEnterResult()` 方法，也没有 `useBed()` 和 `setUseBed(Event.Result)`方法。一般使用 `isCancelled()` 和 `setCancelled(boolean)` 这两个方法来操控本事件的结果。如果调用 `setCancelled(false)` 则玩家可以就寝。否则将阻止玩家就寝。这样写存在一个问题，即插件开发者不知道事件的“默认”结果。比如玩家在主世界右键了一个距离足够近的床，此时周围无怪物游荡，玩家本应该成功入睡，但是第一位开发者调用了 `setCancelled(true)` 让玩家无法就寝。第二位插件开发者调用 `isCancelled()` 方法，发现玩家无法就寝，由于没有 `getBedEnterResult()` 方法，其很可能误以为事件的“默认”结果是玩家无法入睡。同时，假如有开发者想要撤回在其之前所有监听器的修改结果，即让该事件的结果保持“默认”，避免有插件强行允许或禁止玩家就寝，也很难实现其目标，因为无从获取“默认”结果。
> 
> 但是高版本则不然。高版本提供了 `useBed()` 和 `setUseBed(Event.Result)` 两个方法来操控事件的结果，并且增加了 `getBedEnterResult()` 方法。`Event.Result` 枚举有三个字段，分别是允许、阻止和默认。前两个字段分别代表允许玩家上床和阻止玩家上床。比如 `setUseBed(Event.Result.ALLOW)` 这一写法即允许玩家上床睡觉。“默认”则是使用事件在自然状态下，不受插件影响时的默认结果，让事件结果与 `getBedEnterResult()` 的返回值一致。`setUseBed(Event.Result.DEFAULT)` 方法会让所有其他插件对事件结果的操纵无效，让玩家右键床的结果回归 `getBedEnterResult()` 的最初状态。
> 
> 在低版本的 `Bukkit API` 中，没有 `getBedEnterResult()` 方法，也没有 `BedEnterResult` 枚举。所以只能通过 `isCancelled()` 和 `setCancelled(boolean)` 这两个方法来干预事件结果。为了保证向后兼容性（基于低版本 `Bukkit API` 编写的插件也能运行在高版本服务端上），这两个方法并没有删除。在高版本下当某位插件开发者调用了 `isCancelled()` 方法时，如果 `useBed()` 为拒绝则返回 `true` ，如果 `useBed()` 为默认且 `getBedEnterResult()` 为允许就寝则返回 `false` ，如果 `useBed()` 为默认且 `getBedEnterResult()` 为不允许就寝则返回 `true` ，如果 `useBed()` 为允许则返回 `false` 。当某位插件开发者调用 `setCancelled(true)` 时，等效于 `setUseBed(Event.Result.DENY)` 。当某位插件开发者调用 `setCancelled(false)` 时，如果 `useBed()` 为拒绝则等效于 `setUseBed(Event.Result.DEFAULT)` ，如果 `useBed()` 不为拒绝则保持原值不变。

### 方法列表

#### getBedEnterResult

方法声明: public BedEnterResult getBedEnterResult()

方法签名: ()Lorg/bukkit/event/player/PlayerBedEnterEvent/BedEnterResult;

> This describes the default outcome of this event.
> 
> @return the bed enter result representing the default outcome of this event
> 
> <p>
> 
> 该方法用于获取本事件的默认结果。
> 
> @return 本事件的默认结果。
> 
> <p>
> 
> 译注：见上。

#### useBed

方法声明: public Result useBed()

方法签名: ()Lorg/bukkit/event/Event/Result;

> This controls the action to take with the bed that was clicked on.
> 
> In case of {@link org.bukkit.event.Event.Result#DEFAULT}, the default outcome is described by
> 
> {@link #getBedEnterResult()}.
> 
> @return the action to take with the interacted bed
> 
> @see #setUseBed(org.bukkit.event.Event.Result)
> 
> <p>
> 
> 该方法用于获取将要对事件中的床采取何种措施。
> 
> 如果本方法返回 `Event.Result.DEFAULT` ，则事件结果与 `getBedEnterResult()` 方法返回值等同。
> 
> @return 将要对事件中的床采取的措施。
> 
> @see 参见本事件的 `setUseBed(org.bukkit.event.Event.Result)` 方法。
> 
> <p>
> 
> 译注：见上。

#### setUseBed

方法声明: public void setUseBed(@NotNull Result useBed)

方法签名: (Lorg/bukkit/event/Event/Result;)V

> Sets the action to take with the interacted bed.
> 
> {@link org.bukkit.event.Event.Result#ALLOW} will result in the player sleeping, regardless of
> 
> the default outcome described by {@link #getBedEnterResult()}.
> 
> {@link org.bukkit.event.Event.Result#DENY} will prevent the player from sleeping. This has the
> 
> same effect as canceling the event via {@link #setCancelled(boolean)}.
> 
> {@link org.bukkit.event.Event.Result#DEFAULT} will result in the outcome described by
> 
> {@link #getBedEnterResult()}.
> 
> @param useBed the action to take with the interacted bed
> 
> @see #useBed()
> 
> <p>
> 
> 该方法用于设置将要对事件中的床采取何种措施。
> 
> 传入 `Event.Result.ALLOW` 会使玩家成功就寝，无论 `getBedEnterResult()` 返回何值。
> 
> 传入 `Event.Result.DENY` 会使玩家无法就寝，与使用 `setCancelled(boolean)` 方法取消事件等效。
> 
> 传入 `Event.Result.DEFAULT` 会使玩家采用事件默认结果就寝，即 `getBedEnterResult()` 方法返回值的结果。
> 
> @param useBed 将要对事件中的床采取何种措施。
> 
> @see 参见本事件的 `useBed()` 方法。
> 
> <p>
> 
> 译注：见上。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

> Gets the cancellation state of this event. Set to true if you want to
> 
> prevent the player from sleeping.
> 
> Canceling the event has the same effect as setting {@link #useBed()} to
> 
> {@link org.bukkit.event.Event.Result#DENY}.
> 
> For backwards compatibility reasons this also returns true if
> 
> {@link #useBed()} is {@link org.bukkit.event.Event.Result#DEFAULT} and the
> 
> {@link #getBedEnterResult() default action} is to prevent bed entering.
> 
> @return boolean cancellation state
> 
> <p>
> 
> 该方法用于获取本事件是否被取消。如欲阻止玩家就寝，请使用 `setCancelled` 方法取消本事件。
> 
> 使用 `setCancelled` 方法取消本事件，效果与将 `useBed()` 方法返回值设为 `org.bukkit.event.Event.Result#DENY` 相同。
> 
> 为了兼容基于低版本 `Bukkit API` 所编写的插件，如果 `useBed()` 方法返回值是 `org.bukkit.event.Event.Result#DEFAULT` ，且 `getBedEnterResult()` 返回一个阻止玩家就寝的枚举值，那么本方法会返回 `true` 。
> 
> @return 事件取消状态。
> 
> <p>
> 
> 译注：见上。

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

> Sets the cancellation state of this event. A canceled event will not be
> 
> executed in the server, but will still pass to other plugins.
> 
> Canceling this event will prevent use of the bed.
> 
> @param cancel true if you wish to cancel this event
> 
> <p>
> 
> 取消该事件，则玩家将无法上床就寝。
> 
> @param cancel 如欲取消该事件，则传入 `true` 作为参数。
> 
> <p>
> 
> 译注：原文第一段为所有 `setCancelled` 方法共用的文档，不赘。

#### getBed

方法声明: public Block getBed()

方法签名: ()Lorg/bukkit/block/Block;

> Returns the bed block involved in this event.
> 
> @return the bed block involved in this event
> 
> <p>
> 
> 该方法用于获取事件中的床方块。
> 
> @return 事件中的床方块。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: BedEnterResult

> Represents the default possible outcomes of this event.
> 
> <p>
> 
> 用于确定本事件可能结果的枚举。

#### OK

> The player will enter the bed.
> 
> <p>
> 
> 玩家可以上床就寝。

#### NOT_POSSIBLE_HERE

> The world doesn't allow sleeping or saving the spawn point (eg,
> 
> Nether, The End or Custom Worlds). This is based on
> 
> {@link World#isBedWorks()} and {@link World#isNatural()}.
> 
> Entering the bed is prevented and if {@link World#isBedWorks()} is
> 
> false then the bed explodes.
> 
> <p>
> 
> 玩家所在的世界不允许睡觉或保存出生点，比如下界、末地或某些自定义世界。
> 
> `World#isBedWorks()` 和 `World#isNatural()` 方法可以用于检测某个世界是否允许睡觉。
> 
> `World#isBedWorks()` 方法如果返回 `false` ，则玩家无法上床就寝，而且床会爆炸。

#### NOT_POSSIBLE_NOW

> Entering the bed is prevented due to it not being night nor
> 
> thundering currently.
> 
> If the event is forcefully allowed during daytime, the player will
> 
> enter the bed (and set its bed location), but might get immediately
> 
> thrown out again.
> 
> <p>
> 
> 玩家所在世界的时间并不是夜晚，天气亦非雷暴，因此无法就寝。
> 
> 如果玩家尝试日间就寝，并且某个插件在本事件的监听器中改变事件结果，强行允许玩家这样做，那么玩家会上床躺下且其出生点位置会被重设，但此后该玩家有可能立刻被床弹出。
> 
> <p>
> 
> 译注：勿效仿宰予昼寝。

#### TOO_FAR_AWAY

> Entering the bed is prevented due to the player being too far away.
> 
> <p>
> 
> 玩家离床太远，无法就寝。

#### NOT_SAFE

> Entering the bed is prevented due to there being monsters nearby.
> 
> <p>
> 
> 周围有怪物在游荡，玩家无法就寝。

#### OTHER_PROBLEM

> Entering the bed is prevented due to there being some other problem.
> 
> <p>
> 
> 存在其他未知问题，玩家无法就寝。