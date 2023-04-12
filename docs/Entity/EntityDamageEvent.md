---
description: EntityDamageEvent
---

# EntityDamageEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityDamageEvent

### 类描述

> Stores data for damage events
> 
> <p>
> 
> 本事件存储了实体伤害的有关数据。
> 
> <p>
> 
> 译注：事件不是用来完成数据的持久化存储的。此处所谓“存储”意为事件的字段中含有一些与事件中所造成的伤害有关的信息，该事件从服务端底层得到这些信息，存储于一些字段中，再给插件进行读取。当插件处理完毕以后，事件对象应该被销毁。不能使用事件对象来对数据进行保存。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getOriginalDamage

方法声明: public double getOriginalDamage(@NotNull DamageModifier type) throws IllegalArgumentException

方法签名: (Lorg/bukkit/event/entity/EntityDamageEvent/DamageModifier;)D

> Gets the original damage for the specified modifier, as defined at this
> 
> event's construction.
> 
> @param type the modifier
> 
> @return the original damage
> 
> @throws IllegalArgumentException if type is null
> 
> <p>
> 
> 该方法已过时。请勿使用 `DamageModifier` 枚举。

#### setDamage

方法声明: public void setDamage(@NotNull DamageModifier type, double damage) throws IllegalArgumentException, UnsupportedOperationException

方法签名: (Lorg/bukkit/event/entity/EntityDamageEvent/DamageModifier;D)V

