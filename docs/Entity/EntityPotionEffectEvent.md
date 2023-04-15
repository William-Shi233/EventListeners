---
description: EntityPotionEffectEvent
---

# EntityPotionEffectEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityPotionEffectEvent

### 类描述

> Called when a potion effect is modified on an entity.
> 
> If the event is cancelled, no change will be made on the entity.
> 
> <br>
> 
> 当实体所携带的药水效果变化时触发。
> 
> 如果本事件被取消，则涉事实体身上的药水效果保持不变。

### 方法列表

#### getOldEffect

方法声明: public PotionEffect getOldEffect()

方法签名: ()Lorg/bukkit/potion/PotionEffect;

> Gets the old potion effect of the changed type, which will be removed.
> 
> @return The old potion effect or null if the entity did not have the
> 
> changed effect type.
> 
> <br>
> 
> 该方法用于获取将被覆盖的旧药水效果对象。
> 
> @return 旧药水效果对象。如果实体身上原先没有涉事药水效果类型，则返回 `null` 。
> 
> <br>
> 
> 译注：比如玩家在某信标的作用范围内，则该信标会不断更新玩家身上药水效果的时长。这种情况下本方法的返回值不是 `null` 。而如果没有相应药水效果的玩家初次踏足信标作用范围，则本方法会返回 `null` 。

#### getNewEffect

方法声明: public PotionEffect getNewEffect()

方法签名: ()Lorg/bukkit/potion/PotionEffect;

> Gets new potion effect of the changed type to be applied.
> 
> @return The new potion effect or null if the effect of the changed type
> 
> will be removed.
> 
> <br>
> 
> 该方法用于获取涉事实体将得到的新药水效果对象。
> 
> @return 新的药水效果对象。如果本事件发生时涉事实体身上的该种药水效果将被移除，则返回 `null` 。
> 
> <br>
> 
> 译注：比如玩家在某信标的作用范围内，则该信标会不断更新玩家身上药水效果的时长。这种情况下本方法的返回值不是 `null` 。而如果该玩家离开了信标作用范围，一段时间后药水效果消失，则本方法会返回 `null` 。

#### getCause

方法声明: public Cause getCause()

方法签名: ()Lorg/bukkit/event/entity/EntityPotionEffectEvent/Cause;

> Gets the cause why the effect has changed.
> 
> @return A Cause value why the effect has changed.
> 
> <br>
> 
> 该方法用于获取实体所携带的药水效果变化的原因。
> 
> @return 一个 `Cause` 枚举字段，用于确定实体所携带的药水效果变化的原因。

#### getAction

方法声明: public Action getAction()

方法签名: ()Lorg/bukkit/event/entity/EntityPotionEffectEvent/Action;

> Gets the action which will be performed on the potion effect type.
> 
> @return An action to be performed on the potion effect type.
> 
> <br>
> 
> 该方法用于获取对涉事药水效果对象将采取的操作。
> 
> @return 一个 `Action` 枚举字段，用于确定对涉事药水效果对象将采取的操作。

#### getModifiedType

方法声明: public PotionEffectType getModifiedType()

方法签名: ()Lorg/bukkit/potion/PotionEffectType;

> Gets the modified potion effect type.
> 
> @return The effect type which will be modified on the entity.
> 
> <br>
> 
> 该方法用于获取涉事实体将得到的新药水效果类型。
> 
> @return 涉事实体将得到的新药水效果类型。

#### isOverride

方法声明: public boolean isOverride()

方法签名: ()Z

> Returns if the new potion effect will override the old potion effect
> 
> (Only applicable for the CHANGED Action).
> 
> @return If the new effect will override the old one.
> 
> <br>
> 
> 该方法用于获取新药水效果是否会覆盖旧药水效果。
> 
> （只有 `getAction()` 方法返回 `Action#CHANGED` 字段时，本方法才有意义）。
> 
> @return 新药水效果是否会覆盖旧药水效果。

#### setOverride

方法声明: public void setOverride(boolean override)

方法签名: (Z)V

> Sets if the new potion effect will override the old potion effect (Only
> 
> applicable for the CHANGED action).
> 
> @param override If the new effect will override the old one.
> 
> <br>
> 
> 该方法用于设置新药水效果是否会覆盖旧药水效果。
> 
> （只有 `getAction()` 方法返回 `Action#CHANGED` 字段时，本方法才有意义）。
> 
> @param override 新药水效果是否会覆盖旧药水效果。

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

### 枚举: Action

> An enum to specify the action to be performed.
> 
> <br>
> 
> 用于确定将对原有药水效果对象采取何种操作的枚举。

#### ADDED

> When the potion effect is added because the entity didn't have it's
> 
> type.
> 
> <br>
> 
> 原先没有这种类型的药水效果对象，直接添加药水效果。

#### CHANGED

