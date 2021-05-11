# Intro

[mockito][1]、[JMockit][2]等框架可以将程序分解为非常微小的单元，逐个进行测试。 测试某个类（如`classA`）时，所有与其他模块的交互都可以进行模拟、随心所欲地设置返回值等行为，从而帮助开发者聚焦`classA`自己的代码。

本范例中，`StudentServiceTest.java`主要是为了测试`StudentService`类。请阅读和修改源代码，试着理解mock在单元测试中的应用。

PS

1. 现在的代码中有故意留下了一个会失败的测试用例。你可以修复它吗？
2. 利用Spring的`@MockMvc`注解，你也可以做到不启动完整的IoC容器，而是[只对web相关的功能进行测试][3]。

[1]:https://site.mockito.org/
[2]:https://jmockit.github.io/
[3]:https://spring.io/guides/gs/testing-web/