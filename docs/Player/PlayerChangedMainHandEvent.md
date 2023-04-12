---
description: PlayerChangedMainHandEvent
---

# PlayerChangedMainHandEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerChangedMainHandEvent

### 类描述

> Called when a player changes their main hand in the client settings.
> 
> <p>
> 
> 当玩家在客户端设置中修改其主手时触发。
> 
> <p>
> 
> 译注：本事件的触发时机是玩家在客户端设置中的“自定义皮肤”界面设置其主手为左手或右手时。主手默认为右手，副手默认为左手。
> 
> 一般而言，涉及玩家交互时，交互行为只与主副手有关，而与左右手无关。玩家以左手为主手进行交互时，和玩家以右手为主手进行交互时，没有除客户端画面显示以外的区别。

### 方法列表

#### getMainHand

方法声明: public MainHand getMainHand()

方法签名: ()Lorg/bukkit/inventory/MainHand;

> Gets the new main hand of the player. The old hand is still momentarily
> 
> available via {@link Player#getMainHand()}.
> 
> @return the new {@link MainHand} of the player
> 
> <p>
> 
> 该方法用于获取将要成为主手的那一侧手臂。可以使用 `Player#getMainHand()` 方法获取原先的主手。
> 
> @return 将要成为主手的那一侧手臂

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;