> When the entity already had the potion effect type, but the effect is
> 
> changed.
> 
> <br>
> 
> 原先已有这种类型的药水效果对象，改变原有药水效果。
> 
> <br>
> 
> 译注：比如改变时长等。

#### CLEARED

> When the effect is removed due to all effects being removed.
> 
> <br>
> 
> 原先的全部药水效果都被清除。

#### REMOVED

> When the potion effect type is completely removed.
> 
> <br>
> 
> 原先已有这种类型的药水效果对象，将其清除。

### 枚举: Cause

> An enum to specify the cause why an effect was changed.
> 
> <br>
> 
> 用于确定药水效果改变原因的枚举。

#### AREA_EFFECT_CLOUD

> When the entity stands inside an area effect cloud.
> 
> <br>
> 
> 实体步入某一药水云中，获得药水效果。

#### ARROW

> When the entity is hit by an spectral or tipped arrow.
> 
> <br>
> 
> 实体被一支光灵箭或药水箭射中，获得药水效果。

#### ATTACK

> When the entity is inflicted with a potion effect due to an entity
> 
> attack (e.g. a cave spider or a shulker bullet).
> 
> <br>
> 
> 由于承受了攻击（如洞穴蜘蛛的攻击、如潜影贝导弹等），受伤害的实体被施加了药水效果。

#### BEACON

> When beacon effects get applied due to the entity being nearby.
> 
> <br>
> 
> 激活的信标给周遭实体施加药水效果。

#### COMMAND

> When a potion effect is changed due to the /effect command.
> 
> <br>
> 
> 由于原版指令 `/effect` ，实体身上的药水效果发生改变。

#### CONDUIT

> When the entity gets the effect from a conduit.
> 
> <br>
> 
> 激活的潮涌核心给周遭实体施加药水效果。

#### CONVERSION

> When a conversion from a villager zombie to a villager is started or
> 
> finished.
> 
> <br>
> 
> 在僵尸村民被治愈过程的始末，僵尸村民获得力量效果。

#### DEATH

> When all effects are removed due to death (Note: This is called on
> 
> respawn, so it's player only!)
> 
> <br>
> 
> 由于实体死亡，其所携带的全部药水效果被清空（清空药水效果这一过程是重生时发生的，所以本字段专指玩家复活的情况）。

#### DOLPHIN

> When the entity gets the effect from a dolphin.
> 
> <br>
> 
> 海豚给周遭实体施加海豚的恩惠药水效果。

#### EXPIRATION

> When the effect was removed due to expiration.
> 
> <br>
> 
> 药水效果持续时长减为零，自然失效。

#### FOOD

> When an effect is inflicted due to food (e.g. when a player eats or a
> 
> cookie is given to a parrot).
> 
> <br>
> 
> 服用食物带来药水效果（如玩家吃下食物，或给鹦鹉喂食曲奇饼干等）。

#### ILLUSION

> When an illusion illager makes himself disappear.
> 
> <br>
> 
> 幻术师释放咒语，令自己隐身。

#### MILK

> When all effects are removed due to a bucket of milk.
> 
> <br>
> 
> 玩家饮用牛奶，清空全部药水效果。

#### PATROL_CAPTAIN

> When a player gets bad omen after killing a patrol captain.
> 
> <br>
> 
> 玩家杀死袭击队长，获得不祥之兆效果。

#### PLUGIN

> When a potion effect is modified through the plugin methods.
> 
> <br>
> 
> 插件改变实体所携带的药水效果。

#### POTION_DRINK

> When the entity drinks a potion.
> 
> <br>
> 
> 实体喝下药水，获得药水效果。

#### POTION_SPLASH

> When the entity is inflicted with an effect due to a splash potion.
> 
> <br>
> 
> 实体被掷出的喷溅型药水击中，获得药水效果。

#### SPIDER_SPAWN

> When a spider gets effects when spawning on hard difficulty.
> 
> <br>
> 
> 困难难度下，蜘蛛生成时即携带药水效果。

#### TOTEM

> When the entity gets effects from a totem item saving it's life.
> 
> <br>
> 
> 实体在濒死时消耗不死图腾，获得抗火、生命恢复和伤害吸收效果。

#### TURTLE_HELMET

> When the entity gets water breathing by wearing a turtle helmet.
> 
> <br>
> 
> 实体在头盔槽位装备海龟壳，获得水下呼吸效果。

#### UNKNOWN

> When the Cause is missing.
> 
> <br>
> 
> 未知原因。

#### VILLAGER_TRADE

> When a villager gets regeneration after a trade.
> 
> <br>
> 
> 村民在完成交易后获得生命恢复效果。

#### WITHER_ROSE

> When an entity comes in contact with a wither rose.
> 
> <br>
> 
> 实体接触凋零玫瑰，获得凋零效果。