---
description: ArrowBodyCountChangeEvent
---

# ArrowBodyCountChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.ArrowBodyCountChangeEvent

### 类描述

> Called when an arrow enters or exists an entity's body.
> 
> <br>
> 
> 当一根箭矢射入某个实体体内或从体内被拔出时触发。
> 
> <br>
> 
> 译注：原文所谓“exists”，不知所云，应当为“exits”之衍文。即“箭矢自体内被拔出”。
> 
> 本事件可能在两种情况下触发。其一为 `net.minecraft.server.v1_16_R3.EntityPlayer#reset` 方法（参见该类第 `2067` 行）。该方法中会将箭矢数量重设为 `0` 。其二为箭矢击中生物，此时生物体内的箭矢数量会增加一。

### 方法列表

#### isReset

方法声明: public boolean isReset()

方法签名: ()Z

> Whether the event was called because the entity was reset.
> 
> @return was reset
> 
> <br>
> 
> 该方法用于获取本事件是否是由于实体被重置而触发。
> 
> @return 本事件是否是由于实体被重置而触发。
> 
> <br>
> 
> 译注：即 `net.minecraft.server.v1_16_R3.EntityPlayer#reset` 方法的情况（参见该类第 `2067` 行）。

#### getOldAmount

方法声明: public int getOldAmount()

方法签名: ()I

> Gets the old amount of arrows in the entity's body.
> 
> @return amount of arrows
> 
> <br>
> 
> 该方法用于获取事件发生前实体体内原有的箭矢数量。
> 
> @return 事件发生前实体体内原有的箭矢数量。

#### getNewAmount

方法声明: public int getNewAmount()

方法签名: ()I

> Get the new amount of arrows in the entity's body.
> 
> @return amount of arrows
> 
> <br>
> 
> 该方法用于获取事件发生后实体体内将会存在的箭矢数量。
> 
> @return 事件发生后实体体内将会存在的箭矢数量。

#### setNewAmount

方法声明: public void setNewAmount(int newAmount)

方法签名: (I)V

> Sets the final amount of arrows in the entity's body.
> 
> @param newAmount amount of arrows
> 
> <br>
> 
> 该方法用于设置事件发生后实体体内将会存在的箭矢数量。
> 
> @param newAmount 事件发生后实体体内将会存在的箭矢数量。

#### getEntity

方法声明: public LivingEntity getEntity()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

> 译注：无文档。该方法用于获取体内箭矢数量发生变化的生物。

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