> Sets the damage for the specified modifier.
> 
> @param type the damage modifier
> 
> @param damage the scalar value of the damage's modifier
> 
> @throws IllegalArgumentException if type is null
> 
> @throws UnsupportedOperationException if the caller does not support
> 
> the particular DamageModifier, or to rephrase, when {@link
> 
> #isApplicable(DamageModifier)} returns false
> 
> @see #getFinalDamage()
> 
> <p>
> 
> 该方法已过时。请勿使用 `DamageModifier` 枚举。

#### getDamage

方法声明: public double getDamage(@NotNull DamageModifier type) throws IllegalArgumentException

方法签名: (Lorg/bukkit/event/entity/EntityDamageEvent/DamageModifier;)D

> Gets the damage change for some modifier
> 
> @param type the damage modifier
> 
> @return The raw amount of damage caused by the event
> 
> @throws IllegalArgumentException if type is null
> 
> @see DamageModifier#BASE
> 
> <p>
> 
> 该方法已过时。请勿使用 `DamageModifier` 枚举。

#### isApplicable

方法声明: public boolean isApplicable(@NotNull DamageModifier type) throws IllegalArgumentException

方法签名: (Lorg/bukkit/event/entity/EntityDamageEvent/DamageModifier;)Z

> This checks to see if a particular modifier is valid for this event's
> 
> caller, such that, {@link #setDamage(DamageModifier, double)} will not
> 
> throw an {@link UnsupportedOperationException}.
> 
> {@link DamageModifier#BASE} is always applicable.
> 
> @param type the modifier
> 
> @return true if the modifier is supported by the caller, false otherwise
> 
> @throws IllegalArgumentException if type is null
> 
> <p>
> 
> 该方法已过时。请勿使用 `DamageModifier` 枚举。

#### getDamage

方法声明: public double getDamage()

方法签名: ()D

> Gets the raw amount of damage caused by the event
> 
> @return The raw amount of damage caused by the event
> 
> @see DamageModifier#BASE
> 
> <p>
> 
> 该方法用于获取事件中攻击者造成的原始伤害。
> 
> @return 攻击者造成的原始伤害。
> 
> @see 参见 `DamageModifier#BASE` 字段。

#### getFinalDamage

方法声明: public final double getFinalDamage()

方法签名: ()D

> Gets the amount of damage caused by the event after all damage
> 
> reduction is applied.
> 
> @return the amount of damage caused by the event
> 
> <p>
> 
> 该方法用于获取事件中受伤的实体将要承受的最终伤害。最终伤害是经过各种减伤机制计算而得的。
> 
> @return 受伤的实体将要承受的最终伤害。

#### setDamage

方法声明: public void setDamage(double damage)

方法签名: (D)V

> Sets the raw amount of damage caused by the event.
> 
> For compatibility this also recalculates the modifiers and scales
> 
> them by the difference between the modifier for the previous damage
> 
> value and the new one.
> 
> @param damage The raw amount of damage caused by the event
> 
> <p>
> 
> 该方法用于设置事件中攻击者造成的原始伤害。
> 
> （译注：与 `DamageModifier` 相关的过时内容不译）。
> 
> @param damage 攻击者造成的原始伤害。

#### getCause

方法声明: public DamageCause getCause()

方法签名: ()Lorg/bukkit/event/entity/EntityDamageEvent/DamageCause;

> Gets the cause of the damage.
> 
> @return A DamageCause value detailing the cause of the damage.
> 
> <p>
> 
> 该方法用于获取实体受伤的原因。
> 
> @return 实体受伤的原因。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: DamageModifier

> An enum to specify the types of modifier
> 
> @deprecated This API is responsible for a large number of implementation
> problems and is in general unsustainable to maintain. It is likely to be
> removed very soon in a subsequent release. Please see
> https://www.spigotmc.org/threads/194446/ for more information.
> 
> <p>
> 
> 用于确定伤害修改操作的枚举。
> 
> @deprecated 本 `API` 在实现上出现了大量问题，已经无法维护。在随后的版本中它将会被尽快移除。如欲获知更多信息，请参见 [https://www.spigotmc.org/threads/194446/](https://www.spigotmc.org/threads/194446/) 页面。

#### BASE

> This represents the amount of damage being done, also known as the
> 
> raw {@link EntityDamageEvent#getDamage()}.
> 
> <p>
> 
> 本字段已过时。

#### HARD_HAT

> This represents the damage reduced by a wearing a helmet when hit
> 
> by a falling block.
> 
> <p>
> 
> 本字段已过时。

#### BLOCKING

> This represents  the damage reduction caused by blocking, only present for
> 
> {@link Player Players}.
> 
> <p>
> 
> 本字段已过时。

#### ARMOR

> This represents the damage reduction caused by wearing armor.
> 
> <p>
> 
> 本字段已过时。

#### RESISTANCE

> This represents the damage reduction caused by the Resistance potion effect.
> 
> <p>
> 
> 本字段已过时。

#### MAGIC

> This represents the damage reduction caused by the combination of:
> 
> <ul>
> 
> <li>
> 
> Armor enchantments
> 
> </li><li>
> 
> Witch's potion resistance
> 
> </li>
> 
> </ul>
> 
> <p>
> 
> 本字段已过时。

#### ABSORPTION

> This represents the damage reduction caused by the absorption potion
> 
> effect.
> 
> <p>
> 
> 本字段已过时。

### 枚举: DamageCause

> An enum to specify the cause of the damage
> 
> <p>
> 
> 用于确定伤害原因的枚举。

#### CONTACT

> Damage caused when an entity contacts a block such as a Cactus,
> 
> Dripstone (Stalagmite) or Berry Bush.
> 
> Damage: variable
> 
> <p>
> 
> 由于实体接触了方块（如仙人掌、浆果丛等）而受伤。
> 
> 伤害值：因方块而异。

#### ENTITY_ATTACK

> Damage caused when an entity attacks another entity.
> 
> Damage: variable
> 
> <p>
> 
> 由于实体遭到攻击而受伤。
> 
> 伤害值：因攻击情况而异。

#### ENTITY_SWEEP_ATTACK

> Damage caused when an entity attacks another entity in a sweep attack.
> 
> Damage: variable
> 
> <p>
> 
> 由于实体遭到横扫攻击而受伤。
> 
> 伤害值：因攻击情况而异。

#### PROJECTILE

> Damage caused when attacked by a projectile.
> 
> Damage: variable
> 
> <p>
> 
> 由于实体被抛射物击中而受伤。
> 
> 伤害值：因抛射物而异。

#### SUFFOCATION

> Damage caused by being put in a block
> 
> Damage: 1
> 
> <p>
> 
> 由于实体卡在方块内部，窒息而受伤。
> 
> 伤害值：一。

#### FALL

> Damage caused when an entity falls a distance greater than 3 blocks
> 
> Damage: fall height - 3.0
> 
> <p>
> 
> 由于实体自三格以上高度坠落而受伤。
> 
> 伤害值：坠落高度减三。

#### FIRE

> Damage caused by direct exposure to fire
> 
> Damage: 1
> 
> <p>
> 
> 由于实体处于火焰方块中而受伤。
> 
> 伤害值：一。

#### FIRE_TICK

> Damage caused due to burns caused by fire
> 
> Damage: 1
> 
> <p>
> 
> 由于实体正在燃烧而受伤。
> 
> 伤害值：一。

#### MELTING

> Damage caused due to a snowman melting
> 
> Damage: 1
> 
> <p>
> 
> 雪傀儡由于正在融化而受伤。
> 
> 伤害值：一。

#### LAVA

> Damage caused by direct exposure to lava
> 
> Damage: 4
> 
> <p>
> 
> 由于实体处于岩浆中而受伤。
> 
> 伤害值：四。

#### DROWNING

> Damage caused by running out of air while in water
> 
> Damage: 2
> 
> <p>
> 
> 由于实体处于水中且没有氧气值而受伤。
> 
> 伤害值：二。

#### BLOCK_EXPLOSION

> Damage caused by being in the area when a block explodes.
> 
> Damage: variable
> 
> <p>
> 
> 由于实体被方块爆炸波及而受伤。
> 
> 伤害值：因爆炸情况而异。

#### ENTITY_EXPLOSION

> Damage caused by being in the area when an entity, such as a
> 
> Creeper, explodes.
> 
> Damage: variable
> 
> <p>
> 
> 由于实体被另一实体爆炸波及而受伤（如苦力怕爆炸）。
> 
> 伤害值：因爆炸情况而异。

#### VOID

> Damage caused by falling into the void
> 
> Damage: 4 for players
> 
> <p>
> 
> 由于实体坠入虚空而受伤。
> 
> 伤害值：对玩家而言为四。

#### LIGHTNING

> Damage caused by being struck by lightning
> 
> Damage: 5
> 
> 由于实体被闪电劈中而受伤。
> 
> 伤害值：五。

#### SUICIDE

> Damage caused by committing suicide.
> 
> <b>Note:</b> This is currently only used by plugins, default commands
> 
> like /minecraft:kill use {@link #VOID} to damage players.
> 
> Damage: variable
> 
> <p>
> 
> 由于实体自杀而受伤。
> 
> 目前而言仅有插件会采用本字段所描述的情况造成伤害。原版指令如 `/minecraft:kill` 所造成的伤害系落入虚空的伤害，归入 `VOID` 字段。
> 
> 伤害值：因情况而异。

#### STARVATION

> Damage caused by starving due to having an empty hunger bar
> 
> Damage: 1
> 
> <p>
> 
> 由于实体饥饿值为零，过度饥饿而受伤。
> 
> 伤害值：一。

#### POISON

> Damage caused due to an ongoing poison effect
> 
> Damage: 1
> 
> <p>
> 
> 由于实体携带中毒药水效果而受伤。
> 
> 伤害值：一。

#### MAGIC

> Damage caused by being hit by a damage potion or spell
> 
> Damage: variable
> 
> <p>
> 
> 由于实体被伤害药水或咒语所波及而受伤。
> 
> 伤害值：因情况而异。

#### WITHER

> Damage caused by Wither potion effect
> 
> <p>
> 
> 由于实体携带凋零药水效果而受伤。

#### FALLING_BLOCK

> Damage caused by being hit by a falling block which deals damage
> 
> <b>Note:</b> Not every block deals damage
> 
> Damage: variable
> 
> <p>
> 
> 由于实体被下落的方块砸中而受伤。
> 
> 不是每种坠落的方块都会对玩家造成伤害。
> 
> 伤害值：因方块而异。

#### THORNS

> Damage caused in retaliation to another attack by the Thorns
> 
> enchantment.
> 
> Damage: 1-4 (Thorns)
> 
> <p>
> 
> 由于实体攻击了某个盔甲含有荆棘附魔的实体，被荆棘附魔造成反伤。
> 
> 伤害值：一至四。

#### DRAGON_BREATH

> Damage caused by a dragon breathing fire.
> 
> Damage: variable
> 
> <p>
> 
> 由于实体被龙息波及而受伤。
> 
> 伤害值：因情况而异。

#### CUSTOM

> Custom damage.
> 
> Damage: variable
> 
> <p>
> 
> 插件造成的自定义伤害。
> 
> 伤害值：自定义。

#### FLY_INTO_WALL

> Damage caused when an entity runs into a wall.
> 
> Damage: variable
> 
> <p>
> 
> 由于实体在使用鞘翅滑翔时撞上墙壁而受伤。
> 
> 伤害值：视飞行速度而定。

#### HOT_FLOOR

> Damage caused when an entity steps on {@link Material#MAGMA_BLOCK}.
> 
> Damage: 1
> 
> <p>
> 
> 由于实体踩在岩浆块上而受伤。
> 
> 伤害值：一。

#### CRAMMING

> Damage caused when an entity is colliding with too many entities due
> 
> to the maxEntityCramming game rule.
> 
> Damage: 6
> 
> <p>
> 
> 由于实体与过多其他实体相碰撞而挤压受伤，该情况与 `maxEntityCramming` 游戏规则有关。
> 
> 伤害值：六。

#### DRYOUT

> Damage caused when an entity that should be in water is not.
> 
> Damage: 1
> 
> <p>
> 
> 水生生物由于离开水体而受伤。
> 
> 伤害值：一。