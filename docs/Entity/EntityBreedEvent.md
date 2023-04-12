---
description: EntityBreedEvent
---

# EntityBreedEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityBreedEvent

### 类描述

> Called when one Entity breeds with another Entity.
> 
> <p>
> 
> 当某一实体与另一实体繁衍后代时触发。

### 方法列表

#### getEntity

方法声明: public LivingEntity getEntity()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

> 译注：无文档。该方法用于获取新生的宝宝实体。

#### getMother

方法声明: public LivingEntity getMother()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

> Gets the parent creating this entity.
> 
> @return The "birth" parent
> 
> <p>
> 
> 该方法用于获取实体的双亲之一。
> 
> @return 实体的双亲之一。
> 
> <p>
> 
> 译注：`MineCraft` 中的生物并没有性别之分，任意两只同类生物即能繁衍，这一过程是性别无涉的。本方法名字中的所谓“Mother”毫无意义。给性别无涉的体系强加“父母”一词，受到了顺性别异性恋的话语体系影响。故翻译时修改为“双亲之一”，以示笔者对于异性恋以外的各种性取向的尊重。另外，笔者并非不尊重多角恋关系，只不过在 `MineCraft` 游戏机制中，繁衍由两只生物参与，因此称“双亲”。

#### getFather

方法声明: public LivingEntity getFather()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

> Gets the other parent of the newly born entity.
> 
> @return the other parent
> 
> <p>
> 
> 该方法用于获取实体的双亲之一。
> 
> @return 实体的双亲之一。
> 
> <p>
> 
> 译注：`MineCraft` 中的生物并没有性别之分，任意两只同类生物即能繁衍，这一过程是性别无涉的。本方法名字中的所谓“Father”毫无意义。给性别无涉的体系强加“父母”一词，受到了顺性别异性恋的话语体系影响。故翻译时修改为“双亲之一”，以示笔者对于异性恋以外的各种性取向的尊重。另外，笔者并非不尊重多角恋关系，只不过在 `MineCraft` 游戏机制中，繁衍由两只生物参与，因此称“双亲”。

#### getBreeder

方法声明: public LivingEntity getBreeder()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

> Gets the Entity responsible for breeding. Breeder is null for spontaneous
> 
> conception.
> 
> @return The Entity who initiated breeding.
> 
> <p>
> 
> 该方法用于获取引起繁衍的玩家。如果是自然状态下的繁衍，则本方法返回 `null` 。
> 
> @return 引起繁衍的玩家。

#### getBredWith

方法声明: public ItemStack getBredWith()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> The ItemStack that was used to initiate breeding, if present.
> 
> @return ItemStack used to initiate breeding.
> 
> <p>
> 
> 该方法用于获取引起繁衍的物品堆（如存在）。
> 
> @return 引起繁衍的物品堆。
> 
> <p>
> 
> 译注：所谓“引起繁衍的物品堆”，即玩家喂食给动物，使之进入繁衍状态的物品。在 `MineCraft` 的游戏机制中，繁衍需要两只动物参与。本方法所返回的物品堆是玩家饲给其中一方的，无法获取用于喂养另外一方的物品堆。

#### getExperience

方法声明: public int getExperience()

方法签名: ()I

> Get the amount of experience granted by breeding.
> 
> @return experience amount
> 
> <p>
> 
> 该方法用于获取繁衍所产生的经验值。
> 
> @return 繁衍所产生的经验值。

#### setExperience

方法声明: public void setExperience(int experience)

方法签名: (I)V

> Set the amount of experience granted by breeding.
> 
> @param experience experience amount
> 
> <p>
> 
> 该方法用于设置繁衍所产生的经验值。
> 
> @param experience 繁衍所产生的经验值。

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