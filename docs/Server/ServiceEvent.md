---
description: ServiceEvent
---

# ServiceEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.server.ServerEvent

            =>  org.bukkit.event.server.ServiceEvent

### 类描述

> An event relating to a registered service. This is called in a {@link
>
> org.bukkit.plugin.ServicesManager}
>
>
> 
> 代表与 `Service` 有关的事件。本事件的子类一般在 `org.bukkit.plugin.ServicesManager` 类内被触发。
>
>
> 
> 译注：该事件未实现 `getHandlers` 和 `getHandlerList` 方法，无法直接监听。
>
> 所谓 `Service` ，其实是模仿 `JDK` 中的 `ServiceLoader` 设计的。它是用来管理接口与实现类的一套工具。可以参考 [https://javaguide.cn/java/basis/spi.html#spi-%E5%92%8C-api-%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB](https://javaguide.cn/java/basis/spi.html#spi-%E5%92%8C-api-%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB) 了解详情。
> 
> 以下用 `Bukkit` 领域的例子作解释：`Service` 是一套接口。没有实现类。`ServiceProvider` 是具体的实现类。对于一般的 `API` 来说，`API` 和其 `Implementation` 是由同一个团队开发的。一套 `API` 对应一个实现。但是 `Service` 不同。一个 `Service` 可以由很多个 `ServiceProvider` 实现，然后通过 `ServiceManager` 进行管理。比如著名插件 `Vault` 提供了一些与货币操作有关的接口，但是它没有实现类。一些经济插件，比如 `CMI Injector` 等，作为 `ServiceProvider` 实现了这些接口。这些插件把自己的实现类告诉 `ServiceManager` 。于是插件开发者调用 `Vault` 提供的方法时，实际上是告诉 `ServiceManager` 自己需要使用 `Vault` 这个 `Service` ，由 `ServiceManager` 查找服务器上有哪个经济插件实现了 `Vault` 的接口，然后将 `ServiceProvider` 返回给开发者，开发者不需要关心 `ServiceProvider` 具体是什么，只知道 `ServiceManager` 提供的类是实现了 `Service` 所规定的接口的，然后使用即可。
>
> 这样做的好处是，插件开发者不需要依赖某个具体的经济插件，只要依赖一个 `Vault` 即可进行开发。如果没有 `ServiceManager` ，开发者可能需要依赖具体的经济插件，这些插件各自有不同的 `API` ，要由调用者去一个一个作适配。假如某个腐竹使用的经济插件恰好未受支持，那就无法使用。而有了 `ServiceManager` ，开发者就只需要依赖 `Vault` ，腐竹的服务器上只要安装了实现 `Vault` 接口的经济插件就可以使用了。
> 
> 在 `Bukkit` 中，`Service` 不需要注册。`ServiceProvider` 直接把自己的实现类和实现了哪个 `Service` 告诉 `ServiceManager` ，用户直接查找某个 `Service` 有哪些 `ServiceProvider` ，如果没有就返回 `null` 。`Service` 不需要注册自身。
>
> 当然 `JDK` 中的 `Service` 系统更复杂一些，用户依赖于 `Service` 的同时，其实对具体的 `ServiceProvider` 也有一定的依赖。比如 `ScriptEngine` 是一套 `Service` ，它的实现包括 `Nashorn` 等 `ECMAscript` 语言的引擎，也可以有其他语言的引擎，如 `jruby` 等。如果用户只管查找 `ScriptEngine` 的实现类，然后提供一个 `.js` 文件要求执行，而不管自己获取到的引擎具体是用来加载哪种语言的，那显然很荒谬。不过在 `Bukkit` 的情景下，`Service` 系统有所简化，无需关心 `ServiceProvider` 了。

### 方法列表

#### getProvider

方法声明: public RegisteredServiceProvider<?> getProvider()

方法签名: ()Lorg/bukkit/plugin/RegisteredServiceProvider;

> 译注：无文档。该方法用于获取事件中的 `ServiceProvider` 。