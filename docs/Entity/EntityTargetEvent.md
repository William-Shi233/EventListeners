---
description: EntityTargetEvent
---

# EntityTargetEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityTargetEvent

### 类描述

> Called when a creature targets or untargets another entity
> 
> <br>
> 
> 当实体将某个生物作为其目标，或失去目标时触发。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getReason

方法声明: public TargetReason getReason()

方法签名: ()Lorg/bukkit/event/entity/EntityTargetEvent/TargetReason;

> Returns the reason for the targeting
> 
> @return The reason
> 
> <br>
> 
> 该方法用于获取实体切换其目标的原因。
> 
> @return 实体切换其目标的原因。
> 
> <br>
> 
> 译注：该原因不仅包括实体盯上新目标的情况，也包括实体失去旧有目标，茫然逡巡的情况。原句应当改为“Returns the reason for the targeting or untargeting”。为求简洁，译作“切换目标”。

#### getTarget

方法声明: public Entity getTarget()

方法签名: ()Lorg/bukkit/entity/Entity;

> Get the entity that this is targeting.
> 
> This will be null in the case that the event is called when the mob
> 
> forgets its target.
> 
> @return The entity
> 
> <br>
> 
> 该方法用于获取被设为目标的实体。
> 
> 如果本事件是由于实体失去目标而触发，则该方法返回 `null` 。
> 
> @return 被设为目标的实体。

#### setTarget

方法声明: public void setTarget(@Nullable Entity target)

方法签名: (Lorg/bukkit/entity/Entity;)V

> Set the entity that you want the mob to target instead.
> 
> It is possible to be null, null will cause the entity to be
> 
> target-less.
> 
> This is different from cancelling the event. Cancelling the event will
> 
> cause the entity to keep an original target, while setting to be null
> 
> will cause the entity to be reset.
> 
> @param target The entity to target
> 
> <br>
> 
> 该方法用于设置涉事实体的新目标。
> 
> 如果传入 `null` ，则实体将会失去目标。
> 
> 调用本方法并传入 `null` 这一做法，与直接取消事件是不同的。取消事件时，涉事实体将会保持原先的目标不变，而传入 `null` 时，涉事实体将没有目标。
> 
> @param target 涉事实体的新目标。
> 
> <br>
> 
> 译注：比如某实体原先以玩家甲为目标，现在其目标即将切换为玩家乙，并触发了本事件。如果取消事件，则其目标仍然为甲。如果调用本方法并传入 `null` ，则实体将没有目标，停止攻击任何一位玩家。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: TargetReason

> An enum to specify the reason for the targeting
> 
> <br>
> 
> 用于确定实体切换目标原因的枚举。
> 
> <br>
> 
> 译注：该枚举不仅包括实体盯上新目标的情况，也包括实体失去旧有目标，茫然逡巡的情况。原句应当改为“An enum to specify the reason for the targeting or untargeting”。为求简洁，译作“切换目标”。

#### TARGET_DIED

> When the entity's target has died, and so it no longer targets it
> 
> <br>
> 
> 实体原有的目标死亡，因而失去目标。

#### CLOSEST_PLAYER

> When the entity doesn't have a target, so it attacks the nearest
> 
> player
> 
> <br>
> 
> 实体原先没有目标，转而攻击最近的玩家。

#### TARGET_ATTACKED_ENTITY

> When the target attacks the entity, so entity targets it
> 
> <br>
> 
> 实体受到攻击，因此将攻击者设为目标。

#### PIG_ZOMBIE_TARGET

> When the target attacks a fellow pig zombie, so the whole group
> 
> will target him with this reason.
> 
> @deprecated obsoleted by {@link #TARGET_ATTACKED_NEARBY_ENTITY}
> 
> <br>
> 
> 某僵尸猪灵附近的其他僵尸猪灵受到攻击，因此一整群僵尸猪灵将攻击者设为目标。
> 
> @deprecated 本字段已过时，其所描述的情况并入 `TARGET_ATTACKED_NEARBY_ENTITY` 字段。

#### FORGOT_TARGET

> When the target is forgotten for whatever reason.
> 
> <br>
> 
> 因各种原因，实体忘却了自己的目标。

#### TARGET_ATTACKED_OWNER

> When the target attacks the owner of the entity, so the entity
> 
> targets it.
> 
> <br>
> 
> 实体的主人受到攻击，因此实体将攻击者设为目标。
> 
> <br>
> 
> 译注：即被驯服的生物护主。

#### OWNER_ATTACKED_TARGET

> When the owner of the entity attacks the target attacks, so the
> 
> entity targets it.
> 
> <br>
> 
> 实体的主人攻击了某个生物，因此涉事实体也将该生物作为目标。
> 
> <br>
> 
> 译注：即被驯服的生物攻击主人所攻击的目标。

#### RANDOM_TARGET

> When the entity has no target, so the entity randomly chooses one.
> 
> <br>
> 
> 实体原先没有目标，转而随机选取周遭实体作为目标。

#### DEFEND_VILLAGE

> When an entity selects a target while defending a village.
> 
> <br>
> 
> 实体在保卫村庄的过程中选取目标。

#### TARGET_ATTACKED_NEARBY_ENTITY

> When the target attacks a nearby entity of the same type, so the entity targets it
> 
> <br>
> 
> 实体发现附近的同类实体遭到攻击，因此将攻击者设为目标。
> 
> <br>
> 
> 译注：如某一僵尸猪灵遭到攻击后，周遭的一群僵尸猪灵都会愤怒。

#### REINFORCEMENT_TARGET

> When a zombie targeting an entity summons reinforcements, so the reinforcements target the same entity
> 
> <br>
> 
> 某一僵尸召唤增援，被召唤出的僵尸使自身的目标与之相同。
> 
> <br>
> 
> 译注：参见 `MineCraft Wiki` 中有关僵尸的相关页面 [https://minecraft.fandom.com/wiki/Zombie#Reinforcements](https://minecraft.fandom.com/wiki/Zombie#Reinforcements) 可知，在困难难度下，当僵尸受到伤害时，其有一定概率召唤增援，在其四周生成新的僵尸。

#### COLLISION

> When an entity targets another entity after colliding with it.
> 
> <br>
> 
> 涉事实体与另一实体相撞，因而以之作为目标。

#### CUSTOM

> For custom calls to the event.
> 
> <br>
> 
> 事件并非由服务端触发，而是插件触发。插件自定义某种不属于原版游戏内容的原因。

#### CLOSEST_ENTITY

> When the entity doesn't have a target, so it attacks the nearest
> 
> entity
> 
> <br>
> 
> 实体原先没有目标，转而攻击最近的实体。

#### FOLLOW_LEADER

> When a raiding entity selects the same target as one of its compatriots.
> 
> <br>
> 
> 某一掠夺者将同伴的目标设为自己的目标。

#### TEMPT

> When another entity tempts this entity by having a desired item such
> 
> as wheat in it's hand.
> 
> <br>
> 
> 某一实体手持小麦等物品引诱涉事实体。
> 
> <br>
> 
> 译注：小麦用于吸引羊、牛等实体。

#### UNKNOWN

> A currently unknown reason for the entity changing target.
> 
> <br>
> 
> 未知原因。