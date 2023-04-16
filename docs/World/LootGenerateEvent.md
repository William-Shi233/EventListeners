---
description: LootGenerateEvent
---

# LootGenerateEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.world.WorldEvent

            =>  org.bukkit.event.world.LootGenerateEvent

### 类描述

> Called when a {@link LootTable} is generated in the world for an
> 
> {@link InventoryHolder}.
> 
> This event is NOT currently called when an entity's loot table has been
> 
> generated (use {@link EntityDeathEvent#getDrops()}, but WILL be called by
> 
> plugins invoking
> 
> {@link LootTable#fillInventory(org.bukkit.inventory.Inventory, java.util.Random, LootContext)}.
> 
> <br>
> 
> 当一个 `LootTable` 被用于在某个世界中填充一个 `InventoryHolder` 时触发。
> 
> 目前，当实体死亡时，虽然也要通过 `LootTable` 生成掉落物，但这个事件不会被触发。实体死亡时的掉落物可以使用 `EntityDeathEvent#getDrops()` 方法获取。当有插件调用 `LootTable#fillInventory(org.bukkit.inventory.Inventory, java.util.Random, LootContext)` 方法时，本事件会被触发。
> 
> <br>
> 
> 译注：`LootTable` 是战利品表。战利品表用于生成宝箱中的物品、用于生成钓鱼时钓上岸的物品堆、用于确定树叶自然腐烂时掉下苹果的概率……总之，许多与概率相关的地方都有战利品表的身影。所谓“填充一个 `InventoryHolder`”，主要指的是填充宝箱。`InventoryHolder` 不等同于 `Inventory` ，前者是物品栏的拥有者，后者是物品栏本身。比如玩家是玩家背包的拥有者，箱子方块是箱子物品栏的拥有者。此事件偏重于宝箱被填充时触发，树叶腐烂等情况是不会触发本事件的。

### 方法列表

#### getEntity

方法声明: public Entity getEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Get the entity used as context for loot generation (if applicable).
> 
> For inventories where entities are not required to generate loot, such as
> 
> hoppers, null will be returned.
> 
> This is a convenience method for
> 
> {@code getLootContext().getLootedEntity()}.
> 
> @return the entity
> 
> <br>
> 
> 该方法用于获取战利品生成上下文中的实体（如果能获取到）。
> 
> 对于那些生成战利品时无需考虑实体因素的物品栏，比如漏斗，该方法会返回 `null` 。
> 
> 本方法是 `getLootContext().getLootedEntity()` 方法的简写。
> 
> @return 相关实体。
> 
> <br>
> 
> 译注：实体是可以影响战利品生成的。在 `Minecraft Wiki` 中的 `Luck` 页面（ [https://minecraft.fandom.com/wiki/Luck](https://minecraft.fandom.com/wiki/Luck) ），存在关于实体幸运属性的论述。实体获取战利品时，其 `generic.luck` 属性也会参与计算，如果实体的 `generic.luck` 属性值更高，则战利品表中 `quality` 值高的结果更可能出现。因此根据战利品表生成战利品时，实体也是参与计算的一环。

#### getInventoryHolder

方法声明: public InventoryHolder getInventoryHolder()

方法签名: ()Lorg/bukkit/inventory/InventoryHolder;

> Get the inventory holder in which the loot was generated.
> 
> If the loot was generated as a result of the block being broken, the
> 
> inventory holder will be null as this event is called post block break.
> 
> @return the inventory holder
> 
> <br>
> 
> 该方法用于获取将要被填充的 `InventoryHolder` 。
> 
> 如果战利品是因为某个方块被破坏而生成，那么该方法就会返回 `null` ，因为本事件是在方块被破坏以后被触发的。
> 
> @return 物品栏的拥有者。
> 
> <br>
> 
> 译注：`InventoryHolder` 名词解释见上。
> 
> 所谓“因为某个方块被破坏而生成”，是指不打开宝箱，直接将其破坏。此时也会掉落战利品。但是方块已经被破坏了，这个物品栏的持有者自然就是空。

#### getLootTable

方法声明: public LootTable getLootTable()

方法签名: ()Lorg/bukkit/loot/LootTable;

> Get the loot table used to generate loot.
> 
> @return the loot table
> 
> <br>
> 
> 该方法用于获取生成战利品时所使用的战利品表。
> 
> @return 战利品表。

#### getLootContext

方法声明: public LootContext getLootContext()

方法签名: ()Lorg/bukkit/loot/LootContext;

> Get the loot context used to provide context to the loot table's loot
> 
> generation.
> 
> @return the loot context
> 
> <br>
> 
> 该方法用于获取战利品表的上下文。在根据战利品表生成战利品的过程中，需要上下文来提供信息。
> 
> @return 战利品表上下文。
> 
> <br>
> 
> 译注：所谓“上下文”，指的是生成战利品时所需要的所有信息，比如有关实体（钓鱼时读取玩家的 `generic.luck` 属性）、比如生成的位置（宝箱的位置）等等，此处未列全。有了这些信息，就可以完成战利品的生成。`Context` 一词，在程序设计中指的是开发者完成一项任务所需要的全部信息，或者程序运行所需要的一些基本信息的集合。比如线程有 `ContextClassLoader` 等。`Context` 就像是程序运行所需要的环境。

#### setLoot

方法声明: public void setLoot(@Nullable Collection<ItemStack> loot)

方法签名: (Ljava/util/Collection;)V

> Set the loot to be generated. Null items will be treated as air.
> 
> Note: the set collection is not the one which will be returned by
> 
> {@link #getLoot()}.
> 
> @param loot the loot to generate, null to clear all loot
> 
> <br>
> 
> 该方法用于设置将要被填充进宝箱的物品堆列表。该列表中所有为 `null` 的项都将按照空气物品堆处理。注意，该方法的参数不可以是 `getLoot()` 方法的返回值。
> 
> @param loot 将要被填充进宝箱的物品堆列表。如果传入 `null` 将清空所有物品堆，不会有任何战利品生成。
> 
> <br>
> 
> 译注：`getLoot()` 和 `setLoot(Collection<ItemStack>)` 两个方法维护的是同一个集合，名为 `loot` ，类型为 `List<ItemStack>` 。此处的 `loot` 不是方法参数里的 `loot` ，尽管二者名字相同。为了作出区别，按照 `Java` 写法，以下所有 `this.loot` 表示事件类中的集合，而 `loot` 表示用户传入的参数。
> 
> `setLoot(Collection<ItemStack>)` 的实现是将 `this.loot` 集合清空，再调用 `this.loot.addAll` 方法，把用户传入的参数 `loot` 列表中所包含的物品堆全部加入 `this.loot` 列表。
> 
> `getLoot()` 的实现是直接返回 `this.loot` ，没有进行列表的复制，直接提供了引用。用户操作 `getLoot()` 方法返回的列表，就相当于直接对 `LootGenerateEvent` 类里的 `this.loot` 作了修改。
> 
> 如果将 `getLoot()` 得到的列表作为参数，那么在 `setLoot(Collection<ItemStack>)` 方法中，首先会清空 `this.loot` ，这样，`getLoot()` 方法的返回值直接变为空列表。用户传入的参数是 `this.loot` 的引用，就相当于引用了空列表，再之后 `this.loot` 会将自己的全部内容添加到自己的末尾，由于其内容为空，因此最终的结果是 `this.loot` 变为空列表，不会有任何战利品被生成。
> 
> 对源代码节选如下：
> 
> ```
> private final List<ItemStack> loot;
> 
> public List<ItemStack> getLoot() {
>   return this.loot;
> }
> 
> public void setLoot(Collection<ItemStack> loot) {
>   this.loot.clear();
>   if (loot != null)
>     this.loot.addAll(loot); 
> }
> ```

#### getLoot

方法声明: public List<ItemStack> getLoot()

方法签名: ()Ljava/util/List;

> Get a mutable list of all loot to be generated.
> 
> Any items added or removed from the returned list will be reflected in
> 
> the loot generation. Null items will be treated as air.
> 
> @return the loot to generate
> 
> <br>
> 
> 该方法用于获取将要被填充进宝箱的物品堆列表。该列表是可以被修改的。
> 
> 向本方法返回的列表中添加或删除物品堆以后，操作结果将会直接反映在生成的宝箱中的内容物上。该列表中所有为 `null` 的元素都将按空气物品堆处理。
> 
> @return 将要被填充进宝箱的物品堆列表。
> 
> <br>
> 
> 译注：见上 `setLoot(Collection<ItemStack>)` 方法。

#### isPlugin

方法声明: public boolean isPlugin()

方法签名: ()Z

> Check whether or not this event was called as a result of a plugin
> 
> invoking
> 
> {@link LootTable#fillInventory(org.bukkit.inventory.Inventory, java.util.Random, LootContext)}.
> 
> @return true if plugin caused, false otherwise
> 
> <br>
> 
> 该方法用于检测本事件是否系由于插件行为而触发。当插件调用 `LootTable#fillInventory(org.bukkit.inventory.Inventory, java.util.Random, LootContext)` 方法时，会触发本事件。
> 
> @return 如果是由插件行为触发，返回 `true` ，否则返回 `false` 。
> 
> <br>
> 
> 译注：插件可以利用上述方法来为任意一个自定义的物品栏生成内容，自制宝箱。

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;ist;