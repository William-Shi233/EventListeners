---
description: PlayerGameModeChangeEvent
---

# PlayerGameModeChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerGameModeChangeEvent

### 类描述

> Called when the GameMode of the player is changed.
>
>
> 
> 当玩家游戏模式变化时触发。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getNewGameMode

方法声明: public GameMode getNewGameMode()

方法签名: ()Lorg/bukkit/GameMode;

> Gets the GameMode the player is switched to.
>
> @return  player's new GameMode
>
>
> 
> 该方法用于获取玩家的新游戏模式。
>
> @return 玩家的新游戏模式。
>
>
> 
> 译注：可以使用 `Player#getGameMode()` 方法获取玩家的旧游戏模式。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;