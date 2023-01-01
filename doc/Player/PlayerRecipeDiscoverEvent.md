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

### 方法列表

#### getRecipe

方法声明: public NamespacedKey getRecipe()

方法签名: ()Lorg/bukkit/NamespacedKey;

> Get the namespaced key of the discovered recipe.
>
> @return the discovered recipe

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