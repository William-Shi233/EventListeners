# 凡例

下文以 `SlimeSplitEvent` 和 `VillagerCareerChangeEvent` 为例，阐述本项目在为 Spigot API 文档作翻译时所遵循的格式。

```
---
description: SlimeSplitEvent
---
```

该段依据 GitBook 读取 MarkDown 时的定例而写，所有 MarkDown 文件开头均以 description 起笔，表示页面描述。本项目中页面描述即为该事件的简单类名，如 `SlimeSplitEvent` 。该段无实际意义。

```
# SlimeSplitEvent
```

该段为主标题。标题同样为所谓的 `SimpleName` 。

```
### 继承关系

=>  org.bukkit.event.Event

    =>  org.bukkit.event.entity.EntityEvent

        =>  org.bukkit.event.entity.SlimeSplitEvent
```

该段为类的继承关系图。表示 `SlimeSplitEvent extends EntityEvent` ，并且 `EntityEvent extends Event` ，而 `Event extends Object` 则略去不写。类所实现的接口也略去不写，如 `SlimeSplitEvent implements Cancellable` 没有写出。这是因为事件类所可能实现的接口仅有 `Cancellable` 一种，在后文方法列表里，如有 `isCancelled` 和 `setCancelled` 方法即说明实现了该接口，反之则未实现。

```
### 类描述

> Called when a Slime splits into smaller Slimes upon death
```

该段为类的 JavaDoc 原文、翻译与译注。原文应当与 Spigot 官方文档页面中的相关内容一致。对于 `SlimeSplitEvent` 而言，是 [https://hub.spigotmc.org/javadocs/spigot/org/bukkit/event/entity/SlimeSplitEvent.html](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/event/entity/SlimeSplitEvent.html) 页面。翻译内容力求与原文相贴切。译注内容主要对事件触发时机、监听器可能的用途作出补充。

有时，译注内会对一些游戏机制作出说明。一般随附 `Minecraft Wiki` 相关页面的链接。这些链接统一指向英文版维基，因为英文维基常在更新，而中文版维基无法及时地更新翻译，因而中文页面相比于英文原文往往缺漏一些内容。比如对于“雷暴”游戏机制而言，中文维基几乎没能提供有用的游戏机制信息。阅读英语原文则可以清晰了解雷暴状态的切换机制。本项目中，译注是对英语原文的概括提要，不是中文维基的摘抄。

```
### 方法列表

#### getCount

方法声明: public int getCount()

方法签名: ()I

> Gets the amount of smaller slimes to spawn
> 
> @return the amount of slimes to spawn
```

该段为类的方法列表。本列表不会包括该类的每一个方法。比如 `SlimeSplitEvent` 继承自 `EntityEvent` 的 `getEntityType()` 方法就没有列入其中（方法签名：`()Lorg/bukkit/entity/EntityType;` ）。该列表仅包括事件类 `Override` 或 `Overload` 超类的方法，以及事件类所实现的接口的方法。对重写而言，比如 `SlimeSplitEvent` 类重写了超类 `EntityEvent` 中的 `getEntity` 方法（方法签名由原先的 `()Lorg/bukkit/entity/Entity;` 变为 `()Lorg/bukkit/entity/Slime;` ，将返回值类型作了转型，由“实体对象”精确到“类型为史莱姆的实体对象”，其余不变），因此列表囊括之。对实现接口中的方法而言，比如 `SlimeSplitEvent` 类实现了接口 `Cancellable` 所定义的 `isCancelled` 和 `setCancelled` 方法，因此列表囊括之。

每一个方法都自成一小节，标题为方法名，方法声明为 `.java` 文件源代码中声明该方法的语句，方法签名为 `.class` 文件字节码中所使用的表示形式，可用于确定方法的参数和返回值。在这之后是方法的 JavaDoc 文档及翻译。部分方法没有文档，由其太过常见之故，比如 `isCancelled` 和 `setCancelled` 方法用于获取和设置事件是否取消、`getHandlerList` 和 `getHandlers` 方法用于注册和注销监听器。这些方法出现次数极多，没有再作注。

另外还有部分事件，有内部枚举类，比如 `VillagerCareerChangeEvent` 中的 `ChangeReason` 枚举。

```
### 枚举: ChangeReason

> Reasons for the villager's profession changing.

#### LOSING_JOB

> Villager lost their job due to too little experience.

#### EMPLOYED

> Villager gained employment.ofession changing.
```

该段枚举类是配合该事件的 `getReason` 方法（方法签名：`()Lorg/bukkit/event/entity/VillagerCareerChangeEvent/ChangeReason;` ）使用的，当判断 `getReason` 方法的返回值等于 `LOSING_JOB` 时，就代表村民失去了职业，否则就是村民获得了职业。这种枚举的例子还包括如 `EntityDamageEvent` 中的 `DamageCause` ，实体受伤害的原因，等等。这些枚举基本局限于唯一的事件中使用，用来确定事件中的一些细节。不太可能会在 `VillagerCareerChangeEvent` 监听器以外用到“村民改变职业的原因”，同样也不会在 `EntityDamageEvent` 监听器以外用到“实体受伤害的原因”。