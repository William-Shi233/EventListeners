---
description: BlockShearEntityEvent
---

# BlockShearEntityEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockShearEntityEvent

### 类描述

> Event fired when a dispenser shears a nearby sheep.
> 
> <br>
> 
> 当发射器为附近的某只羊剪毛时触发。
> 
> <br>
> 
> 译注：参见 `MineCraft Wiki` 的相关页面 [https://minecraft.fandom.com/wiki/Dispenser#Usage](https://minecraft.fandom.com/wiki/Dispenser#Usage) 可知，当发射器内装有剪刀时，可以剪下羊的羊毛、哞菇身上的蘑菇。
> 
> 在 `net.minecraft.server.v1_16_R3.DispenseBehaviorShears#b(WorldServer worldserver, BlockPosition blockposition, Block bukkitBlock, CraftItemStack craftItem)` 方法中，只要发射器检测到面前一定区域内的某个实体系 `net.minecraft.server.v1_16_R3.IShearable` 的子类，即会调用该接口的 `shear` 方法。而羊和哞菇、雪傀儡等类都实现了 `IShearable` 接口。因此本事件不仅局限于给羊剪毛时触发，当发射器剪下哞菇身上的哞菇、取下雪傀儡头顶的南瓜时都应当触发本事件。 

### 方法列表

#### getEntity

方法声明: public Entity getEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the entity that was sheared.
> 
> @return the entity that was sheared.
> 
> <br>
> 
> 该方法用于获取事件中被剪毛的羊。
> 
> @return 事件中被剪毛的羊。
> 
> <br>
> 
> 译注：本事件不仅局限于给羊剪毛时触发，应作“事件中被修剪的实体”。

#### getTool

方法声明: public ItemStack getTool()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item used to shear this sheep.
> 
> @return the item used to shear this sheep.
> 
> <br>
> 
> 该方法用于获取给羊剪毛时所用的物品堆。
> 
> @return 给羊剪毛时所用的物品堆。
> 
> <br>
> 
> 译注：本事件不仅局限于给羊剪毛时触发，应作“修剪时所用的物品堆”。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancelled)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;