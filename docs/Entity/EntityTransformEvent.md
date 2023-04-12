---
description: EntityTransformEvent
---

# EntityTransformEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityTransformEvent

### 类描述

> Called when an entity is about to be replaced by another entity.
> 
> <br>
> 
> 当某实体将要被另一实体取代时触发。
> 
> <br>
> 
> 译注：本事件在实体发生转变时触发，比如猪被闪电击中变为僵尸猪灵时、村民被闪电击中变为女巫时等等。在这些情况下，原有的实体会被移除，另外生成一个新实体。并不是保留原有实体并变换其种类。

### 方法列表

#### getTransformedEntity

方法声明: public Entity getTransformedEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the entity that the original entity was transformed to.
> 
> This returns the first entity in the transformed entity list.
> 
> @return The transformed entity.
> 
> @see #getTransformedEntities()
> 
> <br>
> 
> 该方法用于获取原先转变前的实体。
> 
> @return 原先转变前的实体。
> 
> @see 参见 `getTransformedEntities()` 方法。
> 
> <br>
> 
> 译注：所谓“This returns the first entity in the transformed entity list.”，该句不知所云。`getTransformedEntities()` 方法返回的是新生的实体，旧有的实体将会死亡，并不会被列入新生实体列表中。

#### getTransformedEntities

方法声明: public List<Entity> getTransformedEntities()

方法签名: ()Ljava/util/List;

> Gets the entities that the original entity was transformed to.
> 
> @return The transformed entities.
> 
> <br>
> 
> 该方法用于获取转变后将要生成的实体列表。
> 
> @return 转变后将要生成的实体列表。
> 
> <br>
> 
> 译注：多数情况下，本列表只有一项。一位村民被雷击会生成一位女巫，一只猪被雷击会生成一只僵尸猪灵。二者往往是一一对应的。但在史莱姆死亡等情况下，会生成多个新实体。为应对上述情况，本方法返回值不是单个实体，而是列表。

#### getTransformReason

方法声明: public TransformReason getTransformReason()

方法签名: ()Lorg/bukkit/event/entity/EntityTransformEvent/TransformReason;

> Gets the reason for the conversion that has occurred.
> 
> @return The reason for conversion that has occurred.
> 
> <br>
> 
> 该方法用于获取实体发生转变的原因。
> 
> @return 实体发生转变的原因。

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

### 枚举: TransformReason

> 译注：无文档。用于确定实体转变原因的枚举。

#### CURED

> When a zombie gets cured and a villager is spawned.
> 
> <br>
> 
> 僵尸被治愈，生成村民。

#### INFECTION

> When a villager gets infected and a zombie villager spawns.
> 
> <br>
> 
> 村民被僵尸感染，生成僵尸村民。

#### DROWNED

> When an entity drowns in water and a new entity spawns.
> 
> <br>
> 
> 实体在水中淹死，生成新实体。

#### SHEARED

> When a mooshroom (or MUSHROOM_COW) is sheared and a cow spawns.
> 
> <br>
> 
> 哞菇（或称蘑菇牛）身上的蘑菇被剪下，生成普通的牛。

#### LIGHTNING

> When lightning strikes a entity.
> 
> <br>
> 
> 闪电击中实体。

#### SPLIT

> When a slime splits into multiple smaller slimes.
> 
> <br>
> 
> 史莱姆分裂为多个体型较小的史莱姆。

#### PIGLIN_ZOMBIFIED

> When a piglin converts to a zombified piglin.
> 
> <br>
> 
> 猪灵在主世界停留时间过长，转变为僵尸猪灵。

#### UNKNOWN

> When reason is unknown.
> 
> <br>
> 
> 未知原因。