---
description: PlayerRecipeDiscoverEvent
---

# PlayerRecipeDiscoverEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerRecipeDiscoverEvent

### 类描述

> Called when a player discovers a new recipe in the recipe book.
> 
> <br>
> 
> 当玩家在配方书中解锁新配方时触发。
> 
> <br>
> 
> 译注：配方书即显示在工作台、熔炉等界面上的绿色封面书本。有关配方与配方书的信息可参见 `MineCraft Wiki` 的相关页面 [https://minecraft.fandom.com/wiki/Recipe](https://minecraft.fandom.com/wiki/Recipe) 。
> 
> 除非 `doLimitedCrafting ` 这一 `GameRule` 为 `true` ，玩家可以任意使用未解锁的配方来合成、烧炼物品。 

### 方法列表

#### getRecipe

方法声明: public NamespacedKey getRecipe()

方法签名: ()Lorg/bukkit/NamespacedKey;

> Get the namespaced key of the discovered recipe.
> 
> @return the discovered recipe
> 
> <br>
> 
> 该方法用于获取被解锁配方的 `NamespacedKey` 对象。
> 
> @return 被解锁配方的 `NamespacedKey` 对象。
> 
> <br>
> 
> 译注：`NamespacedKey` 对象提供了配方的命名空间信息（原版配方以 `minecraft:` 起首，插件配方以插件名起首）和配方的内部名。

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