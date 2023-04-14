---
description: PlayerMoveEvent
---

# PlayerMoveEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerMoveEvent

### 类描述

> Holds information for player movement events
> 
> <br>
> 
> 本事件存储了试图移动的玩家的有关数据。
> 
> <br>
> 
> 译注：事件不是用来完成数据的持久化存储的。此处所谓“存储”意为事件的字段中含有一些与涉事玩家有关的信息，该事件从服务端底层得到这些信息，存储于一些字段中，再给插件进行读取。当插件处理完毕以后，事件对象应该被销毁。不能使用事件对象来对数据进行保存。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

> Gets the cancellation state of this event. A cancelled event will not
> 
> be executed in the server, but will still pass to other plugins
> 
> If a move or teleport event is cancelled, the player will be moved or
> 
> teleported back to the Location as defined by getFrom(). This will not
> 
> fire an event
> 
> @return true if this event is cancelled
> 
> <br>
> 
> 如果一次移动事件或传送事件（ `PlayerTeleportEvent` 是本事件的子类）被取消了，那么玩家将会被传送回起点位置。起点位置即 `getFrom()` 方法的返回值。被传送回起点时不会触发移动或传送事件。
> 
> <br>
> 
> 译注：原文第一段为所有 `isCancelled` 方法共用的文档，不赘。
> 
> 玩家移动是客户端先斩后奏的。比如玩家行走时，一旦按下按键，客户端直接播放移动的动画，并显示玩家移动到了指定位置，然后发送数据包告知服务端自身的位置。服务端可以令玩家回到移动前的位置，但此时的客户端画面中玩家早已在新位置，所以会出现较明显的不连贯现象，在客户端看来，自身似乎被拽回。

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

> Sets the cancellation state of this event. A cancelled event will not
> 
> be executed in the server, but will still pass to other plugins
> 
> If a move or teleport event is cancelled, the player will be moved or
> 
> teleported back to the Location as defined by getFrom(). This will not
> 
> fire an event
> 
> @param cancel true if you wish to cancel this event
> 
> <br>
> 
> 如果一次移动事件或传送事件（ `PlayerTeleportEvent` 是本事件的子类）被取消了，那么玩家将会被传送回起点位置。起点位置即 `getFrom()` 方法的返回值。被传送回起点时不会触发移动或传送事件。
> 
> <br>
> 
> 译注：原文第一段为所有 `setCancelled` 方法共用的文档，不赘。
> 
> 玩家移动是客户端先斩后奏的。比如玩家行走时，一旦按下按键，客户端直接播放移动的动画，并显示玩家移动到了指定位置，然后发送数据包告知服务端自身的位置。服务端可以令玩家回到移动前的位置，但此时的客户端画面中玩家早已在新位置，所以会出现较明显的不连贯现象，在客户端看来，自身似乎被拽回。

#### getFrom

方法声明: public Location getFrom()

方法签名: ()Lorg/bukkit/Location;

> Gets the location this player moved from
> 
> @return Location the player moved from
> 
> <br>
> 
> 该方法用于获取涉事玩家移动的起点位置。
> 
> @return 涉事玩家移动的起点位置。

#### setFrom

方法声明: public void setFrom(@NotNull Location from)

方法签名: (Lorg/bukkit/Location;)V

> Sets the location to mark as where the player moved from
> 
> @param from New location to mark as the players previous location
> 
> <br>
> 
> 该方法用于设置涉事玩家移动的起点位置。
> 
> @param from 涉事玩家移动的起点位置。

#### getTo

方法声明: public Location getTo()

方法签名: ()Lorg/bukkit/Location;

> Gets the location this player moved to
> 
> @return Location the player moved to
> 
> <br>
> 
> 该方法用于获取涉事玩家移动的终点位置。
> 
> @return 涉事玩家移动的终点位置。

#### setTo

方法声明: public void setTo(@NotNull Location to)

方法签名: (Lorg/bukkit/Location;)V

> Sets the location that this player will move to
> 
> @param to New Location this player will move to
> 
> <br>
> 
> 该方法用于设置涉事玩家移动的终点位置。
> 
> @param to 涉事玩家移动的终点位置。

#### validateLocation

方法声明: private void validateLocation(@NotNull Location loc)

方法签名: (Lorg/bukkit/Location;)V

> 译注：无文档。该方法用于确定某个位置对象是否合法。合法的位置对象应当满足两个条件：首先，该对象不为 `null` 。其次，该对象所在的世界不是 `null` 。
> 
> 本事件的 `setTo(Location)` 和 `setFrom(Location)` 两方法都会验证用户传入的位置对象是否合法。所谓“合法”，并不是要求玩家的移动速度不能超过某个上限，仅仅只是要求相关字段不为 `null` 。本事件并不包括反作弊内容。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;