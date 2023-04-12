---
description: VillagerCareerChangeEvent
---

# VillagerCareerChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.VillagerCareerChangeEvent

### 类描述

> 译注：无文档。当村民的职业发生变化时触发。

### 方法列表

#### getEntity

方法声明: public Villager getEntity()

方法签名: ()Lorg/bukkit/entity/Villager;

> 译注：无文档。该方法用于获取职业变化的村民。

#### getProfession

方法声明: public Profession getProfession()

方法签名: ()Lorg/bukkit/entity/Villager/Profession;

> Gets the future profession of the villager.
> 
> @return The profession the villager will change to
> 
> <br>
> 
> 该方法用于获取村民将要从事的职业。
> 
> @return 村民将要从事的职业。

#### setProfession

方法声明: public void setProfession(@NotNull Profession profession)

方法签名: (Lorg/bukkit/entity/Villager/Profession;)V

> Sets the profession the villager will become from this event.
> 
> @param profession new profession
> 
> <br>
> 
> 该方法用于设置村民将要从事的职业。
> 
> @param profession 村民将要从事的职业。

#### getReason

方法声明: public ChangeReason getReason()

方法签名: ()Lorg/bukkit/event/entity/VillagerCareerChangeEvent/ChangeReason;

> Gets the reason for why the villager's career is changing.
> 
> @return Reason for villager's profession changing
> 
> <br>
> 
> 该方法用于获取村民职业变化的原因。
> 
> @return 村民职业变化的原因。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(@NotNull boolean cancel)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: ChangeReason

> Reasons for the villager's profession changing.
> 
> <br>
> 
> 用于确定村民职业变化原因的枚举。
> 
> <br>
> 
> 译注：本枚举仅有两项，分别是“村民获取职业”和“村民失业”。因此本枚举称作“村民职业变化原因”不恰当，应当改为“村民将会获得职业还是失业”。实际上，采用布尔值就可以简明地传递该信息，比如可以将 `getReason()` 方法改为 `isLosingJob()` 方法，返回 `true` 则代表村民即将失业，否则代表村民将会获得新职业。

#### LOSING_JOB

> Villager lost their job due to too little experience.
> 
> <br>
> 
> 村民由于缺乏经验而失业。
> 
> <br>
> 
> 译注：参见 `MineCraft Wiki` 的相关页面 [https://minecraft.fandom.com/wiki/Villager#Professions](https://minecraft.fandom.com/wiki/Villager#Professions) 可知，本枚举字段指村民的工作方块被破坏，且此时村民还没有与玩家进行过交易，经验值为零，因而失业。经验值为零的新手级村民不会无缘无故失业，失业是由工作方块被破坏而导致的。

#### EMPLOYED

> Villager gained employment.ofession changing.
> 
> <br>
> 
> 村民绑定工作方块，获取职业。