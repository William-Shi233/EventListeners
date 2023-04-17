---
description: FoodLevelChangeEvent
---

# FoodLevelChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.FoodLevelChangeEvent

### 类描述

> Called when a human entity's food level changes
> 
> <br>
> 
> 当玩家饥饿值（Food Level）变化时触发。
> 
> <br>
> 
> 译注：本事件在玩家饥饿值（Fool Level，常称作“饱食度”）变化时触发。如欲监听玩家饥饿等级（Exhaustion level）变化，请参见 `EntityExhaustionEvent` 。
> 
> 参见 `Minecraft Wiki` 中的相关页面 [https://minecraft.fandom.com/wiki/Hunger#Exhaustion_level_increase](https://minecraft.fandom.com/wiki/Hunger#Exhaustion_level_increase) 可知，玩家在完成特定操作（如疾跑、如挖掘方块等）时，会累积饥饿等级（Exhaustion level），该值一旦大于等于四，则自减四，并扣除一点饱和度（Saturation）。如果饱和度为零则扣除一点饥饿值（Food Level）。饥饿值由显示在玩家物品栏上方的一排鸡腿体现。但客户端不会明确展示玩家饱和度的具体数值。
> 
> 参见 `net.minecraft.server.v1_16_R3.FoodMetaData#a(EntityHuman)` 方法可知，如果饥饿等级大于等于四，且饱和度大于零，则扣除一点饱和度。如果饱和度小于一，则将饱和度设为零，既不再扣除饥饿值，也不会令饱和度出现负数。如果饱和度被扣除，不会触发本事件。只有饱和度等于零，扣除了饥饿值时，才会触发本事件。
> 
> 另外，本事件不仅仅在饥饿值减少时触发，玩家吃下食物增加饥饿值、由于饱和药水效果回复饥饿值也可以触发本事件。

### 方法列表

#### getEntity

方法声明: public HumanEntity getEntity()

方法签名: ()Lorg/bukkit/entity/HumanEntity;

> 译注：无文档。该方法用于获取饥饿值变化的玩家。

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item that triggered this event, if any.
> 
> @return an ItemStack for the item being consumed
> 
> <br>
> 
> 该方法用于获取引起了饥饿值变化的物品堆（如存在）。
> 
> @return 引起了饥饿值变化的物品堆。

#### getFoodLevel

方法声明: public int getFoodLevel()

方法签名: ()I

> Gets the resultant food level that the entity involved in this event
> 
> should be set to.
> 
> Where 20 is a full food bar and 0 is an empty one.
> 
> @return The resultant food level
> 
> <br>
> 
> 该方法用于获取玩家的新饥饿值。
> 
> 如果本方法返回二十，说明玩家饥饿值将会填满饥饿值栏，如果本方法返回零，说明玩家饥饿值栏将会变空。
> 
> @return 玩家的新饥饿值。

#### setFoodLevel

方法声明: public void setFoodLevel(int level)

方法签名: (I)V

> Sets the resultant food level that the entity involved in this event
> 
> should be set to
> 
> @param level the resultant food level that the entity involved in this
> 
> event should be set to
> 
> <br>
> 
> 该方法用于设置玩家的新饥饿值。
> 
> @param level 玩家的新饥饿值。

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